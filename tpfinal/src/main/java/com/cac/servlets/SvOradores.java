package com.cac.servlets;

import com.cac.tpfinal.Controladora;
import com.cac.tpfinal.Orador;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(name = "SvOradores", urlPatterns = {"/SvOradores"})
public class SvOradores extends HttpServlet {

    Controladora control = new Controladora();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
            List<Orador> listaOradores = new ArrayList<>();
            listaOradores = control.traerOradores();
            
            HttpSession sesion = request.getSession();
            sesion.setAttribute("listaOradores", listaOradores);
            
            response.sendRedirect("listaOradores.jsp");
        
            
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        Orador ora = new Orador();
        ora.setApellido(request.getParameter("txtApellido"));
        ora.setNombre(request.getParameter("txtNombre"));
        ora.setTema(request.getParameter("txtTema"));
        
        control.crearOrador(ora);
        
        response.sendRedirect("index.jsp");
        
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
