import java.util.Scanner;

public class Ex_05 {

    public static void main(String[] args) {
        int idade;
        
        Scanner bf = new Scanner (System.in);
        
        idade = bf.nextInt();
        
        if (idade >= 18)
            System.out.println("Eh maior de idade!");
        else
            System.out.println("Nao eh maior de idade!");
        
        }
    }