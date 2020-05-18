package lession15;

import java.util.ArrayList;
import java.util.List;

public class Person {
	private String namePerson;
	private int agePerson;
	List<Animal> animal = new ArrayList<>();

	public Person(String namePerson, int agePerson) {
		super();
		this.namePerson = namePerson;
		this.agePerson = agePerson;

	}

	public String getNamePerson() {
		return namePerson;
	}

	public void setNamePerson(String namePerson) {
		this.namePerson = namePerson;
	}

	public int getAgePerson() {
		return agePerson;
	}

	public void setAgePerson(int agePerson) {
		this.agePerson = agePerson;
	}

	public List<Animal> getAnimal() {
		return animal;
	}

	public void setAnimal(List<Animal> animal) {
		this.animal = animal;
	}

	@Override
	public String toString() {
		return "Person [namePerson=" + namePerson + ", agePerson=" + agePerson + "]";
	}

}
