package control;


import java.io.*;
import java.util.ArrayList;

/**
 * Created by Semenyuk Andrey on 22.12.15.
 */
public class Load {

	private static Object load (String fileName) {

		FileInputStream fIn = null;
		ObjectInputStream oIn = null;
		Object obj = null;
		try {
			fIn = new FileInputStream(fileName);
			oIn = new ObjectInputStream(fIn);
			obj = oIn.readObject();
			Log.log("Данные успешно загружены");
		} catch (FileNotFoundException e) {
			Log.log("Ошибка: файл " + fileName + " не существует");
			return 1;
		} catch (SecurityException e) {
			Log.log("Ошибка: файл " + fileName + " не доступен для чтения");
			return 2;
		} catch (ClassNotFoundException | IOException e1) {
			Log.log("Ошибка загрузки");
			e1.printStackTrace();
			return 3;
		}
		return obj;
	}

	public static ArrayList loadCompTrans () {
		Log.log("Загразка списка транзакций");

		Object obj = load("comptrans.db");
		if ((Integer) obj == 1) {
			CreateDB.createCompleteTransactionDB();
			obj = load("comptrans.db");
		} else if (obj == null) {
			Log.log("Ошибка загрузки (obj=null)");
		}
		return (ArrayList) obj;
	}

}
