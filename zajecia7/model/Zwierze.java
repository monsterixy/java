package zajecia7.model;

/* @author joann */

// public - modyfikator widoczności
public class Zwierze {

// TWORZENIE ATRYBUTÓW - zestaw funkcji
//=============== ATRYBUTY
    // w celach bezpieczeństwa, by mieć kontrolę, atrybuty dajemy prywatne - widzimy je w ramach swojej klasy
    private double masa;
    private int wiek;
    private String gatunek;
    private String imie;

// KONSTRUKTOR - funkcja tworząca
    public Zwierze () {
        System.out.println("Tworzę nowe zwierze");
        
    }
    
    public Zwierze (double masa) {
        this.masa = masa;
    }
    
    public Zwierze(double masa, int wiek, String gatunek, String imie) {
        this.masa = masa;
        this.wiek = wiek;
        this.gatunek = gatunek;
        this.imie = imie;
        
    }

//ENKAPSULACJA
    // w javie atrybuty powinny zostać prywatne, a dostęp do nich poprzez opakowane funkcje - GET i SET:
// GETTERY i SETTERY
    // GET - żeby obiekt był pobierany
    // SET - by ustawiać wartość
    
    public double getMasa() {
        return masa;
    }
    
    public void setMasa(double masa) {
        this.masa = masa;
        // this oznacza, że odwołuję się do elementu klasy, w której się znajduje
    }
    
    public int getWiek() {
        return wiek;
    }
    
    public void setWiek(int wiek) {
        this.wiek = wiek;
    }
    
    public String getGatunek() {
        return gatunek;
    }
    
    public void setGatunek(String gatunek) {
        this.gatunek = gatunek;
    }

    public String getImie() {
        return imie;
    }
    
    public void setImie(String imie) {
        this.imie = imie;
    }    

//==========================
// Funkcje    
    public void dajGlos() {
        
    }
    
    public void oddychaj(){
        
    }
    
    public void przedstawSie() {
        System.out.println("Nazywam się " + imie + "jestem" + gatunek);
    }
    
    public String toString() {
        String opis = "imie: " + imie + " gatunek: " + gatunek;
        return opis;
    }
    
    public boolean equals(Object obj) {
        
        boolean result = true;
// instanceof -> porównuje czy coś jest jakiegoś typu
        if(obj instanceof Zwierze) {
        
            //RZUTOWANIE
            Zwierze zwierzeZObj = (Zwierze) obj;
            if(! this.getGatunek().equals(zwierzeZObj.getGatunek()))
            {
                result = false;
            }
            else if (! this.getImie().equals(zwierzeZObj.getImie()))
            {
                result = false;
            }
            else if(this.getMasa() != zwierzeZObj.getMasa())
            {
                result = false;
            }
            else if(this.getWiek() != zwierzeZObj.getWiek())
            {
                result = false;
            }
        }
        else {
            result = false;
        }
        
        return result;
    }
    
}
