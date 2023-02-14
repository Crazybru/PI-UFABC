import java.util.Scanner;

public class Ex_09 {

    public static void main(String[] args) {
        double peso, engordou, emagreceu;
        
        Scanner Entrada = new Scanner (System.in);
        
        peso = Entrada.nextDouble();
        engordou = peso * 1.34;
        emagreceu = peso * 0.87;
        
        System.out.printf("Peso (engordou): %.2f \nPeso(emagreceu): %.2f", engordou, emagreceu);
    }
    
}
