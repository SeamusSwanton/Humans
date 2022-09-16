package Humans;

import java.time.LocalDate;
import java.time.Period;
import java.util.Comparator;

public class Human {
	
public static final Comparator<Human> AGE_ORDER = null;
public static final Comparator<Human> ASSEMBLY_ORDER = null;
public static final Comparator<Human> NAME_ORDER = null;
private final int birthYear;
private final int birthMonth;
private final int birthDay;

String firstName;
String lastName;

Gender gender;



	public Human(int birthYear, int birthMonth, int birthDay, String firstName, String lastName,
			Gender gender) {
		this.birthYear = birthYear;
		this.birthMonth = birthMonth;
		this.birthDay = birthDay;
		
		this.firstName = firstName;
		this.lastName = lastName;
		
		this.gender = gender;
	}
	
	public String getGender() {
		String pronoun = "";
		if (gender == (gender.MALE)) {
			pronoun = "He";
		}
		else if (gender == (gender.FEMALE)) {
			pronoun = "She";
		}
		else {
			pronoun = "They";
		}
		return pronoun;
	}
	
	public int getBirthYear() {
		return birthYear;
	}
	public int getBirthMonth() {
		return birthMonth;
	}
	public int getBirthDay() {
		return birthDay;
	}


	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;		
	}
	

	
	public int calculateCurrentAgeInYears() {
		LocalDate now = LocalDate.now();
		LocalDate birthday = LocalDate.of(this.birthYear, this.birthMonth, this.birthDay); 
		int period = Period.between(birthday, now).getYears();  		
		
		return period;
	}

	

}
