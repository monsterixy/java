/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.eksoc.sniegula.interfaceexample;

/**
 *
 * @author sniegulaa
 */
public class TalkableServiceA implements IItalkable{
     
     @Override
     public void method1(){
       System.out.println("Service a Method 1");
     }

    @Override
    public String method2(){
           System.out.println("Service a Method 2");
           return "abcd";
    }

   @Override
   public void method3(int a, float b){
       System.out.println("Service a Method 3");
   }

}
