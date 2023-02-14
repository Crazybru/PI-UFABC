import java.util.Scanner;

public class Ex_05 
{      
    public static void main(String[] args) 
    {
        Scanner bf = new Scanner (System.in);
        int vet[] = new int[10],maior=0,menor=9999;
        int vetpar[] = new int[10];
        int vetimpar[] = new int[10];
        int unico[] = new int[10];
        
        for(int i=0;i<=9;i++){
            vet[i] = bf.nextInt();
            if(vet[i] != unico[0] && vet[i] != unico[1] && vet[i] != unico[2] && vet[i] != unico[3] && vet[i] != unico[4] && vet[i] != unico[5] && vet[i] != unico[6] && vet[i] != unico[7] && vet[i] != unico[8] && vet[i] != unico[9])
                unico[i] = vet[i];
            if(unico[i]%2==0 && unico[i]!=0)
                vetpar[i]=unico[i];
            else if(unico[i]!=0 && unico[i]%2!=0)
                vetimpar[i]=unico[i];
            if(vet[i] > maior)
                maior = vet[i];
            else if(vet[i] < menor)
                menor = vet[i];
        }
        
        System.out.println("Numeros pares:");
        if(menor==0)
            System.out.println(menor);
        for(int i=0;i<=9;i++){
            if(vetpar[i] != 0)
                System.out.println(vetpar[i]);
        }
        System.out.println("Numeros impares");
        for(int i=0;i<=9;i++){
            if(vetimpar[i] != 0)
                System.out.println(vetimpar[i]);
        }
        System.out.println("Maior: "+maior);
        System.out.println("Menor: "+menor);
    }
}
    