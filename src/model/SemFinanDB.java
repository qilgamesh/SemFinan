package model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * @author Andrey Semenyuk
 */
public class SemFinanDB implements Serializable {
	public ArrayList<Transaction> doneTransactions;
	public ArrayList<Transaction> scheduledTransactions;

	public SemFinanDB() {
		doneTransactions = new ArrayList<>();
		scheduledTransactions = new ArrayList<>();
	}


}
