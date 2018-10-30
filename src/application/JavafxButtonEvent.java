package application;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class JavafxButtonEvent extends Application {
	
	public void start(Stage primaryStage) {
		Text tx=new Text();
		tx.setFont(Font.font("Times New Roman",FontWeight.BOLD,FontPosture.ITALIC,50));	
		tx.setX(100);
		tx.setY(100);
		tx.setFill(Color.BISQUE);
		tx.setText("Good Evening!!");
		tx.setStroke(Color.DARKKHAKI);
		tx.setStrokeWidth(2);
		Pane pane1=new Pane();
		pane1.getChildren().add(tx);
				
		Button b1=new Button("<--");
		Button b2=new Button("-->");
		HBox pane2=new HBox();
		pane2.getChildren().addAll(b1,b2);
		
		//to align the button center
		pane2.setAlignment(Pos.CENTER);
		
		BorderPane pane=new BorderPane();
		pane.setCenter(pane1);
		pane.setBottom(pane2);
		
		b1.setOnAction(e->tx.setX(tx.getX()-15));
		b2.setOnAction(e->tx.setX(tx.getX()+15));
		
		Scene scene=new Scene(pane,600,300);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setTitle("Text in javafx");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
}
