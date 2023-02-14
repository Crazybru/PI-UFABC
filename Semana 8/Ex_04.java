import java.util.Scanner;

public class Ex_04
{      
    public static void main(String[] args) 
    {
        Scanner bf = new Scanner (System.in);
        int jdp=0,jds=2,somaP=0,somaS=0;
        int matriz[][] = new int[3][3];
        
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                matriz[i][j] = bf.nextInt();
            }
            somaP = somaP + matriz[i][jdp];
            somaS = somaS + matriz[i][jds];
            jdp++;
            jds--;
        }
        System.out.printf("Soma diagonal principal: %d\nSoma diagonal secundaria: %d", somaP,somaS);
    }   
}