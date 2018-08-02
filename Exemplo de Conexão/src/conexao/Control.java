/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Lucas
 */
public class Control {
   /*
    *- SETANDO CONSTANTES
    *- DRIVER = JDBC " com.mysql.jdbc.Driver "
    *- URL = Destino do banco de dados,jdbc:mysql:// no caso como estou hospedando localmente
        localhost, porta 3306 / nome do banco de dados
    *- USER = nome do usuario para login no banco de dados, padrão root
    *- PASS = senha do usuario para login no banco de dados, padrão     
    */
    final static String DRIVER ="com.mysql.jdbc.Driver";
    final static String URL = "jdbc:mysql://localhost:3306/";
    final static String USER = "root";
    final static String PASS = "";
    
    public Connection get() throws SQLException{
        Connection con = null;
        con = DriverManager.getConnection(URL, USER, PASS);
        
        return con;
    }
    public void close(Connection con){
        try {
            if(con !=null){
            con.close();
            }
        } catch (Exception e) {
            System.out.println("[ERRO] Função close classe connection erro de FECHAMENTO DE CONEXAO");
        }
    }
    public void close(Connection con, PreparedStatement stmt){
        close(con);
        try {
            if(stmt !=null){
            stmt.close();
            }
        } catch (Exception e) {
            System.out.println("[ERRO] Função close classe connection erro de FECHAMENTO DE STMT");
        }
    }
    public void close(Connection con, PreparedStatement stmt,ResultSet rs){
        close(con,stmt);
        try {
            if(rs !=null){
            rs.close();
            }
        } catch (Exception e) {
            System.out.println("[ERRO] Função close classe connection erro de FECHAMENTO DE RS");
        }
    }
    
    
}
