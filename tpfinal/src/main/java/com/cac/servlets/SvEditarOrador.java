
package com.cac.servlets;

import com.cac.tpfinal.Controladora;
import com.cac.tpfinal.Orador;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(name = "SvEditarOrador", urlPatterns = {"/SvEditarOrador"})
public class SvEditarOrador extends HttpServlet {

        Controladora control = new Controladora();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
 
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        int idEditar = Integer.parseInt(request.getParameter("idOradorEditar"));
        Orador ora = control.traerOrador(idEditar);
        
        HttpSession sesion = request.getSession();
        sesion.setAttribute("oraEditar", ora);
            
        response.sendRedirect("editarOrador.jsp");
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            
        Orador oraEditar = (Orador) request.getSession().getAttribute("oraEditar");
        oraEditar.setApellido(request.getParameter("txtApellido"));
        oraEditar.setNombre(request.getParameter("txtNombre"));
        oraEditar.setTema(request.getParameter("txtTema"));

        control.editarOrador(oraEditar);

        // Actualiza los datos de la lista luego de borrar
        List<Orador> listaOradores = new ArrayList<>();
        listaOradores = control.traerOradores();

        HttpSession sesion = request.getSession();
        sesion.setAttribute("listaOradores", listaOradores);

        response.sendRedirect("listaOradores.jsp");
    }

 
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
