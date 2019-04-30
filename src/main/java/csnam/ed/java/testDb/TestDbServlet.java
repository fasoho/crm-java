package csnam.ed.java.testDb;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @project crmjava
 * @user jp
 * @date 2019-04-29
 * Servlet implementation class TestDbServlet
 */
@WebServlet("/test")
public class TestDbServlet extends HttpServlet {

  private static final long serialVersionUID = 1L;

  /**
   * @see HttpServlet#doGet(HttpServletRequest req, HttpServletResponse res)
   */
  protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException,
    IOException {

    String user = "crmuser";
    String password = "pass90210";

    String url = "jdbc:mysql://localhost:3306/crm_db?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&useSSL=false";

    String driver = "com.mysql.cj.jdbc.Driver";

    try {
      PrintWriter out = res.getWriter();

      out.println("Connecting to db: " + url + "\n");

      Class.forName(driver);

      Connection conn = DriverManager.getConnection(url, user, password);

      out.println("Connection: SUCCESS!\n");

      conn.close();

    } catch (Exception e) {
      e.printStackTrace();
      throw new ServletException(e);
    }
  }
}
