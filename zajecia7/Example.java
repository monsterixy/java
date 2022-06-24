package zajecia7;

import zajecia7.model.Zwierze;

// wewnątrz klas można stworzyć biblioteki, typy danych
public class Example {
    
        public static void main (String[] args) {
        // Object a;
        // Example example = new Example();
        
        // utworzenie typu składającego się z kilku atrybutów, po to by móc przechowywyać bardziej złożone struktury
        // tworzenie typu "Zwierzę", które będzie miało cechy charakterystyczne zwierzęcia
        // takie zwierze może mieć masę, wiek itd.
        Zwierze pierwszeZwierze = new Zwierze();
        
        pierwszeZwierze.przedstawSie();
        
        // pierwszeZwierze.masa = 4.5;
        // double masaZ1 = pierwszeZwierze.masa;
        
        pierwszeZwierze.setMasa(4.5);
        double masaZw1 = pierwszeZwierze.getMasa();
        
        pierwszeZwierze.setWiek(3);
        int wiekZw1 = pierwszeZwierze.getWiek();

        pierwszeZwierze.setImie("Z1");
        String imieZw1 = pierwszeZwierze.getImie();

        pierwszeZwierze.setGatunek("Lew");
        String gatunekZw1 = pierwszeZwierze.getGatunek();
        
        Zwierze zwierze2 = new Zwierze(50, 5, "Tygrys", "T1");
        Zwierze zwierze3 = new Zwierze(50, 5, "Tygrys", "T1");
        zwierze2. przedstawSie();
        
        System.out.println("To string" + zwierze2.toString());
        
        boolean czyRowne = zwierze2.equals(zwierze3);
        System.out.println("czy równe " + czyRowne);
    }
}
