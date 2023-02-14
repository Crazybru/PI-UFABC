import java.util.Scanner;

public class Ex_01 {

    public static void main(String[] args) {
        int lado1, lado2, lado3;
        
        Scanner bf = new Scanner (System.in);
        
        lado1 = bf.nextInt();
        lado2 = bf.nextInt();
        lado3 = bf.nextInt();
        
        if ((lado1 < (lado2 + lado3)) && lado2 < (lado1 + lado3) && lado3 < (lado1 + lado2))
        {
            System.out.println("Eh um triangulo!");
        
            if ((lado1 == lado2) && (lado2 == lado3))
            {
                System.out.println("Equilatero!");
            }
            else if ((lado1 == lado2) || (lado2 == lado3) || (lado1 == lado3))
            {
                System.out.println("Isosceles!");
            }
            else
            {
                System.out.println("Escaleno!");
            }
        }
        else{
            System.out.println("Nao eh um triangulo!");
        }
    }
}