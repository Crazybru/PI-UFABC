import java.util.Scanner;

public class Ex_04 
{      
    public static void main(String[] args) 
    {
        Scanner bf = new Scanner (System.in);
        int vet[] = new int[8],soma,x=0,y=0;
        int verificar=0;
        
        for(int i=0;i<=7;i++)
            vet[i]=bf.nextInt();
        
        while(verificar==0){
            x = bf.nextInt();
            if(x<0 || x>=8)
                System.out.println("Valor de X invalido!");
            else
                verificar=1;
        }
        verificar=0;
        
        while(verificar==0){
            y = bf.nextInt();
            if(y<0 || y>=8)
                System.out.println("Valor de Y invalido!");
            else
                verificar=1;
        }
        soma = vet[x] + vet[y];
        System.out.println("Soma eh: "+soma);
        
    }
}