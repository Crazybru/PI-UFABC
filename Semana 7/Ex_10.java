import java.util.Scanner;

public class Ex_10 
{      
    public static void main(String[] args) 
    {
        Scanner bf = new Scanner (System.in);
        int meses[] = new int[12];
        String nomes[] = new String[12];
        
        for(int i=0;i<meses.length;i++)
            meses[i] = bf.nextInt();
        
        bf.nextLine();
        for(int i=0;i<nomes.length;i++)
            nomes[i] = bf.nextLine();
        
        for(int i=0;i<nomes.length;i++)
            System.out.println(nomes[i] +"="+ meses[i]);
    }   
}