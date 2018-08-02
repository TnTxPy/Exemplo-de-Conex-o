package objetos;

import controle.CoUsuario;
import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String login;
    private String senha;
    private String nome;
    CoUsuario comando = new CoUsuario();
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
    
    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void criar(){
        comando.Create(this);
        
    }
    public boolean existe(){
        return comando.Busca(this);
    }
    
}
