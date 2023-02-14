import java.util.Scanner;

public class Ex_05 {

    public static void main(String[] args) {
        int filhos1, filhos2, filhos3, AteDois=0, MaisDeDois=0;
        
        Scanner bf = new Scanner (System.in);
        
        filhos1 = bf.nextInt();
        filhos2 = bf.nextInt();
        filhos3 = bf.nextInt();
        
        if (filhos1 <= 2)
        {
            AteDois++;
        }
        else
        {
            MaisDeDois++;
        }
        
        if (filhos2 <= 2)
        {
            AteDois++;
        }
        else
        {
            MaisDeDois++;
        }
        
        if (filhos3 <= 2)
        {
            AteDois++;
        }
        else
        {
            MaisDeDois++;
        }
        
        System.out.printf("Ate dois filhos: %d\nMais de dois filhos: %d", AteDois, MaisDeDois);
    }
}