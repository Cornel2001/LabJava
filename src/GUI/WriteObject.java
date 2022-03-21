package GUI;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {

	public static void main(String[] args) {
		
		Window window = new Window(); 
		Car cr1 = new Car(20, 3, 3, 1);
		Car cr2 = new Car(12, 4, 5, 6);
		Car cr3 = new Car(25, 45, 4, 5);
		
		FileOutputStream fos;
		try {
			fos = new FileOutputStream("cars.bin");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(cr1);
			oos.writeObject(cr2);
			oos.writeObject(cr3);

			oos.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
			
		}
		

	}
	
  
	

}
