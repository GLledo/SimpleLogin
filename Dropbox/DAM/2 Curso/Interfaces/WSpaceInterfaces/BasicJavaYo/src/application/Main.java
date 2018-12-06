package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application {

	private AnchorPane mypane;

	// modifica el m√©todo start de la clase principal
	@Override
	public void start(Stage stage) throws IOException {

		// primero cargamos la vista fxml en el FXMLLoader
		FXMLLoader loader = new FXMLLoader(getClass().getResource(
				"../view/forest.fxml"));

		// y opcionalmente un controlador para inicializar algun componente
		loader.setController(new SetBlur());

		// ahora sobre el panel mypane cargamos la vista que dejamos en el
		// FXMLLoader
		mypane = (AnchorPane) loader.load();
		
		// a√±ade la escena al stage y la titula
		stage.setTitle("øDÛnde est· la ardilla?");
		stage.setScene(new Scene(mypane));
		stage.show();
	}

	// la clase controladora que aÒade un efecto a la imagen
	class SetBlur {

		// la etiqueta FXML permite acceder al componente imageView ya creado en
		// fxml
		@FXML
		private ImageView forestview;

		@FXML
		public void initialize() {
			forestview.setEffect(new GaussianBlur(2));//tambien podemos poner null y asi quitamos el efecto
		}

	}

	// arranca la aplicaci√≥n
	public static void main(String[] args) {
		launch(args);
	}

}