import java.util.Scanner;

public class Ex_03
{      
    public static void main(String[] args) 
    {
        Scanner bf = new Scanner (System.in);
        int neg=0, pos=0;
        int matriz[][] = new int[4][4];
        
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                matriz[i][j] = bf.nextInt();
                
                if (matriz[i][j] > 10)
                    pos++;
                else if (matriz[i][j] < 0)
                    neg++;
            }
        }
        System.out.printf("Qtd. > 10: %d\nQtd. < 0: %d", pos,neg);
    }   
}
    