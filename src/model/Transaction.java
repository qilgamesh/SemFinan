package model;

import java.io.Serializable;

/**
 * Created by Semenyuk Andrey on 21.12.15.
 * Абстрактный класс транзакции
 */
abstract public class Transaction implements Serializable {
	String date;
	String name;
	double sum;

	public Transaction(String date, String name, double sum) {
		setDate(date);
		setName(name);
		setSum(sum);
	}

	public String getDate() {
		return date;
	}

	public String getName() {
		return name;
	}

	public double getSum() {
		return sum;
	}

	public boolean isIncome() {
		return sum > 0;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSum(double sum) {
		this.sum = sum;
	}

}


