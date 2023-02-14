import java.util.Scanner;

public class Ex_07 {

    public static void main(String[] args) {
        int n1, n2;
        
        Scanner bf = new Scanner (System.in);
        
        n1 = bf.nextInt();
        n2 = bf.nextInt();
        
        if(n1 > n2)
        {
            System.out.println("Menor eh: " + n2);
        }
        else if(n2 > n1)
        {
            System.out.println("Menor eh: " + n1);
        }
        else
        {
            System.out.println("Numeros iguais!");
        }
        }
    }
    