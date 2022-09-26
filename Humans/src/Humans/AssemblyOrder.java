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
		Human[] names = {o1, o2};
		Arrays.sort(names.length);
		if (rankOfHuman(names[0]) > rankOfHuman(names[1])) {
			return -1;
		}
		if (rankOfHuman(names[0]) < rankOfHuman(names[1])) {
			return 1;
		}
		else {
			return 0;
		}
	}

}
