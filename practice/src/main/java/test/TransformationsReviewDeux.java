package test;

import java.io.IOException;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class TransformationsReviewDeux extends Application {
    @Override 
    public void start(Stage stage) throws IOException{

        // Creating the shapes 
        Rectangle r = new Rectangle();
        r.setX(100);
        r.setY(500);
        r.setWidth(100);
        r.setHeight(65);
        r.setFill(Color.YELLOW);
        r.setStroke(Color.BLACK);
        r.setStrokeWidth(6);

        Circle c = new Circle();
        c.setRadius(100);
        c.setLayoutX(400);
        c.setLayoutY(500);
        c.setFill(Color.BLUE);
        c.setStroke(Color.BLACK);

        Polygon tri = new Polygon(
            700.0,500.0,
            890.0,250.0,
            1080,500.0
        );
        tri.setFill(Color.GREEN);
        tri.setStroke(Color.BLACK);
        tri.setStrokeWidth(6);


        Pane pn = new Pane(r,c,tri);
        pn.setMinWidth(1500);
        pn.setMinHeight(800);
        Scene sc = new Scene(pn);
        stage.setScene(sc);
        stage.setTitle("Transformations Practice two");
        stage.show();
    }
    public static void main(String[] args){
        launch();
    }
    
}
