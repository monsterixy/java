/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.eksoc.sniegula.interfaceexample;

/**
 *
 * @author sniegulaa
 */
public class Product implements Comparable<Product>{
  
    private String name;
    private float price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    

   
        public int compareTo(Product o){
     
             if(this.price > o.price )
              {  return 1;}
            //1 this > o


            else if(this.price  == o.price){
               return 0;
            }
            //0  this == o




            else{

              return -1;
            }
            //-1 this <  o
      
        }
    
}
