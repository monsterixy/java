/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.eksoc.sniegula.interfaceexample;

/**
 *
 * @author sniegulaa
 */
public interface IItalkable {

     public static final String attributeA = "a";

     public void method1();
     public String method2();
     public void method3(int a, float b);


     public default void methodWithDefaultImp(){
              System.out.println("DEFAULT");
     }
    
}
