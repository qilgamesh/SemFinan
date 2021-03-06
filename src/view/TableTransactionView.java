package view;

import javafx.geometry.Insets;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.Pane;
import model.Model;
import model.Transaction;
import model.sfTableModel;

import java.util.Collection;

/**
 * @author Andrey Semenyuk
 */
public class TableTransactionView extends sfTableView<Transaction> {
	private final TableView viewer;

	public TableTransactionView(Pane pane) {
		viewer = new TableView();
		viewer.setEditable(true);

		final TableColumn dayCol = new TableColumn<Transaction, Object>("День");
		dayCol.setMinWidth(10);

		TableColumn nameCol = new TableColumn("Наименование");
		nameCol.setMinWidth(150);

		TableColumn sumCol = new TableColumn("Сумма");
		sumCol.setMinWidth(50);

		viewer.getColumns().addAll(dayCol, nameCol, sumCol);
		viewer.getItems().add(new Transaction("Начальный остаток", 1f));
		viewer.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

		pane.setPadding(new Insets(10, 10, 10, 10));
		pane.getChildren().add(viewer);

	}

	@Override
	public void setModel(sfTableModel<Transaction> model) {
		super.setModel(model);
	}

	@Override
	public void modelChanged(Model<Collection<Model<Transaction>>> model) {
		viewer.refresh();
	}
}
