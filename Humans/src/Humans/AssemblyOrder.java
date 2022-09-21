package Humans;

import java.util.Comparator;

public class AssemblyOrder implements Comparator<Human>  {
	
	 private int rankOfHuman(Human h) {
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

	@Override
	public int compare(Human o1, Human o2) {
		if (rankOfHuman(o1) > rankOfHuman(o2)) {
			return -1;
		}
		if (rankOfHuman(o1) < rankOfHuman(o2)) {
			return 1;
		}
		else {
		return 0;
		}
	}

}
