import java.util.Scanner;

public class Ex_08 {

    public static void main(String[] args) {
        double altura, pesoIdeal;
        int sexo;
        
        Scanner bf = new Scanner (System.in);
        
        sexo = bf.nextInt();
        altura = bf.nextDouble();
        
        if(sexo == 0)
        {
            pesoIdeal = (72.7 * altura) - 58;
            System.out.printf("Peso ideal eh: %.2f", pesoIdeal);
        }
        else{
            pesoIdeal = (62.1 * altura) - 44.7;
            System.out.printf("Peso ideal eh: %.2f", pesoIdeal);
        }
        }
    }