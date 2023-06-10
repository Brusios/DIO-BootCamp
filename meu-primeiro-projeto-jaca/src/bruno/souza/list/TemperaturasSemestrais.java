package bruno.souza.list;

/* Exercicio proposto pelo instrutor:
 * Faça um programa que receba a temperatura média dos 6 primeiros meses do ano e armazene-as em uma lista. 
 * Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média, 
 * e em que mês elas ocorreram (mostrar o mês por extenso: 1 - Janeiro, 2 - Fevereiro e etc).
*/
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TemperaturasSemestrais  {
  public static void main(String[] args) {
    List<Double> temperaturas = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    // Receber as temperaturas médias dos 6 primeiros meses
    for (int i = 1; i <= 6; i++) {
        System.out.print("Informe a temperatura média do mês " + i + ": ");
        double temperatura = scanner.nextDouble();
        temperaturas.add(temperatura);
    }

    // Calcular a média semestral
    double soma = 0;
    for (double temperatura : temperaturas) {
        soma += temperatura;
    }
    double mediaSemestral = soma / temperaturas.size();

    // Exibir temperaturas acima da média semestral
    System.out.println("Temperaturas acima da média semestral (" + mediaSemestral + "):");
    for (int i = 0; i < temperaturas.size(); i++) {
        double temperatura = temperaturas.get(i);
        if (temperatura > mediaSemestral) {
            String mes = obterNomeMes(i + 1);
            System.out.println(mes + ": " + temperatura);
        }
    }
}

public static String obterNomeMes(int mes) {
    switch (mes) {
        case 1:
            return "Janeiro";
        case 2:
            return "Fevereiro";
        case 3:
            return "Março";
        case 4:
            return "Abril";
        case 5:
            return "Maio";
        case 6:
            return "Junho";
        default:
            return "";
    }
  }
}
