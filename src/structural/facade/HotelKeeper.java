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
public class HotelKeeper 
{ 
    public VegMenu getVegMenu() 
    { 
        VegRestaurant v = new VegRestaurant(); 
        VegMenu vegMenu = (VegMenu)v.getMenus(); 
        return vegMenu; 
    } 
      
    public NonVegMenu getNonVegMenu() 
    { 
        NonVegRestaurant v = new NonVegRestaurant(); 
        NonVegMenu NonvegMenu = (NonVegMenu)v.getMenus(); 
        return NonvegMenu; 
    } 
      
    public Both getVegNonMenu() 
    { 
        VegNonBothRestaurant v = new VegNonBothRestaurant(); 
        Both bothMenu = (Both)v.getMenus(); 
        return bothMenu; 
    }     
}