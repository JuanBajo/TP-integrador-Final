<%-- 
    Document   : listaOradores
    Created on : 16 ene 2024, 04:50:02
    Author     : Usuario
--%>

<%@page import="java.util.List"%>
<%@page import="com.cac.tpfinal.Orador"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Oradores inscriptos</title>
        <link rel="stylesheet" type="text/css" href="styles.css">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">


    
    
    </head>
    <body>
        <nav class="navbar navbar-expand-lg bg-body-tertiary" data-bs-theme="dark">

        </nav>
        <h1 class="titulolista">Lista de oradores inscriptos</h1>
        <div class=" mx-auto">
        <table class="table table-hover">
            <thead>
                <tr>
                    <th scope="col">Id</th>
                    <th scope="col">Nombre</th>
                    <th scope="col">Apellido</th>
                    <th scope="col">Tema</th>
                    <th scope="col"></th>
                    <th scope="col"></th>
                </tr>
            </thead>
            <tbody>
                <%
                    List<Orador> listaOradores = (List) request.getSession().getAttribute("listaOradores");

                    for (Orador ora : listaOradores) {
                %>    
                <tr>
                    <th scope="row"><%= ora.getIdOrador()%></th>
                    <td><%= ora.getNombre()%></td>
                    <td><%= ora.getApellido()%></td>
                    <td><%= ora.getTema()%></td>
                    <td>
                        <form action="SvEditarOrador" method="GET">
                            <input type="hidden" name="idOradorEditar" value="<%= ora.getIdOrador()%>">
                            <button class="btn btn-outline-primary" type="submit">Editar</button>
                        </form>
                    </td>
                    <td>
                        <form action="SvEliminarOrador" method="POST">
                            <input type="hidden" name="idOrador" value="<%= ora.getIdOrador()%>">
                            <button class="btn btn-outline-danger" type="submit">Borrar</button>
                        </form>
                    </td>

                </tr>



                <%
                    }
                %>

            </tbody>
        </table>
        </div>
                <form action="index.jsp" method="post">
                    <div class="row justify-content-center">
                        <div class="d-grid gap-2 col-6">
                            <button class="btn btn-success mt-2 button-enviar" type="submit">Ir a formulario de inscripción</button>
                        </div>
                    </div>
                </form>
            </div>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
    </body>
</html>
