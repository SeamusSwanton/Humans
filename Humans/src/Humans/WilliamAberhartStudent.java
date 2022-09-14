package Humans;

public class WilliamAberhartStudent extends Youth{
int homeRoom;
String homeRoomTeacher;
String schoolName;

	public WilliamAberhartStudent(int birthYear, int birthMonth, int birthDay, String firstName, String lastName,
			Gender gender, int grade, int homeRoom, String schoolName) {
		super(birthYear, birthMonth, birthDay, firstName, lastName, gender, grade, schoolName);
		
	}
	

	public String getSchoolName() {
		return "William Aberhart High School";
	}

}
