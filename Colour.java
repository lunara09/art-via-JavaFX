package application;

import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Colour implements Comparable<Colour>{
	private Color color;

	public Colour() {
		this.color = Color.rgb(getRandomInt(0, 255), getRandomInt(0, 255), getRandomInt(0, 255));
	}

	private static int getRandomInt(int min, int max) {
		return (int) (Math.random() * ((max - min) + 1) + min);
	}

	public Node getNode() {
		Rectangle t = new Rectangle(30, 30, color);
		t.setOnMouseClicked(e -> {
			Alert msgDialog = new Alert(AlertType.INFORMATION);
			msgDialog.setGraphic(t);
			msgDialog.setHeaderText(null);
			msgDialog.setContentText(this.toString());
			msgDialog.setTitle("Colour");

			msgDialog.showAndWait();
		});

		return t;
	}


	@Override
	public String toString() {
		return  "R: " + Math.round(color.getRed() * 255) +
						" G: " + Math.round(color.getGreen()) +
						" B:" + Math.round(color.getBlue());
	}

	@Override
	public int compareTo(Colour o) {
		return Double.compare(this.color.getBrightness(), o.color.getBrightness());
	}
}
