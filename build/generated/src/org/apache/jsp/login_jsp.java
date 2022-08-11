package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<html lang=\"en\">\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<title> Login</title>\r\n");
      out.write("\t\t<meta charset=\"utf-8\" />\r\n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, user-scalable=0, minimum-scale=1.0, maximum-scale=1.0\">\r\n");
      out.write("\t\t<meta name=\"apple-mobile-web-app-capable\" content=\"yes\">\r\n");
      out.write("\t\t<meta name=\"apple-mobile-web-app-status-bar-style\" content=\"black\">\r\n");
      out.write("\t\t<meta content=\"\" name=\"description\" />\r\n");
      out.write("\t\t<meta content=\"\" name=\"author\" />\r\n");
      out.write("\t\t<link href=\"http://fonts.googleapis.com/css?family=Lato:300,400,400italic,600,700|Raleway:300,400,500,600,700|Crete+Round:400italic\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"vendor/bootstrap/css/bootstrap.min.css\">\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"vendor/fontawesome/css/font-awesome.min.css\">\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"vendor/themify-icons/themify-icons.min.css\">\r\n");
      out.write("\t\t<link href=\"vendor/animate.css/animate.min.css\" rel=\"stylesheet\" media=\"screen\">\r\n");
      out.write("\t\t<link href=\"vendor/perfect-scrollbar/perfect-scrollbar.min.css\" rel=\"stylesheet\" media=\"screen\">\r\n");
      out.write("\t\t<link href=\"vendor/switchery/switchery.min.css\" rel=\"stylesheet\" media=\"screen\">\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"assets/css/styles.css\">\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"assets/css/plugins.css\">\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"assets/css/themes/theme-1.css\" id=\"skin_color\" />\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body class=\"login\" style=\"background-color:lightblue\">\r\n");
      out.write("\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t<div class=\"main-login col-xs-10 col-xs-offset-1 col-sm-8 col-sm-offset-2 col-md-4 col-md-offset-4\">\r\n");
      out.write("\t\t\t\t<div class=\"logo margin-top-30\">\r\n");
      out.write("                                    <b><h1> <b> HospDBMS |  Login  </b></h1></b>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("                             <br>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"box-login\" style=\"border: 7px solid lightcyan  ; padding: 12px; border-radius: 9px 9px; \">\r\n");
      out.write("\t\t\t\t\t<form class=\"form-login\" method=\"get\" action=\"LoginController.jsp\">\r\n");
      out.write("\t\t\t\t\t\t<fieldset>\r\n");
      out.write("\t\t\t\t\t\t\t<legend>\r\n");
      out.write("\t\t\t\t\t\t\t\tSign in to your account\r\n");
      out.write("\t\t\t\t\t\t\t</legend>\r\n");
      out.write("\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t\tPlease enter your name and password to log in.<br />\r\n");
      out.write("\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t<font color=\"red\"><p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${error}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p></font>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"input-icon\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" name=\"email\" placeholder=\"email\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"fa fa-user\"></i> </span>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group form-actions\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"input-icon\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"password\" class=\"form-control password\" name=\"password\" placeholder=\"Password\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"fa fa-lock\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t </span>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("                                                        \r\n");
      out.write("                                                        \r\n");
      out.write("                                                        \r\n");
      out.write("                                                        \r\n");
      out.write("                                                        \r\n");
      out.write("                                                        \r\n");
      out.write("                                                         <table>\r\n");
      out.write("                                                             \r\n");
      out.write("                                                             <tr>\r\n");
      out.write("                                                                 <td>\r\n");
      out.write("                                                                     \r\n");
      out.write("                                                                     \r\n");
      out.write("\t\t\t\t\t\t\t <div class=\"form-actions\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"index.jsp\" class=\"btn btn-primary pull-left\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\tBack <i class=\"fa fa-arrow-circle-left\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("                                                        </div> \r\n");
      out.write("                                                                 \r\n");
      out.write("                                                         </td>\r\n");
      out.write("                                                                 \r\n");
      out.write("                                                                 <td width=\"250px\"></td> \r\n");
      out.write("                                                        \r\n");
      out.write("                                                        <td>\r\n");
      out.write("                                                            \r\n");
      out.write("                                                        <div class=\"form-actions\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t<button type=\"submit\" class=\"btn btn-primary pull-right\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\tLogin <i class=\"fa fa-arrow-circle-right\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t</button>\r\n");
      out.write("                                                        </div> \r\n");
      out.write("                                                        \r\n");
      out.write("                                                        </td>\r\n");
      out.write("                                                             \r\n");
      out.write("                                                             </tr>\r\n");
      out.write("                                                         </table>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("                                                        \r\n");
      out.write("                                                        \r\n");
      out.write("                                                        \r\n");
      out.write("\t\t\t\t\t\t</fieldset>\r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"copyright\">\r\n");
      out.write("\t\t\t\t\t\t&copy; <span class=\"current-year\"></span><span class=\"text-bold text-uppercase\"> HospDBMS</span>. <span>All rights reserved</span>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</body>\r\n");
      out.write("        \r\n");
      out.write("        <script type=\"text/javascript\">\r\n");
      out.write("    function redirect()\r\n");
      out.write("    {\r\n");
      out.write("    var url = \"index.jsp\";\r\n");
      out.write("    window.location(url);\r\n");
      out.write("    }\r\n");
      out.write("    </script>\r\n");
      out.write("\t<!-- end: BODY -->\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
