import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Marks {

	double mark[]=new double[5];
	double sumMarks=0;
	double lowestMark=0;
	double highestMark=0;
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	void captureMarks(int counter) throws Exception {
		System.out.println("Enter marks for student "+(counter+1));
		mark[counter]=Double.parseDouble(br.readLine());
		sumMarks+=mark[counter];
		
		if(counter==0) {
			lowestMark=mark[counter];
		}
		
		//Find Lowest MArk
		if(mark[counter]<lowestMark) {
			lowestMark=mark[counter];
		}
		if(mark[counter]>highestMark) {
			highestMark=mark[counter];
		}
	}
	void displayMarks() {
		for(int i=0; i<5; i++) {
			System.out.println("Marks for student : "+(i+1)+" is "+mark[i]);
		}
		System.out.println("Lowest marks is : "+lowestMark);
		System.out.println("Highest marks is : "+highestMark);
		System.out.println("Average marks is : "+(sumMarks/5));
	}
	public static void main(String[] args) throws Exception {
		Marks m = new Marks();
		for(int counter=0; counter<5; counter++) {
			m.captureMarks(counter);
		}
		m.displayMarks();
	}

}
