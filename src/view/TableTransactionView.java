package view;

import javafx.geometry.Insets;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.Pane;
import model.Model;
import model.Transaction;

import java.util.Collection;

/**
 * @author Andrey Semenyuk
 */
public class TableTransactionView extends sfTableView<Transaction> {
	private final TableView viewer;

	public TableTransactionView(Pane pane) {
		viewer = new TableView();
		pane.setPadding(new Insets(0, 10, 0, 10));

		viewer.setEditable(true);

		final TableColumn uidCol = new TableColumn<Transaction, Object>("День");
		uidCol.setMinWidth(10);

		TableColumn nameCol = new TableColumn("Наименование");
		nameCol.setMinWidth(150);

		TableColumn sumCol = new TableColumn("Сумма");
		sumCol.setMinWidth(50);

		viewer.getColumns().addAll(uidCol, nameCol, sumCol);
		viewer.getItems().add(new Transaction("Начальный остаток", 1f));

		viewer.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

	}

	@Override
	public void modelChanged(Model<Collection<Model<Transaction>>> model) {
		viewer.refresh();
	}
}
