package app.basico;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class PrimeiroFx extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Button btA = new Button("A");
        Button btB = new Button("B");
        Button btC = new Button("C");
        btA.setOnAction(e -> System.out.println("A"));
        btB.setOnAction(e -> System.out.println("B"));
        btC.setOnAction(e -> System.exit(0));

        VBox box = new VBox();
        box.setAlignment(Pos.CENTER);
        box.setSpacing(10);
        box.getChildren().add(btA);
        box.getChildren().add(btB);
        box.getChildren().add(btC);

        Scene cenaUnica = new Scene(box, 150, 100);

        primaryStage.setScene(cenaUnica);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
