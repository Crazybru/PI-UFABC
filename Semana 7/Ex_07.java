import java.util.Scanner;

public class Ex_07
{      
    public static void main(String[] args) 
    {
        Scanner bf = new Scanner (System.in);
        int A[] = new int[5];
        int B[] = new int[5];
        int C[] = new int[5];
        
        for(int i=0;i<=4;i++)
            A[i] = bf.nextInt();
        for(int i=0;i<=4;i++)
            B[i] = bf.nextInt();
        
        for(int i=0;i<=4;i++){
            C[i] = A[i] - B[i];
            System.out.print(C[i] + " ");
        }
    }
}