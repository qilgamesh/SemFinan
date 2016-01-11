package model;

/**
 * @author Andrey Semenyuk
 */
public class Income {

	int uid;
	String name;
	float sum;

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

	public void setSum(String sum) {
		this.sum = Float.valueOf(sum);
	}

	public void setSum(Float sum) {
		this.sum = sum;
	}
}
