import java.util.Scanner;

public class Ex_11 {

    public static void main(String[] args) {
        int n1, n2, n3;
        
        Scanner bf = new Scanner (System.in);
        
        n1 = bf.nextInt();
        n2 = bf.nextInt();
        n3 = bf.nextInt();
        
        if(n1 > n2 && n1 > n3)
        {
            System.out.println("Maior eh: " + n1);
        }
        else if (n2 > n1 && n2 > n3)
        {
            System.out.println("Maior eh: " + n2);
        }
        else if (n3 > n1 && n3 > n2)
        {
            System.out.println("Maior eh: " + n3);
        }
        else
        {
            System.out.println("Numeros Iguais!");
        }
    }
    
}