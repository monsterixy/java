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
public class zadankaPetle {
    
    public static void main(String[] args) {
        
        boolean repeat = true;
        Scanner scanner = new Scanner(System.in);
        
        
//        while(repeat) {
//           System.out.println("Siema, jestem w pętli");
//           String textFromUser = scanner.next();
//           
//           if(textFromUser.equals("STOP")) {
//               repeat = false;
//           }
//        }
//        
//        String textFromUser1 ="";
//        while(! textFromUser1.equals("STOP")) {
//            System.out.println("Jestem w pętli");
//            textFromUser1 = scanner.next();
//        }
//
//        int liczba = 20;
//        while(liczba > 0) {
//            System.out.println(liczba);
//            liczba--;
//        }
//        
//        for(int i=1; i <= 20; i++) {
//            System.out.println(i);
//        }
        
        // Napisz program, który sumuje liczby parzyste od 1 do 100
        // użycie for
        int suma = 0; 
        for(int a=2; a<101;a = a+2){
            suma+=a;
            if(a==100) {
                System.out.println(suma);
            }
        }
    
    }
    

    

}
