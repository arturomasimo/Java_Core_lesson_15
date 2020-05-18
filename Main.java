package lession15;

/**
 * The Main class to work Map
 * @author ARTUR
 * @since JDK 13.0.2
 */
import java.util.Scanner;

public class Main {

public static void main(String[] args) {

		ZooClub zooClub = new ZooClub();
		String st, st1;

		while (true) {
			printMenu();
			st = new Scanner(System.in).nextLine();
			switch (st) {
			case "1": { // add додати учасника клубу
				System.out.print("Введіть (через пробіл) Імя та Вік учасника: ");
				st = new Scanner(System.in).nextLine();
				String[] s = st.split(" ");

				if (!zooClub.addUser(new Person(s[0], Integer.parseInt(s[1])))) {
					System.out.println(
							"Помилка додавання учасника клубу " + st + " Скоріше за все такий учасник уже існує!");
				} else {
					System.out.println("Учасник " + st + " успішно доданий!");
				}
				break;
			} // of 1
			case "2": { // додати тварину до учасника клубу
				System.out.print("Введіть Імя учасника клубу ");
				st = new Scanner(System.in).nextLine();
				System.out.print("Введіть (через пробіл) Тип та Імя тварини  ");
				st1 = new Scanner(System.in).nextLine();
				String[] s = st1.split(" ");
				if (!zooClub.addAnimal(st, new Animal(s[0], s[1]))) {
					System.out.println("Помилка додавання тварини до учасника клубу " + st
							+ " Скоріше за все учасника не знайдено!");
				} else {
					System.out.println("Тварина " + st1 + " успішно додана учаснику " + st);
				}
				break;
			} // if 2
			case "3": { // видалити тварину з учасника клубу
				System.out.print("Введіть (через пробіл) Імя учасника клубу та Імя тварини: ");
				st = new Scanner(System.in).nextLine();
				String[] s = st.split(" ");

				if (!zooClub.deleteAnimal(s[0], s[1])) {
					System.out.println("Помилка видалення тварини " + s[1] + " учасника " + s[0]
							+ " скоріш за все помилковий ввід імен");
				} else {
					System.out.println("Тварина " + s[1] + " успішно видалена в учасника " + s[0]);
				}
				break;
			} // of 3
			case "4": { // видалити учасника з клубу
				System.out.print("Введіть Імя учасника клубу: ");
				st = new Scanner(System.in).nextLine();
				if (!zooClub.deletePerson(st)) {
					System.out.println("Помилка видалення учасника " + st + " .Скоріш за все такого учасника немає");
				} else {
					System.out.println("Учасник " + st + " успішно видалений з клубу");
				}
				break;
			} // of 4
			case "5": { // видалити конкретну тваринку зі всіх власників
				System.out.print("Введіть Імя тварини: ");
				st = new Scanner(System.in).nextLine();
				if (!zooClub.deleteAllAnimal(st)) {
					System.out.println("Помилка видалення тварини " + st + " скоріш за все помилковий ввід імен");
				} else {
					System.out.println("Тварина " + st + " успішно видалена ");
				}

				break;
			} // of 5
			case "6": { // надрукувати зооклуб
				zooClub.printAll();
				break;
			} // of 6
			case "0": { // exit
				System.exit(0);
			} // of 0

			}// of case
		} // of while

	}
	// print menu
	private static void printMenu() {
		System.out.println("Введіть 1  щоб додати учасника клубу");
		System.out.println("Введіть 2  щоб додати тварину до учасника клубу");
		System.out.println("Введіть 3  щоб видалити тварину з учасника клубу");
		System.out.println("Введіть 4  щоб видалити учасника з клубу");
		System.out.println("Введіть 5  щоб видалити конкретну тваринку зі всіх власників");
		System.out.println("Введіть 6  щоб надрукувати зооклуб");
		System.out.println("Введіть 0  щоб вийти з програми");
	}
}
