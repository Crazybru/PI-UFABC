import java.util.Scanner;

public class Ex_02 {

    public static void main(String[] args) {
        int valorInput;
        
        Scanner bf = new Scanner (System.in);
        
        valorInput = bf.nextInt();
        
        if (valorInput != 0)
            System.out.println("Eh diferente!");
        else
            System.out.println("Eh zero!");
        }
    }
    
