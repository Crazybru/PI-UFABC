import java.util.Scanner;

public class Ex_02
{      
    public static void main(String[] args) 
    {
        Scanner bf = new Scanner (System.in);
        int tamanho, j1=0;
        
        tamanho = bf.nextInt();
        int matriz[][] = new int[tamanho][tamanho];
        
        for(int i=0;i<tamanho;i++){
            for(int j=0;j<tamanho;j++){
                if(j==j1)
                    matriz[i][j] = 1;
                else
                    matriz[i][j] = 0;
            }
            j1++;
        }
        
        for(int i=0;i<tamanho;i++){
            for(int j=0;j<tamanho;j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.print("\n");
        }
    }   
}
    