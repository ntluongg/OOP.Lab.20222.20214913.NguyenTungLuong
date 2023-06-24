package hust.soict.dsai.aims.media;

public class DigitalVideoDisc extends Disc {
	// DVD also implements Playable but through Disc

	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super(title, category, cost, director, length);
	}
	
	@Override 
	public String toString() {
	//to String method for printing out in Ex6 lab03
		return "DVD - "+this.getId()+" - "+this.getTitle()+" - "+this.getCategory()+" - "+this.getDirector()+" - "+this.getLength()+": "+this.getCost()+" $";
	}
	
	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null) 
            return false;
        if(!(obj instanceof DigitalVideoDisc))
            return false;
        return (((Media) obj).getTitle() == this.getTitle()); 
	}
	
}