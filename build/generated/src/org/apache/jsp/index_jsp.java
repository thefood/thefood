package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import thefood.dao.ItemDAO;
import thefood.dto.ItemDTO;
import java.util.ArrayList;
import thefood.dto.UserDTO;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    UserDTO user = (UserDTO) session.getAttribute("USER");
    ArrayList<ItemDTO> popularitems = ItemDAO.getPopularItem();

    ArrayList<ItemDTO> selecteditems = (ArrayList<ItemDTO>) session.getAttribute("CART");
    if(selecteditems==null) {
        selecteditems = new ArrayList<>();
        //session.setAttribute("CART", selecteditems);
    }
    
    String btn = request.getParameter("btn");
    if(btn!=null && btn.equals("Order Now")) {
        String itemid = request.getParameter("itemid");
        ItemDTO item = ItemDAO.getItemById(Integer.parseInt(itemid));
        selecteditems.add(item);
        session.setAttribute("CART", selecteditems);
    }


      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("        <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->\r\n");
      out.write("        <meta name=\"description\" content=\"\">\r\n");
      out.write("        <meta name=\"author\" content=\"\">\r\n");
      out.write("        <link rel=\"icon\" href=\"#\">\r\n");
      out.write("        <title>The Food</title>\r\n");
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
      out.write("                        <a class=\"navbar-brand\" href=\"index.html\"> <img class=\"img-rounded logo-img\" src=\"images/logo.png\" alt=\"\"> </a>\r\n");
      out.write("                        <div class=\"collapse navbar-toggleable-md  float-lg-right\" id=\"mainNavbarCollapse\">\r\n");
      out.write("                            <ul class=\"nav navbar-nav\">\r\n");
      out.write("                                <li class=\"nav-item\"> <a class=\"nav-link active\" href=\"index.html\">Home <span class=\"sr-only\">(current)</span></a> </li>\r\n");
      out.write("                                <li class=\"nav-item\"> <a class=\"nav-link active\" href=\"index.html\">About Us <span class=\"sr-only\">(current)</span></a> </li>\r\n");
      out.write("                                <li class=\"nav-item\"> <a class=\"nav-link active\" href=\"contact.html\">Contact Us <span class=\"sr-only\">(current)</span></a> </li>\r\n");
      out.write("                                <li class=\"nav-item\"> <a class=\"nav-link active\" href=\"index.html\">Support <span class=\"sr-only\">(current)</span></a> </li>\r\n");
      out.write("                                <li class=\"nav-item\"> <a class=\"nav-link active\" href=\"cart.jsp\">Cart ");
      out.print(selecteditems.size());
      out.write("<span class=\"sr-only\">(current)</span></a> </li>\r\n");
      out.write("\r\n");
      out.write("                                ");
 if (user == null) { 
      out.write("                            \r\n");
      out.write("                                <li class=\"nav-item\"> <a class=\"nav-link active\" href=\"registration.jsp\"> <img width=\"23px;\" src=\"images/user.png\">\r\n");
      out.write("                                        Login or Sign Up <span class=\"sr-only\">(current)</span></a> </li>\r\n");
      out.write("                                        ");
 } else {
      out.write("\r\n");
      out.write("                                <li class=\"nav-item\"> <a class=\"nav-link active\" href=\"\"> <img width=\"23px;\" src=\"images/user.png\">\r\n");
      out.write("                                        ");
      out.print(user.getFullname());
      out.write(" <span class=\"sr-only\">(current)</span></a> </li>\r\n");
      out.write("\r\n");
      out.write("                                ");
 } 
      out.write("\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </nav>\r\n");
      out.write("                <!-- /.navbar -->\r\n");
      out.write("            </header>\r\n");
      out.write("            <!-- banner part starts -->\r\n");
      out.write("            <section class=\"hero bg-image\" data-image-src=\"images/image01.jpg\">\r\n");
      out.write("                <div class=\"hero-inner\">\r\n");
      out.write("                    <div class=\"container text-center hero-text font-white\">\r\n");
      out.write("                        <h1>Order Delivery & Take-Out </h1>\r\n");
      out.write("                        <h5 class=\"font-white space-xs\">Find specials, and coupons for free</h5>\r\n");
      out.write("                        <div class=\"banner-form\">\r\n");
      out.write("                            <form class=\"form-inline\">\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <label class=\"sr-only\" for=\"exampleInputAmount\">I would like to eat....</label>\r\n");
      out.write("                                    <div class=\"form-group\">\r\n");
      out.write("                                        <input type=\"text\" class=\"form-control form-control-lg\" id=\"exampleInputAmount\" placeholder=\"I would like to eat....\"> </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <button onclick=\"location.href = 'food_results.html'\" type=\"button\" class=\"btn theme-btn btn-lg\">Search food</button>\r\n");
      out.write("                            </form>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"steps\">\r\n");
      out.write("                            <div class=\"step-item step1\">\r\n");
      out.write("                                <svg xmlns=\"http://www.w3.org/2000/svg\" viewbox=\"0 0 483 483\" width=\"512\" height=\"512\">\r\n");
      out.write("                                <g fill=\"#FFF\">\r\n");
      out.write("                                <path d=\"M467.006 177.92c-.055-1.573-.469-3.321-1.233-4.755L407.006 62.877V10.5c0-5.799-4.701-10.5-10.5-10.5h-310c-5.799 0-10.5 4.701-10.5 10.5v52.375L17.228 173.164a10.476 10.476 0 0 0-1.22 4.938h-.014V472.5c0 5.799 4.701 10.5 10.5 10.5h430.012c5.799 0 10.5-4.701 10.5-10.5V177.92zM282.379 76l18.007 91.602H182.583L200.445 76h81.934zm19.391 112.602c-4.964 29.003-30.096 51.143-60.281 51.143-30.173 0-55.295-22.139-60.258-51.143H301.77zm143.331 0c-4.96 29.003-30.075 51.143-60.237 51.143-30.185 0-55.317-22.139-60.281-51.143h120.518zm-123.314-21L303.78 76h86.423l48.81 91.602H321.787zM97.006 55V21h289v34h-289zm-4.198 21h86.243l-17.863 91.602h-117.2L92.808 76zm65.582 112.602c-5.028 28.475-30.113 50.19-60.229 50.19s-55.201-21.715-60.23-50.19H158.39zM300 462H183V306h117v156zm21 0V295.5c0-5.799-4.701-10.5-10.5-10.5h-138c-5.799 0-10.5 4.701-10.5 10.5V462H36.994V232.743a82.558 82.558 0 0 0 3.101 3.255c15.485 15.344 36.106 23.794 58.065 23.794s42.58-8.45 58.065-23.794a81.625 81.625 0 0 0 13.525-17.672c14.067 25.281 40.944 42.418 71.737 42.418 30.752 0 57.597-17.081 71.688-42.294 14.091 25.213 40.936 42.294 71.688 42.294 24.262 0 46.092-10.645 61.143-27.528V462H321z\"></path>\r\n");
      out.write("                                <path d=\"M202.494 386h22c5.799 0 10.5-4.701 10.5-10.5s-4.701-10.5-10.5-10.5h-22c-5.799 0-10.5 4.701-10.5 10.5s4.701 10.5 10.5 10.5z\"></path>\r\n");
      out.write("                                </g>\r\n");
      out.write("                                </svg>\r\n");
      out.write("                                <h4><span>1. </span>Choose Location</h4> </div>\r\n");
      out.write("                            <!-- end:Step -->\r\n");
      out.write("                            <div class=\"step-item step2\">\r\n");
      out.write("                                <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"512\" height=\"512\" viewbox=\"0 0 380.721 380.721\">\r\n");
      out.write("                                <g fill=\"#FFF\">\r\n");
      out.write("                                <path d=\"M58.727 281.236c.32-5.217.657-10.457 1.319-15.709 1.261-12.525 3.974-25.05 6.733-37.296a543.51 543.51 0 0 1 5.449-17.997c2.463-5.729 4.868-11.433 7.25-17.01 5.438-10.898 11.491-21.07 18.724-29.593 1.737-2.19 3.427-4.328 5.095-6.46 1.912-1.894 3.805-3.747 5.676-5.588 3.863-3.509 7.221-7.273 11.107-10.091 7.686-5.711 14.529-11.137 21.477-14.506 6.698-3.724 12.455-6.982 17.631-8.812 10.125-4.084 15.883-6.141 15.883-6.141s-4.915 3.893-13.502 10.207c-4.449 2.917-9.114 7.488-14.721 12.147-5.803 4.461-11.107 10.84-17.358 16.992-3.149 3.114-5.588 7.064-8.551 10.684-1.452 1.83-2.928 3.712-4.427 5.6a1225.858 1225.858 0 0 1-3.84 6.286c-5.537 8.208-9.673 17.858-13.995 27.664-1.748 5.1-3.566 10.283-5.391 15.534a371.593 371.593 0 0 1-4.16 16.476c-2.266 11.271-4.502 22.761-5.438 34.612-.68 4.287-1.022 8.633-1.383 12.979 94 .023 166.775.069 268.589.069.337-4.462.534-8.97.534-13.536 0-85.746-62.509-156.352-142.875-165.705 5.17-4.869 8.436-11.758 8.436-19.433-.023-14.692-11.921-26.612-26.631-26.612-14.715 0-26.652 11.92-26.652 26.642 0 7.668 3.265 14.558 8.464 19.426-80.396 9.353-142.869 79.96-142.869 165.706 0 4.543.168 9.027.5 13.467 9.935-.002 19.526-.002 28.926-.002zM0 291.135h380.721v33.59H0z\" /> </g>\r\n");
      out.write("                                </svg>\r\n");
      out.write("                                <h4><span>2. </span>Order Food</h4> </div>\r\n");
      out.write("                            <!-- end:Step -->\r\n");
      out.write("                            <div class=\"step-item step3\">\r\n");
      out.write("                                <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"512\" height=\"512\" viewbox=\"0 0 612.001 612\">\r\n");
      out.write("                                <path d=\"M604.131 440.17h-19.12V333.237c0-12.512-3.776-24.787-10.78-35.173l-47.92-70.975a62.99 62.99 0 0 0-52.169-27.698h-74.28c-8.734 0-15.737 7.082-15.737 15.738v225.043h-121.65c11.567 9.992 19.514 23.92 21.796 39.658H412.53c4.563-31.238 31.475-55.396 63.972-55.396 32.498 0 59.33 24.158 63.895 55.396h63.735c4.328 0 7.869-3.541 7.869-7.869V448.04c-.001-4.327-3.541-7.87-7.87-7.87zM525.76 312.227h-98.044a7.842 7.842 0 0 1-7.868-7.869v-54.372c0-4.328 3.541-7.869 7.868-7.869h59.724c2.597 0 4.957 1.259 6.452 3.305l38.32 54.451c3.619 5.194-.079 12.354-6.452 12.354zM476.502 440.17c-27.068 0-48.943 21.953-48.943 49.021 0 26.99 21.875 48.943 48.943 48.943 26.989 0 48.943-21.953 48.943-48.943 0-27.066-21.954-49.021-48.943-49.021zm0 73.495c-13.535 0-24.472-11.016-24.472-24.471 0-13.535 10.937-24.473 24.472-24.473 13.533 0 24.472 10.938 24.472 24.473 0 13.455-10.938 24.471-24.472 24.471zM68.434 440.17c-4.328 0-7.869 3.543-7.869 7.869v23.922c0 4.328 3.541 7.869 7.869 7.869h87.971c2.282-15.738 10.229-29.666 21.718-39.658H68.434v-.002zm151.864 0c-26.989 0-48.943 21.953-48.943 49.021 0 26.99 21.954 48.943 48.943 48.943 27.068 0 48.943-21.953 48.943-48.943.001-27.066-21.874-49.021-48.943-49.021zm0 73.495c-13.534 0-24.471-11.016-24.471-24.471 0-13.535 10.937-24.473 24.471-24.473s24.472 10.938 24.472 24.473c0 13.455-10.938 24.471-24.472 24.471zm117.716-363.06h-91.198c4.485 13.298 6.846 27.54 6.846 42.255 0 74.28-60.431 134.711-134.711 134.711-13.535 0-26.675-2.045-39.029-5.744v86.949c0 4.328 3.541 7.869 7.869 7.869h265.96c4.329 0 7.869-3.541 7.869-7.869V174.211c-.001-13.062-10.545-23.606-23.606-23.606zM118.969 73.866C53.264 73.866 0 127.129 0 192.834s53.264 118.969 118.969 118.969 118.97-53.264 118.97-118.969-53.265-118.968-118.97-118.968zm0 210.864c-50.752 0-91.896-41.143-91.896-91.896s41.144-91.896 91.896-91.896c50.753 0 91.896 41.144 91.896 91.896 0 50.753-41.143 91.896-91.896 91.896zm35.097-72.488c-1.014 0-2.052-.131-3.082-.407L112.641 201.5a11.808 11.808 0 0 1-8.729-11.396v-59.015c0-6.516 5.287-11.803 11.803-11.803 6.516 0 11.803 5.287 11.803 11.803v49.971l29.614 7.983c6.294 1.698 10.02 8.177 8.322 14.469-1.421 5.264-6.185 8.73-11.388 8.73z\" fill=\"#FFF\" /> </svg>\r\n");
      out.write("                                <h4><span>3. </span>Delivery or take out</h4> </div>\r\n");
      out.write("                            <!-- end:Step -->\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <!-- end:Steps -->\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!--end:Hero inner -->\r\n");
      out.write("            </section>\r\n");
      out.write("            <!-- banner part ends -->\r\n");
      out.write("            <!-- location match part starts -->\r\n");
      out.write("            <!--  <div class=\"location-match text-xs-center\">\r\n");
      out.write("                 <div class=\"container\"> <span>356 restaurants matched your location: <span class=\"primary-color\">New York, NY -</span> </span>\r\n");
      out.write("                 </div>\r\n");
      out.write("             </div> -->\r\n");
      out.write("            <!-- location match part ends -->\r\n");
      out.write("            <!-- Popular block starts -->\r\n");
      out.write("            <section class=\"popular\">\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <div class=\"title text-xs-center m-b-30\">\r\n");
      out.write("                        <h2>Popular dishes of the month</h2>\r\n");
      out.write("                        <p class=\"lead\">The easiest way to your favourite food</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        ");
 for (ItemDTO item : popularitems) {
      out.write("\r\n");
      out.write("                        <!-- Each popular food item starts -->\r\n");
      out.write("                        <div class=\"col-xs-12 col-sm-6 col-md-4 food-item\">\r\n");
      out.write("                            <div class=\"food-item-wrap\">\r\n");
      out.write("                                <div class=\"figure-wrap bg-image\" data-image-src=\"images/food1.jpg\">\r\n");
      out.write("                                    <div class=\"distance\"><div class=\"mins\"><i class=\"fa fa-motorcycle\"></i> 30 min</div></div>\r\n");
      out.write("                                    <!-- <div class=\"rating pull-left\"> <i class=\"fa fa-star\"></i> <i class=\"fa fa-star\"></i> <i class=\"fa fa-star\"></i> <i class=\"fa fa-star\"></i> <i class=\"fa fa-star-o\"></i> </div> -->\r\n");
      out.write("                                    <!-- <div class=\"review pull-right\"><a href=\"#\">198 reviews</a> </div> -->\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"content\">\r\n");
      out.write("                                    <h5><a href=\"profile.html\">");
      out.print(item.getItemnm());
      out.write("</a></h5>\r\n");
      out.write("                                    <div class=\"product-name\">");
      out.print(item.getCat().getCatnm());
      out.write("</div>\r\n");
      out.write("                                    <div class=\"price-btn-block\"> <span class=\"price\">Rs. ");
      out.print(item.getItemprice());
      out.write("</span> \r\n");
      out.write("                                        <form action=\"index.jsp\">\r\n");
      out.write("                                            <!--\r\n");
      out.write("                                        <a href=\"#\" class=\"btn theme-btn-dash pull-right\">Order Now</a> </div>\r\n");
      out.write("                                            -->\r\n");
      out.write("                                            <input type=\"hidden\" name=\"itemid\" value=\"");
      out.print(item.getItemid());
      out.write("\"/>\r\n");
      out.write("                                            <input type=\"submit\" name=\"btn\" class=\"btn theme-btn-dash pull-right\" value=\"Order Now\" /> \r\n");
      out.write("                                        </form>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        ");
 }
      out.write("\r\n");
      out.write("                        <!-- Each popular food item starts -->\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </section>\r\n");
      out.write("            <!-- Popular block ends -->\r\n");
      out.write("            <!-- How it works block starts -->\r\n");
      out.write("            <section class=\"how-it-works\">\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <div class=\"text-xs-center\">\r\n");
      out.write("                        <h2>Easy 3 Step Order</h2>\r\n");
      out.write("                        <!-- 3 block sections starts -->\r\n");
      out.write("                        <div class=\"row how-it-works-solution\">\r\n");
      out.write("                            <div class=\"col-xs-12 col-sm-12 col-md-4 how-it-works-steps white-txt col1\">\r\n");
      out.write("                                <div class=\"how-it-works-wrap\">\r\n");
      out.write("                                    <div class=\"step step-1\">\r\n");
      out.write("                                        <div class=\"icon\" data-step=\"1\">\r\n");
      out.write("                                            <svg xmlns=\"http://www.w3.org/2000/svg\" viewbox=\"0 0 483 483\" width=\"512\" height=\"512\">\r\n");
      out.write("                                            <g fill=\"#FFF\">\r\n");
      out.write("                                            <path d=\"M467.006 177.92c-.055-1.573-.469-3.321-1.233-4.755L407.006 62.877V10.5c0-5.799-4.701-10.5-10.5-10.5h-310c-5.799 0-10.5 4.701-10.5 10.5v52.375L17.228 173.164a10.476 10.476 0 0 0-1.22 4.938h-.014V472.5c0 5.799 4.701 10.5 10.5 10.5h430.012c5.799 0 10.5-4.701 10.5-10.5V177.92zM282.379 76l18.007 91.602H182.583L200.445 76h81.934zm19.391 112.602c-4.964 29.003-30.096 51.143-60.281 51.143-30.173 0-55.295-22.139-60.258-51.143H301.77zm143.331 0c-4.96 29.003-30.075 51.143-60.237 51.143-30.185 0-55.317-22.139-60.281-51.143h120.518zm-123.314-21L303.78 76h86.423l48.81 91.602H321.787zM97.006 55V21h289v34h-289zm-4.198 21h86.243l-17.863 91.602h-117.2L92.808 76zm65.582 112.602c-5.028 28.475-30.113 50.19-60.229 50.19s-55.201-21.715-60.23-50.19H158.39zM300 462H183V306h117v156zm21 0V295.5c0-5.799-4.701-10.5-10.5-10.5h-138c-5.799 0-10.5 4.701-10.5 10.5V462H36.994V232.743a82.558 82.558 0 0 0 3.101 3.255c15.485 15.344 36.106 23.794 58.065 23.794s42.58-8.45 58.065-23.794a81.625 81.625 0 0 0 13.525-17.672c14.067 25.281 40.944 42.418 71.737 42.418 30.752 0 57.597-17.081 71.688-42.294 14.091 25.213 40.936 42.294 71.688 42.294 24.262 0 46.092-10.645 61.143-27.528V462H321z\" />\r\n");
      out.write("                                            <path d=\"M202.494 386h22c5.799 0 10.5-4.701 10.5-10.5s-4.701-10.5-10.5-10.5h-22c-5.799 0-10.5 4.701-10.5 10.5s4.701 10.5 10.5 10.5z\" /> </g>\r\n");
      out.write("                                            </svg>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <h3>Choose a dish</h3>\r\n");
      out.write("                                        <p>We\"ve got your covered with menus from over 345 delivery restaurants online.</p>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-xs-12 col-sm-12 col-md-4 how-it-works-steps white-txt col2\">\r\n");
      out.write("                                <div class=\"step step-2\">\r\n");
      out.write("                                    <div class=\"icon\" data-step=\"2\">\r\n");
      out.write("                                        <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"512\" height=\"512\" viewbox=\"0 0 380.721 380.721\">\r\n");
      out.write("                                        <g fill=\"#FFF\">\r\n");
      out.write("                                        <path d=\"M58.727 281.236c.32-5.217.657-10.457 1.319-15.709 1.261-12.525 3.974-25.05 6.733-37.296a543.51 543.51 0 0 1 5.449-17.997c2.463-5.729 4.868-11.433 7.25-17.01 5.438-10.898 11.491-21.07 18.724-29.593 1.737-2.19 3.427-4.328 5.095-6.46 1.912-1.894 3.805-3.747 5.676-5.588 3.863-3.509 7.221-7.273 11.107-10.091 7.686-5.711 14.529-11.137 21.477-14.506 6.698-3.724 12.455-6.982 17.631-8.812 10.125-4.084 15.883-6.141 15.883-6.141s-4.915 3.893-13.502 10.207c-4.449 2.917-9.114 7.488-14.721 12.147-5.803 4.461-11.107 10.84-17.358 16.992-3.149 3.114-5.588 7.064-8.551 10.684-1.452 1.83-2.928 3.712-4.427 5.6a1225.858 1225.858 0 0 1-3.84 6.286c-5.537 8.208-9.673 17.858-13.995 27.664-1.748 5.1-3.566 10.283-5.391 15.534a371.593 371.593 0 0 1-4.16 16.476c-2.266 11.271-4.502 22.761-5.438 34.612-.68 4.287-1.022 8.633-1.383 12.979 94 .023 166.775.069 268.589.069.337-4.462.534-8.97.534-13.536 0-85.746-62.509-156.352-142.875-165.705 5.17-4.869 8.436-11.758 8.436-19.433-.023-14.692-11.921-26.612-26.631-26.612-14.715 0-26.652 11.92-26.652 26.642 0 7.668 3.265 14.558 8.464 19.426-80.396 9.353-142.869 79.96-142.869 165.706 0 4.543.168 9.027.5 13.467 9.935-.002 19.526-.002 28.926-.002zM0 291.135h380.721v33.59H0z\" /> </g>\r\n");
      out.write("                                        </svg>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <h3>Choose a tasty dish</h3>\r\n");
      out.write("                                    <p>We\"ve got your covered with menus from over 345 delivery restaurants online.</p>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-xs-12 col-sm-12 col-md-4 how-it-works-steps white-txt col3\">\r\n");
      out.write("                                <div class=\"step step-3\">\r\n");
      out.write("                                    <div class=\"icon\" data-step=\"3\">\r\n");
      out.write("                                        <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"512\" height=\"512\" viewbox=\"0 0 612.001 612\">\r\n");
      out.write("                                        <path d=\"M604.131 440.17h-19.12V333.237c0-12.512-3.776-24.787-10.78-35.173l-47.92-70.975a62.99 62.99 0 0 0-52.169-27.698h-74.28c-8.734 0-15.737 7.082-15.737 15.738v225.043h-121.65c11.567 9.992 19.514 23.92 21.796 39.658H412.53c4.563-31.238 31.475-55.396 63.972-55.396 32.498 0 59.33 24.158 63.895 55.396h63.735c4.328 0 7.869-3.541 7.869-7.869V448.04c-.001-4.327-3.541-7.87-7.87-7.87zM525.76 312.227h-98.044a7.842 7.842 0 0 1-7.868-7.869v-54.372c0-4.328 3.541-7.869 7.868-7.869h59.724c2.597 0 4.957 1.259 6.452 3.305l38.32 54.451c3.619 5.194-.079 12.354-6.452 12.354zM476.502 440.17c-27.068 0-48.943 21.953-48.943 49.021 0 26.99 21.875 48.943 48.943 48.943 26.989 0 48.943-21.953 48.943-48.943 0-27.066-21.954-49.021-48.943-49.021zm0 73.495c-13.535 0-24.472-11.016-24.472-24.471 0-13.535 10.937-24.473 24.472-24.473 13.533 0 24.472 10.938 24.472 24.473 0 13.455-10.938 24.471-24.472 24.471zM68.434 440.17c-4.328 0-7.869 3.543-7.869 7.869v23.922c0 4.328 3.541 7.869 7.869 7.869h87.971c2.282-15.738 10.229-29.666 21.718-39.658H68.434v-.002zm151.864 0c-26.989 0-48.943 21.953-48.943 49.021 0 26.99 21.954 48.943 48.943 48.943 27.068 0 48.943-21.953 48.943-48.943.001-27.066-21.874-49.021-48.943-49.021zm0 73.495c-13.534 0-24.471-11.016-24.471-24.471 0-13.535 10.937-24.473 24.471-24.473s24.472 10.938 24.472 24.473c0 13.455-10.938 24.471-24.472 24.471zm117.716-363.06h-91.198c4.485 13.298 6.846 27.54 6.846 42.255 0 74.28-60.431 134.711-134.711 134.711-13.535 0-26.675-2.045-39.029-5.744v86.949c0 4.328 3.541 7.869 7.869 7.869h265.96c4.329 0 7.869-3.541 7.869-7.869V174.211c-.001-13.062-10.545-23.606-23.606-23.606zM118.969 73.866C53.264 73.866 0 127.129 0 192.834s53.264 118.969 118.969 118.969 118.97-53.264 118.97-118.969-53.265-118.968-118.97-118.968zm0 210.864c-50.752 0-91.896-41.143-91.896-91.896s41.144-91.896 91.896-91.896c50.753 0 91.896 41.144 91.896 91.896 0 50.753-41.143 91.896-91.896 91.896zm35.097-72.488c-1.014 0-2.052-.131-3.082-.407L112.641 201.5a11.808 11.808 0 0 1-8.729-11.396v-59.015c0-6.516 5.287-11.803 11.803-11.803 6.516 0 11.803 5.287 11.803 11.803v49.971l29.614 7.983c6.294 1.698 10.02 8.177 8.322 14.469-1.421 5.264-6.185 8.73-11.388 8.73z\" fill=\"#FFF\" /> </svg>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <h3>Pick up or Delivery</h3>\r\n");
      out.write("                                    <p>Get your food delivered! And enjoy your meal! Pay online on pickup or delivery</p>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <!-- 3 block sections ends -->\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-sm-12 text-center\">\r\n");
      out.write("                            <p class=\"pay-info\">Pay by Cash on delivery , Card or Paypal</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </section>\r\n");
      out.write("\r\n");
      out.write("            <section class=\"app-section\">\r\n");
      out.write("                <div class=\"app-wrap\">\r\n");
      out.write("                    <div class=\"container\">\r\n");
      out.write("                        <div class=\"row text-img-block text-xs-left\">\r\n");
      out.write("                            <div class=\"container\">\r\n");
      out.write("                                <div class=\"col-xs-12 col-sm-5 right-image text-center\">\r\n");
      out.write("                                    <figure> <img src=\"images/app.png\" alt=\"Right Image\" class=\"img-fluid\"> </figure>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col-xs-12 col-sm-7 left-text\">\r\n");
      out.write("                                    <h3>The Best Food Delivery App</h3>\r\n");
      out.write("                                    <p>Now you can make food happen pretty much wherever you are thanks to the free easy-to-use Food Delivery &amp; Takeout App.</p>\r\n");
      out.write("                                    <div class=\"social-btns\">\r\n");
      out.write("                                        <a href=\"#\" class=\"app-btn apple-button clearfix\">\r\n");
      out.write("                                            <div class=\"pull-left\"><i class=\"fa fa-apple\"></i> </div>\r\n");
      out.write("                                            <div class=\"pull-right\"> <span class=\"text\">Available on the</span> <span class=\"text-2\">App Store</span> </div>\r\n");
      out.write("                                        </a>\r\n");
      out.write("                                        <a href=\"#\" class=\"app-btn android-button clearfix\">\r\n");
      out.write("                                            <div class=\"pull-left\"><i class=\"fa fa-android\"></i> </div>\r\n");
      out.write("                                            <div class=\"pull-right\"> <span class=\"text\">Available on the</span> <span class=\"text-2\">Play store</span> </div>\r\n");
      out.write("                                        </a>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </section>\r\n");
      out.write("            <!-- start: FOOTER -->\r\n");
      out.write("            <footer class=\"footer\">\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <!-- top footer statrs -->\r\n");
      out.write("                    <div class=\"row top-footer\">\r\n");
      out.write("                        <div class=\"col-xs-12 col-sm-3 footer-logo-block color-gray\">\r\n");
      out.write("                            <a href=\"#\"> <img src=\"images/logo.png\" width=\"200px\" alt=\"Footer logo\"> </a> <span>Order Delivery &amp; Take-Out </span> </div>\r\n");
      out.write("                        <div class=\"col-xs-12 col-sm-3 about color-gray\">\r\n");
      out.write("                            <h5>About Us</h5>\r\n");
      out.write("                            <ul>\r\n");
      out.write("                                <li><a href=\"#\">About us</a> </li>\r\n");
      out.write("                                <li><a href=\"#\">History</a> </li>\r\n");
      out.write("                                <li><a href=\"#\">Our Team</a> </li>\r\n");
      out.write("                                <li><a href=\"#\">We are hiring</a> </li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-xs-12 col-sm-3 how-it-works-links color-gray\">\r\n");
      out.write("                            <h5>How it Works</h5>\r\n");
      out.write("                            <ul>\r\n");
      out.write("                                <li><a href=\"#\">Enter your location</a> </li>\r\n");
      out.write("                                <li><a href=\"#\">Choose meal</a> </li>\r\n");
      out.write("                                <li><a href=\"#\">Pay via credit card</a> </li>\r\n");
      out.write("                                <li><a href=\"#\">Wait for delivery</a> </li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"col-xs-12 col-sm-3 popular-locations color-gray\">\r\n");
      out.write("                            <h5>Popular Dishes</h5>\r\n");
      out.write("                            <ul>\r\n");
      out.write("                                <li><a href=\"#\">Dal Makhani</a> </li>\r\n");
      out.write("                                <li><a href=\"#\">Kadhai Paneer</a> </li>\r\n");
      out.write("                                <li><a href=\"#\">Butter Chicken</a> </li>\r\n");
      out.write("                                <li><a href=\"#\">Kadhai Chicken</a> </li>\r\n");
      out.write("                                <li><a href=\"#\">Dal Tadka</a> </li>\r\n");
      out.write("                                <li><a href=\"#\">Brcko</a> </li>\r\n");
      out.write("                                <li><a href=\"#\">Tomato Soup</a> </li>\r\n");
      out.write("                                <li><a href=\"#\">Chilli Potato </a> </li>\r\n");
      out.write("\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </footer>\r\n");
      out.write("            <!-- end:Footer -->\r\n");
      out.write("        </div>\r\n");
      out.write("        <!--/end:Site wrapper -->\r\n");
      out.write("        <!-- Bootstrap core JavaScript\r\n");
      out.write("        ================================================== -->\r\n");
      out.write("        <script src=\"js/jquery.min.js\"></script>\r\n");
      out.write("        <script src=\"js/tether.min.js\"></script>\r\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("        <script src=\"js/animsition.min.js\"></script>\r\n");
      out.write("        <script src=\"js/bootstrap-slider.min.js\"></script>\r\n");
      out.write("        <script src=\"js/jquery.isotope.min.js\"></script>\r\n");
      out.write("        <script src=\"js/headroom.js\"></script>\r\n");
      out.write("        <script src=\"js/foodpicky.min.js\"></script>\r\n");
      out.write("    </body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
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
