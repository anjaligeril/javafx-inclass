package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;


public class JavafxText extends Application {
	
		public void start(Stage primaryStage) {
			Text tx=new Text();
			tx.setFont(Font.font("Times New Roman",FontWeight.BOLD,FontPosture.ITALIC,50));	
			tx.setX(100);
			tx.setY(100);
			tx.setFill(Color.BISQUE);
			tx.setText("Good Evening!!");
			tx.setStroke(Color.DARKKHAKI);
			tx.setStrokeWidth(2);
			Pane pane=new Pane();
			pane.getChildren().add(tx);
			Scene scene=new Scene(pane,600,600);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setTitle("Text in javafx");
			primaryStage.setScene(scene);
			primaryStage.show();
			
		}
		
		public static void main(String[] args) {
			launch(args);
		}
}

