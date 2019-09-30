package by.ad.les09_5;

public class Count {
private int var;

public Count (int _var) {
	var = _var;
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




}
