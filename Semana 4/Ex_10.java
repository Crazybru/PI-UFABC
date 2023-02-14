import java.util.Scanner;

public class Ex_10 
{

    public static void main(String[] args) 
    {
        int n, i = 1, somatorio=0;
        
        Scanner bf = new Scanner (System.in);
        
        n = bf.nextInt();
        
        while (i < n)
        {
            if ((n % i == 0) && (n % i != 1))
            {
                somatorio = somatorio + i;
            }
            i++;
        }
        System.out.println(somatorio);
    }
}