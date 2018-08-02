package main;
// COMENTAR E ARRUMAR TRATAMENTOS!
// COMENTAR E ARRUMAR TRATAMENTOS!
// COMENTAR E ARRUMAR TRATAMENTOS!
// COMENTAR E ARRUMAR TRATAMENTOS!
// COMENTAR E ARRUMAR TRATAMENTOS!
public class Funcao {
    public static void print(String str){
            //DEBUG DE PRINT
        int tamanhoTotal = 100;
        int tamanhoTexto = str.length();
        int tamanhoLateral = ( tamanhoTotal - tamanhoTexto ) / 2;
        int tamanhoLaterald = tamanhoLateral;
        int tamanhoLaterale = tamanhoLateral;
        int total = (tamanhoLateral*2)+tamanhoTexto;
        String u = "-";
        if (total != 100){
            int diferenca = 100-total;
            tamanhoLaterald+= diferenca;
        }
        
        //System.out.println("tamanho total:"+tamanhoTotal);
        //System.out.println("tamanho texto:"+tamanhoTexto);
        //System.out.println("tamanho lateral:"+tamanhoLateral);
        for (int i = 0; i < tamanhoLaterale; i++) {
            System.out.print(u);
        }
        System.out.print(str);
        for (int i = 0; i < tamanhoLaterald; i++) {
            System.out.print(u);
            
        }
        System.out.println("");
    }
    public static void print(String str,boolean erro){
            //DEBUG DE PRINT
        int tamanhoTotal = 100;
        int tamanhoTexto = str.length();
        int tamanhoLateral = ( tamanhoTotal - tamanhoTexto ) / 2;
        int tamanhoLaterald = tamanhoLateral;
        int tamanhoLaterale = tamanhoLateral;
        int total = (tamanhoLateral*2)+tamanhoTexto;
        String u = "-";
        if (total != 100){
            int diferenca = 100-total;
            tamanhoLaterald+= diferenca;
        }
        
        //System.out.println("tamanho total:"+tamanhoTotal);
        //System.out.println("tamanho texto:"+tamanhoTexto);
        //System.out.println("tamanho lateral:"+tamanhoLateral);
        for (int i = 0; i < tamanhoLaterale; i++) {
            System.err.print(u);
        }
        System.err.print(str);
        for (int i = 0; i < tamanhoLaterald; i++) {
            System.err.print(u);
            
        }
        System.err.println("");
    }
    public static void print(){
        print("ERRO",true);
    }  
    
}
