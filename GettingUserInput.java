package gettinguserinput;

// CTRL + SHIFT + I -> importuje wymagany pakiet
import java.util.Locale;
import java.util.Scanner;

public class GettingUserInput {

    public static void main(String[] args) {
        // tworzenie zmiennej, która odnosi się do obiektu typu scanner
            // input -> nazwa losowej zmiennej
                // Scanner input;
        
        // tworzenie nowego obiektu typu scanner
            // System.in -> przekazuję standardowy predefiniowany system.in w obiekcie strumienia wejściowego
        Scanner input = new Scanner(System.in);
        
        // by wziąć od użytkownika input trzeba utworzyć np. linię tekstu
        // najpierw dać komunikat do użytkownika, by coś zrobił
        System.out.println("Wprowadź jakiś tekst");
        String line = input.nextLine();
        System.out.println("Wprowadziłeś: " + line);
        
        System.out.println("Wprowadź liczbę całkowitą");
        int liczbaCalkowita = input.nextInt();
        System.out.println("Twoja liczba to: " + liczbaCalkowita);
        
        // floating point -> zmienna zmiennoprzecinkowa
        System.out.println("Wprowadż liczbę zmiennoprzecinkową");
        float floatingPoint = input.nextFloat();
        System.out.println("Wprowadziłeś liczbę: " + floatingPoint);
        
        
    }
    
}
