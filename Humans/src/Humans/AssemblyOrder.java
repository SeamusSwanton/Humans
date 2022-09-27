package Humans;


import java.util.Arrays;
import java.util.Comparator;

public class AssemblyOrder implements Comparator<Human>  {

	

	private static int rankOfHuman(Human h) {
		int x = 0;
		if(h.getClass() == WilliamAberhartStudent.class) {
			x = 3;
		}
		else if(h.getClass() == Youth.class) {
			x = 2;
		}
		else if(h.getClass() == Adult.class) {
			x = 1;
		}

		return x;		 
	}

	public int compare(Human o1, Human o2) {
		
		if (rankOfHuman(o1) > rankOfHuman(o2)) {
			return -1;
		}
		if (rankOfHuman(o1) < rankOfHuman(o2)) {
			return 1;
		}
		else {
			if(o1.getLastName().compareTo(o2.getLastName()) == 0) {
				return o1.getFirstName().compareTo(o2.getFirstName());
			}
			else {
				return  o1.getLastName().compareTo(o2.getLastName());
			}
		}
	}

}
