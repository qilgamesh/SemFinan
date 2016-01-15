package model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * @author Andrey Semenyuk
 */
public class CompTrans extends Transaction implements Serializable {
	ArrayList<Integer> uidList;

	public CompTrans(String n, double s) {
		super(n, s);
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

	public double balance(ArrayList<CompTrans> complTransactions) {
		double bal = sum;
		int tmpIndex = 0;
		for (int i = 0; i < uidListSize(); i++)
			bal -= complTransactions.get(uidList.get(i)).getSum();
		return bal;
	}

}
