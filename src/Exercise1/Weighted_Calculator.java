package Exercise1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Weighted_Calculator extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        /**This section of code creates/configures the window, window title,
         window size, link to the sample.fmxl file, sets the window to a fixed size, and
         it also shows the window when the program starts.
         */
        Parent root = FXMLLoader.load(getClass().getResource("Exercise1.fxml"));
        primaryStage.setTitle("Weighted Average Calculator");
        primaryStage.setScene(new Scene(root, 600, 500));
        primaryStage.setResizable(false);
        primaryStage.show();
    }


    public static void main(String[] args)
    {
        //The launch(args) method calls the start method...
        launch(args);
    }
}
