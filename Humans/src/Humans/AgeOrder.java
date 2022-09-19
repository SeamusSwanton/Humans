package Humans;

public class AgeOrder implements Comparable<Human>{
static int age = 0;
	
	public int compareTo(Human human) {
		
		int compareQuantity = ((Human) human).calculateCurrentAgeInYears(); 
		

		this.age = compareQuantity - human.calculateCurrentAgeInYears();
		return age;
		
	}
	

}
