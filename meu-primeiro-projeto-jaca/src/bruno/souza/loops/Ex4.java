package bruno.souza.loops;

import java.util.Scanner;

public class Ex4 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int quantNumeros;

    System.out.println("Quabtidade de numeros: ");
    quantNumeros = scan.nextInt();   
    
    int count = 0;
    int numero = 0;
    int quantPares = 0;
    int quantImpares = 0;

    do {
      System.out.println("Numero: ");
      numero = scan.nextInt();

      if(numero % 2 == 0) quantPares++; //Add a variavel quantPares
      else quantImpares++;

      count ++;
      //count = count +1;

    } while (count < quantNumeros);
    System.out.println("Quantidade Par: " + quantPares);
    System.out.println("Quantidade Impar: " + quantImpares);
  }  
}
