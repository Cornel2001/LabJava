package Interfata;




import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.Border;



public class Window 
{
	private JFrame frame; 
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btn4;

	 
	public Window()
	{
		super();
		frame = new JFrame("Formula1 Racing Day!");
		initGUI();
	}
	
	private void initGUI()
	{
		frame.setSize(new Dimension(500, 500));
		frame.setVisible(true);
		frame.setLayout(null);
		
		btn1 = new JButton(" ");
		btn2 = new JButton(" ");
		setBtn3(new JButton(" "));
		setBtn4(new JButton(" "));

		
		
		btn1.setBounds(100, 20, 100, 550);
		btn2.setBounds(210, 20, 100, 550);
		btn3.setBounds(320, 20, 100, 552);
		btn4.setBounds(300, 20, 100, 552);

		
		btn1.setBackground(Color.gray);
		btn2.setBackground(Color.gray);
		btn3.setBackground(Color.gray);
		
		
		
		//Border border1 = BorderFactory.createLineBorder(Color.white, 10);
	     // btn1.setBorder(border1);
	    //  btn3.setBorder(border1);
	   
		
		
		frame.add(btn1);
		frame.add(btn2);
		frame.add(btn3);

	}

	public JButton getBtn3() {
		return btn3;
	}

	public void setBtn3(JButton btn3) {
		this.btn3 = btn3;
	}

	public JButton getBtn4() {
		return btn4;
	}

	public void setBtn4(JButton btn4) {
		this.btn4 = btn4;
	}
	
	
	
	
}


