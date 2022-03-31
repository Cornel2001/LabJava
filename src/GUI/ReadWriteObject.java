package GUI;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ReadWriteObject {
	public void ReadWrite(){
	try {
		FileOutputStream fos;
		Car cr1 = new Car(20, 3, 3, 1);
		Car cr2 = new Car(12, 4, 5, 6);
		Car cr3 = new Car(25, 45, 4, 5);
		fos = new FileOutputStream("cars.bin");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(cr1);
		oos.writeObject(cr2);
		oos.writeObject(cr3);

		oos.close();
		//-------------------------
		FileInputStream fis = new FileInputStream("cars.bin");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Car cr11 = (Car) ois.readObject();
		Car cr21 = (Car) ois.readObject();
		Car cr31 = (Car) ois.readObject();
		System.out.println(cr11);
		System.out.println(cr21);
		System.out.println(cr31);
		ois.close();
		
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
}
}
