package com.Nouveau.nuage;

public class Nuage {

 String color;
 int opaque;
int humidite ;
int Temperature;


 
 public void mouvement() {
	

if ( opaque > 5 ) {
 System.out.println("un nuage de couleur" + "  " + color + "  " + "se forme....");
}
else 
{
	
	System.out.println("en voila un phenomene...");
}
if (humidite > 19) {
	System.out.println("Il pleut...");
}
else {
	System.out.println("Il fait beau");
}

System.out.println("Hello World!");
 }
 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
