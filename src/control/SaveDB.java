package control;

import Model.CompTrans;
import Model.SFDB;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Created by Semenyuk Andrey on 22.12.15.
 */
public class SaveDB {
	static String fileName = "semfinan.db";

	static SFDB createNewDB() {
		CompTrans compTrans = new CompTrans("Начальный остаток", 0);
		SFDB sfdb = new SFDB();
		sfdb.compTranses.add(compTrans);
		return sfdb;
	}

	SaveDB() {
		this(createNewDB());
	}

	SaveDB (SFDB sfdb) {
		FileOutputStream fOut = null;
		ObjectOutputStream oOut = null;
		try {
			fOut = new FileOutputStream(fileName);
			oOut = new ObjectOutputStream(fOut);
			oOut.writeObject(sfdb);
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
}
