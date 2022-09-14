package Humans;

public class Youth extends Human{
int grade = 0;
 String schoolName = "";
	
	public Youth(int birthYear, int birthMonth, int birthDay, String firstName, String lastName,
			Gender gender, int grade, String schoolName) {
		super(birthYear, birthMonth, birthDay, firstName, lastName, gender);
		this.grade = grade;
		this.schoolName = schoolName;
	}

	public Object getSchoolGrade() {
		return grade;
	}

	public String getSchoolName() {
		return schoolName;
	}

}
