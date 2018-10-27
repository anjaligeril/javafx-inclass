package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;

public class DemoJavafxCircle extends Application {
	public void start(Stage primaryStage) {
		
		Circle circle=new Circle();
		circle.setCenterX(200);
		circle.setCenterY(200);
		circle.setRadius(40);
		circle.setStrokeWidth(10);
		//circle.setFill(javafx.scene.paint.Color.CYAN);
		circle.setFill(new javafx.scene.paint.Color(1,0.8,0.6,0.4));
		circle.setStroke(javafx.scene.paint.Color.DARKGREY);
		Pane pane=new Pane();
		pane.getChildren().add(circle);

		Scene scene=new Scene(pane,400,400);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		
		//set scene to the stage
		primaryStage.setTitle("circle javafx page");
		primaryStage.setScene(scene);
		primaryStage.show();
	
	
	}

	public static void main(String[] args) {
		launch(args);
	}
}
