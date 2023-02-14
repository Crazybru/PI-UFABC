import java.util.Scanner;

public class Ex_04 {

    public static void main(String[] args) {
        double n1, n2;
        
        Scanner bf = new Scanner (System.in);
        
        n1 = bf.nextDouble();
        n2 = bf.nextDouble();
        
        
        if (n1 > n2)
            System.out.printf("%.2f \n%.2f", n1, n2);
        else
            System.out.printf("%.2f \n%.2f", n2, n1);
        }
    }
    