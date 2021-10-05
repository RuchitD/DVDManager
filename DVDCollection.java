import java.io.*;
import java.util.*;


public class DVDCollection {

	// Data fields
	
	/** The current number of DVDs in the array */
	private int numdvds;
	
	/** The array to contain the DVDs */
	private DVD[] dvdArray,dvdArray1;
	
	/** The name of the data file that contains dvd data */
	private String sourceName;
	
	/** Boolean flag to indicate whether the DVD collection was
	    modified since it was last saved. */
	private boolean modified;
	
	/**
	 *  Constructs an empty directory as an array
	 *  with an initial capacity of 7. When we try to
	 *  insert into a full array, we will double the size of
	 *  the array first.
	 */
	public DVDCollection() {
		numdvds = 0;
		dvdArray = new DVD[7];
	}
	
	public String toString() {
		// Return a string containing all the DVDs in the
		// order they are stored in the array along with
		// the values for numdvds and the length of the array.
		// See homework instructions for proper format.
		
		// print numdvds;
		
		String answer="";
		
		answer += "numdvds ="+ numdvds + "\n";
		answer += "dvdArray.length ="+ dvdArray.length + "\n";
		
		
		for (int i  =0; i < numdvds;i++) {
			
			answer+= "dvdArray["+i+"] = "+dvdArray[i].toString()+ "\n";
	}
	

			
		
		


		



		return answer;	// STUB: Remove this line.
	}

	private int sizeof(DVD[] dvdArray2) {
		// TODO Auto-generated method stub
		return 0;
	}

	public void addOrModifyDVD(String title, String rating, String runningTime) {
		// NOTE: Be careful. Running time is a string here
		// since the user might enter non-digits when prompted.
		// If the array is full and a new DVD needs to be added,
		// double the size of the array first.
		System.out.print(title);
		
		if (numdvds%7!=0 || numdvds==0 ) {
			int rt = Integer.parseInt(runningTime);
			dvdArray[0].setTitle(title);
			dvdArray[numdvds].setRating(rating);
			dvdArray[numdvds].setRunningTime(rt);
			numdvds++;
		}
		else {
			int newsize = dvdArray.length *2;
			
			dvdArray1 = new DVD[newsize];
			dvdArray1=dvdArray.clone();
			dvdArray = new DVD[newsize];
			for(int i=0;i<dvdArray1.length;i++) {
				
				dvdArray[i]=dvdArray1[i];
			}
			
			
		}
		
		
		






	
	}
	
	public void removeDVD(String title) {
		





	}
	
	public String getDVDsByRating(String rating) {
			String totalr = "";
			
			for(int i =0; i < numdvds; i++) {
				 if (dvdArray[numdvds].getRating() == rating)
				 {
				 totalr += dvdArray[numdvds].toString() + "\n";
				 }	
			}
			return totalr;	// STUB: Remove this line.

	}

	public int getTotalRunningTime() {
		int totaltime =0;
		for (int i = 0; i<numdvds; i++) {
			if (numdvds == 0){
				break;}
			
			totaltime += dvdArray[i].getRunningTime();
		}

		return totaltime;	// STUB: Remove this line.

	}

	
	public void loadData(String filename){
	File file = new File(filename);
		
		Scanner filescan = null;
		try {
			filescan = new Scanner(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		while (filescan.hasNextLine() == true) {
			String line = filescan.nextLine();
			String[] data = line.split(",");	
			addOrModifyDVD(data[0],data[1],data[2]);
	}
		
		
			
	
	}
	
	public void save() {
		







	}
	public void edit(String title, String rating, String runningTime) {
		
		
		
	}

	// Additional private helper methods go here:



	
}
