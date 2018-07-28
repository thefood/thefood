<%@page import="thefood.lib.SendSMS"%>
<%@page import="thefood.lib.Mailer"%>
<%@page import="thefood.dao.UserDAO"%>
<%@page import="thefood.dto.UserDTO"%>
<%
    String btn = request.getParameter("btn");
    String msg="";
    // Signup Module
    if (btn != null && btn.equals("Verify")) {
        UserDTO user = (UserDTO) session.getAttribute("USER");
        String otp = request.getParameter("otp");
        String userotp = user.getOtp();
        
        if(otp.equals(userotp)) {
            user.setStatus(1);
            session.setAttribute("USER", user);
            UserDAO.updateUserStatus(user);
            response.sendRedirect("index.jsp");
        }else {
            msg="Incorrect OTP";
        }
        
    }


%>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
        <meta name="description" content="">
        <meta name="author" content="">
        <link rel="icon" href="#">
        <title>House Of Mandi</title>
        <!-- Bootstrap core CSS -->
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <link href="css/font-awesome.min.css" rel="stylesheet">
        <link href="css/animsition.min.css" rel="stylesheet">
        <link href="css/animate.css" rel="stylesheet">
        <!-- Custom styles for this template -->
        <link href="css/style.css" rel="stylesheet"> </head>

    <body class="home">
        <div class="site-wrapper animsition" data-animsition-in="fade-in" data-animsition-out="fade-out">
            <!--header starts-->
            <header id="header" class="header-scroll top-header headrom">
                <!-- .navbar -->
                <nav class="navbar navbar-dark">
                    <div class="container">
                        <button class="navbar-toggler hidden-lg-up" type="button" data-toggle="collapse" data-target="#mainNavbarCollapse">&#9776;</button>
                        <a class="navbar-brand" href="index.html"> <img class="img-rounded logo-img" src="images/food-picky-logo.png" alt=""> </a>
                        <div class="collapse navbar-toggleable-md  float-lg-right" id="mainNavbarCollapse">
                            <ul class="nav navbar-nav">
                                <li class="nav-item"> <a class="nav-link active" href="index.html">Home <span class="sr-only">(current)</span></a> </li>
                                <li class="nav-item"> <a class="nav-link active" href="index.html">About Us <span class="sr-only">(current)</span></a> </li>
                                <li class="nav-item"> <a class="nav-link active" href="index.html">Support <span class="sr-only">(current)</span></a> </li>
                                <li class="nav-item"> <a class="nav-link active" href="registration.html"> <img width="23px;" src="images/user.png">
                                        Login or Sign Up <span class="sr-only">(current)</span></a> </li>
                                <!-- <li class="nav-item dropdown"> <a class="nav-link dropdown-toggle" data-toggle="dropdown" href="#" role="button" aria-haspopup="true" aria-expanded="false">Food</a>
                                    <div class="dropdown-menu"> <a class="dropdown-item" href="food_results.html">Food results</a> <a class="dropdown-item" href="map_results.html">Map results</a></div>
                                </li>
                                <li class="nav-item dropdown"> <a class="nav-link dropdown-toggle" data-toggle="dropdown" href="#" role="button" aria-haspopup="true" aria-expanded="false">Restaurants</a>
                                    <div class="dropdown-menu"> <a class="dropdown-item" href="restaurants.html">Search results</a> <a class="dropdown-item" href="profile.html">Profile page</a></div>
                                </li>
                                <li class="nav-item dropdown"> <a class="nav-link dropdown-toggle" data-toggle="dropdown" href="#" role="button" aria-haspopup="true" aria-expanded="false">Pages</a>
                                    <div class="dropdown-menu"> <a class="dropdown-item" href="pricing.html">Pricing</a> <a class="dropdown-item" href="contact.html">Contact</a> <a class="dropdown-item" href="submition.html">Submit restaurant</a> <a class="dropdown-item" href="registration.html">Registration</a>
                                        <div class="dropdown-divider"></div> <a class="dropdown-item" href="checkout.html">Checkout</a> </div>
                                </li> -->
                            </ul>
                        </div>
                    </div>
                </nav>
                <!-- /.navbar -->
            </header>
            <div class="page-wrapper">
                <!--    <div class="breadcrumb">
                   <div class="container">
                      <ul>
                         <li><a href="#" class="active">Home</a></li>
                         <li><a href="#">Search results</a></li>
                         <li>Profile</li>
                      </ul>
                   </div>
                   </div> -->
                <section class="contact-page inner-page">
                    <div class="container">
                        <div class="register-box">
                            <div class="bs-example bs-example-tabs">
                                <ul class="nav nav-tabs" role="tablist">
                                    <li class="nav-item">
                                        <a class="nav-link active" href="#signin" role="tab" data-toggle="tab">Verify OTP</a></li>

                                </ul>
                            </div>
                            <div  class="tab-content">
                                <div class="tab-pane fade active in" id="signin">
                                    <%=msg %>
                                    <form class="form-horizontal" method="POST" action="verify_otp.jsp">
                                        <fieldset>
                                            <!-- Sign In Form -->
                                            <!-- Text input-->
                                            <div class="control-group">
                                                <label class="control-label" for="userid">Enter OTP</label>
                                                <div class="controls">
                                                    <input required="" id="userid" name="otp" type="text" class="form-control input-medium" placeholder="9999">
                                                </div>
                                            </div>
                                            <!-- Button -->
                                            <div class="control-group">
                                                <label class="control-label" for="signin"></label>
                                                <div class="controls">
                                                    <Input type="submit" id="signin" name="btn" class="btn btn-success" value="Verify"/>
                                                </div>
                                            </div>
                                        </fieldset>
                                    </form>
                                </div>
                                                               
                            </div>
                        </div>
                </section>
                <section class="app-section">
                    <div class="app-wrap">
                        <div class="container">
                            <div class="row text-img-block text-xs-left">
                                <div class="container">
                                    <div class="col-xs-12 col-sm-6  right-image text-center">
                                        <figure> <img src="images/app.png" alt="Right Image"> </figure>
                                    </div>
                                    <div class="col-xs-12 col-sm-6 left-text">
                                        <h3>The Best Food Delivery App</h3>
                                        <p>Now you can make food happen pretty much wherever you are thanks to the free easy-to-use Food Delivery &amp; Takeout App.</p>
                                        <div class="social-btns">
                                            <a href="#" class="app-btn apple-button clearfix">
                                                <div class="pull-left"><i class="fa fa-apple"></i> </div>
                                                <div class="pull-right"> <span class="text">Available on the</span> <span class="text-2">App Store</span> </div>
                                            </a>
                                            <a href="#" class="app-btn android-button clearfix">
                                                <div class="pull-left"><i class="fa fa-android"></i> </div>
                                                <div class="pull-right"> <span class="text">Available on the</span> <span class="text-2">Play store</span> </div>
                                            </a>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </section>
                <!-- start: FOOTER -->
                <footer class="footer">
                    <div class="container">
                        <!-- top footer statrs -->
                        <div class="row top-footer">
                            <div class="col-xs-12 col-sm-3 footer-logo-block color-gray">
                                <a href="#"> <img src="images/food-picky-logo.png" alt="Footer logo"> </a> <span>Order Delivery &amp; Take-Out </span> </div>
                            <div class="col-xs-12 col-sm-3 about color-gray">
                                <h5>About Us</h5>
                                <ul>
                                    <li><a href="#">About us</a> </li>
                                    <li><a href="#">History</a> </li>
                                    <li><a href="#">Our Team</a> </li>
                                    <li><a href="#">We are hiring</a> </li>
                                </ul>
                            </div>
                            <div class="col-xs-12 col-sm-3 how-it-works-links color-gray">
                                <h5>How it Works</h5>
                                <ul>
                                    <li><a href="#">Enter your location</a> </li>
                                    <li><a href="#">Choose meal</a> </li>
                                    <li><a href="#">Pay via credit card</a> </li>
                                    <li><a href="#">Wait for delivery</a> </li>
                                </ul>
                            </div>

                            <div class="col-xs-12 col-sm-3 popular-locations color-gray">
                                <h5>Popular Dishes</h5>
                                <ul>
                                    <li><a href="#">Dal Makhani</a> </li>
                                    <li><a href="#">Kadhai Paneer</a> </li>
                                    <li><a href="#">Butter Chicken</a> </li>
                                    <li><a href="#">Kadhai Chicken</a> </li>
                                    <li><a href="#">Dal Tadka</a> </li>
                                    <li><a href="#">Brcko</a> </li>
                                    <li><a href="#">Tomato Soup</a> </li>
                                    <li><a href="#">Chilli Potato </a> </li>

                                </ul>
                            </div>
                        </div>

                    </div>
                </footer>
                <!-- end:Footer -->
            </div>
            <!-- end:page wrapper -->
        </div>
        <!--/end:Site wrapper -->
        <!-- Bootstrap core JavaScript
           ================================================== -->
        <!--     <script src="js/jquery.min.js"></script> -->
        <script src="js/jquery.min.js"></script>
        <script src="js/tether.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/animsition.min.js"></script>
        <script src="js/bootstrap-slider.min.js"></script>
        <script src="js/jquery.isotope.min.js"></script>
        <script src="js/headroom.js"></script>
        <script src="js/foodpicky.min.js"></script>

    </body>
</html>

