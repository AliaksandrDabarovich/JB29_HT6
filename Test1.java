package by.ad.les09;

public class Test1 {
	private int a;
	private int b;

	public void setA(int i) {
		a = i;
	}

	public void setB(int j) {
		b = j;
	}

	public int getA() {
		return a;
	}

	public int getB() {
		return b;
	}
	
	public void print () {
		System.out.println("Переменная a: "+a+"\t"+"Переменная b: "+b);
	}
	
	public int sum () {
		return a+b;
	}
	
	public void more () {
		if (a>b) {
			System.out.println("Большее a");
		} else if (b>a) {
			System.out.println("Большее b");
		}
	}

}
