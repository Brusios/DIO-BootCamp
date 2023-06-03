package bruno.souza.primeirsemana;

public class MinhaClasse {
  public static void main (String [] args){
    //System.out.print("Ola turma, sejam bem-vindos");
  
    String primeiroNome = "Bruno";
    String segundoNome = "Gustavo";
    double altura = 1.74;
    int peso = 106;

    double calcIMC = calcularIMC(altura, peso);

    String nomeCompleto = nomeClompeto(primeiroNome, segundoNome);
    System.out.println(nomeCompleto);
    System.out.println("Seu IMC: " + calcIMC);
  }
  public static String nomeClompeto (String primeiroNome, String segundoNome){
    return "Nome completo: " + primeiroNome.concat(" ").concat(segundoNome);
  }

  public static double calcularIMC (double altura, int peso){
    return (altura/peso)*2;
  }
}
