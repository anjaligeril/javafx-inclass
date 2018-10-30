package application;


import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;


public class JavafxDispTextVert extends Application {

	
	public void start(Stage primaryStage) {
		
		Text t1=new Text();
		t1.setFont(Font.font("Times New Roman",FontWeight.BOLD,FontPosture.ITALIC,22));
		t1.setText("Java");
		t1.setFill(new javafx.scene.paint.Color(1, .8, 1, .9));
		t1.setRotate(90);
		t1.setX(50);
		t1.setY(200);
		
		Text t2=new Text();
		t2.setFont(Font.font("Times New Roman",FontWeight.BOLD,FontPosture.ITALIC,22));
		t2.setText("Java");
		t2.setFill(new javafx.scene.paint.Color(.2, .9, .6, .5));
		t2.setRotate(90);
		t2.setX(100);
		t2.setY(200);
		
		Text t3=new Text();
		t3.setFont(Font.font("Times New Roman",FontWeight.BOLD,FontPosture.ITALIC,22));
		t3.setText("Java");
		t3.setFill(new javafx.scene.paint.Color(1, 1,.1, .4));
		t3.setRotate(90);
		t3.setX(150);
		t3.setY(200);
		
		Text t4=new Text();
		t4.setFont(Font.font("Times New Roman",FontWeight.BOLD,FontPosture.ITALIC,22));
		t4.setText("Java");
		t4.setFill(new javafx.scene.paint.Color(.1, .1, .5, .7));
		t4.setRotate(90);
		t4.setX(200);
		t4.setY(200);
		
		Text t5=new Text();
		t5.setFont(Font.font("Times New Roman",FontWeight.BOLD,FontPosture.ITALIC,22));
		t5.setText("Java");
		t5.setFill(new javafx.scene.paint.Color(.1, 1, 1, .6));
		t5.setRotate(90);
		t5.setX(250);
		t5.setY(200);
				
		Text t6=new Text();
		t6.setFont(Font.font("Times New Roman",FontWeight.BOLD,FontPosture.ITALIC,22));
		t6.setText("Java");
		t6.setFill(new javafx.scene.paint.Color(.1,0.5, 1, .7));
		t6.setRotate(90);
		t6.setX(300);
		t6.setY(200);
		
		HBox pane=new HBox();
		pane.getChildren().addAll(t1,t2,t3,t4,t5,t6);
		pane.setAlignment(Pos.CENTER);
		
		Scene scene=new Scene(pane,400,200);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setTitle("Text Java");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
