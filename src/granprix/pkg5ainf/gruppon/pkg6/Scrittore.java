package granprix.pkg5ainf.gruppon.pkg6;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Scrittore implements Runnable{
    public String file;
    public String username;
    public String password;
    public Scrittore(String file, String username, String password) {
        this.file = file;
        this.username = username;
        this.password = password;
    }

    public void scrivi(){
        try {
            BufferedWriter scrivi = new BufferedWriter(new FileWriter(file));
            scrivi.write(username  + "-" + password);
            scrivi.flush();
            scrivi.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    @Override
    public void run() {
        scrivi();
    }
}
