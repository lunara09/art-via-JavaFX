package application;

import javafx.fxml.FXML;
import javafx.scene.layout.TilePane;

import java.util.ArrayList;
import java.util.Collections;

public class Controller {
	private ArrayList<Colour> list = new ArrayList<>();

	@FXML
	public TilePane tilePane;

	@FXML
	public void addColour() {
		for (int i = 0; i < 10; i++) {
			list.add(new Colour());
			}
		Collections.sort(list);
		tilePane.getChildren().clear();

		for (Colour colour : list) {
			tilePane.getChildren().add(colour.getNode());
		}
	}

	@FXML
	public void clear() {
		tilePane.getChildren().clear();
		list.clear();
	}
}
