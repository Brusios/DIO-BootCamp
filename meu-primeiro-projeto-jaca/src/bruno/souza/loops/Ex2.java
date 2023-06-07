package bruno.souza.loops;

import java.util.Scanner;

public class Ex2 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int nota;
      System.out.println("Nota: ");
      nota = scan.nextInt();

      while (nota < 0 || nota > 10) {
        System.out.println("Nota invalida! Digite um numero entre 0 a 10.");
        nota = scan.nextInt();
      }
  }
}
