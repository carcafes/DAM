


import javafx.application.Application;
	import javafx.scene.Scene;
	import javafx.stage.Stage;
	
public class CambioMonedaApp extends Application{
	
	private CMController controller;
	@Override
	public void start(Stage primaryStage) throws Exception {
		controller = new CMController();
		
		Scene scene = new Scene(controller.getView(), 320, 200);
		
		primaryStage.setTitle("CambioMoneda con FXML");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	
}
