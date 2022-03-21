package GUI;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class Window  
{
	private JFrame frame; 
	
	 
	public Window()
	{
		super();
		frame = new JFrame("Formula1 Racing Day!");
		initGUI();
		
		JButton btn = new JButton("Bine a-ti venit la cursa!!! ");// sa nu uit sa fac un drapel.
		btn.setBounds(10, 10, 200, 40);
		frame.add(btn);	
		
		JButton btn1 = new JButton("Bine!!! ");
		btn.setBounds(10, 10, 200, 40);
		frame.add(btn1);	
		
	}
	
	private void initGUI()
	{
		frame.setSize(new Dimension(500, 500));
		frame.setVisible(true);
		frame.setDefaultCloseOperation(3);
		frame.setLayout(null);
		
		
	}
	
	
	
	
	
	
	
}



