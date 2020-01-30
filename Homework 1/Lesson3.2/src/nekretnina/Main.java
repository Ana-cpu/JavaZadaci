package nekretnina;

public class Main {

	public static void main(String[] args) {
		Nekretnina ne1 = new Stan();
		Nekretnina ne2 = new Kuca();
		

		//Stan
		System.out.println("Stan se nalazi na adresi: " + ne1.address);
		System.out.println("Kvadratura stana je: " + ne1.kvadratura);
		System.out.println("Stan se nalazi u zoni: " + ne1.zone);
		
		

		//Kuca
		
		System.out.println("Kuca se nalazi na adresi: " + ne2.address);
		System.out.println("Kvadratura kuce je:  " + ne2.kvadratura);
		System.out.println("Zona ukojoj se kuca nalazi je: " + ne2.zone);
	}

}
