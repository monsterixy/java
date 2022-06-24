package multidimensionalarrays;

public class MultidimensionalArrays {

    public static void main(String[] args) {
        // jednowymiarowa tablica:
            // by wyspecyfikować pozycję jednego z elementów potrzebuję jednej liczby lub wymiaru
        int[] values = {3, 5, 234};
        System.out.println(values[2]);
        
        // wielowymiarowa tablica wymaga więcej niż jednego indexu tablicy, by wyspecyfikować wartość
        // dwuwymiarowa:
            // potrzebuję dwóch par nawiasów kwadratowych
        int[][] grid = {
            {3, 5, 234},
            {2, 4},
            {1, 2, 3, 4}
        };
        
        // chcę się odwołać do liczby 4 w 16 linii (NIE ZAPOMINAĆ, że zaczynamy od 0!):
        System.out.println(grid[1][1]);
        System.out.println(grid[0][2]);
        
        // w 1 nawiasie new String[] wpisać liczbę wierszy jaką chcemy mieć w tablicy, w 2 - liczbę kolumn
        String[][] texts = new String[2][3];

        texts[0][1] = "Hello there";
        
        System.out.println(texts[0][1]);
        System.out.println();
        
        System.out.println("Iterowanie wartości w tablicy dwuwymiarowej");
            // najpierw iterujemy wartości po wierszach, później po kolumnach
            // i -> wiersz; j -> kolumna
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length ; j++) {
                // System.out.println(grid[i][j]);
                System.out.print(grid[i][j] + " \t");
            }
            
            System.out.println();
        }
        
        String[][] words = new String[2][];
        
        System.out.println(words[0]);
        words[0] = new String[3];
        
        words[0][1] = "hi there";
        System.out.println(words[0][1]);
        
        System.out.println();
        System.out.println("Tabela 1:");

        String[][] myTabel = new String[3][];
        myTabel[0] = new String[4];
        myTabel[1] = new String[4];
        myTabel[2] = new String[4];
        
        myTabel[0][0] = "hello";
        myTabel[0][1] = "my";
        myTabel[0][2] = "dear";
        myTabel[0][3] = "Ann";
        
        myTabel[1][0] = "have";
        myTabel[1][1] = "a";
        myTabel[1][2] = "nice";
        myTabel[1][3] = "day";

        myTabel[2][0] = "goodbye";
        myTabel[2][1] = "my";
        myTabel[2][2] = "dear";
        myTabel[2][3] = "Ann";
        
        for(int row = 0; row < myTabel.length; row++) {
            for(int col = 0; col < myTabel[row].length; col++) {
                System.out.print(myTabel[row][col] + "\t");
            }
            System.out.println();
        }
       
        System.out.println();
        System.out.println("Tabela 2:");        
        
        String[][] myTabel2 = {
            {"hello", "my", "dear", "Marc"},
            {"how", "are", "you"},
            {"i", "hope", "you", "are", "doing", "great"}
        };
        
        
        for(int r = 0; r < myTabel2.length; r++){
            for(int c = 0; c < myTabel2[r].length; c++) {
                System.out.print(myTabel2[r][c] + "\t");
            }
            System.out.println();
        }
    }
    
}
