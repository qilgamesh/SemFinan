package model;

/**
 * @author Andrey Semenyuk
 */
public class SchedTrans extends Transaction {
	boolean repeat = true;

	public SchedTrans(String date, String name, double sum, boolean repeat) {
		super(date, name, sum);
		this.repeat = repeat;
	}

	public boolean isRepeat() {
		return repeat;
	}
}
