package view;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.Transaction;

import java.sql.SQLException;

/**
 * @author Andrey Semenyuk
 */
public class MainApp extends Application {
	/**
	 * The data as an observable list of Transactions.
	 */
	private ObservableList<Transaction> transactionData = FXCollections.observableArrayList();

	/**
	 * Constructor
	 */
	public MainApp() {
		// Add some sample data
		transactionData.add(new Transaction("Доход1", 2000));
		transactionData.add(new Transaction("Доход2", 3000));
		transactionData.add(new Transaction("Доход3", 4000));
		transactionData.add(new Transaction("Доход4", 8000, true));
		transactionData.add(new Transaction("Доход5", 9000, true));
	}

	/**
	 * Returns the data as an observable list of Transactions.
	 * @return
	 */
	public ObservableList<Transaction> getTransactionData() {
		return transactionData;
	}


	@Override
	public void start(Stage primaryStage) throws Exception {
		Scene scene = new Scene(new RootPane());



		primaryStage.setScene(scene);
		primaryStage.setTitle("Test JavaFX");
		primaryStage.show();
	}


	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		launch(args);
	}

}
