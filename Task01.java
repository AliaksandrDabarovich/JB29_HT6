package by.ad.les09;
/*
 * 1. Создайте класс Test1 двумя переменными. 
 * Добавьте метод вывода на экран и методы изменения этих переменных. Добавьте метод, который находит сумму значений 
 * этих переменных, и метод, который находит наибольшее значение из этих двух переменных.
 */
public class Task01 {

	public static void main(String[] args) {
		Test1 t1= new Test1 ();
		
		
		t1.setA(5);
		t1.setB(7);
		t1.print();
		t1.sum();
		t1.more();
		
	}

}
