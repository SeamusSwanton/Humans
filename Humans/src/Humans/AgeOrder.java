package Humans;

import java.util.Comparator;

public class AgeOrder implements HumanInterface{
public Comparator<Human> ageOrder = null;
	
	@Override
	public Comparator<Human> compareTo(Object o) {
		return ageOrder;
	}

}
