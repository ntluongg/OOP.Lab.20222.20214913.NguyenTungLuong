package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media{
	
	private List<String> authors = new ArrayList<String>();
	
	public Book() {
		// TODO Auto-generated constructor stub
	}

	public boolean addAuthor(String authorName) {
		if (authors.contains(authorName)) 
			return false;
		authors.add(authorName);
		return true;
	}
	
	public boolean removeAuthor(String authorName) {
		if (authors.contains(authorName)) {
			authors.remove(authorName);
			return true;
		}
		return false;
	}
}
