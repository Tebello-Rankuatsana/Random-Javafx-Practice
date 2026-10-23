package test;

import java.io.IOException;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.transform.Shear;
import javafx.scene.transform.Transform;
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
        c.setStrokeWidth(6);

        Polygon tri = new Polygon(
            700.0,500.0,
            890.0,250.0,
            1080,500.0
        );
        tri.setFill(Color.GREEN);
        tri.setStroke(Color.BLACK);
        tri.setStrokeWidth(6);

        // Adding buttons for transformations
        Button reset = new Button("Reset");
        reset.setOnAction(e -> {
            c.getTransforms().clear();
            r.getTransforms().clear();
            tri.getTransforms().clear();
        });
        reset.setLayoutX(100);

        Button shear = new Button("Shear");
        shear.setOnAction(e -> {
            r.getTransforms().add(new Shear(0,0.5));
        });
        shear.setLayoutX(200);


        Button translate = new Button("Translate");
        translate.setOnAction(e -> {
            double transX = 10;
            double transY = 20;
            Transform move = Transform.translate(transX, transY);
            r.getTransforms().add(move);
        });
        translate.setLayoutX(300);

        Button scale_btn = new Button("Scale");
        scale_btn.setOnAction(e -> {
            double scaleX = 0.75;
            double scaleY = 0.75;
            Transform scale = Transform.scale(scaleX, scaleY);
            c.getTransforms().add(scale);
        });
        scale_btn.setLayoutX(400);

        Button rotate_btn = new Button("Rotate");
        rotate_btn.setOnAction(e -> {
            double degrees = 3;
            double rotX = 10;
            double rotY = 10;

            Transform rotate = Transform.rotate(degrees, rotX, rotY);
            tri.getTransforms().add(rotate);
        });
        rotate_btn.setLayoutX(500);

        

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
