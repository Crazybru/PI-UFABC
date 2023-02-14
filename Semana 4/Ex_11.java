import java.util.Scanner;

public class Ex_11 
{

    public static void main(String[] args) 
    {
        int n, i=1, c=0, contador, cmax=1;
        
        Scanner bf = new Scanner (System.in);
        
        n = bf.nextInt();
        contador = n;
        
        while (contador != 0)
        {
            System.out.print(i + " ");
            i++;
            c++;
            if (c == cmax)
            {
                System.out.print("\n");
                cmax++;
                c = 0;
                contador--;
            }

            
        }
        
    }
}