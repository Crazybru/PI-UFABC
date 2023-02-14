import java.util.Scanner;

public class Ex_04
{
    public static boolean QuadradoPerfeito(double num){
        double sqrt = Math.sqrt(num);
        return ((sqrt - Math.floor(sqrt)) == 0);
        }
    
    
    public static void main(String[] args) 
    {
        Scanner bf = new Scanner (System.in);
        double num;
        
        num = bf.nextDouble();
        
        if(QuadradoPerfeito(num))
            System.out.print("Eh um quadrado perfeito!");
        else
            System.out.print("Nao eh um quadrado perfeito!");
        
        }
}