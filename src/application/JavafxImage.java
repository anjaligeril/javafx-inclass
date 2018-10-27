package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;



public class JavafxImage extends Application {

	public void start(Stage primaryStage) {
		
		/*Image img=new Image("https://cdn.atwilltech.com/flowerdatabase/c/celebrate-the-day-fresh-flowers-VA01607.425.jpg");
		ImageView imgvw=new ImageView(img);
		imgvw.setFitHeight(550);
		imgvw.setFitWidth(550);
		HBox pane=new HBox();
		pane.getChildren().add(imgvw);
		Scene scene=new Scene(pane,550,550);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setTitle("image in javafx");
		primaryStage.setScene(scene);
		primaryStage.show();*/
		
		Image img=new Image("image/img.jpg");
		ImageView imgvw=new ImageView(img);
		imgvw.setFitHeight(550);
		imgvw.setFitWidth(550);
		HBox pane=new HBox();
		pane.getChildren().add(imgvw);
		Scene scene=new Scene(pane,550,550);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setTitle("image in javafx");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
		
		//HBox is a kind of pane .it arranges the nodes one after the another horizontally
		
	
		/* Image img=new Image("https://cdn.atwilltech.com/flowerdatabase/c/celebrate-the-day-fresh-flowers-VA01607.425.jpg");
		ImageView imgvw=new ImageView(img);
		Image img1=new Image("https://res.cloudinary.com/prestige-gifting/image/fetch/fl_progressive,q_95,e_sharpen:50,w_480/e_saturation:05/https://www.prestigeflowers.co.uk/images/NF1018.jpg");
		ImageView imgvw1=new ImageView(img1);
		
		HBox pane=new HBox();
		pane.getChildren().addAll(imgvw,imgvw1);
		Scene scene=new Scene(pane,1000,1000);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.show(); */
		
		//VBox is a kind of pane .it arranges the nodes one after the another vertically
		
		
	/*	Image img=new Image("https://cdn.atwilltech.com/flowerdatabase/c/celebrate-the-day-fresh-flowers-VA01607.425.jpg");
		ImageView imgvw=new ImageView(img);
		Image img1=new Image("https://res.cloudinary.com/prestige-gifting/image/fetch/fl_progressive,q_95,e_sharpen:50,w_480/e_saturation:05/https://www.prestigeflowers.co.uk/images/NF1018.jpg");
		ImageView imgvw1=new ImageView(img1);
		
		VBox pane=new VBox();
		pane.getChildren().addAll(imgvw,imgvw1);
		Scene scene=new Scene(pane,1000,1000);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.show();*/
		
	
}

public static void main(String[] args) {
	launch(args);
}
}
