/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.24
 * Generated at: 2019-11-26 13:42:55 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class main_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/tags/design.tag", Long.valueOf(1574775432830L));
    _jspx_dependants.put("/WEB-INF/tags/head.tag", Long.valueOf(1574775454601L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!-- 메인 페이지 -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>BUMMY</title>\r\n");
      if (_jspx_meth_mytag_005fdesign_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t");
      if (_jspx_meth_mytag_005fhead_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t<div style=\"margin-top: 50px;\">\r\n");
      out.write("\t\t<div id=\"exp\">\r\n");
      out.write("\t\t\t<!-- 왼쪽 컨텐츠 -->\r\n");
      out.write("\t\t\t<div id=\"in\">\r\n");
      out.write("\t\t\t\t<img src=\"resources/img/text.png\" height=\"270px;\" /><br> <br>\r\n");
      out.write("\t\t\t\t<button type=\"button\" class=\"btn btn-light\">show</button>\r\n");
      out.write("\t\t\t\t&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t<button type=\"button\" class=\"btn btn-outline-light\"\r\n");
      out.write("\t\t\t\t\tstyle=\"margin-right: 460px;\">baby</button>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"pho\">\r\n");
      out.write("\t\t\t<!-- 오른쪽 컨텐츠 -->\r\n");
      out.write("\t\t\t<div id=\"in\">\r\n");
      out.write("\t\t\t\t<div id=\"carouselExampleIndicators\" class=\"carousel slide\"\r\n");
      out.write("\t\t\t\t\tdata-ride=\"carousel\" style=\"margin-right:50xpx;\">\r\n");
      out.write("\t\t\t\t\t<ol class=\"carousel-indicators\">\r\n");
      out.write("\t\t\t\t\t\t<li data-target=\"#carouselExampleIndicators\" data-slide-to=\"0\"\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"active\"></li>\r\n");
      out.write("\t\t\t\t\t\t<li data-target=\"#carouselExampleIndicators\" data-slide-to=\"1\"></li>\r\n");
      out.write("\t\t\t\t\t</ol>\r\n");
      out.write("\t\t\t\t\t<div class=\"carousel-inner\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"carousel-item active\">\r\n");
      out.write("\t\t\t\t\t\t\t<img src=\"resources/img/img1.png\" width=\"100px;\"\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"d-block w-100\">\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"carousel-item\">\r\n");
      out.write("\t\t\t\t\t\t\t<img src=\"resources/img/img2.png\" width=\"100px;\"\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"d-block w-100\">\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<a class=\"carousel-control-prev\" href=\"#carouselExampleIndicators\"\r\n");
      out.write("\t\t\t\t\t\trole=\"button\" data-slide=\"prev\"> <span\r\n");
      out.write("\t\t\t\t\t\tclass=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span> <span\r\n");
      out.write("\t\t\t\t\t\tclass=\"sr-only\">Previous</span>\r\n");
      out.write("\t\t\t\t\t</a> <a class=\"carousel-control-next\" href=\"#carouselExampleIndicators\"\r\n");
      out.write("\t\t\t\t\t\trole=\"button\" data-slide=\"next\"> <span\r\n");
      out.write("\t\t\t\t\t\tclass=\"carousel-control-next-icon\" aria-hidden=\"true\"></span> <span\r\n");
      out.write("\t\t\t\t\t\tclass=\"sr-only\">Next</span>\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_mytag_005fdesign_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  mytag:design
    org.apache.jsp.tag.web.design_tag _jspx_th_mytag_005fdesign_005f0 = new org.apache.jsp.tag.web.design_tag();
    _jsp_getInstanceManager().newInstance(_jspx_th_mytag_005fdesign_005f0);
    try {
      _jspx_th_mytag_005fdesign_005f0.setJspContext(_jspx_page_context);
      _jspx_th_mytag_005fdesign_005f0.doTag();
    } finally {
      _jsp_getInstanceManager().destroyInstance(_jspx_th_mytag_005fdesign_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_mytag_005fhead_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  mytag:head
    org.apache.jsp.tag.web.head_tag _jspx_th_mytag_005fhead_005f0 = new org.apache.jsp.tag.web.head_tag();
    _jsp_getInstanceManager().newInstance(_jspx_th_mytag_005fhead_005f0);
    try {
      _jspx_th_mytag_005fhead_005f0.setJspContext(_jspx_page_context);
      _jspx_th_mytag_005fhead_005f0.doTag();
    } finally {
      _jsp_getInstanceManager().destroyInstance(_jspx_th_mytag_005fhead_005f0);
    }
    return false;
  }
}
