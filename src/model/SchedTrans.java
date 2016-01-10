package model;

/**
 * @author Andrey Semenyuk
 */
public class SchedTrans extends Transaction {
	boolean repeat;

	public SchedTrans(String date, String name, double sum) {
		this(date, name, sum, false);
	}

	public SchedTrans(String date, String name, double sum, boolean repeat) {
		super(date, name, sum);
		this.repeat = repeat;
	}

	public boolean isRepeat() {
		return repeat;
	}
}
