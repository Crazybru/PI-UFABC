import java.util.Scanner;

public class Ex_05 
{      
    public static void main(String[] args) 
    {
        Scanner bf = new Scanner (System.in);
        int tlinha=0,tcoluna=0;
        tlinha = bf.nextInt();
        tcoluna = bf.nextInt();
        
        double M[][] = new double[tlinha][tcoluna];
        
        for(int i=0;i<tlinha;i++){
            for(int j=0;j<tcoluna;j++){
                if(i < j){
                    M[i][j] = 2*i + 7*j - 2;
                }
                if(i == j){
                    double iQuadrado = 0;
                    iQuadrado = Math.pow(i, 2);
                    M[i][j] = 3*iQuadrado - 1;
                }
                if(i > j){
                    double iCubo=0,jQuadrado=0;
                    iCubo = Math.pow(i,3);
                    jQuadrado = Math.pow(j,2);
                    
                    M[i][j] = 4*iCubo + 5*jQuadrado + 1;
                }
                
                System.out.printf("%.0f ", M[i][j]);
            }
            System.out.print("\n");
        }
    }   
}