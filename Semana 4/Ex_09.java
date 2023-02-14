import java.util.Scanner;

public class Ex_09 
{

    public static void main(String[] args) 
    {
        int n1, n2, n3, operacao=-1, resultado, menorNum=999;
        
        Scanner bf = new Scanner (System.in);
        
        while ((operacao !=0) && (operacao <= 3))
        {
            operacao = bf.nextInt();
            
            switch (operacao)
            {
                case 1:
                    n1 = bf.nextInt();
                    n2 = bf.nextInt();
                    
                    resultado = (n1+n2);
                    System.out.println("(a+b) = "+resultado);
                    
                    if (resultado < menorNum)
                    {
                        menorNum = resultado;
                    }
                    break;
                case 2:
                    n1 = bf.nextInt();
                    n2 = bf.nextInt();
                    n3 = bf.nextInt();
                    
                    resultado = (n1+n2+n3);
                    System.out.println("(a+b+c) = "+resultado);
                    
                    if (resultado < menorNum)
                    {
                        menorNum = resultado;
                    }
                    break;
                case 3:
                    n1 = bf.nextInt();
                    n2 = bf.nextInt();
                    
                    resultado = (n1*n2);
                    System.out.println("(a*b) = "+resultado);
                    
                    if (resultado < menorNum)
                    {
                        menorNum = resultado;
                    }
                    break;
                case 0:
                    System.out.println("Menor resultado: "+menorNum);
                    break;
                default:
                    System.out.println("Nenhum calculo foi realizado!");
                    break;
            }
        }
    }
}
