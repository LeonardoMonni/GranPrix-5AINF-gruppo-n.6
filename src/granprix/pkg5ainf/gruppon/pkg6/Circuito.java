package granprix.pkg5ainf.gruppon.pkg6;

public class Circuito {
    String lunghezza;
    String luogo;
    Auto auto;
    int lunghezzametri;

    boolean semaforo;

    public Circuito(String lunghezza, String luogo) {
        this.lunghezza = lunghezza;
        this.luogo = luogo;
        this.lunghezzametri = Integer.parseInt(lunghezza) * 1000;
        this.semaforo = false;
    }
    public void gara(){
        if (lunghezzametri <= auto.metriMacchina){
            System.out.println("La macchina ha terminato il circuito!");
        }
    }
}
