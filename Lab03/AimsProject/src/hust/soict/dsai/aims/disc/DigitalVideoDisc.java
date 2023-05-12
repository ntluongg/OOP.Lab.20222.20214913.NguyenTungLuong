package hust.soict.dsai.aims.disc;

public class DigitalVideoDisc {
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
	}
	public DigitalVideoDisc(String title, String category, String director, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.cost = cost;
	}
	public DigitalVideoDisc(String title, String category, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.cost = cost;
	}
	public DigitalVideoDisc(String title) {
		super();
		this.title = title;
	}
	
	private String title;
	private String category;
	private String director;
	private int length;
	private float cost;
	
	public String getTitle() {
		return title;
	}
	public String getCategory() {
		return category;
	}
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	public float getCost() {
		return cost;
		
	
	}
	
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
	
	public void setTitle(String title) {
		this.title = title;
	}
}
