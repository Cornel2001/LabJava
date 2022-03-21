package GUI;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("cars.bin");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Car cr1 = (Car) ois.readObject();
			Car cr2 = (Car) ois.readObject();
			Car cr3 = (Car) ois.readObject();
			System.out.println(cr1);
			System.out.println(cr2);
			System.out.println(cr3);
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
