package GUI;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PISTAsingletonClass {
	
	
	private static PISTAsingletonClass singleton = new PISTAsingletonClass( );
	
	private static volatile PISTAsingletonClass obj  = null;
	 
   private PISTAsingletonClass() {
    	
    }
 
    public static PISTAsingletonClass getInstance()
    {
        if (obj == null)
        {
            synchronized (PISTAsingletonClass.class)
            {
                if (obj==null)
                    obj = new PISTAsingletonClass();
            }
        }
        return obj;
    }
    
    
};
