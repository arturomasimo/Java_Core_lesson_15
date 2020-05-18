package lession15;

public class Animal {
	private String typAnimal;
	private String nameAnimal;

	public Animal() {
	}

	public Animal(String typAnimal, String nameAnimal) {
		super();
		this.typAnimal = typAnimal;
		this.nameAnimal = nameAnimal;
	}

	@Override
	public String toString() {
		return "Animal [typAnimal=" + typAnimal + ", nameAnimal=" + nameAnimal + "]";
	}

	public String getTypAnimal() {
		return typAnimal;
	}

	public void setTypAnimal(String typAnimal) {
		this.typAnimal = typAnimal;
	}

	public String getNameAnimal() {
		return nameAnimal;
	}

	public void setNameAnimal(String nameAnimal) {
		this.nameAnimal = nameAnimal;
	}

}
