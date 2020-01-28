package nekretnina;
import nekretnina.Vlasnik;

public class Main {
	

	public static void main(String[] args) {
		Vlasnik Vlasnik = null;
		Nekretnina ne1 = new Stan( "string", "string2", 1,Vlasnik);
		Nekretnina ne2 = new Kuca();

		//Stan
		System.out.println("Stan " + ne1.adress);
		System.out.println("Stan " + ne1.kvadratura);
		System.out.println("Stan" + ne1.zone);
		System.out.println("Stan" + ne1.getAdress());
		System.out.println("Stan" + ne1.getKvadratura());
		

		//Kuca
		System.out.println("Kuca " + ne1.adress);
		System.out.println("Kuca " + ne1.kvadratura);
		System.out.println("Kuca" + ne1.zone);
		System.out.println("Kuca" + ne1.getAdress());
		System.out.println("Kuca" + ne1.getKvadratura());
	}

}