package edu.cnm.deepdive.temperature;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Controller {

  @FXML
  private TextField farenheitInput;

  @FXML
  private TextField celsiusInput;

  @FXML
  private void convertToFarenheit(ActionEvent actionEvent) {
    String rawCelsius = celsiusInput.getText().trim();
    double celsius = rawCelsius.isEmpty() ? 0 : Double.parseDouble(rawCelsius);
    double farenheit = celsius * 9 / 5 + 32;
    farenheitInput.setText(String.format("%.2f", farenheit));
  }

  @FXML
  private void convertToCelsius(ActionEvent actionEvent) {
    String rawFarenheit = farenheitInput.getText().trim();
    double farenheit = rawFarenheit.isEmpty() ? 0 : Double.parseDouble(rawFarenheit);
    double celsius = (farenheit - 32) * 5 / 9;
    celsiusInput.setText(String.format("%.2f", celsius));
  }
}
