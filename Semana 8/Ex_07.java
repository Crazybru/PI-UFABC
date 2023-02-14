import java.util.Scanner;

public class Ex_07
{      
    public static void main(String[] args){
        
        Scanner bf = new Scanner (System.in);
        int M[][] = new int[3][3];
        int soma=0;
        
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++)
                M[i][j] = bf.nextInt();
        }
        soma = M[0][1] + M[0][2] + M[1][2];
        
        System.out.print("Soma: "+soma);
    }   
}