package endava;
import java.util.Random;

public class Random1 {

	public static void main(String[] args) {
		Random rand = new Random();
		int mesec = rand.nextInt(12)+1;
		int godina=2000;
		
		switch(mesec) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			int brojDana = 31;
			break;
		 case 4: case 6: case 9: case 11:
			brojDana = 30;
			break;
		 case 2:
			 if(godina %4 == 0)
				 brojDana = 29;
			 else
				 brojDana = 28;
			break;
		}
	}

}
