package Humans;

public class WilliamAberhartStudent extends Youth{
int homeRoom;
String homeRoomTeacher;
String schoolName;

	public WilliamAberhartStudent(int birthYear, int birthMonth, int birthDay, String firstName, String lastName,
			Gender gender, int grade, int homeRoom, String homeRoomTeacher) {
		super(birthYear, birthMonth, birthDay, firstName, lastName, gender, grade, homeRoomTeacher);
		this.homeRoom = homeRoom;
		this.homeRoomTeacher = homeRoomTeacher;
	}
	

	public String getSchoolName() {
		return "William Aberhart High School";
	}
	public String getHomeRoomTeacher() {
		return homeRoomTeacher;
	}
	public int getHomeRoom() {
		return homeRoom;
	}
}
