package main;

import java.util.Scanner;
import objetos.Usuario;

public class Principal extends Funcao {

    public static void main(String[] args) {
        
        /*
        Função print para simplificar a utilização do System.out.println
        Função print para centralização de texto
        
        estrutura simples de exemplificação
        
        */
        
        Scanner tc = new Scanner(System.in);
        Funcao f = new Funcao();
        boolean continuar = true;
        int op;
        while(continuar){
            
            f.print("CONEXAO SQL");
            f.print("MENU PRINCIPAL");
            f.print("1. Verificar Existencia");
            f.print("2. Criar Usuário       ");
            
            
            op = tc.nextInt();
        }
        
        
    }
}
