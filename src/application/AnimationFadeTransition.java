package application;


import javafx.animation.FadeTransition;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
public class AnimationFadeTransition extends Application {

	public void start(Stage primaryStage) {
		//rectangle
		Rectangle rec=new Rectangle(10,10,200,200);
		rec.setFill(Color.PURPLE);
		rec.setStrokeWidth(2);
		rec.setStroke(Color.DARKORCHID);
		//Animation
		FadeTransition fdtn=new FadeTransition(Duration.millis(1000));
		fdtn.setFromValue(1.0);
		fdtn.setToValue(0.3);
		fdtn.setAutoReverse(true);
		fdtn.setCycleCount(50);
		fdtn.setNode(rec);
		fdtn.play();
		Pane pane=new Pane(rec);
		Scene scene=new Scene(pane,550,550);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setTitle("image in javafx");
		primaryStage.setScene(scene);
		primaryStage.show();
	
}

	public static void main(String[] args) {
	launch(args);
}
}
