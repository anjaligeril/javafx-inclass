package application;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;

import javafx.scene.layout.GridPane;


public class DemoForm extends Application {
public void start(Stage primaryStage) {
		
		//login form
	
		GridPane pane=new GridPane();
		
		pane.add(new Label("User Name"),0,0);
		pane.add(new TextField(), 1, 0);
		pane.add(new Label("Password"), 0, 1);
		pane.add(new TextField(), 1, 1);
		Button btnok= new Button("Login");
		pane.add(btnok, 1, 2);
		Scene scene=new Scene(pane,400,400);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setTitle("Login Page");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	
}

public static void main(String[] args) {
	launch(args);
}
}
