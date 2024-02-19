/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package granprix.pkg5ainf.gruppon.pkg6;

import java.util.Scanner;

/**
 *
 * @author Brunori, Monni, Draoui
 */
public class GranPrix5AINFGruppon6 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci l'username: ");
        String username = scanner.nextLine();

        System.out.print("Inserisci la password: ");
        String password = scanner.nextLine();

        System.out.println("Scegli l'Auto:");
        System.out.println("-Ferrari\n-Mercedes\n-RedBull");
        String Auto = scanner.nextLine();

        System.out.println("Scegli il Circuito:");
        System.out.println("-Italia\n-Qatar\n-Brasile");
        String Circuito = scanner.nextLine();

        System.out.println("Con quante macchine vuoi gareggiare?");
        int Nauto = scanner.nextInt();

        for (int i = 0; i < Nauto; i++) {
            Auto auto = new Auto("Auto " + i, "Anonimo");
        }

        Scrittore scrittore = new Scrittore("Dati.csv", username, password);
        Thread threadScrittore = new Thread(scrittore);
        threadScrittore.start();

        Auto auto0 = new Auto("Ferrari", "Brunori");
        Auto auto1 = new Auto("Mercedes", "Monni");
        Auto auto2 = new Auto("RedBull", "Draoui");

        Circuito circuito0 = new Circuito("7km","Italia");
        Circuito circuito1 = new Circuito("9km","Qatar");
        Circuito circuito2 = new Circuito("5km","Brasile");

    }

}
