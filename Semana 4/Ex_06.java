import java.util.Scanner;

public class Ex_06 {

    public static void main(String[] args) {
        int numero, contador=0, contador2; //o "contador=0" vai ser usado pra dar a quantidade de ciclos necessarios e será o numero printado a cada ciclo 
        
        Scanner bf = new Scanner (System.in);
        
        numero = bf.nextInt();
        contador2= numero; //contador usado pra ordem decresente
        
        while (contador <= numero) //enquanto o contador não chegar no número digitado pelo usuário, o código continuará rodando
        {
            System.out.print(contador + " "); //a parte com aspas vazias (" ") é para dar o espaço entre o numero printado e o proximo (sem isso, 1 a 5 seria representado como "12345", etc)
            contador++; // cada ciclo adiciona +1 ao contador (para dar a ordem crescente, 1 até 10 por exemplo)
        }
        System.out.print("\n"); //quando a ordem crescente acaba todos os ciclos, esse comando pula uma linha
        while (contador2 >= 0) //esse código só para de rodar quando o contador2 (definido anteriormente) chegar a 0
        {
            System.out.print(contador2 + " ");
            contador2--; //como a ordem é decrescente, o contador2 é subtraído a cada ciclo, até chegar a 0
        }

    }
}