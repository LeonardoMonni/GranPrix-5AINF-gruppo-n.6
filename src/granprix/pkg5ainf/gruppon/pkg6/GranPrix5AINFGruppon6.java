/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package granprix.pkg5ainf.gruppon.pkg6;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Brunori, Monni, Draoui
 */
public class GranPrix5AINFGruppon6 {
    
    /**
     * @param args the command line arguments
     *
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci l'username: ");
        String username = scanner.nextLine();

        System.out.print("Inserisci la password: ");
        String password = scanner.nextLine();

        Auto auto0 = new Auto("Ferrari", "Brunori");
        Auto auto1 = new Auto("Mercedes", "Monni");
        Auto auto2 = new Auto("RedBull", "Draoui");

        System.out.println("Scegli l'Auto: (utilizza la maiuscola)");
        System.out.println("-Ferrari\n-Mercedes\n-RedBull");
        String Auto = scanner.nextLine();
        switch (Auto) {
            case "Ferrari":
                System.out.println("La macchina scelta è " + Auto + " ed il suo pilota è " + auto0.pilota + ". Vuoi Modificare la macchina?");
                break;

            case "Mercedes":
                System.out.println("La macchina scelta è " + Auto + " ed il suo pilota è " + auto1.pilota + ". Vuoi Modificare la macchina?");
                break;

            case "RedBull":
                System.out.println("La macchina scelta è la " + Auto + " ed il suo pilota è " + auto2.pilota + ". Vuoi Modificare la macchina?");
                break;
        }
        String risposta = scanner.nextLine();

        if (risposta.equals("si")){
            System.out.println("Scegli cosa vuoi modificare: \n1. Aggiunta di protossido di azoto(NOS)\n2. Aggiunta spoiler più alto\n3. Modifica carrozzeria(-25kg) ");
            String modifica = scanner.nextLine();
            System.out.println("Modifica Apportata");
        }

        Circuito circuito0 = new Circuito("7","Mugello(Italia)");

        Circuito circuito1 = new Circuito("9","Lusail International Circuit(Qatar)");
        Circuito circuito2 = new Circuito("5","Interlagos(Brasile)");

        System.out.println("Scegli il Circuito:");
        System.out.println("-Mugello(Italia)\n-Lusail International Circuit(Qatar)\n-Interlagos(Brasile)");
        String Circuito = scanner.nextLine();

        System.out.println("Con quante macchine vuoi gareggiare?");
        int Nauto = scanner.nextInt();

        Auto[] autoanonime = new Auto[20];

        for (int i = 0; i < Nauto; i++) {
            Auto auto = new Auto("Auto " + i, "Anonimo");
            autoanonime[i] = new Auto("Auto " + i, "Anonimo");
        }

        System.out.println("Signor " + username + " la macchina da te scelta è la " + Auto + ", gareggerai nel " + Circuito);

        Scrittore scrittore = new Scrittore("src/granprix/pkg5ainf/gruppon/pkg6/Dati.csv", username, password);
        Thread threadScrittore = new Thread(scrittore);
        threadScrittore.start();

        DirettoreGara direttore = new DirettoreGara();
        direttore.start();
        try {
            direttore.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for (int i = 0; i < Nauto; i++){
            autoanonime[i].start();
            try {
                autoanonime[i].join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}