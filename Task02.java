package by.ad.les09_2;

/*
 * 2. Создйте класс Test2 двумя переменными. 
 * Добавьте конструктор с входными параметрами. 
 * Добавьте конструктор, инициализирующий члены класса по умолчанию. 
 * Добавьте set- и get- методы для полей экземпляра класса. 
 
 */
public class Task02 {

	
	public static void main (String [] args) {
		Test2 ob1 = new Test2();
		Test2 ob2 = new Test2(5,7);
		
		ob1.setA(1);
		ob1.setB(3);
		
		
		System.out.println(ob1.getA()); 
		System.out.println(ob1.getB()); 
		System.out.println(ob2.getA()); 
		System.out.println(ob2.getB()); 
	}
	
	
	
}
