import java.util.Scanner;

public class Ex_01 
{

    public static double FCalculadora(double num1, double num2, char sinal){
        double resultado=0;
        
        switch(sinal){
            case '+':
            resultado = num1 + num2;
            System.out.printf("%.1f", resultado);
            break;
            
            case '-':
            resultado = num1 - num2;
            System.out.printf("%.1f", resultado);
            break;
            
            case '*':
            resultado = num1 * num2;
            System.out.printf("%.1f", resultado);
            break;
            
            case '/':
            resultado = num1 / num2;
            System.out.printf("%.1f", resultado);
            break;
        }
        return resultado;
    }
    
    public static void main(String[] args) 
    {
        double n1, n2;
        char sinal;
        
        Scanner bf = new Scanner (System.in);
        
        n1 = bf.nextDouble();
        bf.nextLine();
        sinal = bf.nextLine().charAt(0);
        n2 = bf.nextDouble();
        
        FCalculadora(n1,n2,sinal);
    }
    
}