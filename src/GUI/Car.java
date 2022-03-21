package GUI;

import java.io.Serializable;

public class Car implements Serializable{
	
	private int vitezaMax;
	private float rataConsumCombustibil;
	private float timpViataRoti;
	private float vitezaDeAcceleratie;
	
	public Car(int vitezaMax, float rataConsumCombustibil, float timpViataRoti,float vitezaDeAcceleratie )
	{
		this.vitezaMax = vitezaMax;
		this.rataConsumCombustibil = rataConsumCombustibil;
		this.timpViataRoti =timpViataRoti;
		this.vitezaDeAcceleratie =vitezaDeAcceleratie;
	}
	
	public int getVitexaMax()
	{
		return vitezaMax;
		
	}
	public void setVitezaMax( int vitezaMax)
	{
		this.vitezaMax = vitezaMax;
	}
	
	
	public float getRataConsumCombustibil()
	{
		return rataConsumCombustibil;
	}
	public void setRataConsumCombustibil(float rataConsumCombustibil)
	{
		this.rataConsumCombustibil = rataConsumCombustibil;
	}
	
	
	public float getTimpViataRoti()
	{
		return timpViataRoti;
	}
	public void getTimpViataRoti(float timpViataRoti)
	{
		this.timpViataRoti = timpViataRoti;
	}
	
	public float getVitezaDeAcceleratie()
	{
		return vitezaDeAcceleratie;
		
	}
	public void setVitezaDeAcceleratie(float vitezaDeAcceleratie)
	{
		this.vitezaDeAcceleratie = vitezaDeAcceleratie;
	}
	
	public String toString() {
		
		
		return "Masina are urmatoarele caracteristici:" + vitezaMax +"," + rataConsumCombustibil+"," + timpViataRoti + "," + vitezaDeAcceleratie + ".";
		
	}
	
}
	


