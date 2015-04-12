/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursac.controlador;

import cursac.datos.DboCurso;
import cursac.datos.DaoCurso;
import java.util.Collection;

/**
 *
 * @author Chaz
 */
public class GraficaPrePost {

    private DboCurso curso;

    public GraficaPrePost(DboCurso curso) {
        this.curso = curso;
    }

    public String generarGrafica() {
        DaoCurso connCurso = new DaoCurso();
        String grafica = "";
        grafica += "<ul id=\"org\" style=\"display:none\">\n"
                + "            <li>\n"
                + "             " + curso.getNombre() + "<p>Código: " + curso.getCodigo() + "<br>Créditos: " + curso.getCreditos() + "<br>Categoria: " + getCategoria(curso.getObligatorio()) + "</p>\n";

        Collection<DboCurso> cursosPost = connCurso.obtenerCursosPost(curso).values();

        if (cursosPost.size() > 0) {
            grafica += "<ul>\n";

            for (DboCurso cursoP : cursosPost) {
                grafica += "<li><a href=\"prepost?id=" + cursoP.getCodigo() + "\">" + cursoP.getNombre() + "</a><p>Código: " + cursoP.getCodigo() + "<br>Créditos: " + cursoP.getCreditos() + "</p>\n";

                Collection<DboCurso>  cursosPostPost = connCurso.obtenerCursosPost(cursoP).values();

                if (cursosPostPost.size() > 0) {
                    grafica += "<ul>\n";

                    for (DboCurso cursoPP : cursosPostPost) {
                        grafica += "<li><a href=\"prepost?id=" + cursoPP.getCodigo() + "\">" + cursoPP.getNombre() + "</a><p>Código: " + cursoPP.getCodigo() + "<br>Créditos: " + cursoPP.getCreditos() + "</p></li>\n";
                    }

                    grafica += "</ul>\n";
                }
                grafica += "</li>";
            }
            grafica += "</ul>\n"
                    + "</li></ul>";
        } else {
            grafica += "</li></ul>\n"
                    + "Post Requisitos: NINGUNO";
        }
        return grafica;
    }

    public String obtenerPrerequisitos() {
        DaoCurso connCurso = new DaoCurso();
        String prerequisitos = "";
        Collection<DboCurso>  cursosPre = connCurso.obtenerCursosPre(curso).values();

        if (cursosPre.size() > 0) {
            prerequisitos += "<table border=0>";
            for(DboCurso cursoPre : cursosPre){
                prerequisitos += "<tr>";
                prerequisitos += "\n\r <td><a href=\"prepost?id="+cursoPre.getCodigo()+"\">"+cursoPre.getCodigo()+" - "+cursoPre.getNombre()+"</a></td>";
                prerequisitos += "</tr>";
            }
            prerequisitos += "</table>";
        } else {
            prerequisitos += "NINGUNO";
        }
        return prerequisitos;
    }

    public String getCategoria(int obligatorio) {
        if (obligatorio == 1) {
            return "Obligatorio";
        }
        return "No obligatorio";
    }
}
