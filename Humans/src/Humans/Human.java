package Humans;

import java.time.LocalDate;
import java.time.Period;

public class Human {
	
int birthYear;
int birthMonth;
int birthDay;

String firstName;
String lastName;

Gender gender;

LocalDate now = LocalDate.now();
LocalDate birthday = LocalDate.of(birthYear, birthMonth, birthDay);  

	public Human(int birthYear, int birthMonth, int birthDay, String firstName, String lastName,
			Gender gender) {
		this.birthYear = birthYear;
		this.birthMonth = birthMonth;
		this.birthDay = birthDay;
		
		this.firstName = firstName;
		this.lastName = lastName;
		
		this.gender = gender;
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
		Period period = Period.between(birthday, now);  
		
		
		return 0;
	}

}
