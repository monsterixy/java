/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.eksoc.sniegula.tablice;

import java.util.Scanner;

/**
 *
 * @author sniegulaa
 */
public class Przyklad1 {


   public static void main(String[] args){
   
//int dlugosc = 4;
  // int[] tablicaLiczb = {2,3,7,8,5};
       int [][] macierzLiczb2 = {{1,4,5,6},
                              {2,3,5,7},
                              {3,4,6,7}};
    countAverage(macierzLiczb2);
   /* int [][]macierzLiczb = new  int [5][6];
    macierzLiczb[0][0]= 5;//Pierwszy  element (lewy górny)
    macierzLiczb [4][5] = 4;//Ostatni element (prawy dolny)

    int [][] macierzLiczb2 = {{1,4,5,6},
                              {2,3,5,7},
                              {3,4,6,7}};

    maxLiczba(macierzLiczb2);

   for(int i=0; i<macierzLiczb2.length; i++){
   
     for(int j=0; j<macierzLiczb2[0].length; j++){
          
              System.out.println(i + " "+ j + " "+ macierzLiczb2[i][j]);
 
      }

   }

   
    najwiekszaLiczba(tablicaLiczb);


   for(int liczba : tablicaLiczb){
    
            System.out.println(liczba);
   }


   String[] tablicaTekstow = new String[dlugosc];
   tablicaTekstow [0] = "wartość 1";
   tablicaTekstow [1] = "wartość 2 ";
   tablicaTekstow [2] = "wartość 3 ";
   tablicaTekstow [3] = "OSTATNI";

   String elementPobranyZTablicy = tablicaTekstow[0];

   //tablicaTekstow [4] = "Za zakresem";
   //java.lang.ArrayIndexOutOfBoundsException


  String[] gracze = {"Gracz1", "Gracz2"};
   int dlugoscGraczy = gracze.length;

   for(int i=0; i< gracze.length; i++){
      System.out.println(i + " " + gracze[i]);
   }

   for(String element  : gracze ){
       System.out.println(element);
   }

    exampleFunction(gracze);
*/
}   
   

   public static void exampleFunction(String[] tablica){
   
}

   

 public static void najwiekszaLiczba(int[] tablica){
    int max=tablica[0];
    int pozycja =0;
     
     for(int i=1; i< tablica.length; i++){

          if(tablica[i] > max){
              max= tablica[i];
              pozycja = i;
          }
     }

     System.out.println(max + "znajduje się w elemencie o index = " + pozycja);
    

 }


 public static void wartoscSrednia(int[] tablica){
 
int suma =0;
for (int i=0; i<tablica.length; i++){
 suma = suma + tablica[i];
}
 
suma =0;
for(int liczba : tablica){
suma = suma + liczba;
}

}

public static void ileDodatnich(int[] tablica){

}
 
public static void maxLiczba(int[][] macierzLiczb2){
int pozycjaI =0;
int pozycjaJ =0;

int max=macierzLiczb2[0][0];
  for(int i=0; i<macierzLiczb2.length; i++){
   
     for(int j=0; j<macierzLiczb2[0].length; j++){
          
              if(macierzLiczb2[i][j] > max){
                 pozycjaI = i;
                 pozycjaJ =j;
                 max=macierzLiczb2[i][j];
              }
 
      }

   }

  System.out.println(pozycjaI + " " +pozycjaJ + " " + max);
}   


public static void countAverage(int[][] tablica){

   Scanner scanner = new Scanner(System.in);

   System.out.println("Podaj wartość dolną przedziału");

   float a = scanner.nextFloat();
   System.out.println("Podaj wartość górną przedziału");
   float b = scanner.nextFloat();

   float suma = 0;
   int iloscLiczb =0;

   for(int i=0; i<tablica.length; i++ ){
        
       for(int j=0; j<tablica[0].length; j++){
       int liczbaZTab = tablica[i][j];
        if(a <= liczbaZTab   && liczbaZTab<= b ){
                suma = suma +  liczbaZTab;
                iloscLiczb = iloscLiczb+1;
         }
       }     

   }

   if(iloscLiczb > 0){
  
         float srednia = suma/iloscLiczb;
         System.out.println("Średnia wynosi " +srednia);
   }
    else
    {
            System.out.println("Brak liczb mieszczących się w przedziale");
    }
   
   

}


}
