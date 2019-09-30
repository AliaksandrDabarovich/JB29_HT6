package by.ad.les09_5;
/*
 * 5. Опишите класс, реализующий десятичный счетчик, который 
 * может увеличивать или уменьшать свое значение на единицу 
 * в заданном диапазоне. Предусмотрите инициализацию счетчика 
 * значениями по умолчанию и произвольными значениями. 
 * Счетчик имеет методы увеличения и уменьшения состояния, и 
 * метод позволяющее получить его текущее состояние.
 *  Написать код, демонстрирующий все возможности класса.
 */
public class Task05 {

	public static void main(String[] args) {
		
		Count count1 = new Count();
		Count count2 = new Count (15);
		
		System.out.println("count1: "+ count1);
		System.out.println("count2: "+ count2);
		
		count1.add();
		count2.rem();
		
		System.out.println(count1.getVar());
		System.out.println(count2.getVar());
		
		
	}

}
