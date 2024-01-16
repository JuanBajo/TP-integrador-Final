
package com.cac.servlets;

import com.cac.persistencia.exceptions.NonexistentEntityException;
import com.cac.tpfinal.Controladora;
import com.cac.tpfinal.Orador;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "SvEliminarOrador", urlPatterns = {"/SvEliminarOrador"})
public class SvEliminarOrador extends HttpServlet {

    Controladora control = new Controladora();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
 
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        int idEliminar = Integer.parseInt(request.getParameter("idOrador"));   
        try {
            control.borrarOrador(idEliminar);
            
            // Actualiza los datos de la lista luego de borrar
            List<Orador> listaOradores = new ArrayList<>();
            listaOradores = control.traerOradores();
            
            HttpSession sesion = request.getSession();
            sesion.setAttribute("listaOradores", listaOradores);
            
            response.sendRedirect("listaOradores.jsp");

        } catch (NonexistentEntityException ex) {
            Logger.getLogger(SvEliminarOrador.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
        

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
