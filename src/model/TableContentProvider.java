package model;


import javafx.scene.control.TableView;

import java.util.Iterator;

/**
 * @author Andrey Semenyuk
 */
public class TableContentProvider<P> {

	public Iterator<Model<P>> getElements(Object inputElement) {
		return ((sfTableModel<P>) inputElement).getProperty().iterator();
	}

	public void dispose() {
	}

	public void inputChanged(TableView tableView, Object oldInput, Object newInput) {

	}
}
