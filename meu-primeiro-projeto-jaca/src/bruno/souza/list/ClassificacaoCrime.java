package bruno.souza.list;

/*
 * Exercicio proposto pelo instrutor:
 * Utilizando listas, faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
    1. "Telefonou para a vítima?"
    2. "Esteve no local do crime?"
    3. "Mora perto da vítima?"
    4. "Devia para a vítima?"
    5. "Já trabalhou com a vítima?"

Se a pessoa responder positivamente a 2 questões ela deve ser classificada com "Suspeita", entre 3 e 4 como "Címplice" e 5 como "Assasina".
Caso contrário, ela será classificado como "Inocente".
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClassificacaoCrime {
  public static void main(String[] args) {
    List<String> perguntas = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    // Adicionar as perguntas à lista
    perguntas.add("Telefonou para a vítima?");
    perguntas.add("Esteve no local do crime?");
    perguntas.add("Mora perto da vítima?");
    perguntas.add("Devia para a vítima?");
    perguntas.add("Já trabalhou com a vítima?");

    List<String> respostas = new ArrayList<>();

    // Fazer as perguntas e armazenar as respostas
    for (String pergunta : perguntas) {
        System.out.print(pergunta + " (s/n): ");
        String resposta = scanner.nextLine();
        respostas.add(resposta.toLowerCase());
    }

    int respostasPositivas = 0;

    // Verificar número de respostas positivas
    for (String resposta : respostas) {
        if (resposta.equals("s")) {
            respostasPositivas++;
        }
    }

    // Classificar a pessoa com base nas respostas
    String classificacao;
    if (respostasPositivas == 2) {
        classificacao = "Suspeita";
    } else if (respostasPositivas >= 3 && respostasPositivas <= 4) {
        classificacao = "Cúmplice";
    } else if (respostasPositivas == 5) {
        classificacao = "Assassina";
    } else {
        classificacao = "Inocente";
    }

    // Exibir a classificação
    System.out.println("Classificação: " + classificacao);
}
}
