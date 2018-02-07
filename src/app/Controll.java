package app;

import java.util.List;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import model.Product;

public class Controll {
	@FXML
	private Button Gomb;
	@FXML
	private ListView<String> lista;
	@FXML
	private Button addGomb;

	@FXML
	private Button saveGomb;
	@FXML
	private TextField ItemName;
	@FXML
	private TextField ItemCost;
	@FXML
	private TextField ItemQuantity;
	@FXML
	private TextField ItemType;

	@FXML
	protected void handleSubmitButtonAction(ActionEvent event) {
		loadEntitiesToList(controller.ProductController.getAllProductInList());
	}

	@FXML
	protected void addButtonAction(ActionEvent event) {
		// System.out.println("add something...");
	}

	private void loadEntitiesToList(List<Product> list) {
		for (Product product : list) {
			lista.getItems().add(product.toString());
		}
	}

	/*
	 * private void //loadEntitiesToList(List<Product> allProductInList) {  }
	 */

	@FXML
	protected void saveData(ActionEvent event) {
		lista.getItems().add(new Person("Zoli", 20).toString());
		Product p = new Product(ItemName.getText(), ItemCost.getText(), ItemQuantity.getText(), ItemType.getText());
		System.out.println(p.toString());
		cleanFields();
	}

	private void cleanFields() {
		ItemName.setText("");
		ItemCost.setText("");
		ItemQuantity.setText("");
		ItemType.setText("");
	}
}
