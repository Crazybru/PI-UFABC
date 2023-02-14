package projetopi;
import java.util.Scanner;
import java.io.IOException;

public class ProjetoPI {

    public static void main(String[] args) throws IOException {
        double perfil[] = new double[3];
        int continuar=1, verificar=0;
        String aluno;
        char conceito;

        //Scanners:
        Scanner num = new Scanner(System.in); 
        Scanner nomes = new Scanner(System.in);

        //Loop principal:
        while (continuar != 0) { 
            
            System.out.println("Alunos:");
            System.out.println("Brunno Toscano Messias \nGabriela Lagreca \nGuilherme Fidelix de Sa¡ \nMariana Klein Vasconcelos Mendes");
            System.out.println("\nDigite o nome de um aluno.");
            
            //Input do nome e validação:
            aluno = nomes.nextLine();
            while(verificar==0){
                if(aluno.equals("Brunno Toscano Messias") || aluno.equals("Gabriela Lagreca") || aluno.equals("Guilherme Fidelix de Sa") || aluno.equals ("Mariana Klein Vasconcelos Mendes"))
                    verificar = 1;
                else
                    System.out.println("Digite um nome válido!");
            }
            
            //Cálculo das notas:
            NotasMedias(aluno,perfil); 
            conceito = Conceito(perfil[2]);
            System.out.printf("Notas: \nP1: %.1f \nP2: %.1f \nMédia: %.1f \nConceito: %c", perfil[0], perfil[1], perfil[2], conceito);

            //Pedido para continuar o programa:
            System.out.println("\nDeseja ver as notas de outro aluno? \nSe sim, digite 1, se nÃ£o, digite 0.");
            continuar = num.nextInt();
            while ((continuar != 1) && (continuar != 0)) 
            {
                System.out.println("Digite 1 para continuar ou 0 para encerrar.");
                continuar = num.nextInt();
            }
            verificar = 0;
        }
    }
    //public static double NotasMedias

    public static double[] NotasMedias (String aluno, double p[]){
        long RA;
        Scanner notas = new Scanner(System.in);
        
        switch (aluno) {
            case "Brunno Toscano Messias":
                RA = 11202020125L;
                System.out.println("RA: "+RA);
                p[0] = notas.nextDouble();
                p[1] = notas.nextDouble();
                p[2] =(p[0]+p[1])/2;
                break;
            case "Gabriela Lagreca":
                RA = 11201723025L;
                System.out.println("RA: "+RA);
                p[0] = notas.nextDouble();
                p[1] = notas.nextDouble();
                p[2] =(p[0]+p[1])/2;
                break;
            case "Guilherme Fidelix de Sa¡":
                RA = 11202020808L;
                System.out.println("RA: "+RA);
                p[0] = notas.nextDouble();
                p[1] = notas.nextDouble();
                p[2] =(p[0]+p[1])/2;
                break;
            case "Mariana Klein Vasconcelos Mendes":
                RA = 11201720384L;
                System.out.println("RA: "+RA);
                p[0] = notas.nextDouble();
                p[1] = notas.nextDouble();
                p[2] =(p[0]+p[1])/2;
                break;
            default:
                break;
        }
        return p;
    }

    public static char Conceito (double media) {
        char conceito;
        if (media <= 4.5){
            conceito = 'F';
        }
        else if (media <= 5.9 && media >= 4.6){
            conceito = 'D';
        }
        else if (media <= 7.0 && media >= 6.0){
            conceito = 'C';
        }
        else if (media <= 8.5 && media >= 7.1){
            conceito = 'B';
        }
        else {
            conceito = 'A';
        }
        return conceito;
    }
}