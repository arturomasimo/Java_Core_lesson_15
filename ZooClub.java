package lession15;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ZooClub {
	Map<Person, List<Animal>> map = new HashMap<>();

	public Map<Person, List<Animal>> getMap() {
		return map;
	}

	public void setMap(Map<Person, List<Animal>> map) {
		this.map = map;
	}

	public boolean addUser(Person person) {
		boolean bool = true;
		for (Person person1 : map.keySet()) {
			if (person1.getNamePerson().equalsIgnoreCase(person.getNamePerson())) {
				bool = false;
			}
		}
		if (bool) {
			map.put(person, person.getAnimal());
		}
		return bool;
	}

	public boolean addAnimal(String namePerson, Animal animal1) {
		boolean bool = false;
		for (Person person : map.keySet()) {
			if (person.getNamePerson().equalsIgnoreCase(namePerson)) {
				person.animal.add(animal1);
				bool = true;
			}
		}
		return bool;
	}

	public boolean deleteAnimal(String namePerson, String nameAnimal) {
		boolean bool = false;
		for (Person person : map.keySet()) {
			if (person.getNamePerson().equalsIgnoreCase(namePerson)) {
				Iterator<Animal> pet = person.animal.iterator();
				while (pet.hasNext()) {
					if (pet.next().getNameAnimal().equalsIgnoreCase(nameAnimal)) {
						pet.remove();
						bool = true;
					}
				}
			}
		}
		return bool;
	}

	public boolean deletePerson(String namePerson) {
		boolean bool = false;
		Iterator<Person> iterator = map.keySet().iterator();
		while (iterator.hasNext()) {
			if (iterator.next().getNamePerson().equalsIgnoreCase(namePerson)) {
				iterator.remove();
				bool = true;
			}
		}
		return bool;
	}

	public boolean deleteAllAnimal(String nameAnimal) {
		boolean bool = false;
		for (Person person : map.keySet()) {
			Iterator<Animal> iterator = person.animal.iterator();
			while (iterator.hasNext()) {
				if (iterator.next().getNameAnimal().equalsIgnoreCase(nameAnimal)) {
					iterator.remove();
					bool = true;
				}
			}
		}
		return bool;
	}

	public void printAll() {
		Collection<Map.Entry<Person, List<Animal>>> entrySet = map.entrySet();
		for (Map.Entry<Person, List<Animal>> entry : entrySet) {
			System.out.println(entry.getKey() + "  " + entry.getValue());
		}
	}

}
