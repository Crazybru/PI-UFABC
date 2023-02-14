import java.util.Scanner;

public class Ex_06
{      
    public static void main(String[] args) 
    {
        Scanner bf = new Scanner (System.in);
        double vet[] = new double[5];
        double soma=0;
        int neg=0;
        
        for(int i=0;i<=4;i++){
            vet[i] = bf.nextDouble();
            if(vet[i]<0)
                neg++;
            else
                soma = soma + vet[i];
        }
        System.out.println(neg);
        System.out.printf("%.6f", soma);
    }
}
    