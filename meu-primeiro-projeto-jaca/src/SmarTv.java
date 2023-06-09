public class SmarTv {
  boolean ligada=true;
  int canal =5;
  int volume=20;

  public void ligar(){
    ligada=true;
  }
  public void desligar(){
    ligada=false;
  }

  public void aumentarVolume(){
    volume++;
    System.out.println("Aumentando o volume para: " + volume);
  }

  public void diminuirVolume(){
    volume--;
    System.out.println("Diminuindo o volume para: " + volume);
  }

  public void aumentarCanal(){
    volume++;
    System.out.println("Aumentando o canal para: " + volume);
  }

  public void diminuirCanal(){
    volume++;
    System.out.println("Diminuindo o canal para: " + volume);
  }

  public void mudarCanal(int novoCanal){
    canal = novoCanal;
    System.out.println("Mudando o canal para: " + canal);
  }
}
