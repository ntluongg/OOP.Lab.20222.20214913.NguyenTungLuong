package hust.soict.dsai.test.store;

import hust.soict.dsai.aims.media.*;
import hust.soict.dsai.aims.screen.StoreScreen;
import hust.soict.dsai.aims.store.*;

public class StoreTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create a Store instance and 3 DVDs
		Store store = new Store();	
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
				"Animation", "Roger Allers", 87, 19.95f);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars",
				"Science Fiction", "George Lucas", 87, 24.95f);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin",
				"Animation", "Roger Allerts", 90,  18.99f);
		Book b1 = new Book("Aladin", "Tales", 20f);
		//here I add DVDs and test add method
 		store.addMedia(dvd1);
		store.addMedia(dvd2);
		store.addMedia(dvd3);
		store.addMedia(b1);
		
		store.printStore();
		//test remove method:
		System.out.println("After remove");
		store.removeMedia(dvd2);
		
		new StoreScreen(store);
		
	}

}
