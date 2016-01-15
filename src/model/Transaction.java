package model;

import java.io.Serializable;

/**
 * @author Andrey Semenyuk
 */
public class Transaction implements Serializable {
	private boolean planned;
	String name;
	double sum;

	public Transaction(String name, double sum) {
		setName(name);
		setSum(sum);
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setSum(double sum) {
		this.sum = sum;
	}

	public double getSum() {
		return sum;
	}

	public boolean isPlanned() {
		return planned;
	}

	@Override
	public String toString() {
		if (planned)
			return "Запланированная";
		return "Завершённая";
	}

}


