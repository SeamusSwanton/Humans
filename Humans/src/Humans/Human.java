package Humans;

import java.time.LocalDate;
import java.time.Period;
import java.util.Comparator;

public class Human implements Comparable<Human> {
	

public static final Comparator<Human> AGE_ORDER = new AgeOrder();
public static final Comparator<Human> ASSEMBLY_ORDER = new AssemblyOrder();
public static final Comparator<Human> NAME_ORDER = new NameOrder();
private final int birthYear;
private final int birthMonth;
private final int birthDay;
private int age;

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
	public int getAgeInYears() {
		return age;
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
		age = Period.between(birthday, now).getYears();  				
		return age;
	}
	
	public int calculateCurrentAgeInMonths() {
		LocalDate now = LocalDate.now();
		LocalDate birthday = LocalDate.of(this.birthYear, this.birthMonth, this.birthDay); 
		return Period.between(birthday, now).getMonths();  		
	}
	
	public int calculateCurrentAgeInDays() {
		LocalDate now = LocalDate.now();
		LocalDate birthday = LocalDate.of(this.birthYear, this.birthMonth, this.birthDay); 
		return Period.between(birthday, now).getDays();  		
	}
	
	
	public int compareTo(Human o) {
		int x = 0;
		if(this.calculateCurrentAgeInYears() == o.calculateCurrentAgeInYears() ) {
			if(this.calculateCurrentAgeInMonths() == o.calculateCurrentAgeInMonths() ) {
				x = Integer.compare(o.calculateCurrentAgeInDays(), this.calculateCurrentAgeInDays());
			}
			else {
				x = Integer.compare(o.calculateCurrentAgeInMonths(), this.calculateCurrentAgeInMonths());
			}
		}
		else {
			x = Integer.compare(o.calculateCurrentAgeInYears(), this.calculateCurrentAgeInYears());
		}
		return x;
	}

	

}
