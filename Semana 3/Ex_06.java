import java.util.Scanner;

public class Ex_06 {

    public static void main(String[] args) {
        int numero;
        
        Scanner bf = new Scanner (System.in);
        
        numero = bf.nextInt();
        
        if (numero % 2 == 0)
        {
            System.out.println("Eh par!");
        }
        else
        {
            System.out.println("Eh impar!");
        }
        
        
        }
    }