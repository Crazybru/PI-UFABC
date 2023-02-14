import java.util.Scanner;

public class Ex_03 
{
    public static double Conversor(double farenheit){
        double celsius;
        celsius = ((farenheit - 32.0)*(5.0/9.0));
        System.out.printf("%.2f", celsius);
        return celsius;
    }
    
    
    public static void main(String[] args) 
    {
        double farenheit;
        
        Scanner bf = new Scanner (System.in);
        
        farenheit = bf.nextInt();
        Conversor(farenheit);
    }
}
    