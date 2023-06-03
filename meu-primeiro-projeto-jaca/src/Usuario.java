
public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmarTv smarTv = new SmarTv();

        smarTv.diminuirVolume();
        smarTv.diminuirVolume();
        smarTv.diminuirVolume();
        smarTv.diminuirVolume();

        System.out.println("TV Ligada? " + smarTv.ligada);
        System.out.println("Canal atual: " + smarTv.canal);
        System.out.println("Volume atual: " + smarTv.volume);

        smarTv.ligar();
        System.out.println("Novo status --> TV Ligada? " + smarTv.ligada);

        smarTv.desligar();
        System.out.println("Novo status --> TV Ligada? " + smarTv.ligada);

        smarTv.aumentarCanal();

        smarTv.mudarCanal(13);
    }
}
