package Humans;

public class Introducer {

	public String createPublicIntroduction(Human person) {
		String introduction = String.format("I am pleased to introduce %s %s.",person.getFirstName(), person.getLastName());
		
		
		return introduction;
	}

}
