import java.util.Scanner;

public class Ex_02 {

    public static void main(String[] args) {
        double valor_produto, valor_pago=0;
        int tipo_pagamento;
        
        Scanner bf = new Scanner (System.in);
        
        valor_produto = bf.nextDouble();
        tipo_pagamento = bf.nextInt();
        
        if (tipo_pagamento == 0)
        {
            valor_pago = (valor_produto*0.75);
            System.out.printf("R$ %.2f", valor_pago);
        }
        else if (tipo_pagamento == 1)
        {
            valor_pago = (valor_produto*0.8);
            System.out.printf("R$ %.2f", valor_pago);
        }    
        else if (tipo_pagamento == 2)
        {
            valor_pago = (valor_produto*0.9);
            System.out.printf("R$ %.2f", valor_pago);
        }   
        else if (tipo_pagamento == 3)
        {
            valor_pago = (valor_produto*0.95);
            System.out.printf("R$ %.2f", valor_pago);
        }    
    }
}