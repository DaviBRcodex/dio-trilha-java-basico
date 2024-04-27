
public class SmartTV {

        int canal = 1;
        int volume = 25;
        Boolean ligada =false;

        public void mudarCanal(int novoCanal){
                canal = novoCanal;
        }

        public void diminuirCanal(){
                canal--;
        }


        public void aumentarCanal(){
            canal++;
        }


        public void aumentarVolume(){
                volume++;
                System.out.println("Aumentando o volume para" +volume);
        }
        public void diminuirVolume(){
                volume--;
                System.out.println("diminuindo o volume para" +volume);
        }

        public void ligar(){
                ligada = true;
        }
        public void desligar(){
                ligada = false;
        }


}