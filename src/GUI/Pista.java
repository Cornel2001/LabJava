package GUI;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Pista {

	
	JPanel pn = new JPanel() {	
		public void paint(Graphics g) {
		g.setColor(Color.red);
		g.drawRect(50, 50, 200, 40);//sa desenez un patrat pentru inceput de pista
		
		
		}
		};
}
