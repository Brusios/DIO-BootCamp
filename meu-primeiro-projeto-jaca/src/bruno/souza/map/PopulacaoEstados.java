package bruno.souza.map;
import java.util.*;

/*Exercicio proposto:

Dada a população estimulada de alguns estados do NE brasileiro, faça:

Estado = PE - População = 9.616.621
Estado = AL - População = 3.351.543
Estado = CE - População = 9.187.103
Estado = RN - População = 3.534.265

Crie um dicionário e relacione os estados e suas populações;
Substitua a população do estado do RN por 3.534.165;
Confira se o estado PB está no dicionário, caso não adicione: PB - 4.039.277;
Exiba a população de PR;
Exiba todos os estados e suas populações na ordem que foi informado;
Exiba os estados e suas populações em ordem alfabetica;
Exiba o estado com o menor população e sua quantidade;
Exiba o estado com a maior população e sua quantidade;
Exiba a soma da população desses estados;
Exiba a média da população deste dicionário de estados;
Remova os estados com a população menor que 4.000.000;
Apague o dicionário de estados;
Confira se o dicionário esta vazio. */

public class PopulacaoEstados {
  public static void main(String[] args) {
    Map<String, Long> populacaoEstados = new LinkedHashMap<>();
    
    // Adicionar os estados e suas populações ao mapa
    populacaoEstados.put("PE", 9616621L);
    populacaoEstados.put("AL", 3351543L);
    populacaoEstados.put("CE", 9187103L);
    populacaoEstados.put("RN", 3534265L);
    
    // Substituir a população do estado do RN
    populacaoEstados.put("RN", 3534165L);
    
    // Verificar se o estado PB está no mapa e adicionar se não estiver
    populacaoEstados.putIfAbsent("PB", 4039277L);
    
    // Exibir a população do estado PR
    Long populacaoPR = populacaoEstados.get("PR");
    System.out.println("População do estado PR: " + populacaoPR);
    
    // Exibir os estados e suas populações na ordem em que foram informados
    System.out.println("Estados e suas populações na ordem informada:");
    for (Map.Entry<String, Long> entry : populacaoEstados.entrySet()) {
        System.out.println("Estado: " + entry.getKey() + ", População: " + entry.getValue());
    }
    
    // Exibir os estados e suas populações em ordem alfabética
    System.out.println("Estados e suas populações em ordem alfabética:");
    Map<String, Long> populacaoEstadosOrdenado = new TreeMap<>(populacaoEstados);
    for (Map.Entry<String, Long> entry : populacaoEstadosOrdenado.entrySet()) {
        System.out.println("Estado: " + entry.getKey() + ", População: " + entry.getValue());
    }
    
    // Encontrar o estado com a menor população
    String estadoMenorPopulacao = null;
    Long menorPopulacao = Long.MAX_VALUE;
    for (Map.Entry<String, Long> entry : populacaoEstados.entrySet()) {
        if (entry.getValue() < menorPopulacao) {
            estadoMenorPopulacao = entry.getKey();
            menorPopulacao = entry.getValue();
        }
    }
    System.out.println("Estado com menor população: " + estadoMenorPopulacao + ", População: " + menorPopulacao);
    
    // Encontrar o estado com a maior população
    String estadoMaiorPopulacao = null;
    Long maiorPopulacao = Long.MIN_VALUE;
    for (Map.Entry<String, Long> entry : populacaoEstados.entrySet()) {
        if (entry.getValue() > maiorPopulacao) {
            estadoMaiorPopulacao = entry.getKey();
            maiorPopulacao = entry.getValue();
        }
    }
    System.out.println("Estado com maior população: " + estadoMaiorPopulacao + ", População: " + maiorPopulacao);
    
    // Calcular a soma da população dos estados
    Long somaPopulacao = 0L;
    for (Long populacao : populacaoEstados.values()) {
        somaPopulacao += populacao;
    }
    System.out.println("Soma da população dos estados: " + somaPopulacao);
    
    // Calcular a média da população dos estados
    double mediaPopulacao = (double) somaPopulacao / populacaoEstados.size();
    System.out.println("Média da população dos estados: " + mediaPopulacao);
    
    // Remover os estados com população menor que 4.000.000
    populacaoEstados.values().removeIf(populacao -> populacao < 4000000L);
    
    // Apagar o dicionário de estados
    populacaoEstados.clear();
    
    // Verificar se o dicionário está vazio
    boolean vazio = populacaoEstados.isEmpty();
    System.out.println("O dicionário está vazio? " + vazio);
}
}
