import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class MyApp extends Application {
    @Override
    public void start(Stage stage) {
        Label label = new Label("Hello, JavaFX in VS Code!");
        Scene scene = new Scene(label, 400, 200);
        stage.setScene(scene);
        stage.setTitle("JavaFX Demo");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
