package gettersandreturn;

// tu się tworzy tzw. pomysł osoby - klasę osoby
class Person {
    // daj osobie jakieś dane
    String name;
    int age;
    // daj jakieś zachowanie (method)
    void speak() {
        System.out.println("My name is: " + name);
    }
    
    // ta metoda nie zwraca niczego (mówimy o metodzie zwracających wartości)
    /*void calculateYersToRetirement() {
        if(age<=63) {
            int yearsLeft = 65 - age;
            System.out.println("You've got " + yearsLeft + " years left till retirement.");
        }
        else if(age==64) {
            System.out.println("You've got 1 year left till retirement.");
        }
        else {
            System.out.println("You are already retired.");
        }
    }*/
    
    // ta metoda zwraca wartość typu int
    int calculateYersToRetirement() {
        int yearsLeft = 65 - age;
        System.out.println(yearsLeft);
        
        // zwróć ile pozsostało lat (wpisanie return zostawia metodę w tym punkcie)
        return yearsLeft;
    }
    
    // ENKAPSULACJA - oznacza, że dane, które deklarujesz w klasie są ukryte dla innych klas
    int getAge() {
        return age;
    }
    
    String getName() {
        return name;
    }
}
public class GettersAndReturn {

    public static void main(String[] args) {
        // w main method mogę stworzyć obiekt osoby - konkretną osobę
        Person person1 = new Person();
        person1.name = "Joe";
        person1.age = 63;
        
        // person1.speak();
        
        // tak wpisujemy, gdy daliśmy metodę int
        int years = person1.calculateYersToRetirement();
        
        System.out.println("Years till retirement: " + years);
        // tak wpisujemy w przypadku, gdy daliśmy void
        // person1.calculateYersToRetirement();
        
        int age = person1.getAge();
        String name = person1.getName();
        
        System.out.println("Name is: " + name);
        System.out.println("Age is: " + age);
    }
    
    
    
}
