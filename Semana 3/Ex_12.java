import java.util.Scanner;

public class Ex_12 {

    public static void main(String[] args) {
        int idade;
        
        Scanner bf = new Scanner (System.in);
        
        idade = bf.nextInt();
        
        if(idade <= 0)
        {
            System.out.println("Idade Invalida!");
        }
        else if (idade < 18)
        {
            System.out.println("Menor de Idade!");
        }
        else if (idade >= 65)
        {
            System.out.println("Maior de 65 anos!");
        }
        else
        {
            System.out.println("Maior de idade!");
        }
    }
    
}