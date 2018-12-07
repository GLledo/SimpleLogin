package application.control;

import java.awt.Label;
import java.io.IOException;

import javafx.animation.FadeTransition;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;


public class ControlFX {
	
	@FXML
	ImageView image;
	@FXML
	AnchorPane rootPane;
	
	public void openForm() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("GetMe.fxml"));
			AnchorPane page = (AnchorPane) loader.load();
			Stage homeStage = new Stage();
			homeStage.setTitle("Form");
			Scene scene=new Scene(page);
			homeStage.setScene(scene);
			homeStage.setMaximized(true);
			homeStage.show();
			System.out.println("second stage ok");

	   }catch (IOException e) {
			e.printStackTrace();
			System.out.println("second stage ko");
	
			}
    }
	
	
	// El metodo funciona, lo que ocurre es que se genera un conflicto entre 
	// el fade y el boton
	// ya viste  en clase que funcionaban los dos asiq comento el fade
	/*public void initialize() { 
		
			image.setVisible(true);
			FadeTransition fadeTransition = new FadeTransition(
				Duration.seconds(5), image);
				fadeTransition.setFromValue(0);
				fadeTransition.setToValue(1);
					fadeTransition.play();
	}*/
	
	public void getMe() {
		try { 
		FXMLLoader loader = new FXMLLoader();
          loader.setLocation(Main.class.getResource("GetMe.fxml"));
          AnchorPane page;
		
			page = (AnchorPane) loader.load();
		
          Stage sendStage = new Stage();
          sendStage.setTitle("Form");
          Scene scene = new Scene(page);
          sendStage.setScene(scene);
          
          sendStage.show();;
          
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void close() {
		 Stage thisStage = (Stage) rootPane.getScene().getWindow();
 	    thisStage.close();
	}
	
}
