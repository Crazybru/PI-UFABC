import java.util.Scanner;

public class Ex_05 {

    public static void main(String[] args) {
        double base, altura, area;
        
        Scanner Entrada = new Scanner (System.in);
        
        System.out.println("Digite o valor da base:");
        base = Entrada.nextDouble();
        
        System.out.println("Digite o valor da altura:");
        altura = Entrada.nextDouble();
        
        area = (base*altura)/2;
        
        System.out.printf("%.2f", area);
    }
    
}