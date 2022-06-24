
package methodparameters;

class Robot {
    
    // deklaruję zmienną string - text (potrzebuję zm. string by ją później otrzymać)
    // to nazywa się PRZEKAZYWANIEm PARAMETRÓW DO METODY
    // ponieważ zmienna łańcuchowa text (String text) jest zadeklarowana w () nazywamy ją parametrem
    // PARAMETR -> jest jak zmienna, którą przekazujesz do metody
        // tu przekazuję string do tej metody
    public void speak(String text) {
        // teraz mogę użyć zmienną text w faktycznej treści metody
        // tu używam wartość parametrów 
        System.out.println(text);
    }
    
    // ta metoda bierze jeden paraemtr typu integer
    public void jump(int height) {
        System.out.println("Jumping: " + height);
    }
    
    public void move(String direction, double distance) {
        System.out.println("Moving " + distance + " meters in direction " + direction);
    }
}

public class MethodParameters {

    public static void main(String[] args) {
        Robot sam = new Robot();
        sam.speak("Hi, I'm Sam");
        sam.jump(7);
        sam.move("West", 12.2);
        
        String greeting = "Hello there.";
        sam.speak(greeting);
        
        int value = 14;
        sam.jump(value);
    }
    
}
