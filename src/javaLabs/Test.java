package javaLabs;

public class Test {

	public static void main(String[] args) {
		Farm ukrFarm = new Farm("Nalyvaiko Severyn's Farm", "Ukraine, Kiev", 10000, 300);
		Farm euFarm = new Farm("At Father Gascoigne", "UK, London", 13000, 400, 500);
		
		euFarm.printFarmAmount();
		
		Farm usaFarm = new Farm();
		usaFarm.resetValues("Wild West", "USA, Texas", 8000, 250, 1000, 7495, 900);
		
		Farm.printStaticFarmAmount();
		
		System.out.println();
		
		System.out.println(ukrFarm);
		System.out.println(euFarm);
		System.out.println(usaFarm);
	}

}
