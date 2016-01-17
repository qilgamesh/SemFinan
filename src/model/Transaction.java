package model;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import java.io.Serializable;

/**
 * Model class for a Transaction
 *
 * @author Andrey Semenyuk
 */
public class Transaction implements Serializable {
	private final BooleanProperty planned;
	private final StringProperty title;
	private final StringProperty sum;

	/**
	 * Constructor with some initial data.
	 *  @param title
	 * @param sum 
	 */
	public Transaction(String title, double sum) {
		this(title, sum, false);
	}

	/**
	 * Constructor with some initial data.
	 *
	 * @param title
	 * @param sum
	 * @param planned
	 */
	public Transaction(String title, double sum, boolean planned) {
		this.title = new SimpleStringProperty(title);
		this.sum = new SimpleStringProperty(String.valueOf(sum));
		this.planned = new SimpleBooleanProperty(planned);
	}

	public void setPlanned(boolean planned) {
		this.planned.set(planned);
	}

	public boolean getPlanned() {
		return planned.get();
	}

	public BooleanProperty plannedProperty() {
		return planned;
	}

	public void setName(String name) {
		this.title.set(name);
	}

	public String getName() {
		return title.get();
	}

	public StringProperty titleProperty() {
		return title;
	}

	public void setSum(double sum) {
		this.sum.set(String.valueOf(sum));
	}

	public double getSum() {
		return Double.valueOf(sum.get());
	}

	public StringProperty sumProperty() {
		return sum;
	}


}


