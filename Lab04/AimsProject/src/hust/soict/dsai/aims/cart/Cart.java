package hust.soict.dsai.aims.cart;

import hust.soict.dsai.aims.media.DigitalVideoDisc;

public class Cart {	
	public static final int MAX_NUMBER_ORDERED = 20;
	private DigitalVideoDisc[] itemsOrdered;
	private int qtyOrdered; 
	public Cart(){
		this.qtyOrdered = 0; 
		this.itemsOrdered = new DigitalVideoDisc[MAX_NUMBER_ORDERED];
	}

	public void addDigitalVideoDisc(DigitalVideoDisc disc){
		if (qtyOrdered == MAX_NUMBER_ORDERED) {
			System.out.println("Your cart is already full! Cannot add more ");
			return ;		
		}
		
		itemsOrdered[qtyOrdered] = disc;
		System.out.println("The disc has been added: "+disc.getTitle()+" -"+disc.getDirector());
		qtyOrdered +=1;
		if (qtyOrdered == MAX_NUMBER_ORDERED) {
			System.out.println("Your cart is full ");
		}
	} 
	
	public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
		for (DigitalVideoDisc d: dvdList) {
			if (d == null) {
				break;
			}
			addDigitalVideoDisc(d);
		}
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2) {
		addDigitalVideoDisc(dvd1);
		addDigitalVideoDisc(dvd2);
	}
	
	public void removeDigitalVideoDisc(DigitalVideoDisc disc){
		if (qtyOrdered == 0) {
			System.out.println("Your cart is empty, cannot remove any items ");
			return;
		}
		
		int k = -1;
		
		for (int i = 0; i<qtyOrdered; i++) {
			if (itemsOrdered[i].equals(disc)){
				k = i;
				break;
			}
		}
		if (k == -1) {
			System.out.println("Can't find disc: "+disc.getTitle()+" -"+disc.getDirector());
			return;
		}
		
		for (int i = k; i < qtyOrdered-1; i++) {
			itemsOrdered[i]=itemsOrdered[i+1];
		}
		
		itemsOrdered[qtyOrdered-1] = null;
		qtyOrdered -=1;
		System.out.println("The disc has been removed: "+disc.getTitle()+" -"+disc.getDirector());
	} 
	
	public float totalCost() {
		float sum = 0.0f;
		for (int  i = 0; i < qtyOrdered; i++ ) {
			sum +=itemsOrdered[i].getCost();
		}		
		return sum;
	}
	
	public void print() {
		System.out.println("***********************CART***********************");
		System.out.println("Ordered Items:");
		int count = 0;
		for (DigitalVideoDisc d: itemsOrdered) {
			if (d == null) {
				break;
			} 
			count+=1;
			System.out.print(count+". ");
			System.out.println(d);
		}
		System.out.println("Total cost: "+totalCost());
		System.out.println("***************************************************");
	}
	
	public void search(int id) {
		System.out.println("Your search result: ");
		int count = 0;
		for (DigitalVideoDisc d: itemsOrdered) {
			if (d == null) {
				break;
			} 
			if (d.isMatch(id)) {
				count+=1;
				System.out.print(count+". ");
				System.out.println(d);
			}
		}
		if (count == 0) {
			System.out.println("no match found");
		}
	}
	
	public void search(String title) {
		System.out.println("Your search result: ");
		int count = 0;
		for (DigitalVideoDisc d: itemsOrdered) {
			if (d == null) {
				break;
			} 
			if (d.isMatch(title)) {
				count+=1;
				System.out.print(count+". ");
				System.out.println(d);
			}
		}
		if (count == 0) {
			System.out.println("no match found");
		}
	}
	
}