/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.eksoc.sniegula.kolekcje;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author Sniegulaa
 */
public class CollectionsExamle {

    public static void main(String[] args){

     PriorityQueue<Integer> simpleQueue = new PriorityQueue();
     simpleQueue.add(1);
     int liczbaZdjetaZKolejki = simpleQueue.poll();


     Deque<Integer> complexQueue = new ArrayDeque<>();
     
     complexQueue.addFirst(1);
     complexQueue.addLast(4);
      System.out.println("Długość kolejki przed " + complexQueue.size()); 
     while(! complexQueue.isEmpty()){
       //Poll - zdejmij z kolejki
      int liczbaZKolejki = complexQueue.pollFirst();
      System.out.println(liczbaZKolejki);
     }
     
      System.out.println("Długość kolejki po " + complexQueue.size());
 
     TreeMap<String, Integer> pierwszaMapa = new TreeMap<>();
     pierwszaMapa.put("Klucz1", 4);
     pierwszaMapa.put("klucz2", 6);

      if(pierwszaMapa.containsKey("Klucz1")){
          int wartosc = pierwszaMapa.get("Klucz1");
     }

     Set<String> keys = pierwszaMapa.keySet();
       for(String key :keys ){
                  int wartosc2 = pierwszaMapa.get(key);

            
          System.out.println("Klucz " +key + " wartość " +  wartosc2);
      }


       Set<Entry<String, Integer>> entrySet =   pierwszaMapa.entrySet();
       for(Entry entry :entrySet ){
             String klucz = (String)entry.getKey();
             int wartosc =  (int)entry.getValue();

       }
//countNoOfComputers();
      /*



       //LISTA
       LinkedList<String> listaKolorow = new LinkedList<>();
       listaKolorow.add("Niebueski");
       listaKolorow.add("Czerwony");

       ArrayList<Integer> listaLiczb = new ArrayList();
       listaLiczb.add(3);
       listaLiczb.add(5);


       for(int i=0; i< listaKolorow.size(); i++){
             String kolor = listaKolorow.get(i);
       }

       // getNumbersFromUser();


      //ZBIÓR
      HashSet<String> zbiorMiast = new HashSet <>();
      zbiorMiast.add("Zgierz");
      zbiorMiast.add("Zgierz");
      zbiorMiast.add("Elbląg");
      zbiorMiast.add("Warszawa");
      zbiorMiast.add("Gdańsk");


      

      int dlugoscZbioru = zbiorMiast.size();
      System.out.println("Podałeś " + dlugoscZbioru + " unikalnych miast");
  

     for(String miasto : zbiorMiast){

                System.out.println(miasto);
      }


*/

 }


    public static void getNumbersFromUser(){

          ArrayList<Integer> numbers = new ArrayList();
          int a =0;
          Scanner scanner = new Scanner(System.in);
           do{

                 System.out.println("Podaj liczbę. Podaj 0 jeśli chcesz zakończyć");
                 a = scanner.nextInt();
                 if(a != 0){
                        numbers.add(a);
                 }
             }
            while(a != 0);


               int suma =0;
            for(int i=0; i< numbers.size(); i++){
                    suma = suma  + numbers.get(i);
             }


             System.out.println("Podałeś " + numbers.size() + " liczb");
            System.out.println("Suma wynosi " + suma);

    }

  

   public static void countNoOfComputers(){
 
  HashMap<String, Integer> computers = new HashMap<>();
  String comuterName = "";
  Scanner scanner = new Scanner(System.in);
  do{
 
     System.out.println("Podaj nazwę komputera");
     comuterName = scanner.next();
     if(!computers.containsKey(comuterName)){
 
            computers.put(comuterName, 1);

     }
      else {

       int currentNumber = computers.get(comuterName); 
       computers.put(comuterName, currentNumber+1);

     }



  } while(!comuterName.equals("-"));
    
    int maxValue =0;
    String keyOfMax = "";
    for(String key : computers.keySet()){
          int value = computers.get(key);
          System.out.println("Klucz " +key + " wartość " +  value);
          if(value > maxValue){
                 maxValue = value;
                keyOfMax = key ;
         }

 
   }
  System.out.println("Najwięcek jest komputerów " +keyOfMax);
   


  }
    
}
