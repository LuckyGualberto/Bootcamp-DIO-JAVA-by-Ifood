public class usuario {
 
   public static void main(String[] args) {
        
        SmartTv smartTv = new SmartTv();

        smartTv.ligar();

        System.out.println("Novo Status -> TV está ligada?" + smartTv.ligada);


        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume atual:" +smartTv.volume);


        System.out.println("TV está ligada?" + smartTv.ligada);
        System.out.println("Canal Atual:" + smartTv.canal);
        System.out.println("Volume Atual:" + smartTv.volume);


        smartTv.mudarCanal(7);
        System.out.println("Canal Atual:" + smartTv.canal);

        smartTv.desligar();

        System.out.println("Novo Status -> TV está ligada?" + smartTv.ligada);
    }

s
}
