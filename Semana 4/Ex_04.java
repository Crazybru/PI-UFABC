import java.util.Scanner;

public class Ex_04 {

    public static void main(String[] args) {
        double premio=780;
        int ganhador;
        
        Scanner bf = new Scanner (System.in);
        
        ganhador = bf.nextInt();
        
        if (ganhador == 1)
        {
            premio = premio * 0.46;
            System.out.printf("Primeiro ganhador: R$ %.2f", premio);
        }
        else if (ganhador == 2)
        {
            premio = premio * 0.32;
            System.out.printf("Segundo ganhador: R$ %.2f", premio);
        }
        else if (ganhador == 3)
        {
            premio = premio * 0.22;
            System.out.printf("Terceiro ganhador: R$ %.2f", premio);
        }
    }
}