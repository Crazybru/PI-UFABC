import java.util.Scanner;

public class Ex_07 {

    public static void main(String[] args) {
        int numero, impar=1, par=0;
        
        Scanner bf = new Scanner (System.in);
        
        numero = bf.nextInt();
        
        if (numero%2 == 0)
        {
            while(impar < numero)
            {
                System.out.print(impar + " ");
                impar++;
                impar++;
            }
            
            System.out.print("\n");
            
            while (par <= numero)
            {
                System.out.print(par + " ");
                par++;
                par++;
            }
        }
        else{
            while(impar <= numero)
            {
                System.out.print(impar + " ");
                impar++;
                impar++;
            }
            
            System.out.print("\n");
            
            while (par <= numero)
            {
                System.out.print(par + " ");
                par++;
                par++;
            }
        }
    }
}