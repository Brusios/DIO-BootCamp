package bruno.souza.primeirsemana;
public class MinhaClasse {
  public static void main (String [] args){
    //System.out.print("Ola turma, sejam bem-vindos");
  
    String primeiroNome = "Bruno";
    String segundoNome = "Gustavo";
    Double altura = 1.75;
    int peso = 92;

    Double calcIMC = calcularIMC(altura, peso);

    String nomeCompleto = nomeClompeto(primeiroNome, segundoNome);
    System.out.println(nomeCompleto);
    System.out.println("Seu IMC: " + calcIMC);
  }
  public static String nomeClompeto (String primeiroNome, String segundoNome){
    return "Nome completo: " + primeiroNome.concat(" ").concat(segundoNome);
  }

  public static Double calcularIMC (Double altura, int peso){
    return (altura/peso)*2;
  }
}
