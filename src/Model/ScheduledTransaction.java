package Model;

/**
 * Created by Semenyuk Andrey on 28.12.15.
 */
public class ScheduledTransaction extends Transaction {
	boolean repeat = true;

	public ScheduledTransaction(String date, String name, double sum, boolean repeat) {
		super(date, name, sum);
		this.repeat = repeat;
	}

	public boolean isRepeat() {
		return repeat;
	}
}
