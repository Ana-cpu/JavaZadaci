package student;

public class OceneStudent {

	private String firstName;
	private String lastname;
	private int Mark;
	private double pointsNumber;
	
	//getMark based on numberPoints
	
    public int getMark() {
	    if (pointsNumber <= 100 && pointsNumber > 90) Mark= 10;
	    else if (pointsNumber <= 91 && pointsNumber > 80) Mark= 9;
	    else if (pointsNumber <= 81 && pointsNumber > 70) Mark= 8;
	    else if (pointsNumber <= 71 && pointsNumber > 60) Mark= 7;
	    else if (pointsNumber <= 61 && pointsNumber > 50) Mark= 6;
	    
	    else {
	    	Mark= 5;
	    }
	    return Mark;
    }
	
	//construct a new student
	public OceneStudent(String firstName, String lastname, double pointsNumber) {
		this.firstName = firstName;
		this.lastname = lastname;
		this.pointsNumber = pointsNumber;
		this.Mark = Mark; 
	}

	public boolean less(OceneStudent b) {
		OceneStudent a = this;
		return a.pointsNumber < b.pointsNumber;
	}
	
	public String toString() {
		return pointsNumber + " " + firstName + "" + lastname + "";
	}
	
	public static void main (String[] args) {
		
		//this will be modified later
		int n = Integer.parseInt(args[0]);
		// initialize an array
		OceneStudent[] oceneStudents = new OceneStudent[n];
		
		for (int i =0; i<n; i++) {
			String firstName = StdIn.readString();
			String lastname = StdIn.readString();
			Double pointsNumber = StdIn.readDouble();
			oceneStudents[i] = new OceneStudent(firstName, lastname, pointsNumber);
		};
		
		//insertion sort students
		// this part will be modified later and number of points will be added
		for (int i = 0; i < n; i ++) {
			for (int j = i; j > 0; j --) {
				if (oceneStudents[j].less(oceneStudents[j-1])){
					OceneStudent swap = oceneStudents[j];
					oceneStudents[j] = oceneStudents[j-1];
					oceneStudents[j-1] = swap;
				}
			}
		}
		
		//print results
		for(int i = 0; i < n; i++) {
			StdOut.println(oceneStudents[i]);
		}
		
	}
}
