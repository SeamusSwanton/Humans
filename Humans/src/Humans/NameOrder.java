package Humans;

import java.util.Comparator;

public class NameOrder implements Comparator<Human> {

	public int compare(Human o1, Human o2) {
		if(o1.getLastName().compareTo(o2.getLastName()) == 0) {
			return o1.getFirstName().compareTo(o2.getFirstName());
		}
		else {
			return  o1.getLastName().compareTo(o2.getLastName());
		}
		
	}

}
