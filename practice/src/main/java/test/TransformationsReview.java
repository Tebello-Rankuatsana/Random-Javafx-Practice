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

public class TransformationsReview extends Application {
    @Override 
    public void start(Stage stage) throws IOException{
        
        // Creating the shapes i'm going to translate
        Rectangle rect_one = new Rectangle();
        rect_one.setX(800);
        rect_one.setY(50);
        rect_one.setWidth(120);
        rect_one.setHeight(95);
        rect_one.setFill(Color.CHOCOLATE);
        rect_one.setStroke(Color.GREEN);

        Circle circ_one = new Circle();
        circ_one.setRadius(90);
        circ_one.setLayoutX(500);
        circ_one.setLayoutY(300);
        circ_one.setFill(Color.BLANCHEDALMOND);
        circ_one.setStroke(Color.RED);


        Polygon poly_one = new Polygon(
            200.0,50.0,
            350.0,150.0,
            500.0,50.0
        );
        poly_one.setFill(Color.RED);
        poly_one.setStroke(Color.BLUE);

        // Reset Button
        Button btn_zero = new Button("Reset");
        btn_zero.setOnAction(e -> {
            rect_one.getTransforms().clear();
            circ_one.getTransforms().clear();
            poly_one.getTransforms().clear();
        });
        btn_zero.setLayoutX(0);

        // Transformation Control Buttons
        Button btn_one = new Button("Translate");
        btn_one.setLayoutX(200);
        btn_one.setLayoutY(0);
        btn_one.setOnAction(e -> {
            double translateX = 10.0;
            double translateY = 5.0;

            Transform translate = Transform.translate(translateX, translateY);
            poly_one.getTransforms().add(translate);
        });


        Button btn_two = new Button("Rotate");
        btn_two.setLayoutX(400);
        btn_two.setLayoutY(0);
        btn_two.setOnAction(e -> {
            double angle = 4;
            double rotX = 10;
            double rotY = 10;
            Transform rotate = Transform.rotate(angle, rotX, rotY);
            rect_one.getTransforms().add(rotate);
        });

        Button btn_three = new Button("Scale");
        btn_three.setLayoutX(600);
        btn_three.setLayoutY(0);
        btn_three.setOnAction(e -> {
            double scaleX = 0.99;
            double scaleY = 0.99;
            Transform scale = Transform.scale(scaleX, scaleY);
            circ_one.getTransforms().add(scale);
        });
    

        Button btn_four = new Button("Shear");
        btn_four.setOnAction(e -> {
            rect_one.getTransforms().add(new Shear(0.5,0));
        });
        btn_four.setLayoutX(800);
        btn_four.setLayoutY(0);


        
        
        Pane pn = new Pane(rect_one,circ_one,poly_one,btn_zero,btn_one,btn_two,btn_three,btn_four);
        pn.setMinWidth(1024);
        pn.setMinHeight(700);

        Scene sc = new Scene(pn);
        stage.setScene(sc);
        stage.setTitle("Transformations Review");
        stage.show();
    }
    public static void main(String[] args){
        launch();
    }
    
}
