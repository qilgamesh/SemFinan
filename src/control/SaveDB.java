package control;

import Model.CompTrans;
import Model.SemFinanDB;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Created by Semenyuk Andrey on 22.12.15.
 */
public class SaveDB {
	static String fileName = "semfinan.db";

	static SemFinanDB createNewDB() {
		CompTrans compTrans = new CompTrans("Начальный остаток", 1);
		SemFinanDB semFinanDB = new SemFinanDB();
		semFinanDB.cTrans.add(compTrans);
		return semFinanDB;
	}

	SaveDB() {
		this(createNewDB());
	}

	SaveDB(SemFinanDB semFinanDB) {
		FileOutputStream fOut = null;
		ObjectOutputStream oOut = null;
		try {
			fOut = new FileOutputStream(fileName);
			oOut = new ObjectOutputStream(fOut);
			oOut.writeObject(semFinanDB);
			Log.toConsole("БД успешно сохранена в файл");
		} catch (IOException e) {
			try {
				assert oOut != null;
				oOut.flush();
				oOut.close();
				fOut.close();
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
			Log.toConsole("Ошибка сохранения БД");
		}
	}
}
