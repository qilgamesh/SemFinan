package controller;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Semenyuk Andrey on 23.12.15.
 */

public class Log {

	public static void toConsole(String s) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yy HH:mm:ss");
		Date d = new Date();
		System.out.println(sdf.format(d) + " " + s);
	}
}
