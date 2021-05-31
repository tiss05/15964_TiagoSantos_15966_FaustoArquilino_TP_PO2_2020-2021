/**
 * Created by Fausto Arquilino (15966) and Tiago Santos (15964)
 * 31/05/2021
 */

 import javafx.application.Application;
 import javafx.scene.Scene;
 import javafx.stage.Stage;

public class BoulderDashStart extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        Board boulderDash = new Board();
        Scene scene = new Scene(boulderDash);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

