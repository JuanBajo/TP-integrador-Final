<%-- 
    Document   : editarOrador
    Created on : 16 ene 2024, 07:03:11
    Author     : Usuario
--%>

<%@page import="com.cac.tpfinal.Orador"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
 <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Oradores</title>
        <link rel="stylesheet" type="text/css" href="styles.css">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
    </head>
    <body>
        
        <% Orador oraEditar = (Orador) request.getSession().getAttribute("oraEditar"); %>
        <nav class="navbar navbar-expand-lg bg-body-tertiary" data-bs-theme="dark">

        </nav>
        <section>
            <div class="d-flex flex-column align-items-center justify-content-center">
                <p id="convertirseOrador" class="p-oradores"></p>
                <h3 class="h-oradores">Editar datos de Orador inscripto</h3>
                <p class="p-oradores"></p>
            </div>

            <div>
                <form action="SvEditarOrador" method="POST" id="form-orador">
                    <div class="row justify-content-center">
                        <div class="col-lg-3 col-md-3 col-sm-12 div-form-control">
                            <input type="text" class="form-control mt-3" placeholder="Nombre" aria-label="Nombre" name="txtNombre" value="<%= oraEditar.getNombre() %>">
                        </div>
                        <div class="col-lg-3 col-md-3 col-sm-12 div-form-control">
                            <input type="text" class="form-control mt-3" placeholder="Apellido" aria-label="Apellido" name="txtApellido" value="<%= oraEditar.getApellido() %>">
                        </div>
                    </div>
                    <div class="row justify-content-center">
                        <div class="col-lg-6 col-md-6 col-sm-12 div-form-control">
                            <textarea class="form-control mt-3" id="exampleFormControlTextarea1" rows="3" placeholder="¿Sobre qué quiere hablar?" name="txtTema"  ><%= oraEditar.getTema() %></textarea>
                            <p class="p-oradores text-lg-start mt-1">Recuerda incluir un título para tu charla.</p>

                        </div>
                    </div>
                    <div class="row justify-content-center">
                        <div class="d-grid gap-2 col-6">
                            <button class="btn btn-success mt-2 button-enviar" type="submit">Guardar modificaciones</button>
                        </div>
                    </div>
                </form>
            </div>
            <div>
                <form action="SvOradores" method="GET">
                    <div class="row justify-content-center">
                        <div class="d-grid gap-2 col-6">
                            <button class="btn btn-success mt-2 button-enviar" type="submit">Volver a lista de oradores</button>
                        </div>
                    </div>
                </form>
            </div>


        </section>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
    </body>
</html>
