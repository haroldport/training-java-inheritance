package com.arquitecturajava.ejemplo006;

public class Principal {

	public static void main(String[] args) {
		
		Persona p1 = new Deportista("Hugo", "Futbol");
		
		System.out.println(p1.getNombre());
		p1.andar();
		
		Deportista d = (Deportista) p1;
		System.out.println(d.getDeporte());
		

	}

}
