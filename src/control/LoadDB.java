package control;


import Model.SFDB;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by Semenyuk Andrey on 22.12.15.
 */
public class LoadDB {
	static String fileName = "semfinan.db";

	public static SFDB loadDB() {
		FileInputStream fIn = null;
		ObjectInputStream oIn = null;
		SFDB obj = new SFDB();
		try {
			fIn = new FileInputStream(fileName);
			oIn = new ObjectInputStream(fIn);
			obj = (SFDB) oIn.readObject();
			Log.log("Данные успешно загружены");
		} catch (FileNotFoundException e) {
			Log.log("Ошибка: файл " + fileName + " не существует");
		} catch (SecurityException e) {
			Log.log("Ошибка: файл " + fileName + " не доступен для чтения");
		} catch (ClassNotFoundException | IOException e1) {
			Logger.getLogger(LoadDB.class.getName()).log(Level.SEVERE, null, e1);
			Log.log("Ошибка загрузки");
			e1.printStackTrace();
		}
		if (obj == null) {
			new SaveDB();
			return SaveDB.createNewDB();
		} else return obj;
	}

}
