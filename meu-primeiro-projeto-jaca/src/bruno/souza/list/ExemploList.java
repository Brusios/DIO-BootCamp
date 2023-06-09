package bruno.souza.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploList {
  public static void main(String[] args) {
    System.out.println("Criando uma lista e adicionando sete notas: ");

    List<Double> notas = new ArrayList<Double>();
    notas.add(7.2);
    notas.add(2.0);
    notas.add(5.8);
    notas.add(4.2);
    notas.add(1.8);
    notas.add(0.0);
    notas.add(9.6);

    System.out.println(notas.toString());
    System.out.println("Tamanho: " + notas.size());

    System.out.println("Menor nota: " + Collections.min(notas));
    System.out.println("Max nota: " + Collections.max(notas));
  }
}
