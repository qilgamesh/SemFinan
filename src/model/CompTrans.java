package model;

import java.io.Serializable;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

/**
 * Created by Semenyuk Andrey on 28.12.15.
 */
public class CompTrans extends Transaction implements Serializable {
	ArrayList<Integer> uidList;

	public CompTrans(String n, double s) {
		super("", n, s);
		setDateNow();
	}

	public void addUid(int uid) {
		uidList.add(uid);
	}

	public int uidListSize() {
		return uidList.size();
	}

	public Integer[] getUidList() {
		return (Integer[]) uidList.toArray();
	}

	void setDateNow() {
		Locale local = new Locale("ru", "RU");
		DateFormat df = DateFormat.getDateInstance(DateFormat.DEFAULT, local);
		setDate(df.format(new Date()));
	}

	public double balance(ArrayList<CompTrans> complTransactions) {
		double bal = sum;
		int tmpIndex = 0;
		for (int i = 0; i < uidListSize(); i++) bal -= complTransactions.get(uidList.get(i)).getSum();
		return bal;
	}

}
