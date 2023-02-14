import java.util.Scanner;

public class Ex_01 
{      
    public static void main(String[] args) 
    {
        Scanner bf = new Scanner (System.in);
        int vet[] = new int[6];
        
        for(int i=0;i<=5;i++)
            vet[i] = bf.nextInt();
        
        for(int i=5;i>=0;i--)
            System.out.print(vet[i]+" ");
        
        
        }
}