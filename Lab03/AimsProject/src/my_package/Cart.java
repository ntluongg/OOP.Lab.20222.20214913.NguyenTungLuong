package my_package;

public class Cart {
	
	public static final int MAX_NUMBER_ORDERED = 20;
	private DigitalVideoDisc[] itemsOrdered;
	private int qtyOrdered;
	
	public Cart(){
		this.qtyOrdered = 0; 
		this.itemsOrdered = new DigitalVideoDisc[MAX_NUMBER_ORDERED];
	}

	public void addDigitalVideoDisc(DigitalVideoDisc disc){
		if (this.qtyOrdered == MAX_NUMBER_ORDERED) {
			System.out.println("Your cart is already full! Cannot add more ");
			return ;		
		}
		
		this.itemsOrdered[this.qtyOrdered] = disc;
		System.out.println("The disc has been added: "+disc.getTitle()+" -"+disc.getDirector());
		this.qtyOrdered +=1;
		switch (this.qtyOrdered) {
			case 18:
				System.out.println("Your cart is almost full. 2 more!");
				return;
			case 19:
				System.out.println("Your cart is almost full. 1 more!");
				return;
			case 20:
				System.out.println("Your cart is full ");
				return;
		}
	} 
	
	public void removeDigitalVideoDisc(DigitalVideoDisc disc){
		if (this.qtyOrdered == 0) {
			System.out.println("Your cart is empty, cannot remove any items ");
			return;
		}
		for (int i = 0; i < this.qtyOrdered; i++) {
			if (this.itemsOrdered[i] == null) {
				break; 
			}
			if (this.itemsOrdered[i].equals(disc)) {
				
			}
		}
		DigitalVideoDisc[] new_arr = new DigitalVideoDisc[Cart.MAX_NUMBER_ORDERED];
		for(int i=0, k=0;i<this.qtyOrdered;i++){
            if(this.itemsOrdered[i]!=disc){
                new_arr[k]=this.itemsOrdered[i];
                k++;
            }
        }

		this.qtyOrdered -=1;
		System.out.println("The disc has been removed: "+disc.getTitle()+" -"+disc.getDirector());
		this.itemsOrdered = new_arr;
		new_arr = null;
	} 
	
	public float totalCost() {
		float sum = 0.0f;
		for (DigitalVideoDisc d : this.itemsOrdered) {
			if (d == null) {
				break; 
			}
			sum +=d.getCost();
		}
		return sum;
	}
	
}