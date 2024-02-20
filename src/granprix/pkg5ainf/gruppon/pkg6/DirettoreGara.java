package granprix.pkg5ainf.gruppon.pkg6;

public class DirettoreGara extends Thread{

    @Override
    public void run(){
        try {
            sleep(2500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for (int i = 3; i > 0; i-- ){
            System.out.println(i + "...");
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
        System.out.println("**!START!**");
    }

}
