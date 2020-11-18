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
public class VegRestaurant implements Hotel 
{ 
    public Menus getMenus() 
    { 
        VegMenu v = new VegMenu(); 
        return v; 
    } 
} 