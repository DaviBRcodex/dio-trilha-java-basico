public class Usuario {
    public static void main(String[] args) throws Exception {

         SmartTV smartTv = new SmartTV();

         smartTv.diminuirVolume();
         smartTv.diminuirVolume();
         smartTv.diminuirVolume();
         smartTv.aumentarVolume();

        System.out.println("canal Atual : "+smartTv.canal);

         smartTv.mudarCanal(13);
         System.out.println("canal Atual : "+smartTv.canal);

        System.out.println("Volume atual :" +smartTv.volume);

         System.out.println("Tv ligada ??" + smartTv.ligada);
         System.out.println("Volume atual :" +smartTv.volume);

         smartTv.ligar();
         System.out.println("Novo Status -> Tv ligada ?"+smartTv.ligada);


         smartTv.desligar();
        System.out.println("Novo Status -> Tv desligada ?"+smartTv.ligada);

    }

}
