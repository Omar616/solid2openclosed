import Model.Forma;
import Model.Cuadrado;
import Model.Trianguloequilatero;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Bueno Rosas Brayan Omar
 */
@WebServlet(name = "Receiver", urlPatterns = {"/Receiver"})
public class Receiver extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Rs</title>");            
            out.println("</head>");
            out.println("<body>");
            String tipo = request.getParameter("shape");
            double side = Double.parseDouble(request.getParameter("numsides"));
            if(tipo.equals("triangle"))
            {
                Forma triangulo = new Trianguloequilatero(side);
                out.print("Area:" + triangulo.area());
                out.print("<br>Perimetro: " + triangulo.perimeter());
            }
            else
            {
                Forma cuadrado = new Cuadrado(side);
                out.print("Area: " + cuadrado.area());
                out.print("<br>Perimetro: " + cuadrado.perimeter());
            }
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
