package TA_21_Maven.EjerciciosClase;

import TA_21_Maven.EjerciciosClase.Geometria;

/**
 * Hello world!
 *
 */
public class App 
{
	  public static void main( String[] args )
	    {
		   //Creacion de Objeto Circulo
		   Geometria gm=new Geometria(2);
		   double areaCirc= gm.areaCirculo(2);
		   gm.setArea(areaCirc);    
		   System.out.println(gm);
	    }
}
