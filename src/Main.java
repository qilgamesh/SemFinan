import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import view.RootPane;

import java.sql.SQLException;

/**
 * @author Andrey Semenyuk
 */
public class Main extends Application {

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
