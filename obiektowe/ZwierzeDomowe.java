/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.sniegula.programowanieobiektowe2;

/**
 *
 * @author sniegulaa
 */
public class ZwierzeDomowe extends Zwierze {

     private String wlasciciel;

    public String getWlasciciel() {
        return wlasciciel;
    }

    public void setWlasciciel(String wlasciciel) {
        this.wlasciciel = wlasciciel;
    }



    public void someFunction(){

     String someMessage = wlasciciel + " " + getMasa();
     funkcjaC();

    }


    @Override
    public void functionB(){
       System.out.println("Jestem zwierzęciem domoeym, mam właściecla " + getWlasciciel());
    }


    
}
