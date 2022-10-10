

import java.util.Random;
import java.util.Scanner;

import javax.swing.BoundedRangeModel;


public class megaSena {
    public static void main(String[] args) {
       Random random = new Random();

       int[] numerosSorteio = new int[6];

       for(int i =0; i < numerosSorteio.length;i++){
         int numero = random.nextInt(60); 
         numerosSorteio[i] = numero;
       }
       System.out.println("As dezenas sorteadas são:" );
       for (int numero : numerosSorteio) {
        System.out.println(numero);
       }

    }

}