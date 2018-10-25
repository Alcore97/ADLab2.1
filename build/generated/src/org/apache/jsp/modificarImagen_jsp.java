package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.*;
import java.sql.*;
import javax.servlet.http.*;
import java.util.*;

public final class modificarImagen_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Busca una imagen</title>\n");
      out.write("    </head>\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/styles.css\">\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <!--% if(session.getAttribute(\"user\")==null) response.sendRedirect(\"login.jsp\");  %-->\n");
      out.write("        \n");
      out.write("        <h1>Modifica la imatge</h1>\n");
      out.write("        <br>\n");
      out.write("        <h2>Escull els camps que vols modificar de la imatge</h2>\n");
      out.write("        \n");
      out.write("        ");

            Connection connection = null;
            try {
                Class.forName("org.sqlite.JDBC");
                connection = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\aleix\\Desktop\\Escritorio\\pro2\\JavaMasterRace\\NetBeans\\LIBRERIA.db");
                int id = Integer.parseInt(request.getParameter("id"));               
                String t,d,p,a;
                String sql = "select titol_imatge, descripcio, paraula_clau, autor "
                        + "from imatges where id_imatge = "; //agafem els camps de la imatge per a mostrar els valors al formulari
                sql = sql + id;
 
                Statement statement = connection.createStatement();
                ResultSet rs = statement.executeQuery(sql);
                
                if(rs.next()){ //si trobem els camps al select, els mostrem al formulari
                t=rs.getString("titol_imatge");
                d=rs.getString("descripcio");
                p=rs.getString("paraula_clau");
                a=rs.getString("autor");
               
      out.write("\n");
      out.write(" \n");
      out.write("        <form method =\"post\" action=\"/WebApplicationREMASTERED/modificarImagen?id=");
      out.print(id);
      out.write("\" enctype=\"multipart/form-data\">\n");
      out.write("            <div>Titol</div>\n");
      out.write("            <input type=\"text\" name=\"titol\" placeholder=\"Titol de la foto\" value=\"");
      out.print(t);
      out.write("\">\n");
      out.write("            \n");
      out.write("            <div>Descripcio</div>\n");
      out.write("            <input type =\"text\" name=\"descripcio\" placeholder=\"Descripció breu de la foto\" value=\"");
      out.print(d);
      out.write("\">\n");
      out.write("            \n");
      out.write("            <div>Paraula clau</div>\n");
      out.write("            <input type=\"text\" name=\"paraulesclau\" placeholder=\"Paraules clau de la foto\" value=\"");
      out.print(p);
      out.write("\">\n");
      out.write("            \n");
      out.write("            <div>Autor</div>\n");
      out.write("            <input type =\"text\" name=\"author\" placeholder=\"Autor de la foto\" value=\"");
      out.print(a);
      out.write("\" required>\n");
      out.write("\n");
      out.write("            <input type =\"submit\" value=\"Modifica!\">\n");
      out.write("                     \n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("        <br><br>\n");
      out.write("        \n");
      out.write("        <a href=\"menu.jsp\"><h4>Tornar al menu!</h4></a>\n");
      out.write("        ");

           } 

}
        catch(SQLException e)
        {
          System.err.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            System.err.println(e.getMessage());
        }   
        finally
        {
          try
          {
            if(connection != null)
              connection.close();
          }
          catch(SQLException e)
          {
            // connection close failed.
            System.err.println(e.getMessage());
          }
        }
        
      out.write("\n");
      out.write("    </body>\n");
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
