import java.util.Scanner;

public class Ex_08 
{      
    public static void main(String[] args) 
    {
        Scanner bf = new Scanner (System.in);
        int vet[] = new int[6];
        int repetido=-1;
        
        for(int i=0;i<vet.length;i++)
            vet[i] = bf.nextInt();
        
        for(int i = 0; i < vet.length; i++) {  
            for(int j = i + 1; j < vet.length; j++) {  
                if(vet[i] == vet[j]){
                    if(repetido != vet[j])
                        System.out.println(vet[j]);
                    repetido = vet[j];
                }    
            }  
        }   
        if(repetido == -1)
            System.out.println("Nao existem valores iguais!");
    }   
}
   