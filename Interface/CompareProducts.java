/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.eksoc.sniegula.interfaceexample;

import java.util.Comparator;

/**
 *
 * @author sniegulaa
 */
public class CompareProducts implements Comparator<Product> {
    public int compare(Product a, Product b){
         return a.getName().compareTo(b.getName());
    }
}
