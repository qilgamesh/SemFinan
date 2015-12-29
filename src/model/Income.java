package model;

/**
 * Created by Semenyuk Andrey on 22.12.15.
 * Класс описания элемента справочника доходов
 */
public class Income {

	int uid;
	String name;
	float sum;

	public Income(int uid, String name) {
		this(uid, name, 0);
	}

	public Income(int uid, String name, float sum) {
		this.uid = uid;
		this.name = name;
		this.sum = sum;
	}

	public String getUID() {
		return String.valueOf(this.uid);
	}

	public String getName() {
		return this.name;
	}

	public String sumToString() {
		return String.valueOf(this.sum);
	}
}
