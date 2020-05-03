package sample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {


    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Kalkulacka 2000");

        VBox vBox = new VBox();

        vBox.setAlignment(Pos.TOP_CENTER);

        Text titleText = new Text("Kalkulator 2000");

        titleText.setFont(Font.font(25));


        VBox.setMargin(titleText, new Insets(50, 0, 0, 0));

        HBox controlBox = new HBox();

        VBox.setMargin(controlBox, new Insets(10, 0, 0, 0));

        controlBox.setAlignment(Pos.TOP_CENTER);

        TextField numb1 = new TextField();
        TextField numb2 = new TextField();
        Text resultText = new Text();

        resultText.setFont(Font.font(25));

        HBox.setMargin(resultText, new Insets(0, 10, 0, 0));

        HBox.setMargin(numb2, new Insets(0, 0, 0, 10));
        HBox.setMargin(resultText, new Insets(0, 0, 0, 10));

        controlBox.getChildren().addAll(numb1, numb2, resultText);

        HBox actionsBox = new HBox();

        VBox.setMargin(actionsBox, new Insets(10, 0, 0, 0));


        actionsBox.setAlignment(Pos.TOP_CENTER);

        Button plusButton = new Button("+");
        Button minusButton = new Button("-");
        Button divideButton = new Button("/");
        Button multipleButton = new Button("*");


        plusButton.setOnAction(event -> {
            System.out.println("Akcia: +");
            try {
                double result = Double.valueOf(numb1.getText().replace(",", ".")) + Double.valueOf(numb2.getText().replace(",", "."));
                resultText.setText("= " + result);
            } catch (NumberFormatException e) {
                resultText.setText("ERROR");
            }
        });

        minusButton.setOnAction(event -> {
            System.out.println("Akcia: -");
            try {
                double result = Double.valueOf(numb1.getText().replace(",", ".")) - Double.valueOf(numb2.getText().replace(",", "."));
                resultText.setText("= " + result);
            } catch (NumberFormatException e) {
                resultText.setText("ERROR");
            }
        });

        divideButton.setOnAction(event -> {
            System.out.println("Akcia: /");
            try {
                double result = Double.valueOf(numb1.getText().replace(",", ".")) / Double.valueOf(numb2.getText().replace(",", "."));
                resultText.setText("= " + result);
            } catch (NumberFormatException e) {
                resultText.setText("ERROR");
            }
        });

        multipleButton.setOnAction(event -> {
            System.out.println("Akcia: *");
            try {
                double result = Double.valueOf(numb1.getText().replace(",", ".")) * Double.valueOf(numb2.getText().replace(",", "."));
                resultText.setText("= " + result);
            } catch (NumberFormatException e) {
                resultText.setText("ERROR");
            }
        });

        plusButton.setStyle("-fx-background-color: #42d1f4");
        minusButton.setStyle("-fx-background-color: #f45060");
        divideButton.setStyle("-fx-background-color: #47f447");
        multipleButton.setStyle("-fx-background-color: #8f68f4");

        HBox.setMargin(minusButton, new Insets(0, 0, 0, 10));
        HBox.setMargin(divideButton, new Insets(0, 0, 0, 10));
        HBox.setMargin(multipleButton, new Insets(0, 0, 0, 10));


        actionsBox.getChildren().addAll(plusButton, minusButton, divideButton, multipleButton);

        vBox.getChildren().addAll(titleText, controlBox, actionsBox);

        Scene scene = new Scene(vBox, 500, 500);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}