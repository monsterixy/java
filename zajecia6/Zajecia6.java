
package zajecia6;

public class Zajecia6 {

    public static void main(String[] args) {
        multiplyTable();
        
        /*int i = 0;
        
         // continue -> przerywamy obecną iterację pętli, pętle kontynuuje od następnej iteracji
        for(i=0; i < 10; i++) {
            if(i==3 || i==4) {
                System.out.println("Continue");
                continue;
                // kończy obecną iterację, zaczyna następną
            }
            System.out.println(i);
        }
        System.out.println("");
        System.out.println("Inny przykład pętli:");
        
        for(i=0; i < 10; i++) {
            if(i==3 || i==4) {
                System.out.println("Continue");
                break;
                //
            }
            System.out.println(i);
        }
        
        // MODULO
        int reszta = 4 % 3;
        
        int suma = 0;
        for(int a=0; a<=100; a++) {
            if(a%2==1) {
                continue;
            }
            suma+=a;
            System.out.println(suma);
        }
*/
        
// ZADANIE Z LOSOWANIA
/* Zadania obiekt1 = new Zadania ();
obiekt1.losowanie();

Zadania obiekt2 = new Zadania ();
obiekt2.najwiekszyWspolnyDzielnik();*/
         
    }
    
    // Program wyświetlający tabliczkę mnożenia dla liczb od 1 do 10...
    
    public static void multiplyTable() {
        System.out.println("Program wyświetla tabliczkę mnożenia dla liczb od 1 do 100:");
        for(int i=1; i<=10; i++) {
            
            for(int j=1; j<=10; j++) {
                int result = i * j;
                /*
                if(result < 10) {
                    System.out.printf("%d" + "  ", result);
                }
                else {
                    System.out.printf("%d" + " ", result);
                }*/
                
                System.out.print(result);
                System.out.print("\t");
                
            }
            System.out.println();
        }
    }
    
}
