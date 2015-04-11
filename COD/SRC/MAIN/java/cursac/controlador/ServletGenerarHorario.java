/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursac.controlador;

import cursac.datos.DaoAsignacionHorario;
import cursac.datos.DboAsignacionHorario;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author CHAZ
 */
@WebServlet(name = "srvGenerarHorario", urlPatterns = {"/crearHorario"})
public class ServletGenerarHorario extends HttpServlet {

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
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {

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
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher rd = null;
        int id_periodo = 3;

        String[] cursosTo = request.getParameterValues("cursosTo[]");
        DaoAsignacionHorario connAsignacion = new DaoAsignacionHorario();
        ArrayList<DboAsignacionHorario> asginaciones = new ArrayList<>();
        ArrayList<DboAsignacionHorario> traslapes = new ArrayList<>();
        int empezar = 1;
        for (String curso : cursosTo) {

            String[] partes = curso.split("-");
            ArrayList<DboAsignacionHorario> asignacionActual = connAsignacion.obtenerAsignaciones(id_periodo, Integer.parseInt(partes[0]), Integer.parseInt(partes[1]));
            if (asignacionActual != null) {
                asginaciones.addAll(asignacionActual);
            }
            for (int i = empezar; i < cursosTo.length; i++) {

                if (cursosTo[i] != null) {
                    String[] partes2 = cursosTo[i].split("-");
                    ArrayList<DboAsignacionHorario> traslapeActual = connAsignacion.obtenerTraslapes(id_periodo, Integer.parseInt(partes[0]), Integer.parseInt(partes[1]),
                            Integer.parseInt(partes2[0]), Integer.parseInt(partes2[1]));
                    if (traslapeActual != null) {
                        traslapes.addAll(traslapeActual);
                    }
                }
            }

            empezar++;
        }

        rd = request.getRequestDispatcher("/verHorario.jsp");

        //request.setAttribute("cursos", cursosSecciones);
        rd.forward(request, response);
    }

    /*protected void doPost(HttpServletRequest request, HttpServletResponse response)
     throws ServletException, IOException {
     response.setContentType("text/html;charset=UTF-8");
     try (PrintWriter out = response.getWriter()) {
     /* TODO output your page here. You may use following sample code. 

     int codigo = Integer.parseInt(request.getParameter("txtCodigo"));
     String btnPrePost = request.getParameter("btnPrePost");
     DaoCurso connCurso = new DaoCurso();
     DboCurso cursoSolicitado = connCurso.obtenerCurso(codigo);

     if (btnPrePost != null) {
     if (cursoSolicitado != null) {
     GraficaPrePost grafica = new GraficaPrePost(cursoSolicitado);
     out.println(grafica.generarGrafica());
     }
     }

     }
     }*/
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
