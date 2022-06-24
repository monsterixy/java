/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.sniegula.programowanieobiektowe2;

import java.util.ArrayList;

/**
 *
 * @author sniegulaa
 */
public class TestProgramu {

    public static void main(String[] args) {

         

         Zwierze zwierze1 = new Zwierze();
         zwierze1.setWiek(2);
         zwierze1.setMasa(30);
         //zwierze1.funkcjaC();
         //System.out.println("ZWIERZE");
         //zwierze1.functionB();
         
         ZwierzeDomowe zwierze2 = new ZwierzeDomowe();
         Zwierze kotekTomka = zwierze2;
         kotekTomka.setWiek(2);
         kotekTomka.setMasa(30);
         //kotekTomka.setWlasciciel("Tomek");
         //System.out.println("zwierze2");
         //kotekTomka.functionB();
         if(kotekTomka instanceof ZwierzeDomowe){
           ZwierzeDomowe   domowyKotekTomka   = (ZwierzeDomowe)kotekTomka;
         }
         else if(kotekTomka instanceof ZwerzeDzikie){
           ZwerzeDzikie   dzikiKotekTomka   = (ZwerzeDzikie)kotekTomka;
       
         }

         ZwerzeDzikie zwierze3 = new ZwerzeDzikie();
         zwierze3.setWiek(2);
         zwierze3.setMasa(30); 
         zwierze3.setCzyZagrozony(true);
         //System.out.println("zwierze3");
         //zwierze3.functionB();


         ArrayList<Zwierze> zwierzeta = new ArrayList();
         zwierzeta.add(zwierze1);
         zwierzeta.add(zwierze2);
         zwierzeta.add(zwierze3);
          for(int i=0; i< zwierzeta.size(); i++){
           Zwierze zwierze_i = zwierzeta.get(i);
           System.out.println("Zwierze nr " +i);
           zwierze_i.functionB();

              if(zwierze_i instanceof ZwierzeDomowe){
               ZwierzeDomowe domowe = (ZwierzeDomowe)zwierze_i;
                System.out.println("Zwierze domowe " +domowe.getWlasciciel() );
              }

               else if(zwierze_i instanceof ZwerzeDzikie){
                 ZwerzeDzikie dzikie = (ZwerzeDzikie) zwierze_i;
                  System.out.println("Jestem zwierzeciem dzikim " +dzikie.isCzyZagrozony() );
               }

           
          }
        
    }
    
}
