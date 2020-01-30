package com.Nouveau.nuage;

public class Nuagefroid extends Nuage {


public void mouvement() {

	 if ((Temperature == 0) && (humidite < 10 ) && (humidite > 3))
	{
	System.out.println("Il neigera surement...");
} 
		
	if ((Temperature < 0) && (humidite < 0)) {
		System.out.println("Il va geler aujourd'hui");
	}
	if ((Temperature < 1) && (humidite > 3)) {
		System.out.println("c'est un brouillard ?..");
	}
	else 
	{
		System.out.println(" La reponse est dans mon bulletin Meteo !");
	}
	System.out.println("Hello World !");
}
}
	
	
	
	


