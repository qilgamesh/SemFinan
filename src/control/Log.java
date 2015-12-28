package control;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by Semenyuk Andrey on 23.12.15.
 */

public class Log {

	Locale local = new Locale("ru", "RU");

	public static void log(String s) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yy HH:mm:ss");
		Date d = new Date();
		System.out.println(sdf.format(d) + " " + s);
	}
}
