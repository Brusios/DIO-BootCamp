package bruno.souza.list;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.sql.rowset.Predicate;

public class StreamAPI {
  public static void main(String[] args) {
    List<String> numerosAleatorios = Arrays.asList("1","0", "4", "1", "2", "3", "9", "9", "6" ,"5");
  
    System.out.println("Imprima todos os elementos dessa lista de String: ");

    numerosAleatorios.forEach(t -> System.out.println(t) );

    System.out.println("Pegue os 5 primeiros numeros e coloque dentro de um Set: : ");

    numerosAleatorios.stream()
    .limit(5)
    .collect(Collectors.toSet())
    .forEach(System.out::println);

    System.out.println("transforme esta Lista de String em uma lista de números inteiros.");

    List<Integer> collectList = numerosAleatorios.stream()
    .map(Integer::parseInt)
    .collect(Collectors.toList());

    System.out.println("Nova var: " + collectList);

    System.out.println("Numeros pares e maiores que 2 e coloque em uma lista: ");

    List<Integer> listaParesMaioresQue2 = numerosAleatorios.stream().map(Integer::parseInt)
    .filter(i -> i %2 == 0 && i > 2).collect(Collectors.toList());

    System.out.println(listaParesMaioresQue2 + "\n \n");

    System.out.println("Mostrando a média: ");
    numerosAleatorios.stream().mapToInt(Integer::parseInt)
    .average()
    .ifPresent(System.out::println);
  
    System.out.println("\nRemovendo os valores impares: ");

    listaParesMaioresQue2.removeIf(i -> (i % 2 !=0 ));
    System.out.println(listaParesMaioresQue2);
  }
}
