/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zajecia6;

import java.util.Random;
import java.util.Scanner;


public class Zadania {
    public void losowanie() {
    
    Scanner scanner = new Scanner(System.in);
    System.out.println("Podaj liczbę 0 - 20");
    int numberFromUser = scanner.nextInt(21);
    
    Random random = new Random();
    
    for(int i=0; i<10; i++) {
        int randomNumber = random.nextInt(21);
        System.out.println(randomNumber);
        
        if(numberFromUser == randomNumber) {
            System.out.println("Trafiłeś");
            break;
        }
    }
    }
    
    public void najwiekszyWspolnyDzielnik() {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Podaj pierwszą liczbę");
        int a = scanner.nextInt();
        
        System.out.println("Podaj drugą liczbę");
        int b = scanner.nextInt();
        
        while(a!=b) {
            if(a>b) {
                a = a-b;
            }
            else {
                b = b-a;
            }
        }
        System.out.println("Największym wspólnym dzielnikiem jest " + a);
    }
    
}
