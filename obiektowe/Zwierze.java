/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.sniegula.programowanieobiektowe2;

/**
 *
 * @author sniegulaa
 */
public class Zwierze {

   private int wiek;

   private float masa;

    private void functionA(){
       System.out.println("Funkcja a PRIVATE w zwierzeciu");
    }

    public void functionB(){ 
        System.out.println("Funkcja B - PUBLIC w zwierzeciu");
    }


    protected void funkcjaC(){
        System.out.println("Funkcja C - PROTECTED w zwierzeciu");
   } 

    public int getWiek() {
         functionA();
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public float getMasa() {
        return masa;
    }

    public void setMasa(float masa) {
        this.masa = masa;
    }


    
}
