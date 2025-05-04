import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class MyFirstFrameApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        Button button = new Button("Press Me");

        button.setOnAction(e -> {
            System.out.println("Welcome to JavaFX");
        });

        StackPane root = new StackPane();
        root.getChildren().add(button);

        Scene scene = new Scene(root, 300, 200);

        primaryStage.setTitle("My First Frame");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
