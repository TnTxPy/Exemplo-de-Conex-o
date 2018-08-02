package controle;

import conexao.Control;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import main.Funcao;
import objetos.Usuario;

public class CoUsuario {
    Control c = new Control();
    Funcao f = new Funcao();
    
    public void Create(Usuario usu){
        Connection con = null;
        PreparedStatement stmt = null;
        String login = usu.getLogin();
        String senha = usu.getSenha();
        String nome = usu.getNome();
        try {
            
            con = c.get();
            stmt = con.prepareStatement("insert into usuarios (nome,login,senha) values(?,?,?)");
            stmt.setString(1, nome);
            stmt.setString(2, login);
            stmt.setString(3, senha);
            stmt.executeUpdate();
            
        } catch (SQLException ex) {
            f.print("ERRO ao abrir conexão CoUsuario.java",true);
            System.out.println(ex);
        }
        
        c.close(con, stmt);
    }
    public Boolean Busca(Usuario usu){
        List<String> lista = new ArrayList<String>();
        
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String login = usu.getLogin();
        String senha = usu.getSenha();
        String nome = usu.getNome();
        
        try {
            con = c.get();
            stmt = con.prepareStatement("select * from usuarios where login = ?");
            stmt.setString(1, login);
            rs = stmt.executeQuery();
            while(rs.next()){
                Usuario nU = new Usuario();
                lista.add(rs.getString("login"));
                
            }
        } catch (SQLException ex) {
            
        }
        return lista.contains(usu.getLogin());
        
    }
    
}
