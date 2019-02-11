package javaLabs;

public class Farm {

	public String location = "NoData";
	public int animalNumber;
	public int fanPower;

	public static int farmAmount = 0;

	protected int harvest;
	protected int alarmCode = 1111;

	private int income;
	private String name = "NoData";

	public Farm(String name, String location, int income, int animalNumber, int fanPower) {
		this.name = name;
		this.location = location;
		this.income = income;
		this.animalNumber = animalNumber;
		this.fanPower = fanPower;
		farmAmount++;
	}

	public Farm(String name, String location, int income, int animalNumber) {
		this(name, location, income, animalNumber, 0);
	}

	public Farm() {
		this("NoData", "NoData", 0, 0);
	}

	public void resetValues(String name, String location, int income, int animalNumber, int fanPower, int alarmCode, int harvest) {
		this.name = name;
		this.location = location;
		this.income = income;
		this.animalNumber = animalNumber;
		this.fanPower = fanPower;
		this.alarmCode = alarmCode;
		this.harvest = harvest;
	}

	@Override
	public String toString() {
		return "Farm name: " + name + 
				"\nNumber of animals: " + animalNumber + 
				"\nFan power: " + fanPower +
				"\nIncome: " + income + 
				"\nLocation:" + location + 
				"\nHarvest: " + harvest + 
				"\nAlarm code: " + alarmCode + "\n";
	}

	public static void printStaticFarmAmount() {
		System.out.println("We have " + farmAmount + " farms");
	}

	public void printFarmAmount() {
		System.out.println("We have " + farmAmount + " farms");
	}

	public int getHarvest() {
		return harvest;
	}

	public void setHarvest(int harvest) {
		this.harvest = harvest;
	}

	public int getAlarmCode() {
		return alarmCode;
	}

	public void setAlarmCode(int alarmCode) {
		this.alarmCode = alarmCode;
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
