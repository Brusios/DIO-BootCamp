package bruno.souza.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class LancamentoDados {
    public static void main(String[] args) {
        Map<String, Map<String, Integer>> timesMap = new HashMap<>();
        Random random = new Random();

        // Realizar o lançamento do dado 100 vezes
        for (int i = 0; i < 100; i++) {
            String time = obterNomeTimeAleatorio();
            int pontos = obterPontuacaoAleatoria();

            // Verificar se o time já existe no mapa
            if (timesMap.containsKey(time)) {
                Map<String, Integer> infoMap = timesMap.get(time);
                // Atualizar a frequência dos pontos
                if (infoMap.containsKey("Pontos")) {
                    int frequenciaPontos = infoMap.get("Pontos");
                    infoMap.put("Pontos", frequenciaPontos + 1);
                } else {
                    infoMap.put("Pontos", 1);
                }
            } else {
                // Adicionar o time ao mapa com as informações iniciais
                Map<String, Integer> infoMap = new HashMap<>();
                infoMap.put("Pontos", 1);
                timesMap.put(time, infoMap);
            }
        }

        int totalPontos = 0;

        // Exibir o mapa completo e calcular o total de pontos
        for (Map.Entry<String, Map<String, Integer>> entry : timesMap.entrySet()) {
            String time = entry.getKey();
            Map<String, Integer> infoMap = entry.getValue();
            int frequenciaPontos = infoMap.get("Pontos");
            totalPontos += frequenciaPontos;
            System.out.println("Time: " + time);
            System.out.println("Frequência de Pontos: " + frequenciaPontos);
            System.out.println();
        }

        // Calcular a média de pontos
        double mediaPontos = (double) totalPontos / timesMap.size();

        System.out.println("Quantidade de vezes que cada time ganhou:");
        for (Map.Entry<String, Map<String, Integer>> entry : timesMap.entrySet()) {
            String time = entry.getKey();
            Map<String, Integer> infoMap = entry.getValue();
            int frequenciaPontos = infoMap.get("Pontos");
            System.out.println("Time: " + time + ", Frequência de Pontos: " + frequenciaPontos);
        }

        System.out.println("Média de Pontos: " + mediaPontos);
    }

    // Método para obter um nome de time aleatório
    private static String obterNomeTimeAleatorio() {
        String[] times = { "Corinthians", "Palmeiras", "São Paulo", "Santos", "Portuguesa" };
        Random random = new Random();
        int indice = random.nextInt(times.length);
        return times[indice];
    }

    // Método para obter uma pontuação aleatória entre 80 e 99
    private static int obterPontuacaoAleatoria() {
        Random random = new Random();
        return random.nextInt(20) + 80;
    }
}
