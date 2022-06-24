package arrayss;

public class Arrayss {

    public static void main(String[] args) {
        
        // stwórz wystarczająco pamięci by trzymać liczbę całkowitą (o wielkości 32 bitów
        // daj jakąś wartość (7) do tej pamięci
        int value = 7;
        
        // stwórz zmienną, która może się odnościć do całej listy liczb całkowitych
        // w tym przypadku w values nie jest trzymana żadna liczba; tu mogę jedynie odwołąć się do listy liczb całkowitych
        // - ZMIENNA REFERENCYJNA
        int[] values;
        
        // w zmiennej referyncyjnej alokować jakąś pamięć, do której mogę włożyć jakieć liczby całkowite
        // w nawiasach kwadratowych, które reprezentują tablicę wpisuję liczbę liczb całkowitch, do któych potrzebuję wartości by się odwoływać
        // wskaż to odwołanie na "new int [3]"; new int [3]  używa nowego słowa kluczowego do alokowania pewnej pamięci
            // ilośc pamięci, której alokuję jest wystarczająca by trzymać trzy liczby całkowite
        values = new int[3];
        
        // odwołanie się do pierwszej liczby całkowitej w tej liście liczb całkowitych:
            // w nawiasach kwadratowych wpisuję numer pozycji w liście, do której chcę się odwołać (numery zaczynają się od zera)
        System.out.println(values[0]);
        
        values[0] = 10;
        values[1] = 20;
        values[2] = 30;

        System.out.println(values[0]);
        System.out.println(values[1]);
        System.out.println(values[2]);
        
        // iterowanie w liście ->  idź po każdej wartości w kolejności:
        // wykonuj pętle dopóki i jest rów ine ostatniej wartości w tablicy-1
        for(int i = 0; i < values.length; i++) 
        {
        System.out.println(values[i]);
        }
        
        // inicjowanie tablicy w tym samym czasie co deklarowanie jej
            // zamiast alokowania pamięci a potem specyfikowania wartości, mogę wyspecyfikować wartości w liście w nawiasach klamrowych
        int[] numbers = {5, 6, 7};
        
        for(int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        
    }
    
}
