package hust.soict.dsai.aims;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Aims {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello, world! this is main method running ");
		
		//Create a new cart 
		Cart anOrder = new Cart();
		
		//Create new DVD objects and add them to the cart
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
				"Animation", "Roger Allerts", 87, 1.0f);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars",
				"Science Fiction", "George Lucas", 87, 24.95f);
	
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin",
				"Animation", "Roger Allerts", 18.99f);
		
		DigitalVideoDisc[] testList = new DigitalVideoDisc[10];
		testList[1] = dvd1;
		testList[2] = dvd2;
		testList[3] = dvd3;
		anOrder.addDigitalVideoDisc(testList);
		anOrder.displayCart();
		System.out.println("Total Cost is: ");
		System.out.println(anOrder.totalCost()); 
		
	}
}
