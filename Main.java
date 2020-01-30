package com.Nouveau.nuage;

public class Main {
	

public static void main (String[]Args) {
	
	
	Nuage a = new Nuage();
	Nuage B = new Nuagechaud();
	Nuage c = new Nuagefroid();
	
	
	a.color = "vert";
	a.opaque = 8;
	a.humidite = 5;
	a.mouvement();
	
	B.color = "jaune";
	B.humidite = 29;
	B.Temperature = 34;
	B.opaque = 6;
	B.mouvement();
	
	
	c.color = "gris";
	c.Temperature = 10;
	c.humidite = 9;
	c.opaque = 6;
	c.mouvement();
	
}

}
