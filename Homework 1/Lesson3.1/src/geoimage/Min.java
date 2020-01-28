package geoimage;

public class Min {

	public static void main(String[] args) {
		GeometricImage ci1 = new Circle();
		GeometricImage ci2 = new ElipsaExample();
		
		GeometricImage tr1 = new Trougao();
		GeometricImage tr2 = new JednakokrakiTrougao();
		GeometricImage tr3 = new NejednakostranicniTrougao();
		
		GeometricImage kv1 = new Kvadrat();
		GeometricImage kv2 = new Pravougaonik();
		GeometricImage kv3 = new Kvadrat(5);
		

		//Krug
		System.out.println("Obim kruga " + ci1.obim());
		System.out.println("Povrsina kruga " + ci1.povrsina());
		System.out.println("MethodToString Kruga " + ci1.getClass().toString());
		
		//Elipsa
		System.out.println("Obim elipse " + ci2.obim());
		System.out.println("Povrsina elipse " + ci2.povrsina());
		System.out.println("MethodToString Elipse " + ci2.getClass().toString());
		
		
        //Jednakostranicni trougao
		System.out.println("Obim jednakostranicnog trougla"  + tr1.obim());
		System.out.println("Povrsina jednakostranicnog trougla" + tr1.povrsina());
		System.out.println("MethodToString jednakostranicnog trougla " + tr1.getClass().toString());
		
		
		//Jednakokraki trougao
		System.out.println("Obim jednakokrakog trougla " + tr2.obim());
		System.out.println("Povrsina jednakokrakog trougla je" + tr2.obim());
		System.out.println("MethodToString jednakokrakog trougla" + tr2.getClass().toString());
		
		
		//Kvadrat
		System.out.println("Obim kvadrata je " + kv1.obim());
		System.out.println("Povrsina kvadrata je " + kv1.povrsina());
		System.out.println("MethodToString kvadrata" + kv1.getClass().toString());

		//Pravougaonoik
		System.out.println("Obim pravougaonika " + kv2.obim());
		System.out.println("Povrsina pravougaonika " + kv2.povrsina());
		System.out.println("MethodToString pravougaonika " + kv2.getClass().toString());
		
		//Kvadrat sa ne setovanom default stranicom
		System.out.println("Obim kvadrata je " + kv3.obim());
		System.out.println("Povrsina kvadrata je " + kv3.povrsina());
		System.out.println("MethodToString kvadrata" + kv3.getClass().toString());
		
	}

}
