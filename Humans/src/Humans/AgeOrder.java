package Humans;

import java.util.Comparator;

public class AgeOrder implements Comparator<Human>{

	@Override
	public int compare(Human o1, Human o2) {
		return o1.compareTo(o2);
	}



}
