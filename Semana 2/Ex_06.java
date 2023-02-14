import java.util.Scanner;

public class Ex_06 {

    public static void main(String[] args) {
        double num_1, num_2, num_3, adicao, media, produto;
        
        Scanner Entrada = new Scanner (System.in);
        
        System.out.println("Digite o primeiro número");
        num_1 = Entrada.nextDouble();
        
        System.out.println("Digite o segundo número");
        num_2 = Entrada.nextDouble();
        
        System.out.println("Digite o terceiro número");
        num_3 = Entrada.nextDouble();
        
        adicao = num_1 + num_2 + num_3;
        media = (num_1 + num_2 + num_3)/3;
        produto = num_1 * num_2 * num_3;
        
        System.out.printf("Adicao: %.2f \nMedia: %.2f \nProduto: %.2f", adicao, media, produto);
                
        
    }
    
}
