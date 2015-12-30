package controller;


import model.SemFinanDB;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @author Andrey Semenyuk
 */
public class LoadDB {
	static String fileName = "data/semfinan.db";

	public static SemFinanDB loadDB() {
		Log.toConsole("Загрузка БД из файла");
		FileInputStream fIn = null;
		ObjectInputStream oIn = null;
		SemFinanDB obj = null;
		try {
			fIn = new FileInputStream(fileName);
			oIn = new ObjectInputStream(fIn);
			obj = (SemFinanDB) oIn.readObject();
			Log.toConsole("БД успешно загружена");
		} catch (FileNotFoundException e) {
			Log.toConsole("Файл БД " + fileName + " не существует или ошибка доступа");
		} catch (IOException e) {
			Log.toConsole("Ошибка загрузки БД из файла: нет доступа на чтение");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			Log.toConsole("Ошибка загрузки БД из файла (вероятно, что файл или данные повреждены)");
			e.printStackTrace();
		}

		if (obj == null) {
			Log.toConsole("Создание новой БД");
			new SaveDB();
			return SaveDB.createNewDB();
		} else
			return obj;
	}

}
