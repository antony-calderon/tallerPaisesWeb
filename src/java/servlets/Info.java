package servlets;


import paises.Pais;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

/**
 *
 * @author antony
 */
@WebServlet(name = "Info", urlPatterns = {"/Info"})
public class Info extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Info</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Info at " + request.getContextPath() + "</h1>");
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

        //////////////tomamos el dato ingresado en el input pais///////////////////
        String pais = request.getParameter("pais");

        /////////////asignamos directamente los datos de los paises por constructor normal////////
        Pais argelia = new Pais();
        argelia.setNombre("Argelia");
        argelia.setCapital("Argel");
        argelia.setGentilicio("Argelio");
        argelia.setMoneda("Dinar Argelino");
        argelia.setIdioma("Arabe");

        Pais benin = new Pais();
        benin.setNombre("Benin");
        benin.setCapital("Porto Novo");
        benin.setGentilicio("Beninés");
        benin.setMoneda("Franco CFA");
        benin.setIdioma("Francés");

        ///////////asignamos directamente los datos de los paises por contructor sobrecargado//////////
        Pais camerun = new Pais("Camerun", "Yaundé", "Camerunes", "Franco CFA", "Ingles y Frances");
        Pais egipto = new Pais("Egipto", "El Cairo", "Egipcio", "Libra Egipcia", "Arabe");
        Pais libia = new Pais("Libia", "Trípoli", "Libio", "Dinar Libio", "Arabe");




        ////////////guardamos los objetos de tipo pais en un arraylist//////////////////
        ArrayList paises = new ArrayList();
        paises.add(argelia);
        paises.add(benin);
        paises.add(camerun);
        paises.add(egipto);
        paises.add(libia);

        //processRequest(request, response);
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("<center>");
        out.println("<h1>TU OPCION¡</h1>");

	
        //////////recorremos el arraylist de paises para buscar el pais digitado///////
	Iterator it = paises.iterator();

        for (int i = 0; i < paises.size(); i++) {
            Object objeto = it.next();
            Pais p = (Pais) objeto;
            if (pais.equalsIgnoreCase(p.getNombre())) {
                out.println("<h2>Pais: " + p.getNombre() + "</h2>\n"
                        + "<h2>Capital: " + p.getCapital() + "</h2>\n"
                        + "<h2>Gentilicio: " + p.getGentilicio() + "</h2>\n"
                        + "<h2>Moneda: " + p.getMoneda() + "</h2>\n"
                        + "<h2>Idioma Oficial: " + p.getIdioma() + "</h2>");
            }/*else if(!pais.equalsIgnoreCase(p.getNombre())){
                out.println("<h2>El nombre no  encontrado</h2>");
            }*/
        }

	
	//int moneda = Integer.parseInt(request.getParameter("pesos"));
        out.println("<br>");
        out.println("<br>");
        out.println("<form method='POST' action='Conversion'>");
        out.println("<h1>Convertir Pesos a moneda local</h1>");
        out.println("<br><input type='text' placeholder='introduce pesos colombianos' name='pesos'>");
        out.println("<br><button type='submit' value='enviar'>CALCULAR</button>");
        
        /*if(pais.equalsIgnoreCase("argelia")){
            moneda=(int) (moneda*0.35);
        }*/

        //out.println("<h1>"+moneda+"</h1>");

        out.println("</center>");
        out.println("</body>");
        out.println("</html>");
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
