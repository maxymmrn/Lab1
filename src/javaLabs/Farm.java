package javaLabs;

public class Farm {
	public String location;
	public int animalAmount;
	public int fanPower;
	
	private int income;
	private String name;
	
	public static int farmAmount = 0;
	
	protected int harvest;
	protected int alarmCode;
	
	public Farm() {
		farmAmount++;
	}
	
	public Farm(String name, String location, int income, int animalAmount) {
		this.name = name;
		this.location = location;
		this.income = income;
		this.animalAmount = animalAmount;
		farmAmount++;
	}
	
	public Farm(String name, String location, int income, int animalAmount, int fanPower) {
		this(name, location, income, animalAmount);
		this.fanPower = fanPower;
	}
	
	public void resetValues(String name, String location, int income, int animalAmount, int fanPower, int alarmCode, int harvest) {
		this.name = name;
		this.location = location;
		this.income = income;
		this.animalAmount = animalAmount;
		this.fanPower = fanPower;
		this.alarmCode = alarmCode;
		this.harvest = harvest;
	}
	
	@Override
	public String toString() {
		System.out.println("Info:");
		System.out.println("Farm: " + name);
		System.out.println("Location: " + location);
		System.out.println("Amount of animals: " + animalAmount);
		System.out.println("Fan's power: " + fanPower + " W");
		System.out.println("Income per year: " + income + "$");
		System.out.println("Harvest in this year: " + harvest + " kg");
		System.out.println("");
		return super.toString();
	}
	
	
	public static void printStaticFarmAmount() {
		System.out.println("We have " + farmAmount + " farms");
	}
	
	public void printFarmAmount() {
		System.out.println("We have " + farmAmount + " farms");
	}
	
	public int getIncome() {
		return income;
	}
	
	public void setIncome(int income) {
		this.income = income;
	}
	
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
