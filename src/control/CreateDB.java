package control;

import Model.CompTrans;
import Model.Income;

import java.util.ArrayList;
import java.util.LinkedHashSet;

/**
 * Created by Semenyuk Andrey on 23.12.15.
 */
public class CreateDB {

	public static void createIncomesDB() {
		Income inc = new Income(0, "Другие");
		LinkedHashSet<Income> incs = new LinkedHashSet<Income>();
		incs.add(inc);
		Save.saveIncomes(incs);
	}

	public static void createCompleteTransactionDB() {
		CompTrans compTrans = new CompTrans("Начальный остаток", 0);
		ArrayList<CompTrans> compTranses = new ArrayList<CompTrans>();
		compTranses.add(compTrans);
		Save.saveCompleteTransactions(compTranses);
	}

}

