<%@page import="DAO.PatientDAO"%>
<%@page import="pojo.Patients"%>
<%@page import="DAO.PrescriptionDAO"%>
<%@page import="pojo.Doctors"%>
<%@page import="DAO.DoctorsDAO"%>
<%@page import="pojo.Prescription"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    String email =(String) session.getAttribute("email");
    Doctors d = DoctorsDAO.getDoctorByEmail(email);
    String disease = request.getParameter("disease");
    String pname = request.getParameter("name");
    String hname = request.getParameter("hname");
    String medicine1 = null;
    String medicine2 = null;
    String medicine3 = null;
    String medicine4 = null;
    String medicine5 = null;
    medicine1 = request.getParameter("medicine1");
    medicine2 = request.getParameter("medicine2");
    medicine3 = request.getParameter("medicine3");
    medicine4 = request.getParameter("medicine4");
    medicine5 = request.getParameter("medicine5");
    String plocality = request.getParameter("locality");
    Patients p = PatientDAO.getPatientByName(pname);
    String date = new java.util.Date().toLocaleString();
    //Prescription obj = new Prescription(1,p, d, disease, hname, medicine1, medicine2, medicine3, medicine4, medicine5, plocality);
    Prescription obj = new Prescription(p, d, disease, hname, date, medicine1, medicine2, medicine3, medicine4, medicine5, plocality);
    
    if(PrescriptionDAO.save(obj)>0){
        response.sendRedirect("prescriptionhistory.jsp");
    }else{
        response.sendRedirect("prescription.jsp");
    }
%>