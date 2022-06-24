/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.eksoc.sniegula.interfaceexample;

/**
 *
 * @author sniegulaa
 */
public class TalkableServiceB implements IItalkable , SecondInterface{

  @Override
     public void method1(){
       System.out.println("Service b Method 1");
     }

    @Override
    public String method2(){
           System.out.println("Service b Method 2");
           return "abcd";
    }

   @Override
   public void method3(int a, float b){
       System.out.println("Service b Method 3");
   }
   @Override
   public  void methodWithDefaultImp(){
       System.out.println("Service b override default");
    }

@Override
 public void secondInterfaceMethod(){
   System.out.println("Second interface");
 }
    
}
