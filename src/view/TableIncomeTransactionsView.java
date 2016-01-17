package view;

import javafx.geometry.Insets;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.GridPane;
import model.Model;
import model.Transaction;
import model.sfTableModel;

import java.util.Collection;

/**
 * @author Andrey Semenyuk
 */
public class TableIncomeTransactionsView extends sfTableView<Transaction>  {
	private final TableView viewer;

	public TableIncomeTransactionsView(GridPane pane) {
		viewer = new TableView();
		viewer.setEditable(true);
		//viewer.setItems((ObservableList) new TableContentProvider<Transaction>());

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
		pane.getChildren().addAll(viewer);
	}

	@Override
	public void setModel(sfTableModel<Transaction> model) {
		super.setModel(model);
		//viewer.set
	}

	@Override
	public void modelChanged(Model<Collection<Model<Transaction>>> model) {
		viewer.refresh();

	}
}
