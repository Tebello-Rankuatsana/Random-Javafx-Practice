package test;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.ClosePath;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {


    @Override
    public void start(Stage stage) throws IOException {

        // Text t = new Text("Name: ");
        Label lbl = new Label("Test One JavaFX Practice!!!!!");    
        // t.setLayoutX(400);
        // TextField txt = new TextField();
        // txt.setText("Ranks");
        Button btn_one = new Button("Animation Button");
        btn_one.setTextFill(Color.GREEN);
        btn_one.setLayoutY(300);
        btn_one.setOnAction(e ->{
            // Circle circ_two = new Circle();
            // circ_two.setRadius(50);
            // circ_two.setCenterX(100);  
            // circ_two.setCenterY(100);
        });
        Circle circ = new Circle();
        circ.setRadius(50);
        circ.setCenterX(100);  
        circ.setCenterY(100);
        circ.setStroke(Color.AQUA);
        circ.setStrokeWidth(9);
        circ.setFill(Color.RED);

        Rectangle rect = new Rectangle();   
        rect.setX(500);
        rect.setY(300); 
        rect.setWidth(100);
        rect.setHeight(100);
        rect.setStroke(Color.GREEN);
        rect.setFill(Color.ANTIQUEWHITE);

        // drawing Triangle using path class in javafx
        Path triangle = new Path();
        triangle.getElements().addAll(
            new MoveTo(50,50),
            new LineTo(150,150),
            new LineTo(50,150),
            new ClosePath()
        );
        triangle.setFill(Color.CRIMSON);
        triangle.setLayoutX(300);
        triangle.setLayoutY(200);
        
        // drawing a pentagon using path class in javafx
        Path pentagon = new Path(
            new MoveTo(200.0, 100.0),    // Vertex 1: Top Apex
            new LineTo(295.11, 169.10),  // Vertex 2: Top Right
            new LineTo(258.78, 280.90),  // Vertex 3: Bottom Right
            new LineTo(141.22, 280.90),  // Vertex 4: Bottom Left
            new LineTo(104.89, 169.10),  // Vertex 5: Top Left
            new ClosePath()
        );
        pentagon.setFill(Color.KHAKI);
        pentagon.setStroke(Color.PERU);
        pentagon.setStrokeWidth(3);

        Polygon poly = new Polygon(
            40.0,60.0,
            300.0,200.0,
            60.0,200.0

        );
        poly.setFill(Color.RED);
        poly.setStroke(Color.PURPLE);
        poly.setStrokeWidth(3);
        poly.setLayoutX(525);
        poly.setLayoutY(300);
        

        Pane box = new Pane(lbl, btn_one,circ);
        box.getChildren().add(rect);
        box.getChildren().add(triangle);
        box.getChildren().add(pentagon);
        box.getChildren().add(poly);
        box.setMinHeight(540);
        box.setMinWidth(1024);

        
        Scene scene = new Scene(box);
        stage.setTitle("JavaFX Practice");
        stage.setScene(scene);
        stage.show();
    }


    public static void main(String[] args) {
        launch();
    }

}