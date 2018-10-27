package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;

public class DemoJavafx_stackPane extends Application {

	public void start(Stage primaryStage) {
		
		//create stack pane object
		StackPane pane=new StackPane();
		Button b=new Button("ok");
		pane.getChildren().add(b);
		
		Scene scene=new Scene(pane,200,50);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		
		//set scene to the stage
		primaryStage.setTitle("Stack pane javafx page");
		primaryStage.setScene(scene);
		primaryStage.show();
	
}

	public static void main(String[] args) {
		launch(args);
	}
}
