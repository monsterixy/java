/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.eksoc.sniegula.interfaceexample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author sniegulaa
 */
public class TestMyInterface {

   public static void main(String[] args){

      IItalkable talkableService = new TalkableServiceB();

      List<IItalkable> services = new ArrayList<>();
      services.add(new TalkableServiceA());
      services.add(new TalkableServiceB());

      //talkableService.method1();
      //String result = talkableService.method2();
      //talkableService.method3(3, 6);


       for(IItalkable service : services){
               service.methodWithDefaultImp();

               if(service instanceof SecondInterface){
                   SecondInterface second = (SecondInterface) service;
                   second.secondInterfaceMethod();
                }
       }

    
    String a = IItalkable.attributeA;

    List<Product> prodcuts = new ArrayList<Product>();
   Product p1 = new Product();
   p1.setName("b");
   p1.setPrice(3);
   prodcuts.add(p1);

  Product p2 = new Product();
   p2.setName("z");
   p2.setPrice(1);
   prodcuts.add(p2);

   Product p3 = new Product();
   p3.setName("a");
   p3.setPrice(2);
   prodcuts.add(p3);

   Collections.sort(prodcuts); //compareTo

   Collections.sort(prodcuts, new CompareProducts()); //compare

   }
    
}
