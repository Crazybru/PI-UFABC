import java.util.Scanner;

public class Ex_09
{      
    public static void main(String[] args) 
    {
        Scanner bf = new Scanner (System.in);
        int vet[] = new int[10];
        
        for(int i=0;i<vet.length;i++){
            vet[i] = bf.nextInt();
            if(i!=0){
                for(int j = 0;j<i;j++){
                    if(vet[i] == vet[j]){
                        System.out.println("Numero já digitado! Digite outro numero!");  
                        i--;
                        break;
                }
              }
            }
        }
        for(int i=0;i<vet.length;i++)
            System.out.println(vet[i]);
    }   
}