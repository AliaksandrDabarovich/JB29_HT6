package by.ad.les09_3;
import java.util.Random;
import java.util.Arrays;
/*
 * 3. Создайте класс с именем Student, содержащий поля: фамилия и 
 * инициалы, номер группы, успеваемость (массив из пяти элементов). 
 * Создайте массив из десяти элементов такого типа. Добавьте возможность 
 * вывода фамилий и номеров групп студентов, имеющих оценки, равные только 9 или 10. 
 */
public class Student {
	private String fio;
	private int groupNum;
	private int[] marks = new int[5];

	public Student(String _fio, int _groupNum) {

		fio = _fio;
		groupNum = _groupNum;
		Random rand = new Random();
		
		int [] _marks= new int[5];
		for (int i=0; i<_marks.length;i++) {
			
			_marks[i] = rand.nextInt(10);
		}
		marks = _marks;

	}
	
	public int [] getMarks () {
		return marks;
		
	}
	public String getFio () {
		return fio;
		
	}
	public int getNum () {
		return groupNum;
		
	}
	
	

	@Override
	public String toString() {
		return "Student [fio=" + fio + ", groupNum=" + groupNum + ", marks=" + Arrays.toString(marks) + "]";
	}
	
	
	
	
	
	

}
