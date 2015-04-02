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

    DboCurso curso;

    public GraficaPrePost(DboCurso curso) {
        this.curso = curso;
    }

    public String escribirArchivo(String grafica) {
        String devolver = "";

        devolver = "<!DOCTYPE HTML>\n"
                + "<html>\n"
                + "<head>\n"
                + "<title>" + curso.getNombre() + "</title>"
                + "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n"
                + "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\">\n"
                + "<link href='http://fonts.googleapis.com/css?family=Cagliostro' rel='stylesheet' type='text/css'>\n"
                + "<link href=\"CSS/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n"
                + "<link rel=\"stylesheet\" href=\"CSS/jquery.jOrgChart.css\"/>\n"
                + "<script type=\"text/javascript\" src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js\"></script>\n"
                + "<script type=\"text/javascript\" src=\"https://ajax.googleapis.com/ajax/libs/jqueryui/1.8.16/jquery-ui.min.js\"></script>\n"
                + "<script type=\"text/javascript\" src=\"http://cursosusac.site90.net/LIB/jquery.jOrgChart.js\"></script>\n"
                + "<script>\n"
                + "    jQuery(document).ready(function() {\n"
                + "        $(\"#org\").jOrgChart({\n"
                + "			chartElement : '#chart'\n"
                + "        });\n"
                + "    });\n"
                + "    </script>\n"
                + "</head>\n"
                + "<body>\n"
                + "<div class=\"wrap\">\n"
                + "<div class=\"wrapper\">\n"
                + "<div class=\"logo\">\n"
                + "	<a href=\"index.html\"><h1>CURSAC</h1></a>\n"
                + "</div>\n"
                + "<div class=\"header_right\">\n"
                + "	<div class=\"cssmenu\">\n"
                + "		<ul>\n"
                + "		  	<li class=\"noactive\"><a href=\"index.html\"><span>Home</span></a></li>\n"
                + "			<li class=\"active\"><a href=\"index2.html\"><span>Pre y post</span></a></li>\n"
                + "			<li class=\"noactive\"><a href=\"#\"><span>Horarios</span></a></li>\n"
                + "			<li class=\"has-sub\"><a href=\"#\"><span>Pensum</span></a></li>\n"
                + "			<li \"last\"><a href=\"contact.html\"><span>Contacto</span></a></li>\n"
                + "			<div class=\"clear\"></div>\n"
                + "		 </ul>\n"
                + "	</div>"
                + "</div>\n"
                + "	<div class=\"clear\"></div>\n"
                + "</div>\n"
                + "</div>\n"
                + "<div class=\"main_bg\">\n"
                + "<div class=\"wrap\">\n"
                + "<div class=\"wrapper\">\n"
                + "	<div class=\"main1\">\n"
                + "          		<div class=\"grid_1_of_2 images_1_of_2\">\n"
                + "				<h2 class=\"style\">" + curso.getNombre() + "</h2>\n"
                + "				<div id=\"chart\" class=\"orgChart\"></div>"
                + grafica
                + "<div class=\"clear\"></div>\n"
                + "    \n"
                + "    			</div>\n"
                + "</div>\n"
                + "</div>\n"
                + "</div>\n"
                + "<div class=\"wrap\">\n"
                + "<div class=\"wrapper\">\n"
                + "	<div class=\"footer\">\n"
                + "		<div class=\"social-icons\">\n"
                + "	   		  	<ul>\n"
                + "			      <li class=\"icon_1\"><a href=\"#\" target=\"_blank\"> </a></li>\n"
                + "			      <li class=\"icon_2\"><a href=\"#\" target=\"_blank\"> </a></li>\n"
                + "			      <li class=\"icon_3\"><a href=\"#\" target=\"_blank\"> </a></li>\n"
                + "			      <li class=\"icon_4\"><a href=\"#\" target=\"_blank\"> </a></li>\n"
                + "			      <div class=\"clear\"></div>\n"
                + "		     </ul>\n"
                + "	   	 </div>\n"
                + "		<a href=\"index.html\"><h2>CURSAC</h2></a>\n"
                + "		<div class=\"copy\">\n"
                + "			<p class=\"w3-link\">© Todos los derechos reservados | Analisis y diseño 2 FIUSAC 2015</p>\n"
                + "		</div>\n"
                + "	</div>\n"
                + "</div>\n"
                + "<div class=\"clear\"></div>\n"
                + "</div></body>\n"
                + "</html>";

        return devolver;
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

                Collection<DboCurso> cursosPostPost = connCurso.obtenerCursosPost(cursoP).values();

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
        }else{
            grafica += "</li></ul>\n"
                    + "Post Requisitos: NINGUNO";
        }
        /*        + "				$cursos_pre=mysql_query(\"SELECT C.* FROM CURSO C JOIN CURSO_PRE_POST P ON C.codigo = P.padre WHERE P.hijo =\".$id_curso,$conexion) or\n"
                + "	  die(\"Problemas en el select:\".mysql_error());\n"
                + "	  \n"
                + "	  				\n"
                + "	  					echo '<br> Pre requisitos: ';\n"
                + "						\n"
                + "						if(mysql_num_rows($cursos_pre)>0){\n"
                + "						echo '</br><table border=\"1\" align=\"center\">';\n"
                + "	  					while ($curso_pre = mysql_fetch_array($cursos_pre)){\n"
                + "								echo '<tr><td><a href=\"prepost.php?id='.$curso_pre['codigo'].'\">'.$curso_pre['codigo'].' -</a></td><td> <a href=\"prepost.php?id='.$curso_pre['codigo'].'\">'.$curso_pre['nombre'].'</a></td></tr>';\n"
                + "						}\n"
                + "						echo '</table>';		\n"
                + "						}else{\n"
                + "							echo 'NINGUNO';	\n"
                + "						}\n"
                + "					";*/
        return escribirArchivo(grafica);
    }

    public String obtenerPrerequisitos() {

        return "";
    }

    public String getCategoria(int obligatorio) {
        if (obligatorio == 1) {
            return "Obligatorio";
        }
        return "No obligatorio";
    }
}
