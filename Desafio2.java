import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int A, N;
      

        Scanner input = new Scanner(System.in);
        A = input.nextInt();
        N = input.nextInt();

        //TODO:  Retorne o valor da soma de todos múltiplos de "A" até o seu limite "N".
          int soma=0;
            for(int i = 1; i <= N; i++){
            if(i % A == 0) {
                soma += i; 
            }
        }

        System.out.println(soma);
    }
    
}
public class Desafio2 {
    
}
