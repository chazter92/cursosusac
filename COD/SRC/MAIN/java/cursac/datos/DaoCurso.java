/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursac.datos;

import cursac.controlador.ConexionMySql;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import javax.sql.RowSet;

/**
 *
 * @author Chaz
 */
public class DaoCurso {

    ConexionMySql conn = new ConexionMySql();

    public HashMap<String, DboCurso> obtenerCursosPost(DboCurso cursoPadre) {
        HashMap<String, DboCurso> cursos;
        cursos = convertirDbo(conn.query("SELECT C.codigo, C.nombre, C.creditos, C.obligatorio FROM CURSO C "
                + "JOIN CURSO_PRE_POST P ON C.codigo = P.hijo WHERE P.padre = ?",
                new Object[]{cursoPadre.getCodigo()}, new Object[]{1}));
        return cursos;
    }

    public HashMap<String, DboCurso> obtenerCursosPre(DboCurso cursoHijo) {
        HashMap<String, DboCurso> cursos;
        cursos = convertirDbo(conn.query("SELECT C.codigo, C.nombre, C.creditos, C.obligatorio FROM CURSO C "
                + "JOIN CURSO_PRE_POST P ON C.codigo = P.padre WHERE P.hijo = ?",
                new Object[]{cursoHijo.getCodigo()}, new Object[]{1}));
        return cursos;
    }

    public HashMap<String, DboCurso> obtenerCursos() {
        HashMap<String, DboCurso> cursos;
        cursos = convertirDbo(conn.query("SELECT codigo, nombre, creditos, obligatorio FROM curso",
                new Object[0], new Object[0]));
        return cursos;
    }

    public DboCurso obtenerCurso(int codigo) {
        HashMap<String, DboCurso> cursos;
        cursos = convertirDbo(conn.query("SELECT codigo, nombre, creditos, obligatorio FROM curso "
                + "WHERE codigo = ?",
                new Object[]{codigo}, new Object[]{codigo}));

        ArrayList<DboCurso> cursosDevolver = new ArrayList(cursos.values());
        if (cursosDevolver.size() > 0) {
            return cursosDevolver.get(0);
        } else {
            return null;
        }
    }

    private HashMap<String, DboCurso> convertirDbo(RowSet setCurso) {
        if (setCurso != null) {
            HashMap<String, DboCurso> cursos = new HashMap<>();
            try {
                while (setCurso.next()) {
                    DboCurso actual = new DboCurso(setCurso.getInt("codigo"), setCurso.getString("nombre"),
                            setCurso.getInt("creditos"), setCurso.getInt("obligatorio"));
                    cursos.put(String.valueOf(actual.getCodigo()), actual);
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage() + " | " + ex.getSQLState());
            }

            return cursos;
        }
        return null;
    }

}
