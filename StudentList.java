package by.ad.les09_3;
import java.util.List;
import java.util.ArrayList;

public class StudentList {// если в названии использовать List , то уже нужно и интерфефс List реализовывать. Group вполне подошла бы
	private List <Student> stList;

	public StudentList() {
		stList = new ArrayList <Student>();
	}
	
	public void add (Student newSt) {
		stList.add(newSt);
	}
	
	public List <Student> getSt(){// выучите правила java beans, бещ них жить тяжело
		return stList;
	}
	
	
	

	@Override
	public String toString() {
		return "StudentList [stList=" + stList + "]";
	}
	
	/*
	 * public void printSt(){
	 * 
	 * for (int k = 0; k < stList.size(); k++) { System.out.println(stList.get(k));
	 * }
	 * 
	 * 
	 * }
	 */
	
	
}
