import java.util.Scanner;

public class Ex_06 
{      
    public static void main(String[] args){
        
        Scanner bf = new Scanner (System.in);
        int M[][] = new int[3][3];
        int somatorio[] = new int[3];
        
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++)
                M[i][j] = bf.nextInt();
        }
        somatorio[0] = M[0][0] + M[1][0] + M[2][0];
        somatorio[1] = M[0][1] + M[1][1] + M[2][1];
        somatorio[2] = M[0][2] + M[1][2] + M[2][2];
        
        for(int i=0;i<3;i++)
            System.out.print(somatorio[i] + " ");
    }   
}
    