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
public class NonVegRestaurant implements Hotel 
{ 
    public Menus getMenus() 
    { 
        NonVegMenu nv = new NonVegMenu(); 
        return nv; 
    } 
} 