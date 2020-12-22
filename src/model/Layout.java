package model;

import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Layout {

    //create stage
    public static void show(Stage stage) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Layout.class.getResource("layout.fxml"));
            Parent root = fxmlLoader.load();

            stage.setTitle("UPN/RPN calculator");
            stage.setScene(new Scene(root, 410, 400));
            stage.show();
        } catch (IOException e){
            System.err.println("Something wrong with firstV.fxml: " + e.getMessage());
            e.printStackTrace(System.err);
        }
    }
}
