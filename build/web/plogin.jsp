<html lang="en">
	<head>
		<title>Patient Login</title>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0, minimum-scale=1.0, maximum-scale=1.0">
		<meta name="apple-mobile-web-app-capable" content="yes">
		<meta name="apple-mobile-web-app-status-bar-style" content="black">
		<meta content="" name="description" />
		<meta content="" name="author" />
		<link href="http://fonts.googleapis.com/css?family=Lato:300,400,400italic,600,700|Raleway:300,400,500,600,700|Crete+Round:400italic" rel="stylesheet" type="text/css" />
		<link rel="stylesheet" href="vendor/bootstrap/css/bootstrap.min.css">
		<link rel="stylesheet" href="vendor/fontawesome/css/font-awesome.min.css">
		<link rel="stylesheet" href="vendor/themify-icons/themify-icons.min.css">
		<link href="vendor/animate.css/animate.min.css" rel="stylesheet" media="screen">
		<link href="vendor/perfect-scrollbar/perfect-scrollbar.min.css" rel="stylesheet" media="screen">
		<link href="vendor/switchery/switchery.min.css" rel="stylesheet" media="screen">
		<link rel="stylesheet" href="assets/css/styles.css">
		<link rel="stylesheet" href="assets/css/plugins.css">
		<link rel="stylesheet" href="assets/css/themes/theme-1.css" id="skin_color" />
	</head>
	<body class="login" style="background-color:lightblue">
		<div class="row">
			<div class="main-login col-xs-10 col-xs-offset-1 col-sm-8 col-sm-offset-2 col-md-4 col-md-offset-4">
				<div class="logo margin-top-30">
                                    <b><h1> <b> HospDBMS | Patient Login  </b></h1></b>
				</div>
                             <br>

				<div class="box-login" style="border: 7px solid lightcyan  ; padding: 12px; border-radius: 9px 9px; ">
					<form class="form-login" method="post" action="patientpage.jsp">
						<fieldset>
							<legend>
								Sign in to your account
							</legend>
							<p>
								Please enter your name and password to log in.<br />
							</p>
							<font color="red"><p>${error}</p></font>
							<div class="form-group">
								<span class="input-icon">
									<input type="text" class="form-control" name="username" placeholder="Username">
									<i class="fa fa-user"></i> </span>
							</div>
							<div class="form-group form-actions">
								<span class="input-icon">
									<input type="password" class="form-control password" name="password" placeholder="Password">
									<i class="fa fa-lock"></i>
									 </span>
							
                                                            
                                                            <table>
                                                             
                                                             <tr>
                                                                 <td>
                                                                     
                                                                     
							 <div class="form-actions">
								
								<a href="index.jsp" class="btn btn-primary pull-left">
									Back <i class="fa fa-arrow-circle-left"></i>
								</a>
                                                        </div> 
                                                                 
                                                         </td>
                                                                 
                                                                 <td width="250px"></td> 
                                                        
                                                        <td>
                                                            
                                                        <div class="form-actions">
								
								<button type="submit" class="btn btn-primary pull-right" name="submit">
									Login <i class="fa fa-arrow-circle-right"></i>
								</button>
                                                        </div> 
                                                        
                                                        </td>
                                                             
                                                             </tr>
                                                         </table>
                                                            
							
						</fieldset>
					</form>

					<div class="copyright">
						&copy; <span class="current-year"></span><span class="text-bold text-uppercase"> HospDBMS</span>. <span>All rights reserved</span>
					</div>
			
				</div>

			</div>
		</div>
	</body>
	<!-- end: BODY -->
</html>