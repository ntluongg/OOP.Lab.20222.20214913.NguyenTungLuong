package hust.soict.dsai.aims.media;

public class DigitalVideoDisc extends Disc {
	
	private static int nbDigitalVideoDiscs = 0;
	private String director;
	private int length;
/*	
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
		
		nbDigitalVideoDiscs+=1; //increase the class counter
		id = nbDigitalVideoDiscs;
	}
	
	public DigitalVideoDisc(String title, String category, String director, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.cost = cost;
		nbDigitalVideoDiscs+=1; //increase the class counter
		id = nbDigitalVideoDiscs;
	}
	public DigitalVideoDisc(String title, String category, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.cost = cost;
		nbDigitalVideoDiscs+=1; //increase the class counter
		id = nbDigitalVideoDiscs;
	}
	public DigitalVideoDisc(String title) {
		super();
		this.title = title;
		nbDigitalVideoDiscs+=1; //increase the class counter
		id = nbDigitalVideoDiscs;
	}
	
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
*/
	@Override
	public boolean equals(Object obj) {
		if(obj == null) {
            return false;
        }
        if(!(obj instanceof DigitalVideoDisc)) {
            return false;
        }
        DigitalVideoDisc other = (DigitalVideoDisc) obj;
        	return (other.title == this.title)&&(other.director == this.director) ; 
	}
	
	@Override 
	public String toString() {
	//to String method for printing out in Ex6 lab03
		return "DVD - "+title+" - "+category+" - "+director+" - "+length+": "+cost+" $";
	}
	
	//lines below are for searching
	public boolean isMatch(String title) {
		//check matching title
		return this.title == title;
	}
	
	public boolean isMatch(int id) {
		//check matching id
		return this.id == id;
	}
}