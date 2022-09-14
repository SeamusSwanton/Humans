package Humans;

public class Adult extends Human{
String occupation = "";
String placeOfWork = "";

	public Adult(int birthYear, int birthMonth, int birthDay, String firstName, String lastName,
			Gender gender, String placeOfWork, String occupation) {
		super(birthYear, birthMonth, birthDay, firstName, lastName, gender);
		this.occupation = occupation;
		this.placeOfWork = placeOfWork;
	}

	public String getOccupation() {
		return occupation;
	}

	public String getPlaceOfWork() {
		return placeOfWork;
	}

	

}
