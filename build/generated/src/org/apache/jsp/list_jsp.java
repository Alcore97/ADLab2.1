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

public final class list_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Llistar imatges</title>\n");
      out.write("    </head>\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/styles.css\">\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <!--% if(session.getAttribute(\"user\")==null) response.sendRedirect(\"login.jsp\");  %-->\n");
      out.write("        \n");
      out.write("     <h1>Llistat d'imatges</h1> \n");
      out.write("        ");

            Connection connection = null;
            try {
                Class.forName("org.sqlite.JDBC");
                connection = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\aleix\\Desktop\\Escritorio\\pro2\\JavaMasterRace\\NetBeans\\LIBRERIA.db");
                Statement statement = connection.createStatement();
                ResultSet rs = statement.executeQuery("select nom, autor, id_imatge from imatges"); //necessitem id, nom i autor de les imatges a la DB
                
      out.write("\n");
      out.write("                            <table style=\"width:60%\">\n");
      out.write("                            <tr>\n");
      out.write("                            <th>Nom imatge</th>\n");
      out.write("                            <th>Visualitzar imatge</th>\n");
      out.write("                            <th>Modificar</th>\n");
      out.write("                            <th>Eliminar imatge</th>\n");
      out.write("                            </tr>\n");
      out.write("                ");
            
                while(rs.next()){
                    String aut = rs.getString("autor");
                    int id = rs.getInt("id_imatge");
                    session = request.getSession();
                    String ola = (String)session.getAttribute("user");  
                    
                    if(ola.equals(aut)) { //comprovacio si user es autor foto
                        out.println("<html><body>"
                        + "<tr>"
                        + "<td style='text-align:center;'>" + rs.getString("nom") + "</td>"
                        + "<td style='text-align:center;'> <a href='.\\images\\" + rs.getString("nom") + "'>Veure imatge</a> </td>"
                        + "<td style='text-align:center;'> <a href='.\\modificarImagen.jsp?id=" + id + "'>Modificar imatge</a> </td>"
                        + "<td style='text-align:center;'> <a href='.\\eliminarImagen?id=" + id + "'>Eliminar imatge</a> </td>");
                        } 
                    else { //si no es l'autor, no pot eliminar ni modificar foto
                        out.println("<html><body>"
                        + "<tr>"
                        + "<td style='text-align:center;'>" + rs.getString("nom") + "</td>"
                        + "<td style='text-align:center;'> <a href='.\\images\\" + rs.getString("nom") + "'>Veure imatge</a> </td>"
                        + "<td style='text-align:center;'> No ets el propietari </td>"
                        + "<td style='text-align:center;'> No ets el propietari </td>");
                    }
                } 
            }
    catch(java.lang.NullPointerException e){
        System.err.println(e.getMessage());
            response.sendRedirect("login.jsp");
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
      out.write("            \n");
      out.write("            </table>\n");
      out.write("            <br><br>\n");
      out.write("            <a href='menu.jsp'><h4>Tornar a menu!</h4></a>      \n");
      out.write("        </body>\n");
      out.write("</html>\n");
      out.write("           \n");
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
