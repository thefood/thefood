package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import thefood.lib.SendSMS;
import thefood.lib.Mailer;
import thefood.dao.UserDAO;
import thefood.dto.UserDTO;

public final class verify_005fotp_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

    String btn = request.getParameter("btn");

    // Signup Module
    if (btn != null && btn.equals("Verify")) {
        UserDTO user = (UserDTO) session.getAttribute("USER");
        String otp = request.getParameter("otp");
        String userotp = user.getOtp();
        
        if(otp.equals(userotp)) {
            user.setStatus(1);
            session.setAttribute("USER", user);
            UserDAO.updateUserStatus(user);
            response.sendRedirect("index.html");
        }
        
    }



      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("        <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->\r\n");
      out.write("        <meta name=\"description\" content=\"\">\r\n");
      out.write("        <meta name=\"author\" content=\"\">\r\n");
      out.write("        <link rel=\"icon\" href=\"#\">\r\n");
      out.write("        <title>House Of Mandi</title>\r\n");
      out.write("        <!-- Bootstrap core CSS -->\r\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"css/font-awesome.min.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"css/animsition.min.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"css/animate.css\" rel=\"stylesheet\">\r\n");
      out.write("        <!-- Custom styles for this template -->\r\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\"> </head>\r\n");
      out.write("\r\n");
      out.write("    <body class=\"home\">\r\n");
      out.write("        <div class=\"site-wrapper animsition\" data-animsition-in=\"fade-in\" data-animsition-out=\"fade-out\">\r\n");
      out.write("            <!--header starts-->\r\n");
      out.write("            <header id=\"header\" class=\"header-scroll top-header headrom\">\r\n");
      out.write("                <!-- .navbar -->\r\n");
      out.write("                <nav class=\"navbar navbar-dark\">\r\n");
      out.write("                    <div class=\"container\">\r\n");
      out.write("                        <button class=\"navbar-toggler hidden-lg-up\" type=\"button\" data-toggle=\"collapse\" data-target=\"#mainNavbarCollapse\">&#9776;</button>\r\n");
      out.write("                        <a class=\"navbar-brand\" href=\"index.html\"> <img class=\"img-rounded logo-img\" src=\"images/food-picky-logo.png\" alt=\"\"> </a>\r\n");
      out.write("                        <div class=\"collapse navbar-toggleable-md  float-lg-right\" id=\"mainNavbarCollapse\">\r\n");
      out.write("                            <ul class=\"nav navbar-nav\">\r\n");
      out.write("                                <li class=\"nav-item\"> <a class=\"nav-link active\" href=\"index.html\">Home <span class=\"sr-only\">(current)</span></a> </li>\r\n");
      out.write("                                <li class=\"nav-item\"> <a class=\"nav-link active\" href=\"index.html\">About Us <span class=\"sr-only\">(current)</span></a> </li>\r\n");
      out.write("                                <li class=\"nav-item\"> <a class=\"nav-link active\" href=\"index.html\">Support <span class=\"sr-only\">(current)</span></a> </li>\r\n");
      out.write("                                <li class=\"nav-item\"> <a class=\"nav-link active\" href=\"registration.html\"> <img width=\"23px;\" src=\"images/user.png\">\r\n");
      out.write("                                        Login or Sign Up <span class=\"sr-only\">(current)</span></a> </li>\r\n");
      out.write("                                <!-- <li class=\"nav-item dropdown\"> <a class=\"nav-link dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\" role=\"button\" aria-haspopup=\"true\" aria-expanded=\"false\">Food</a>\r\n");
      out.write("                                    <div class=\"dropdown-menu\"> <a class=\"dropdown-item\" href=\"food_results.html\">Food results</a> <a class=\"dropdown-item\" href=\"map_results.html\">Map results</a></div>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li class=\"nav-item dropdown\"> <a class=\"nav-link dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\" role=\"button\" aria-haspopup=\"true\" aria-expanded=\"false\">Restaurants</a>\r\n");
      out.write("                                    <div class=\"dropdown-menu\"> <a class=\"dropdown-item\" href=\"restaurants.html\">Search results</a> <a class=\"dropdown-item\" href=\"profile.html\">Profile page</a></div>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li class=\"nav-item dropdown\"> <a class=\"nav-link dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\" role=\"button\" aria-haspopup=\"true\" aria-expanded=\"false\">Pages</a>\r\n");
      out.write("                                    <div class=\"dropdown-menu\"> <a class=\"dropdown-item\" href=\"pricing.html\">Pricing</a> <a class=\"dropdown-item\" href=\"contact.html\">Contact</a> <a class=\"dropdown-item\" href=\"submition.html\">Submit restaurant</a> <a class=\"dropdown-item\" href=\"registration.html\">Registration</a>\r\n");
      out.write("                                        <div class=\"dropdown-divider\"></div> <a class=\"dropdown-item\" href=\"checkout.html\">Checkout</a> </div>\r\n");
      out.write("                                </li> -->\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </nav>\r\n");
      out.write("                <!-- /.navbar -->\r\n");
      out.write("            </header>\r\n");
      out.write("            <div class=\"page-wrapper\">\r\n");
      out.write("                <!--    <div class=\"breadcrumb\">\r\n");
      out.write("                   <div class=\"container\">\r\n");
      out.write("                      <ul>\r\n");
      out.write("                         <li><a href=\"#\" class=\"active\">Home</a></li>\r\n");
      out.write("                         <li><a href=\"#\">Search results</a></li>\r\n");
      out.write("                         <li>Profile</li>\r\n");
      out.write("                      </ul>\r\n");
      out.write("                   </div>\r\n");
      out.write("                   </div> -->\r\n");
      out.write("                <section class=\"contact-page inner-page\">\r\n");
      out.write("                    <div class=\"container\">\r\n");
      out.write("                        <div class=\"register-box\">\r\n");
      out.write("                            <div class=\"bs-example bs-example-tabs\">\r\n");
      out.write("                                <ul class=\"nav nav-tabs\" role=\"tablist\">\r\n");
      out.write("                                    <li class=\"nav-item\">\r\n");
      out.write("                                        <a class=\"nav-link active\" href=\"#signin\" role=\"tab\" data-toggle=\"tab\">Verify OTP</a></li>\r\n");
      out.write("\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div  class=\"tab-content\">\r\n");
      out.write("                                <div class=\"tab-pane fade active in\" id=\"signin\">\r\n");
      out.write("                                    <form class=\"form-horizontal\" method=\"POST\" action=\"verify_otp.jsp\">\r\n");
      out.write("                                        <fieldset>\r\n");
      out.write("                                            <!-- Sign In Form -->\r\n");
      out.write("                                            <!-- Text input-->\r\n");
      out.write("                                            <div class=\"control-group\">\r\n");
      out.write("                                                <label class=\"control-label\" for=\"userid\">Enter OTP</label>\r\n");
      out.write("                                                <div class=\"controls\">\r\n");
      out.write("                                                    <input required=\"\" id=\"userid\" name=\"otp\" type=\"text\" class=\"form-control input-medium\" placeholder=\"9999\">\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <!-- Button -->\r\n");
      out.write("                                            <div class=\"control-group\">\r\n");
      out.write("                                                <label class=\"control-label\" for=\"signin\"></label>\r\n");
      out.write("                                                <div class=\"controls\">\r\n");
      out.write("                                                    <Input type=\"submit\" id=\"signin\" name=\"btn\" class=\"btn btn-success\" value=\"Verify\"/>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </fieldset>\r\n");
      out.write("                                    </form>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                                               \r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                </section>\r\n");
      out.write("                <section class=\"app-section\">\r\n");
      out.write("                    <div class=\"app-wrap\">\r\n");
      out.write("                        <div class=\"container\">\r\n");
      out.write("                            <div class=\"row text-img-block text-xs-left\">\r\n");
      out.write("                                <div class=\"container\">\r\n");
      out.write("                                    <div class=\"col-xs-12 col-sm-6  right-image text-center\">\r\n");
      out.write("                                        <figure> <img src=\"images/app.png\" alt=\"Right Image\"> </figure>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"col-xs-12 col-sm-6 left-text\">\r\n");
      out.write("                                        <h3>The Best Food Delivery App</h3>\r\n");
      out.write("                                        <p>Now you can make food happen pretty much wherever you are thanks to the free easy-to-use Food Delivery &amp; Takeout App.</p>\r\n");
      out.write("                                        <div class=\"social-btns\">\r\n");
      out.write("                                            <a href=\"#\" class=\"app-btn apple-button clearfix\">\r\n");
      out.write("                                                <div class=\"pull-left\"><i class=\"fa fa-apple\"></i> </div>\r\n");
      out.write("                                                <div class=\"pull-right\"> <span class=\"text\">Available on the</span> <span class=\"text-2\">App Store</span> </div>\r\n");
      out.write("                                            </a>\r\n");
      out.write("                                            <a href=\"#\" class=\"app-btn android-button clearfix\">\r\n");
      out.write("                                                <div class=\"pull-left\"><i class=\"fa fa-android\"></i> </div>\r\n");
      out.write("                                                <div class=\"pull-right\"> <span class=\"text\">Available on the</span> <span class=\"text-2\">Play store</span> </div>\r\n");
      out.write("                                            </a>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </section>\r\n");
      out.write("                <!-- start: FOOTER -->\r\n");
      out.write("                <footer class=\"footer\">\r\n");
      out.write("                    <div class=\"container\">\r\n");
      out.write("                        <!-- top footer statrs -->\r\n");
      out.write("                        <div class=\"row top-footer\">\r\n");
      out.write("                            <div class=\"col-xs-12 col-sm-3 footer-logo-block color-gray\">\r\n");
      out.write("                                <a href=\"#\"> <img src=\"images/food-picky-logo.png\" alt=\"Footer logo\"> </a> <span>Order Delivery &amp; Take-Out </span> </div>\r\n");
      out.write("                            <div class=\"col-xs-12 col-sm-3 about color-gray\">\r\n");
      out.write("                                <h5>About Us</h5>\r\n");
      out.write("                                <ul>\r\n");
      out.write("                                    <li><a href=\"#\">About us</a> </li>\r\n");
      out.write("                                    <li><a href=\"#\">History</a> </li>\r\n");
      out.write("                                    <li><a href=\"#\">Our Team</a> </li>\r\n");
      out.write("                                    <li><a href=\"#\">We are hiring</a> </li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-xs-12 col-sm-3 how-it-works-links color-gray\">\r\n");
      out.write("                                <h5>How it Works</h5>\r\n");
      out.write("                                <ul>\r\n");
      out.write("                                    <li><a href=\"#\">Enter your location</a> </li>\r\n");
      out.write("                                    <li><a href=\"#\">Choose meal</a> </li>\r\n");
      out.write("                                    <li><a href=\"#\">Pay via credit card</a> </li>\r\n");
      out.write("                                    <li><a href=\"#\">Wait for delivery</a> </li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"col-xs-12 col-sm-3 popular-locations color-gray\">\r\n");
      out.write("                                <h5>Popular Dishes</h5>\r\n");
      out.write("                                <ul>\r\n");
      out.write("                                    <li><a href=\"#\">Dal Makhani</a> </li>\r\n");
      out.write("                                    <li><a href=\"#\">Kadhai Paneer</a> </li>\r\n");
      out.write("                                    <li><a href=\"#\">Butter Chicken</a> </li>\r\n");
      out.write("                                    <li><a href=\"#\">Kadhai Chicken</a> </li>\r\n");
      out.write("                                    <li><a href=\"#\">Dal Tadka</a> </li>\r\n");
      out.write("                                    <li><a href=\"#\">Brcko</a> </li>\r\n");
      out.write("                                    <li><a href=\"#\">Tomato Soup</a> </li>\r\n");
      out.write("                                    <li><a href=\"#\">Chilli Potato </a> </li>\r\n");
      out.write("\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                </footer>\r\n");
      out.write("                <!-- end:Footer -->\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- end:page wrapper -->\r\n");
      out.write("        </div>\r\n");
      out.write("        <!--/end:Site wrapper -->\r\n");
      out.write("        <!-- Bootstrap core JavaScript\r\n");
      out.write("           ================================================== -->\r\n");
      out.write("        <!--     <script src=\"js/jquery.min.js\"></script> -->\r\n");
      out.write("        <script src=\"js/jquery.min.js\"></script>\r\n");
      out.write("        <script src=\"js/tether.min.js\"></script>\r\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("        <script src=\"js/animsition.min.js\"></script>\r\n");
      out.write("        <script src=\"js/bootstrap-slider.min.js\"></script>\r\n");
      out.write("        <script src=\"js/jquery.isotope.min.js\"></script>\r\n");
      out.write("        <script src=\"js/headroom.js\"></script>\r\n");
      out.write("        <script src=\"js/foodpicky.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
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
