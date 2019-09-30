package by.ad.les09_4;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Comparator;

/*
 * 4. Создайте класс Train, содержащий поля: название 
 * пункта назначения, номер поезда, время отправления. 
 * Создайте данные в массив из пяти элементов типа Train, 
 * добавьте возможность сортировки элементов массива по 
 * номерам поездов. Добавьте возможность вывода информации 
 * о поезде, номер которого введен пользователем. Добавьте 
 * возможность сортировки массив по пункту назначения, причем поезда с одинаковыми 
 * пунктами назначения должны быть упорядочены по времени отправления. 
 */
public class Task04 {

	public static void main(String[] args) {
		Train mas[] = new Train[5];
		Train tr1 = new Train("Brest", 23, 9, 01);
		Train tr2 = new Train("Brest", 11, 9, 02);
		Train tr3 = new Train("Vitebsk", 5, 14,15);
		Train tr4 = new Train("Lodz", 9, 12,16);
		Train tr5 = new Train("Smolevichi", 78, 22,59);

		mas[0] = tr1;
		mas[1] = tr2;
		mas[2] = tr3;
		mas[3] = tr4;
		mas[4] = tr5;

		

		/* System.out.println(Arrays.toString(newMas) + "\n" + tr1.getNum()); */
		/* ret(mas); */
		/*
		 * Train newMas []=new Train[5]; newMas=sortPunkt(mas);
		 */
		Comparator<Train> tr = new Comparator<Train>()
				{
			public int compare(Train a, Train b){
				
				int i = a.getPunkt().compareTo(b.getPunkt());
			    if (i != 0) {return i;}

			    if (a.getTime()>b.getTime()) {
			    	i= 1;
			    	
			    } else  if (a.getTime()<b.getTime()) {
			    	i= -1;
			    	
			    }
			    
			    if (a.getMin()>b.getMin()) {
			    	i= 1;
			    	
			    } else  if (a.getMin()<b.getMin()) {
			    	i= -1;
			    	
			    }
				return i;
			    
			      
		         
		    }
			
			
			
			
				};
		Arrays.sort(mas, tr);

		for (Train t : mas) {
			System.out.println(t);
		}
		

	}

	public static Train[] sort(Train mas[]) {
		Train maxTrain;
		int maxTrainIndex;
		for (int i = 0; i < mas.length - 1; i++) {
			maxTrain = mas[i];
			maxTrainIndex = i;
			for (int j = i + 1; j < mas.length; j++) {
				if (maxTrain.getNum() < mas[j].getNum()) {
					maxTrain = mas[j];
					maxTrainIndex = j;
				}
			}
			Train temp = mas[i];
			mas[i] = maxTrain;
			mas[maxTrainIndex] = temp;

		}
		return mas;
	}

	public static Train[] sortPunkt(Train mas[]) {
		Train maxTrain;
		int maxTrainIndex;
		for (int i = 0; i < mas.length - 1; i++) {
			maxTrain = mas[i];
			maxTrainIndex = i;
			for (int j = i + 1; j < mas.length; j++) {
				if (maxTrain.getPunkt().compareTo(maxTrain.getPunkt()) > 0) {
					maxTrain = mas[j];
					maxTrainIndex = j;
				}
			}
			Train temp = mas[i];
			mas[i] = maxTrain;
			mas[maxTrainIndex] = temp;

		}
		return mas;
	}

	public static void ret(Train mas[]) {
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите номер поезда >");
		while (sc.hasNextInt() == false) {
			sc.next();
			System.out.println("Введите номер поезда >");
		}
		number = sc.nextInt();
		boolean boo;
		boo = false;
		for (int i = 0; i < mas.length; i++) {
			if (number == mas[i].getNum()) {
				System.out.println("Поезд: " + mas[i]);
				boo = true;
			}
		}
		if (boo == false) {
			System.out.println("Номера такого поезда нет!");
		}

	}

}
