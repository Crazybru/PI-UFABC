import java.util.Scanner;

public class Ex_02
{
    static int check = 1;

    public static int Semana(int dia){
            switch(dia){
                case 1:
                    System.out.println("Domingo");
                    check = 1;
                    break;
                case 2:
                    System.out.println("Segunda-feira");
                    check = 1;
                    break;
                case 3:
                    System.out.println("Terça-feira");
                    check = 1;
                    break;
                case 4:
                    System.out.println("Quarta-feira");
                    check = 1;
                    break;
                case 5:
                    System.out.println("Quinta-feira");
                    check = 1;
                    break;
                case 6:
                    System.out.println("Sexta-feira");
                    check = 1;
                    break;
                case 7:
                    System.out.println("Sabado");
                    check = 1;
                    break;
                default:
                    check = 0;
                    break;
            }
            return check;
        }
    
    
    public static void main(String[] args) 
    {
        int dia;
        
        Scanner bf = new Scanner (System.in);
        
        dia = bf.nextInt();
        
        Semana(dia);
        
        while(check == 0){
            System.out.println("O numero deve ser >=1 e <=7!");
            dia = bf.nextInt();
            Semana(dia);
        }
    }
    
}