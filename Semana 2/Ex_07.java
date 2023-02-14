import java.util.Scanner;

public class Ex_07 {

    public static void main(String[] args) {
        int nascimento, ano_atual, idade, ano_futuro;
        
        Scanner Entrada = new Scanner (System.in);
        
        
        nascimento = Entrada.nextInt();
        
       
        ano_atual = Entrada.nextInt();
        
        System.out.println("Idade atual: " + (ano_atual - nascimento));
        
        
        ano_futuro = Entrada.nextInt();
        
        System.out.println("Em " + ano_futuro + ", a idade sera: "+ (ano_futuro - nascimento) );   
    }
    
}
