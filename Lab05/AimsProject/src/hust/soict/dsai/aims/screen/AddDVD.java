package hust.soict.dsai.aims.screen;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import hust.soict.dsai.aims.media.*;

public class AddDVD {
	DigitalVideoDisc dvd;
	
	public AddDVD() {}
	
	public void addDVD() {
		JPanel p = new JPanel();
		JTextField title = new JTextField(10);
		JTextField category = new JTextField(10);
		JTextField cost = new JTextField(10);
		JTextField director = new JTextField(10);
		JTextField length = new JTextField(10);
		
		p.add(new JLabel("Title :"));
		p.add(title);
		p.add(new JLabel("Category : "));
		p.add(category);
		p.add(new JLabel("Cost : "));
		p.add(cost);
		p.add(new JLabel("Director : "));
		p.add(director);
		p.add(new JLabel("Length : "));
		p.add(length);
		
		JOptionPane.showConfirmDialog(null, p, "Input Media : ", JOptionPane.OK_CANCEL_OPTION);
		dvd = new DigitalVideoDisc(title.getText(), category.getText(), director.getText(), Integer.parseInt(length.getText()), Float.parseFloat(cost.getText()));
	}
	
	public DigitalVideoDisc getInput() {
		return dvd;
	}
}
