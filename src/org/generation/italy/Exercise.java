package org.generation.italy;

public class Exercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int età, prz; // prz=prezzo
		String giorno;

		età = 11;
		prz = 0;
		giorno = "mercoledì";

		if (età < 10)
			System.out.println("Il biglietto è gratis");
		else {
			if (età >= 10 && età < 15)
				prz = 6;

			if (età >= 15)
				prz = 8;

			if (giorno.equals("mercoledì"))
				prz = prz - 2;

			System.out.println("Il biglietto costa " + prz + " €");
		}

	}
}
