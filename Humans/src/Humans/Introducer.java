package Humans;

public class Introducer {

	public String createPublicIntroduction(Human person) {
		try {
			String introduction = String.format("I am pleased to introduce %s %s.",
					person.getFirstName(), person.getLastName());
			if(person instanceof Adult) {
				introduction = introduction + String.format(" %s works at %s and their occupation is %s.",
						(person).getGender(), ((Adult) person).getPlaceOfWork(), ((Adult) person).getOccupation()); 
			}
			if(person instanceof Youth) {
				introduction = introduction + String.format(" %s goes to %s and is in grade %d.",
						(person).getGender(), ((Youth) person).getSchoolName(), ((Youth) person).getSchoolGrade());
				if(person instanceof WilliamAberhartStudent &&
						((WilliamAberhartStudent) person).getHomeRoomTeacher() != null) {

					introduction = introduction + String.format(" %s belongs to %s's homeroom, which is in room %d.",
							(person).getGender(), ((WilliamAberhartStudent) person).getHomeRoomTeacher(),
							((WilliamAberhartStudent) person).getHomeRoom());								
				}
				if (person instanceof WilliamAberhartStudent &&( (WilliamAberhartStudent) person).getHomeRoomTeacher() == null) {
					introduction = introduction + (" Their homeroom is unknown at this time.");
				}
			}
			return introduction;
		}
		catch(Exception e) {
			return "This person has issues and can't be introduced.";
		}
	}

}
