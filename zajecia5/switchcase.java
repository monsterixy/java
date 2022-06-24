/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zajecia5;
import java.util.Scanner;

/**
 *
 * @author joann
 */
public class switchcase {
    
    public void konwertowanieTemperatury() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Podaj temperaturę");
        double temperatura = scanner.nextDouble();
        double wynik;
        
        System.out.println("W jakich jednotskach wyrażone? (Celsjusze/Farenheity)");
        System.out.println("Wpisz C - dla Celsjuszów i F - dla Farenheitów)");
        String jednostki = scanner.next();
        
        System.out.println("Wpisz konwertuj");
        String konwertowanie = scanner.next();
        String konwertowanieLowerCase = konwertowanie.toLowerCase();
        
        boolean czyKonwertowanie = konwertowanieLowerCase.equals("konwertuj");
        
        switch(jednostki) {
            case "C":
                wynik = temperatura*(9/5) + 32;
                System.out.println(temperatura + "°C to " + wynik + "°F");
                break;
            case "F":
                wynik = (temperatura-32) * (5/9);
                System.out.println(temperatura + "°F to"  + wynik + "°C");
                break;
        }
        
                
        
    }
}
