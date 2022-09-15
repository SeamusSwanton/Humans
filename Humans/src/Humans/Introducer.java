package Humans;

public class Introducer {

	public String createPublicIntroduction(Human person) {
		String introduction = String.format("I am pleased to introduce %s %s.",
				person.getFirstName(), person.getLastName());
		if(person instanceof Adult) {
			introduction = introduction + String.format(" %s works at %s and their occupation is %s.",
					(person).getGender(), ((Adult) person).getPlaceOfWork(), ((Adult) person).getOccupation()); 
		}
		if(person instanceof Youth) {
			introduction = introduction + String.format(" %s goes to %s and is in grade %d.",
					(person).getGender(), ((Youth) person).getSchoolName(), ((Youth) person).getSchoolGrade());
			if(person instanceof WilliamAberhartStudent) {
				introduction = introduction + String.format(" %s belongs to %s's homeroom, which is in room %d.",
						(person).getGender(), ((WilliamAberhartStudent) person).getHomeRoomTeacher(),
						((WilliamAberhartStudent) person).getHomeRoom());
			}
		}
		return introduction;
	}

}
