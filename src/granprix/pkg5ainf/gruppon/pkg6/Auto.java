package granprix.pkg5ainf.gruppon.pkg6;

public class Auto extends Thread{
    String marca;
    String pilota;
    int lunghezza;
    int metriMacchina = 0;
    public Auto(String marca, String pilota) {
        this.marca = marca;
        this.pilota = pilota;
        this.lunghezza = 0;
    }

    public void setLunghezza(int lunghezza) {
        this.lunghezza = lunghezza;
    }

    public int getMetriMacchina(){
        return metriMacchina;
    }
    @Override
    public void run(){


        /*
        - creare una funzione random che faccia andare le macchine da 30 a 80 m/s
        - le macchine si devono fermare quando superano i km del circuito

        serviranno:
        - metodo random
        - stabilire il traguardo: lunghezza circuito
         */


    }
}
