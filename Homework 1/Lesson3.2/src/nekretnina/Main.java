package nekretnina;

public class Main {
	

	public static void main(String[] args) {
		Vlasnik vlasnik = new Vlasnik("Ana", "Acanski", "1234567891012", "123456789");
		Nekretnina ne1 = new Stan();
		Nekretnina ne2 = new Kuca();
		
		//it is not important - Vlasnik is set to null for this round:)
		Nekretnina ne3 = new Stan(vlasnik, "Bulevar Patrijarha Pavla", 63, 2);

		//Stan
		System.out.println("Stan se nalazi na adresi: " + ne1.address);
		System.out.println("Kvadratura stana je: " + ne1.kvadratura);
		System.out.println("Stan se nalazi u zoni: " + ne1.zone);
		

		//Kuca
		
		System.out.println("Kuca se nalazi na adresi: " + ne2.address);
		System.out.println("Kvadratura kuce je:  " + ne2.kvadratura);
		System.out.println("Zona u kojoj se kuca nalazi je: " + ne2.zone);
		
		//The apartment with a parameters-- this part could e modified, at this moment I am ignoring Vlasnik, this part will be modified in a Vlasnik class later
		System.out.println(vlasnik);
		System.out.println(ne3.toString());
		
	}

}
