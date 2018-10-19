package info.sjd.view;


import javax.swing.JFrame;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Window extends Application {
	private Scene scene;
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage window) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("Window.fxml"));
		scene = new Scene (root);
		window.setTitle("SJD-TASK11-AMAZON_BOT");
		window.setScene(scene);
		window.show();
	}

	
}
