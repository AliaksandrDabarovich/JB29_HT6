package by.ad.les09_5;
// организовывайте, пожалуйста, код.
// несколько задач в одном пакете похожи на кашу и разобрать что и где не легко


public class Count {
private int var;// выравнивайте код, это важно

public Count (int _var) {
	var = _var;// используйте ссылку this в таких случаях
}

public Count () {
	var = 0;
}

public int add () {
	return var++;
}

public int rem () {
	return var--;
}

public int getVar() {
	return var;
}

public void setVar(int var) {
	this.var = var;
}

@Override
public String toString() {
	return "Count [var=" + var + "]";
}

//equals, hashCode? - мы разбирали где и когда нужно переопределять данные методы


}
