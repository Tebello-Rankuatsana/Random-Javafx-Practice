package test;

import java.io.IOException;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.transform.Scale;
import javafx.stage.Stage;

public class AnimationReview extends Application {
    @Override 
    public void start(Stage stage) throws IOException{

        // Creating the shapes that will be animated
        // rectangle
        Rectangle rc = new Rectangle();
        rc.setX(100);
        rc.setY(500);
        rc.setWidth(200);
        rc.setHeight(135);
        rc.setFill(Color.LIGHTCYAN);
        rc.setStroke(Color.LAVENDER);
        rc.setStrokeWidth(6);

        // circle
        Circle c = new Circle();
        c.setRadius(95);
        c.setLayoutX(600);
        c.setLayoutY(500);
        c.setFill(Color.MAGENTA);
        c.setStroke(Color.MISTYROSE);
        c.setStrokeWidth(6);

        // Triangle
        Polygon tri = new Polygon(
            1000,500,
            1100,350,
            1200,500
        );
        tri.setFill(Color.GREEN);
        tri.setStroke(Color.BLUE);
        tri.setStrokeWidth(6);

        // Buttons to control animations

        
        
        Pane pn = new Pane(rc,c,tri);
        pn.setMinWidth(1424);
        pn.setMinHeight(800);
        
        Scene sc = new Scene(pn);
        stage.setScene(sc);
        stage.setTitle("Animation review - With Buttons appended");
        stage.show();


    }
    public static void main(String[] args){
        launch();
    }
    
}
