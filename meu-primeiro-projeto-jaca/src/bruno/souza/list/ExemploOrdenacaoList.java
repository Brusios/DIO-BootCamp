package bruno.souza.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExemploOrdenacaoList {
  public static void main(String[] args) {
    
    List<Gato> meuGatos = new ArrayList<>(){{
      add(new Gato("Jon", 18, "branco"));
      add(new Gato("Brusios", 1, "caramelo"));
      add(new Gato("Brusios", 2, "Preto"));
      add(new Gato("Brusios", 2, "caramelo"));
      add(new Gato("Brusios", 2, "daramelo"));
      add(new Gato("Sofia", 12, "preto"));
    }};
    System.out.println("\n---  Ordem de Inserção  ---");
    System.out.println(meuGatos);

    System.out.println("\n---  Ordem aleatória  ---");
    Collections.shuffle(meuGatos);
    System.out.println(meuGatos);

    System.out.println("\n---  Ordem Natural (Nome)  ---");
    Collections.sort(meuGatos);
    System.out.println(meuGatos);

    System.out.println("\n---  Ordem Nome/Idade/Cor  ---");
    meuGatos.sort(new ComparatorNomeIdadeCor());
    System.out.println(meuGatos);


  }
}

/**
 * Class Gato
 */
class Gato implements Comparable<Gato> {
  private String nome;
  private Integer idade;
  private String cor;
  
  public Gato(String nome, Integer idade, String cor) {
    this.nome = nome;
    this.idade = idade;
    this.cor = cor;
  }

  public String getNome() {
    return nome;
  }

  public Integer getIdade() {
    return idade;
  }

  public String getCor() {
    return cor;
  }

  @Override
  public String toString() {
    return "nome=" + nome + ", idade=" + idade + ", cor=" + cor;
  }

  @Override
  public int compareTo(Gato gato) {
   return this.getNome().compareToIgnoreCase(gato.getNome());
  }
}

class ComparatorNomeIdadeCor implements Comparator<Gato>{

  @Override
  public int compare(Gato g1, Gato g2) {
 
    int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
    if (nome != 0) return nome;

    int idade = g1.getIdade().compareTo(g2.getIdade());
    if(idade != 0 ) return idade;

    //int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
    //if (cor != 0) return cor;

    return g1.getCor().compareTo(g2.getCor());
    //return Integer.compare(g1.getIdade(), g2.getIdade());  

  }

}
