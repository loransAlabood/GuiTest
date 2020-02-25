package GuiTest;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class GuiTest extends Application {

	
	public void start(Stage stage) throws Exception {
		
		Label label = new Label ("Hi JavaFX!");
		StackPane pane = new StackPane ();
		pane.getChildren().add(label);
		Scene scene = new Scene (pane, 800,600);
		stage.setScene(scene);
		stage.show();
		
	}
	
	
	public static void main (String[] args) {
		
		launch();
		
		
	}
	
	
}
