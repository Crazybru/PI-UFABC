import java.util.Scanner;

public class Ex_08 {

    public static void main(String[] args) {
        int numero=-1;
        
        Scanner bf = new Scanner (System.in);
        
        while(numero < 0)
        {
            numero = bf.nextInt();
            
            if (numero < 0)
            {
                System.out.println("O numero deve ser >=0!");
            }
        }
        
        while (numero >= 0)
        {
            System.out.print(numero + " ");
            numero--;
        }
        
        System.out.print("\nFIM!");
    }
}
