package GUI;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.management.JMException;
import javax.management.JMRuntimeException;

import com.google.gson.*;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

public class CitireJSON {
	
	Car[] masini;
	
	void rulare()
	{
		System.out.println("Programul a rulat");
	}
	
	
    CitireJSON(int i)//Constructor
	{
		masini = new Car[i];
	}
	
    public void  citire_agenda(){
    	{
    		Gson gson = new Gson();
    		
    		try(FileReader file = new FileReader("Fisier.json")) 
    		{
    		    try {
    				masini = new Gson().fromJson(file, Car[].class);
    			} catch (Exception e) {
    				// TODO Auto-generated catch block
    				e.printStackTrace();
    			}
    		} 
    		catch (FileNotFoundException e) 
    		{
    			e.printStackTrace();
    			
    		} 
    		catch (IOException e1) 
    		{
    			e1.printStackTrace();
    		} catch (JMException e) {
    			e.printStackTrace();
    		} catch (JMRuntimeException e) {
    			e.printStackTrace();
    		}
    		
    	}
    	}
    //--------------------------
	
	

}
