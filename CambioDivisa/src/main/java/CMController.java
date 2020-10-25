
import java.io.IOException;
import java.net.URL;

import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class CMController implements Initializable {
	Divisa euro;
	Divisa libra;
	Divisa dolar;
	Divisa yen;
	Divisa Origen;
	ObservableList<String> options =

			FXCollections.observableArrayList("Euro", "Dolar", "Yen", "Libra");

	@FXML
	private VBox view;

	@FXML
	private TextField Valor1;

	@FXML
	private TextField Valor2;

	@FXML
	private ComboBox<String> Moneda1;

	@FXML
	private ComboBox<String> Moneda2;

	public CMController() throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/View.fxml"));
		loader.setController(this);
		loader.load();
	}

	public void initialize(URL location, ResourceBundle resources) {
		euro = new Divisa("Euro", 1.0);
		libra = new Divisa("Libra", 0.8873);
		dolar = new Divisa("Dolar", 1.2007);
		yen = new Divisa("Yen", 133.59);

		Moneda1.setItems(options);
		Moneda2.setItems(options);
		Valor1.setText("0");
		Valor2.setText("0");

	}

	public VBox getView() {
		return view;
	}
	
	public void Euro(double X) {
		Origen.setValor(Double.valueOf(Valor1.getText())/X);
	}
	public void resultado(double X) {
		Valor2.setText(""+Origen.getValor()*X);
	}

	public void actionPerformed(ActionEvent e) {
		Valor2.setText("0");
		Origen=null;
		switch (Moneda1.getValue()) {

		case "Euro":
			Origen = euro;
			Euro(euro.getValor());
			break;
		case "Libra":
			Origen = libra;
			Euro(libra.getValor());
			break;
		case "Yen":
			Origen = yen;
			Euro(yen.getValor());
			break;
		case "Dolar":
			Origen = dolar;
			Euro(dolar.getValor());
			break;
		}
		switch (Moneda2.getValue()) {

		case "Euro":
			resultado(euro.getValor());
			break;
		case "Libra":
			resultado(libra.getValor());
			break;
		case "Yen":
			resultado(yen.getValor());
			break;
		case "Dolar":
			resultado(dolar.getValor());
			break;
		}
		

	}

}
