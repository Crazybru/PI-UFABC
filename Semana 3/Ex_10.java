import java.util.Scanner;

public class Ex_10 {

    public static void main(String[] args) {
        double salario, emprestimo, limite;
        
        Scanner bf = new Scanner (System.in);
        
        salario = bf.nextDouble();
        emprestimo = bf.nextDouble();
        
        limite = 0.3 * salario;
        
        if(limite >= emprestimo)
        {
            System.out.println("Emprestimo Liberado!");
        }
        else
        {
            System.out.println("Emprestimo Negado!");
        }
        
    }
    
}
