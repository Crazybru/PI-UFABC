import java.util.Scanner;

public class Ex_08 
{      
    public static void main(String[] args){
        
        Scanner bf = new Scanner (System.in);
        int M[][] = new int[4][4];
        int soma=0;
        
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++)
                M[i][j] = bf.nextInt();
        }
        soma = M[1][0] + M[2][0] + M[2][1] + M[3][0] + M[3][1] + M[3][2];
        
        System.out.print("Soma: "+soma);
    }   
}
    