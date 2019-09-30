package by.ad.les09_3;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

/*
 * 3. Создайте класс с именем Student, содержащий поля: фамилия и 
 * инициалы, номер группы, успеваемость (массив из пяти элементов). 
 * Создайте массив из десяти элементов такого типа. Добавьте возможность 
 * вывода фамилий и номеров групп студентов, имеющих оценки, равные только 9 или 10. 
 */
public class Task03 {

	public static void main(String[] args) {
		Student st1 = new Student("Dabarovich", 11);
		Student st2 = new Student("Dabarovich2", 22);
		Student st3 = new Student("Dabarovich3", 33);
		Student st4 = new Student("Dabarovich4", 44);
		Student st5 = new Student("Dabarovich5", 55);
		Student st6 = new Student("Dabarovich6", 11);
		Student st7 = new Student("Dabarovich7", 22);
		Student st8 = new Student("Dabarovich8", 33);
		Student st9 = new Student("Dabarovich9", 44);
		Student st10 = new Student("Dabarovich10", 55);
		StudentList list1 = new StudentList();

		list1.add(st1);
		list1.add(st2);
		list1.add(st3);
		list1.add(st4);
		list1.add(st5);
		list1.add(st6);
		list1.add(st7);
		list1.add(st8);
		list1.add(st9);
		list1.add(st10);

		System.out.println(list1);

		List <Student> list2 = new ArrayList<>();
		list2 = list1.getSt();
		otlich(list2);

	}

	public static void otlich(List<Student> list2) {
		Student st6;
		int[] marks;
		boolean boo;

		for (int i = 0; i < list2.size(); i++) {
			st6 = list2.get(i);
			marks = st6.getMarks();
			boo = false;
			for (int j = 0; j < marks.length; j++) {
				if (marks[j] > 8) {
					boo = true;

				} else {
					boo = false;
					break;
				}
			}
			if (boo == true) {
				System.out.println("----------------------" + "\n" + st6.getFio() + "\t" + st6.getNum());
			}

		}

	}

}
