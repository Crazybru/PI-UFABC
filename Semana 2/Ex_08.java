import java.util.Scanner;

public class Ex_08 {

    public static void main(String[] args) {
        int num_1, num_2, num_3;
        
        Scanner Entrada = new Scanner (System.in);
        
        num_1 = Entrada.nextInt();
        num_2 = Entrada.nextInt();
        num_3 = Entrada.nextInt();
        
        System.out.println("Quadrado de "+num_1+": " + (num_1*num_1));
        System.out.println("Cubo de "+num_1+": " + (num_1*num_1*num_1));
        System.out.println("Resto de "+num_2+" por "+num_3+": " + (num_2 % num_3));
       
    }
    
}
