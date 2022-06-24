/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.sniegula.programowanieobiektowe2;

/**
 *
 * @author sniegulaa
 */
public class ZwerzeDzikie extends Zwierze{

    
private boolean czyZagrozony;

    public boolean isCzyZagrozony() {
        return czyZagrozony;
    }

    public void setCzyZagrozony(boolean czyZagrozony) {
        this.czyZagrozony = czyZagrozony;
    }

@Override
    public void functionB(){
       super.functionB();
       System.out.println("Jestem zwierzęciem dzikim");
        if(czyZagrozony){
                System.out.println("Jestem zagrożony wyginieciem");
         }
    }

    
}
