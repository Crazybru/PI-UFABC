import java.util.Scanner;

public class Ex_03 {

    public static void main(String[] args) {
        String gordo, emagrecer_engordar;
        
        Scanner bf = new Scanner (System.in);
        
        gordo = bf.nextLine();
        emagrecer_engordar = bf.nextLine();
        
        if (gordo.equals("sim"))
        {
            if (emagrecer_engordar.equals("sim"))
            {
                System.out.println("Compre uma bicicleta!");
            }
            else if (emagrecer_engordar.equals("nao"))
            {
                System.out.println("Case!");
            }
        }
        if (gordo.equals("nao"))
        {
            if (emagrecer_engordar.equals("sim"))
            {
                System.out.println("Case!");
            }
            else if (emagrecer_engordar.equals("nao"))
            {
                System.out.println("Compre uma bicicleta!");
            }
        }     
    }
}
