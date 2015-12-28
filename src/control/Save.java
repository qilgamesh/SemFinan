package control;

import Model.CompTrans;
import Model.Income;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/**
 * Created by Semenyuk Andrey on 22.12.15.
 */
public class Save {

	private static void save(Object object, String fileName) {
		FileOutputStream fOut = null;
		ObjectOutputStream oOut = null;
		try {
			fOut = new FileOutputStream(fileName);
			oOut = new ObjectOutputStream(fOut);
			oOut.writeObject(object);
			Log.log("Данные успешно сохранены");
		} catch (IOException e) {
			try {
				assert oOut != null;
				oOut.flush();
				oOut.close();
				fOut.close();
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
			Log.log("Ошибка сохранения");
		}
	}

	public static void saveCompleteTransactions(ArrayList<CompTrans> compTranses) {
		Log.log("Сохрание списка транзакций");
		save(compTranses, "comptrans.db");
	}

	public static void saveIncomes(LinkedHashSet<Income> incomes) {
		Log.log("Сохрание справочника приходов");
		save(incomes, "incomes.db");
	}

}
