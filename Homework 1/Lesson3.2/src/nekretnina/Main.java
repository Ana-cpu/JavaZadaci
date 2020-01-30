package nekretnina;

public class Main {

	public static void main(String[] args) {
		Nekretnina ne1 = new Stan();
		Nekretnina ne2 = new Kuca();
		

		//Stan
		System.out.println("Stan " + ne1.address);
		System.out.println("Stan " + ne1.kvadratura);
		System.out.println("Stan" + ne1.zone);
		

		//Kuca
		System.out.println("Kuca " + ne1.address);
		System.out.println("Kuca " + ne1.kvadratura);
		System.out.println("Kuca" + ne1.zone);
	}

}
