package endava;

public class AppIntegerLiterals {

	public static void main(String[] args) {
		int a = 101;
		int b = 0101;
		int c = 0xFace;
		int d = 0b1111;
	    System.out.println(a);
	    System.out.println(b);
	    System.out.println(c);
	    System.out.println(d);
	    a = (int) 5.66;
	    b= ++a;
	    double t = 5.67;
	    int x = 1;
	    
	    String ime = "Ana";
	    a=b=5;
	    ime+="Acanski";
	    
	    System.out.println(a);
	    System.out.println(b);
	    System.out.println(a+b);
	    System.out.println(a*t);
	    System.out.println(a>b?a:b);
	    System.out.println(27.16+3.0);
	    System.out.println(7/2);
	    System.out.println(7/2.0);
	    System.out.println(2*7*Math.PI);
	    System.out.println(Math.pow(7, 2)*Math.PI);
	    System.out.println((true)&&(3>4));
	    System.out.println(!(a>0)&&(a>0));
	    System.out.println(!(x>0)&&(x>0));//check this
	    System.out.println((x>0)&&(a>0));
	    System.out.println((x>0)||(x<0));
	    System.out.println((x!=0)||(x==0));
	    System.out.println((x>=0)||(x<0));
	    System.out.println((x!=1)==!(x==1));
	    System.out.println(ime);
	    System.out.println(a += a);
	    if (a!=0) {
		    System.out.println(a /= a);
		    System.out.println(a *= a);
	    }
	    if(b!= 0){
		    System.out.println(b -= b);
	    }
	    System.out.println(a % 2 !=0);
	    if(a % 2 !=0) {
	    	a = a+1;
	    	System.out.println(a);
	    	System.out.println("Broj je pretvoren u paran");
	    }
	    if(a%2 == 0) {
	    	System.out.println("a je paran broj");
	    }else
	    	System.out.println("a je neparan broj");
	    System.out.println("a="+a);
	    
	}

}
