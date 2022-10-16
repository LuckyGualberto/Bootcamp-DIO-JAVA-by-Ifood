import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) {

        //TODO: Imprima se os valores numéricos passados são iguais ou não.
        
        Scanner leitor = new Scanner(System.in);
        
        int A = leitor.nextInt();
        int B = leitor.nextInt();
        
     
        if (A == B){
        System.out.println("Sao iguais!");
        }
        
        else {
          
        System.out.println("Nao sao iguais!");
        }
    }
}