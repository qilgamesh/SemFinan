package controller;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Andrey Semenyuk
 */

public class Log {

	public static void toConsole(String s) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yy HH:mm:ss");
		Date d = new Date();
		System.out.println(sdf.format(d) + " " + s);
	}
}
