package granprix.pkg5ainf.gruppon.pkg6;

public class Circuito {
    String lunghezza;
    String luogo;

    boolean semaforo;

    public Circuito(String lunghezza, String luogo) {
        lunghezza = lunghezza;
        luogo = luogo;
        semaforo = false;
    }

    public synchronized boolean semaforo() {
        while(!semaforo)
            try {
                wait();
            } catch (InterruptedException ex) {
                System.err.println("Errore nel wait()!");
            }
        semaforo = true;
        notifyAll();
        return semaforo;
    }

    public synchronized void setSemaforo(boolean semaforo){
        this.semaforo = true;
    }
}
