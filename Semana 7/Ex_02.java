import java.util.Scanner;

public class Ex_02
{      
    public static void main(String[] args) 
    {
        Scanner bf = new Scanner (System.in);
        int vet[] = new int[5];
        double media, soma=0;
        
        for(int i=0;i<=4;i++)
            vet[i] = bf.nextInt();
        
        for(int i=0;i<=4;i++)
            soma = soma + vet[i];
        
        media = soma/5;
        
        for(int i=0;i<=4;i++)
            System.out.print(vet[i]+" ");
        System.out.printf("\n%.2f", media);
        
        
    }
}
    