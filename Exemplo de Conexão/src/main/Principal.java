package main;

import java.util.Scanner;
import static main.Funcao.print;
import objetos.Usuario;

public class Principal extends Funcao {

    public static void main(String[] args) {
        
        /*
        Função print para simplificar a utilização do System.out.println
        Função print para centralização de texto
        
        estrutura simples de exemplificação
        
        */
        
        Scanner tc = new Scanner(System.in);
        Scanner tc1 = new Scanner(System.in);
        boolean continuar = true;
        int op;
        while(continuar){
            print("Bem vindo ao sistema de Conexão sql");
            print("    MENU PRINCIPAL    ");
            print("1. Cadastrar Usuario  ");
            print("2. Verificar Usuario  ");
            print("3. Remover Usuario    ");
            print("");
            op = tc.nextInt();
            if(op == 1){
                
                boolean continuarOp1 = true;
                String nome = "",login = "",senha = "";
                
                while(continuarOp1){
                    print("    CADASTRO DE USUARIO    ");
                    print("    Insira o Nome:         ");
                    try {
                        nome = tc1.nextLine();
                        continuarOp1 = false;
                    } catch (Exception e) {
                        print("[ERRO] INSIRA UM NOME VALIDO",true);
                    }
                }
                continuarOp1 = true;
                while(continuarOp1){
                    print("     CADASTRO DE LOGIN     ");
                    print("    Insira o Login:         ");
                    try {
                        login = tc1.nextLine();
                        continuarOp1 = false;
                    } catch (Exception e) {
                        print("[ERRO] INSIRA UM LOGIN VALIDO",true);
                    }
                }
                continuarOp1 = true;
                while(continuarOp1){
                    print("     CADASTRO DE SENHA      ");
                    print("    Insira a Senha:         ");
                    try {
                        senha = tc1.nextLine();
                        continuarOp1 = false;
                    } catch (Exception e) {
                        print("[ERRO] INSIRA UMA SENHA VALIDA",true);
                    }
                }
                
                
                Usuario newU = new Usuario();
                newU.setLogin(login);
                newU.setNome(nome);
                newU.setSenha(senha);
                newU.criar();
                if(newU.existe()){
                    print("CONTA CRIADA COM SUCESSO");
                }else{
                    print("[ERRO] FALHA NA CRIAÇÃO DA CONTA",true);
                }
                
                
                
                
            }else if(op == 2){
                
            }else if(op == 3){
                
            }else{
                
            }        
        }
        
        
    }
}
