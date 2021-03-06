/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.31
 * Generated at: 2020-06-14 02:34:54 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.SinhVien;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("model.SinhVien");
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
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!--\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Cổng thông tin đào tạo Học viện Công nghệ Bưu chính Viễn thông</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"./res/main-css.css\">\n");
      out.write("        ");
 SinhVien sinhVien = (SinhVien) session.getAttribute("maSinhVien");
//        if (sinhVien == null) response.sendRedirect("index.jsp"); 
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"header\">\n");
      out.write("            <div id=\"h1\"></div>\n");
      out.write("            <div id=\"h2\">\n");
      out.write("                ");
 if (sinhVien == null) {
      out.write("\n");
      out.write("                <button id=\"btn_dang_nhap\" onclick=\"window.location.href = 'Views/login.jsp'\">Đăng nhập</button>\n");
      out.write("                ");
 } else {
      out.write("\n");
      out.write("                <span style=\"color: yellow; font-weight: bolder\">\n");
      out.write("                    Chào bạn, ");
      out.print( sinhVien.getHoTen());
      out.write("&nbsp;(");
      out.print( sinhVien.getMaSV() );
      out.write(") \n");
      out.write("                </span> <button><a style=\"text-decoration: none\" href=\"/logout\">Đăng xuất</a></button>\n");
      out.write("                \n");
      out.write("                ");
 }
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"content\">\n");
      out.write("            <div id=\"menu\">\n");
      out.write("                <a class=\"menu-items\" href=\"../index.jsp\" >TRANG CHỦ</a>\n");
      out.write("                <a class=\"menu-items\" href=../Views/XemDiemThi.jsp >XEM KẾT QUẢ HỌC TẬP</a> \n");
      out.write("            </div>\n");
      out.write("            <div id=\"main-content\" style=\"height: 730px; margin: 10px 20px 10px 20px; border-style: double;\">\n");
      out.write("                <h2 style=\"padding-left: 5px\"><u>Thông tin chung</u></h2>\n");
      out.write("                <h2 style=\"color: chocolate; padding-left: 5px\">\n");
      out.write("                    THÔNG BÁO:  v/v  RÀ SOÁT THỜI KHÓA BIỂU và ĐĂNG KÝ HỌC GHÉP KỲ 2 NĂM HỌC 2019 - 2020\n");
      out.write("                </h2>\n");
      out.write("                <h3 style=\"padding-left: 5px\"><u>Ngày 18/03/2020: </u> \n");
      out.write("                    THÔNG BÁO v/v TIẾP NHẬN , HỖ TRỢ ĐĂNG KÝ HỌC GHÉP HỌC KỲ 2\n");
      out.write("                </h3>\n");
      out.write("                <p style=\"font-size: 20px; padding: 0px 0px 5px 5px\">\n");
      out.write("                     Phòng Giáo vụ đã tiếp nhận, xem xét Đơn (qua e-mail đến hết ngày 20/03/2020) về việc đăng ký học ghép, \n");
      out.write("                     điều chỉnh đăng ký các học phần học kỳ 2 năm học 2019 - 2020 và thông báo tới các Sinh viên biết kết quả xử lý cụ thể như sau: \n");
      out.write("                </p>\n");
      out.write("                <p style=\"font-size: 20px; padding: 0px 0px 5px 5px\">\n");
      out.write("                    <b>1- Đăng ký học ghép (học lại, học cải thiện):</b>\n");
      out.write("                    PGV chỉ hỗ trợ sinh viên trong việc mở số lượng các Nhóm học phần đến mức tối đa cho phép, \n");
      out.write("                    chứ không thực hiện việc đăng ký hộ sinh viên. Sinh viên phải trực tiếp thực hiện thao tác đăng ký \n");
      out.write("                    trong thời gian mở hệ thống như đã thông báo  (đến \n");
      out.write("                    <b>24h ngày chủ nhật, 22/03/2020); </b>\n");
      out.write("                    \n");
      out.write("                </p>\n");
      out.write("                <p style=\"font-size: 20px; padding: 0px 0px 10px 5px\">\n");
      out.write("                    <b>2- Điều chỉnh đăng ký: (bổ sung, rút bớt các học phần theo đúng tiến trình đào\n");
      out.write("                        tạo chuẩn của kỳ học)\n");
      out.write("                    </b>\n");
      out.write("                </p>\n");
      out.write("                <p style=\"font-size: 20px; padding: 0px 0px 0px 5px\">\n");
      out.write("                    - Tất cả các trường hợp sinh viên xin rút bớt học phần sẽ được PGV giải quyết \n");
      out.write("                    trước ngày 24/03/2020\n");
      out.write("                </p>\n");
      out.write("                <p style=\"font-size: 20px; padding: 0px 0px 0px 5px\">\n");
      out.write("                    - Các trường hợp đăng ký bổ sung học phần đúng quy định (Bổ sung học phần còn \n");
      out.write("                    thiếu chưa đăng ký trong Phiếu đăng ký tháng 12/2019)sẽ được PGV hỗ trợ đăng ký;\n");
      out.write("                </p>\n");
      out.write("                <p style=\"font-size: 20px; padding: 0px 0px 0px 5px\">\n");
      out.write("                    - Các trường hợp đăng ký bổ sung không đúng quy định (Không nộp phiếu nhờ hỗ trợ \n");
      out.write("                    xử lý lỗi đăng ký đúng thời gian trong đợt đăng ký chính thức của Khóa/ngành) \n");
      out.write("                    sẽ không được hỗ trợ đăng ký.\n");
      out.write("                </p>\n");
      out.write("                <p style=\"font-size: 20px; padding: 0px 0px 10px 5px\">\n");
      out.write("                    <b>\n");
      out.write("                        3- Đề nghị: \n");
      out.write("                    </b>\n");
      out.write("                    Tất cả sinh viên rà soát lại lịch học cá nhân trên hệ thống quản lý đào tạo \n");
      out.write("                    để chuẩn bị tham gia học tập kỳ 2 năm học theo kế hoạch Học viện đã thông báo, \n");
      out.write("                    có vấn đề vướng mắc sinh viên liên hệ theo số điện thoại hỗ trợ của \n");
      out.write("                    Phòng giáo vụ trước ngày 24/03/2020 để được giải đáp ( 0915 114 306).\n");
      out.write("                </p>\n");
      out.write("                <h3>Trân trọng./.</h3>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div id=\"footer\">\n");
      out.write("            <br>\n");
      out.write("            <h3 style=\"margin-left: 5%\">HỌC VIỆN CÔNG NGHỆ BƯU CHÍNH VIỄN THÔNG</h3>\n");
      out.write("            <div id=\"footer11\">\n");
      out.write("                <div id=\"beginfooter\"></div>\n");
      out.write("                <div id=\"footer1\">\n");
      out.write("                    <p style=\"margin-bottom: 0px;\">Trụ sở chính:</p>\n");
      out.write("                    <p style=\"margin-top: 0px;\">122 Hoàng Quốc Việt, Q.Cầu Giấy, Hà Nội.</p>\n");
      out.write("                    <p style=\"margin-bottom: 0px;\">Cơ sở đào tạo tại Hà Nội:</p>\n");
      out.write("                    <p style=\"margin-top: 0px;\">Km10, Đường Nguyễn Trãi, Q.Hà Đông, Hà Nội</p>  \n");
      out.write("                    <a href=\"https://www.facebook.com/HocvienPTIT\"><img class=\"contactIcon\" src=\"res/fbb.png\" style=\"border-radius: 5px\"></a>\n");
      out.write("                    <a href=\"http://portal.ptit.edu.vn/\"><img class=\"contactIcon\" src=\"res/ptit.png\"></a>\n");
      out.write("                   \n");
      out.write("                </div>\n");
      out.write("                <div id=\"footer2\">\n");
      out.write("                    <p style=\"margin-bottom: 0px;\">Học viện cơ sở tại TP. Hồ Chí Minh:</p>\n");
      out.write("                    <p style=\"margin-top: 0px;\">11 Nguyễn Đình Chiểu, P. Đa Kao, Q.1 TP Hồ Chí Minh</p>\n");
      out.write("                    <p style=\"margin-bottom: 0px;\">Cơ sở đào tạo tại TP Hồ Chí Minh:</p>\n");
      out.write("                    <p style=\"margin-top: 0px;\">Đường Man Thiện, P. Hiệp Phú, Q.9 TP Hồ Chí Minh</p>\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("                <div id=\"footer3\">\n");
      out.write("                    <br>\n");
      out.write("                    <iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3725.301678832317!2d105.78570991486083!3d20.98054088602447!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x3135acce762c2bb9%3A0xbb64e14683ccd786!2zSOG7jWMgdmnhu4duIEPDtG5nIG5naOG7hyBCxrB1IGNow61uaCBWaeG7hW4gdGjDtG5nIC0gUFRJVA!5e0!3m2!1svi!2s!4v1585330320219!5m2!1svi!2s\"\n");
      out.write("                            width=\"400\" height=\"100\" frameborder=\"0\" style=\"border:0;\" allowfullscreen=\"\" aria-hidden=\"false\" tabindex=\"0\"></iframe>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>        \n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
}
