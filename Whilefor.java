/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package whilefor;

/**
 *
 * @author joann
 */
public class Whilefor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           
    // WHILE LOOP 
        // boolean przechowuje true or false - możemy zapisać tu warunek, który później zwróci nam wartość true, jeśli jest prawdziwy lub false, jeśli fałszywy
        int value = 0;
        boolean loop = value < 5;
        System.out.println(loop);
    
        // tworzenie pętli przy pomocy while --> 
        // w pętli while potrzebuje mieć warunek -> dopóki ten warunek jest prawdziwy pętla się powtarza
        while (value < 10)
        {
            // jeśli napiszę samo sysout to pętla będzie się powtarzać w nieksończoność
            System.out.println("Hello" + " " + value);
            // jeżeli dopiszę warunek poniżej oznacza to, że zaczynam od wartości 0 (ponieważ wcześniej zadeklarowałam int=0), potem w każdej kolejenej iteracji dodaje 1
            // -> dopóki value jest mniejsze od 10 to dodaje do niej 1, wraca i spradza czy ostatnia wartość jest mniejsza od 10, jeśli tak to znowu dodaje +1 do value
            // --> gdy value będzie większe lub równe 10 pętla się zatrzyma --> wyświetla się tyle "Hello n" dopóki value będzie mniejsze od 10, czyli od Hello 1 do Hello 9.
            value = value + 1;
        }
        
    
    // FOR LOOPS
// w nawiasach okrągłych pętli for zawierają się warunki, które kontrolują ile razy pętla się wykonuje
    // w nawiasach okrągłych muszą być co najmniej dwa średniki - inaczej wyskoczy błąd
    // średniki te dzielą rzeczy na trzy sekcje:
    // 1. Pierwsza sekcja zawiera kod, który wykonuje się zanim pętla się zacznie. W tym miejscu
        // mogę zadeklarować i zainicjować (nadać początkową wartość) zmienną sterującą (zmienna, która kontroluje iteracje pętli)
        // standardowo daje się tutaj i=0
    // 2. W drugiej sekcji zanjduje się warunek; tak długo aż warunek jest prawdziwy pętla będzie się wykonywać
        // np. tak długo jak i będzie mniejsze od 5 ta pętla będzie się wykonywać
    // 3. W trzeciej sekcji znajduje się warunek, który będzie się wykonywać raz po każdej iteracji pętli
        // np. weź wartość i, dodaj do niej 1, wróć i wykonaj ponownie - za każdym powtórzeniem pętli będę zwiększać wartość argumentu o 1
        // możemy to zapisać w postaci i = i + 1 lub i++
// w nawiasach klamrowych umieszczamy kod, któy chcemy wykonywać
    // tu: wyświetlamy kolejne wartości i
    // zamiast System.out.println() mogę użyć System.out.printf() --> jest to moetoda, która wymaga przejścia do tego co nazywamy argumentami
        // pierwszym argumentem System.out.printf() jest string (ciąg znaków) -> format specifier, a drugim argumentem jest wartość do wypełniania format spceifier'a
            // format specifier to ciąg znaków, który może zawierać specjalne znaki/symbole, które potem będą zastąpione przez liczby lub zmienne, którą w tym przypadku jest "i"
            // format specifier zaczyna się od "%" i kończy literą; litera określająca liczbę całkowitą
            // %d --> wyświetl ciąg znaków, ale zamień "%d" na wartość liczby całkowitej określonej za przecinkiem (tu: i) -> wszystko wyświetli się w jednej linii
            // jeśli chcemy wyświetlać każdą iterację od nowej linii należy dopisać "%d\n"
            //
    
    for(int i=0; i < 5; i = i + 1) {
        // System.out.println("The value of i is: " + i);
        // System.out.printf("The value of i is: %d", i);
        System.out.printf("The value of i is: %d\n", i);

    }

    }
    
}
