/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structural.facade;

/**
 *
 * @author Chris
 */
public class Client 
{ 
    public static void main (String[] args) 
    { 
        HotelKeeper keeper = new HotelKeeper(); 
          
        VegMenu v = keeper.getVegMenu(); 
        NonVegMenu nv = keeper.getNonVegMenu(); 
        Both = keeper.getVegNonMenu(); 
  
    } 
} 
