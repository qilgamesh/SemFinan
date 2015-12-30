package model;

/**
 * @author Andrey Semenyuk
 */
public class Expense implements java.io.Serializable {

	int uid;
	String name;
	float sum;

	public Expense(int uid, String name) {
		this(uid, name, 0);
	}

	public Expense(int uid, String name, float sum) {
		this.uid = uid;
		this.name = name;
		this.sum = sum;
	}
}
