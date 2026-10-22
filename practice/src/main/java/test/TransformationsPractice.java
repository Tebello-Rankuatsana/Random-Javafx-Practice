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

public class TransformationsPractice extends Application{
    @Override 
    public void start(Stage stage) throws IOException{
        Button btn = new Button("Translate Button");
        btn.setLayoutX(450);
        btn.setTextFill(Color.TEAL);
        btn.setOnAction(e -> {
            btn.setTextFill(Color.RED);
            
        });

        Rectangle rect = new Rectangle();
        rect.setX(100);
        rect.setY(100);
        // rect.setLayoutX(300);
        // rect.setLayoutY(250);
        rect.setWidth(79);
        rect.setHeight(69);
        rect.setStrokeWidth(4);
        rect.setStroke(Color.GOLD);
        rect.setFill(Color.GRAY);

        btn.setOnAction(e -> {
            rect.setTranslateX(200);
            rect.setTranslateY(200);
        });

        Button btn_two = new Button("Rotate Button");
        btn_two.setLayoutX(300);
        btn_two.setTextFill(Color.BLUEVIOLET);
        
        btn_two.setOnAction(e ->{
            rect.setRotate(45);
        });

        Polygon poly = new Polygon(
            95.0,200.0,
            105.0,145.0,
            125.0,155.0
            // 75.0,35.0,
            // 125.0,35.0
        );
        poly.setFill(Color.RED);
        poly.setStrokeWidth(4);
        poly.setStroke(Color.BLUE);
        poly.setLayoutX(300);

        Button btn_three = new Button("Second Rotate Button");
        btn_three.setLayoutX(150);
        btn_three.setOnAction(e ->{
            // double scaleX = 3.0;
            // double scaleY = 3.0;
            // Transform scale =  new Transform.scale(scaleX,scaleY);
            // poly.getTransforms().add(scale);
            double degrees = 30;
            double rotX = 100;
            double rotY = 100;
        
            Transform rotate = Transform.rotate(degrees, rotX, rotY);
            poly.getTransforms().add(rotate);
        });

        Circle circ = new Circle();
        circ.setRadius(50);
        circ.setCenterX(150);
        circ.setCenterY(350);

        Button btn_four =  new Button("Alt Scale method");
        btn_four.setOnAction(e -> {
            double scaleX = 0.4;
            double scaleY = 0.4;
            Transform scale = Transform.scale(scaleX, scaleY);
            circ.getTransforms().add(scale);

        });

        Rectangle rect_two = new Rectangle();
        rect_two.setX(400);
        rect_two.setY(400);
        rect_two.setWidth(73);
        rect_two.setHeight(54);
        rect_two.setFill(Color.BROWN);
        rect_two.setStroke(Color.GREEN);
        rect_two.setStrokeWidth(5);

        Button btn_five = new Button("Shear Button");
        btn_five.setLayoutX(600);
        // btn_five.setLayoutY(600);
        btn_five.setOnAction(e ->{
            rect_two.getTransforms().add(new Shear(0,0.5));
        });
        btn_five.setTextFill(Color.IVORY);

        // 

        Pane pn = new Pane(btn,rect,btn_two,poly,btn_three,circ,btn_four,rect_two,btn_five);
        pn.setMinWidth(1024);
        pn.setMinHeight(700);
        // pn.getChildren().add();
        // pn.getChildren().add(rect);

        Scene sc = new Scene(pn);
        stage.setTitle("Transformations Practice");
        stage.setScene(sc);
        stage.show();
    }

    public static void main(String[] args){
        launch();
    }
}
