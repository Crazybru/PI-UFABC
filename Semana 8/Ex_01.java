import java.util.Scanner;

public class Ex_01
{      
    public static void main(String[] args) 
    {
        Scanner bf = new Scanner (System.in);
        int matriz[][] = new int[3][3];
        int jsave1=0, isave1=0, jsave2=0, isave2=0, maior=-999, menor=999;
        
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                matriz[i][j] = bf.nextInt();
                
                if(matriz[i][j] > maior){
                    jsave1 = j;
                    isave1 = i;
                    maior = matriz[i][j];
                }
                if(matriz[i][j] < menor){
                    jsave2 = j;
                    isave2 = i;
                    menor = matriz[i][j];
                } 
            }
        }
        System.out.printf("Maior: %d\nPosicao (maior): %d linha e %d coluna\nMenor: %d\nPosicao (menor): %d linha e %d coluna", maior,isave1,jsave1,menor,isave2,jsave2);
    }   
}