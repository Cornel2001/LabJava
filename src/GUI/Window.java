package GUI;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class Window 
{
	private JFrame frame; 
	private JPanel carPanel;
	 
	public Window()
	{
		super();
		frame = new JFrame("Formula1 Racing Day!");
		initGUI();
		
		carPanel = new JPanel();
		carPanel.setSize(105, 200);
		//carPanel.setBackground(Color.blue);
		carPanel.setLocation(600, 480);
		
		JLabel car =new JLabel(new ImageIcon("car.png1.jpg"));
		carPanel.add(car);
		
		frame.add(carPanel);
		frame.setResizable(true);
	}
	
	private void initGUI()
	{
		frame.setSize(new Dimension(500, 500));
		frame.setVisible(true);
		frame.setLayout(null);
	}	
		
	
	
	
	
}


