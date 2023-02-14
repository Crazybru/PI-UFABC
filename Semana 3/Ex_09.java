import java.util.Scanner;

public class Ex_09 {

    public static void main(String[] args) {
        String senha;
        
        Scanner bf = new Scanner (System.in);
        
        senha = bf.nextLine();
        
        if((senha.equals("UFABC")) || (senha.equals("ufabc")))
        {
                System.out.println("Acesso Liberado!");
        }
        else
        {
            System.out.println("Acesso Negado!");
        }
    }
    
}