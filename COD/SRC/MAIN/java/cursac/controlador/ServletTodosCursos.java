/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursac.controlador;

import cursac.modelo.DaoAsignacionHorario;
import cursac.modelo.DaoCurso;
import cursac.modelo.DaoSeccion;
import cursac.modelo.DboAsignacionHorario;
import cursac.modelo.DboCurso;
import cursac.modelo.DboSeccion;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
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
@WebServlet(name = "srvTodosCursos", urlPatterns = {"/horario"})
public class ServletTodosCursos extends HttpServlet {

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

        RequestDispatcher rd = null;
        int id_periodo = 3;
        DaoCurso connCurso = new DaoCurso();
        DaoSeccion connSeccion = new DaoSeccion();
        DaoAsignacionHorario connAsignacion = new DaoAsignacionHorario();
        
        HashMap<String, DboCurso> cursos = connCurso.obtenerCursos();
        ArrayList<DboSeccion> secciones = connSeccion.obtenerSecciones();
        
        ArrayList<DboAsignacionHorario> cursoSeccion = connAsignacion.obtenerCursoSeccion(id_periodo);
        
        if (cursoSeccion != null) {
            String cursosSecciones = "";
            for(DboAsignacionHorario actual : cursoSeccion){
                cursosSecciones += "<option value=\""+actual.codigoSeccion()+"\">"+cursos.get(String.valueOf(actual.getCodigo())).getNombre()+
                        " "+ secciones.get(actual.getId_seccion()-1).getSeccion()+ "</option>";
                
            }
            rd = request.getRequestDispatcher("/consultarHorario.jsp");
            request.setAttribute("cursos", cursosSecciones);
            
        } else {
            rd = request.getRequestDispatcher("/index.jsp");
        }

        rd.forward(request, response);
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
        DaoCurso connCurso = new DaoCurso();
        DaoSeccion connSeccion = new DaoSeccion();
        DaoAsignacionHorario connAsignacion = new DaoAsignacionHorario();
        
        HashMap<String, DboCurso> cursos = connCurso.obtenerCursos();
        ArrayList<DboSeccion> secciones = connSeccion.obtenerSecciones();
        
        ArrayList<DboAsignacionHorario> cursoSeccion = connAsignacion.obtenerCursoSeccion(id_periodo);
        
        if (cursoSeccion != null) {
            String cursosSecciones = "";
            
            for(DboAsignacionHorario actual : cursoSeccion){
                cursosSecciones += "<option value=\""+actual.codigoSeccion()+"\">"+cursos.get(String.valueOf(actual.getCodigo())).getNombre()+
                        " "+ secciones.get(actual.getId_seccion()).getSeccion()+ "</option>";
            }
            rd = request.getRequestDispatcher("/consultarHorario.jsp");
            request.setAttribute("cursos", cursosSecciones);
            
        } else {
            rd = request.getRequestDispatcher("/index.jsp");
        }

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
