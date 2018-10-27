package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class DemoJavaFx1 extends Application {
	public void start(Stage primaryStage) {
		
		//create button object
		Button btnOk=new Button("ok");
		
		//create object of scene
		Scene scene=new Scene(btnOk,200,200);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		
		//set scene to the stage
		primaryStage.setTitle("First javafx page");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		//secondstage
		
		Stage secondStage=new Stage();
		Button btnok1=new Button("second ok");
		Scene scene1=new Scene(btnok1,200,200);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		
		secondStage.setTitle("Second javafx page");
		secondStage.setScene(scene1);
		secondStage.show();
	
	}

	public static void main(String[] args) {
		launch(args);
	}
}
