
package switchh;

import java.util.Scanner;

public class Switchh {

    public static void main(String[] args) {
        // Switch pozwala na podjęcie różnych akcji w zależności od wartości zmiennej;
        // w przeciwieństwie do if-a switch kest bardziej efektywny w pewnych warunkach
        
        Scanner input = new Scanner(System.in);
        System.out.println("Wpisz polecenie");
        String text = input.nextLine();
        
        switch(text) {
            case "start":
                System.out.println("Maszyna wystartowała");
                break;
            
            case "stop":
                System.out.println("Maszyna zarzymała się");
            
            default:
                System.out.println("Komenda nie rozpoznana");
        }
        
        
    }
    
}
