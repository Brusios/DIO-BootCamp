package bruno.souza.loops;

import java.util.Scanner;

public class Ex3 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int numero;
    int count = 0;
    int maior = 0;
    int soma = 0;

      do {
        System.out.println("Numero: ");
        numero = scan.nextInt();

        soma = soma + numero;
        if (numero > maior) maior = numero;
        
        count = count + 1;       
      } while (count < 5);

      System.out.println("Maior numero: " + maior);
      System.out.println("Soma total de todos os numeros: " + soma);
      System.out.println("Media entre os 5 numeros digitados: " + (soma/5));
    }

  
}
