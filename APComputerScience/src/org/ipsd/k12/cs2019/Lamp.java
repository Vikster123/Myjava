package org.ipsd.k12.cs2019;

public class Lamp {

	
	private int wattage;
	private String manufacturer;
	private boolean isOn;

	
	public Lamp (int wattage, boolean isOn ,String manufacturer) {
		this.wattage = wattage;
		this.manufacturer = manufacturer;
		this.isOn = isOn;
		
	}
	
	public void flipLight() {
		
	 this.isOn = !isOn;

		
		
	}
	
	public String toString() {
		
		return "Wattage = " + this.wattage + "\n" + "Manufacturer = " + this.manufacturer + "\n"  ;
	}
	
	public static void main(String[] args) {
		Lamp lamp1 = new Lamp (60, true, "Concord");
		System.out.println(lamp1.toString());
	}
}
