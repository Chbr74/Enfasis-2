/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templatess
 * and open the template in the editor.
 */
package FactoryMethod2;


public class ArchivoVideo implements IArchivo
{
   public ArchivoVideo() {
   }


   // -----------------------------


   @Override
     public void reproducir() {
       System.out.println("Reproduciendo archivo de vídeo...");
   }
}
