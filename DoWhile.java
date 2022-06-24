package dowhile;

import java.util.Scanner;
import static javax.management.Query.value;

public class DoWhile {

    public static void main(String[] args) {
        // poproś użytkownika, by wprowadził jakiś input i wejdź w pętlę aż użytkownik wprowadzi konkretny input
        Scanner scanner = new Scanner(System.in);
        // poprość użytkownika by wprowadził liczbę i pytaj go wpisywanie liczby dopóki nie wprowadzi liczby 5
        /*
                System.out.println("Wprowadź liczbę: ");
        int value = scanner.nextInt();
        
        while(value != 5)
        {
        System.out.println("Wprowadź jeszcze raz liczbę: ");
        value = scanner.nextInt();
        }
        */
                
        // do -> rozpoczyna i kończy nawiasem klamrowym; kod który chcę wykonywac jest w klamrach
        // while -> warunek; zapisuje się w nawiasach okrągłych i kończy średnikiem;
            // dopóki ten warunek jest prawdziwy, kod się wykonuje w pętli
            
        int value = 0;
        do
        {
            System.out.println("Wprowadź liczbę: ");
            value = scanner.nextInt();
        }
        while(value != 5);
        System.out.println("Wpisałeś 5!");
    }
    
}
