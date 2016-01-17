package controller;

import javafx.collections.FXCollections;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import model.Transaction;
import view.MainApp;

/**
 *
 * @author Andrey Semenyuk
 */
public class TransactionOverviewController {
	private TableView<Transaction> transactionTable;
	private TableColumn<Transaction, String> titleNameColumn = new TableColumn<>("title");
	private TableColumn<Transaction, String> sumNameColumn = new TableColumn<>("sum");

	private MainApp mainApp;

	/**
	 * The constructor.
	 * The constructor is called before the initialize() method.
	 */
	public TransactionOverviewController() {
		transactionTable = new TableView<>();
		transactionTable.setItems(FXCollections.observableArrayList(new Transaction("Начальный остаток", 1000)));
	}

	/**
	 * Initializes the controller class. This method is automatically called
	 * after form loaded.
	 */
	private void initialize() {
		// Initialize the person table with the two columns.
		titleNameColumn.setCellValueFactory(cellData -> cellData.getValue().titleProperty());
		sumNameColumn.setCellValueFactory(cellData -> cellData.getValue().sumProperty());
	}

	/**
	 * Is called by the main application to give a reference back to itself.
	 *
	 * @param mainApp
	 */
	public void setMainApp(MainApp mainApp) {
		this.mainApp = mainApp;

		// Add observable list data to the table
		transactionTable.setItems(mainApp.getTransactionData());
	}


}
