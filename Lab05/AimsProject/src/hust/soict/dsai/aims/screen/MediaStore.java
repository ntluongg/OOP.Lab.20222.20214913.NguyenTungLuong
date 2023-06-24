package hust.soict.dsai.aims.screen;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import hust.soict.dsai.aims.media.*;

public class MediaStore extends JPanel {
	private Media media;
	
	public MediaStore(Media media) {
		this.media = media;
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		JLabel title = new JLabel(media.getTitle());
		title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 20));
		title.setAlignmentX(CENTER_ALIGNMENT);
		
		JLabel cost = new JLabel(""+media.getCost()+" $");
		cost.setAlignmentX(CENTER_ALIGNMENT);
		
		JPanel container = new JPanel();
		container.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		ButtonListener btnListener = new ButtonListener();
		JButton addButton = new JButton("Add to cart");
		addButton.addActionListener(btnListener);
		container.add(addButton);
		if (media instanceof Playable) {
			JButton playButton = new JButton("Play");
			playButton.addActionListener(btnListener);
			container.add(playButton);
		}
		
		this.add(Box.createVerticalGlue());
		this.add(title);
		this.add(cost);
		this.add(Box.createVerticalGlue());
		this.add(container);
		
		this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	}

	private class ButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String s = e.getActionCommand();
			if (s.equals("Play")) {
				JDialog d = new JDialog();
	            // create a label
	            JLabel l = new JLabel("Playing ur track bro ,bruhh bruhh lmao ");
	            d.add(l);
	            d.setSize(300, 300);
	            // set visibility of dialog
	            d.setVisible(true);
			} else if (s.equals("Add to cart")) {
				
			}
		}
	}
	
}
