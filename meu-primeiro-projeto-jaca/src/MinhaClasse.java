public class MinhaClasse {
  public static void main (String [] args){
    //System.out.print("Ola turma, sejam bem-vindos");
  
    String primeiroNome = "Bruno";
    String segundoNome = "Gustavo";

    String nomeCompleto = nomeClompeto(primeiroNome, segundoNome);
    System.out.println(nomeCompleto);
  }
  public static String nomeClompeto (String primeiroNome, String segundoNome){
    return "Nome completo: " + primeiroNome.concat(" ").concat(segundoNome);
  }
}
