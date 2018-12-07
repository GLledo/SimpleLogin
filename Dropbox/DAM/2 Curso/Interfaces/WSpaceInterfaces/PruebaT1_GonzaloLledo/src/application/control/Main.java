package application.control;

import javafx.animation.FadeTransition;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;



public class Main extends Application {
	
	Stage stage;
	
	public void start(Stage myStage) throws Exception {

		stage = myStage;
		MainWindow();
	}
	
	
	public void MainWindow() {
		try {

			FXMLLoader loader = new FXMLLoader(getClass().getResource(
					"Profile.fxml"));
			AnchorPane pane = loader.load();
			// Controller myc=loader.getController();
			// myc.main(stage,this);
			
			Scene scene = new Scene(pane);

			// adding Google fonts
			scene.getStylesheets().add(
					"https://fonts.googleapis.com/css?family=Poiret+One");

			//stage.initStyle(StageStyle.UNDECORATED);
			stage.setTitle("Formulario");
			stage.setScene(scene);
			stage.show();

		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void closeStage() {
		stage.close();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
