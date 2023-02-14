import java.util.Scanner;

public class Ex_03 
{      
    public static void main(String[] args) 
    {
        Scanner bf = new Scanner (System.in);
        int vet[] = new int[6], soma;
        
        vet[0] = 1;
        vet[1] = 0;
        vet[2] = 5;
        vet[3] = -2;
        vet[4] = -5;
        vet[5] = 7;
        
        soma = vet[0] + vet[1] + vet[5];
        vet[4] = 100;
        
        System.out.println("A soma eh: "+soma);
        for(int i=0;i<=5;i++)
            System.out.println(vet[i]);
        
    }
}