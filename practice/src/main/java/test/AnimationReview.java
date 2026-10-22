package test;

import java.io.IOException;

import javafx.util.Duration;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.transform.Scale;
import javafx.scene.transform.Transform;
import javafx.stage.Stage;

public class AnimationReview extends Application {
    @Override 
    public void start(Stage stage) throws IOException{

        // Creating the shapes that will be animated
        // rectangle
        Rectangle rc = new Rectangle();
        rc.setX(50);
        rc.setY(500);
        rc.setWidth(200);
        rc.setHeight(135);
        rc.setFill(Color.LIGHTCYAN);
        rc.setStroke(Color.LAVENDER);
        rc.setStrokeWidth(6);

        // circle
        Circle c = new Circle();
        c.setRadius(95);
        c.setLayoutX(550);
        c.setLayoutY(500);
        c.setFill(Color.MAGENTA);
        c.setStroke(Color.MISTYROSE);
        c.setStrokeWidth(6);

        // Triangle
        Polygon tri = new Polygon(
            950,500,
            1050,350,
            1150,500
        );
        tri.setFill(Color.GREEN);
        tri.setStroke(Color.BLUE);
        tri.setStrokeWidth(6);

        // Rectangle two
        Rectangle rc_two = new Rectangle();
        rc_two.setX(1350);
        rc_two.setY(500);
        rc_two.setWidth(80);
        rc_two.setHeight(55);
        rc_two.setFill(Color.RED);
        rc_two.setStroke(Color.YELLOW);
        rc_two.setStrokeWidth(6);
        
        // Buttons to control animations
        // translation animation
        Button btn_one = new Button("Translation Animation");
        btn_one.setLayoutX(50);
        btn_one.setOnAction(e -> {
            // double transX = 80;
            // double transY = 50;
            // Transform translate = Transform.translate(transX, transY);
            // rc.getTransforms().add(translate);

            KeyValue ky = new KeyValue(rc.translateXProperty(), 100);
            KeyFrame kf = new KeyFrame(Duration.seconds(10), ky);
            Timeline tm = new Timeline(kf);
            tm.play();
        });


        // Scale animation
        Button btn_two = new Button("Scale Animation");
        btn_two.setLayoutX(550);
        btn_two.setOnAction(e -> {
            // y scale
            KeyValue kv_y = new KeyValue(c.scaleYProperty(), 100);
            KeyFrame kf_y = new KeyFrame(Duration.seconds(10), kv_y);
            Timeline tm_y = new Timeline(kf_y);
            tm_y.play();

            KeyValue kv = new KeyValue(c.scaleXProperty(), 100);
            KeyFrame kf = new KeyFrame(Duration.seconds(10), kv);
            Timeline tm = new Timeline(kf);
            tm.play();

        });


        // Rotation animation
        Button btn_three = new Button("Rotation Animation");
        btn_three.setLayoutX(950);
        btn_three.setOnAction(e -> {
            KeyValue kv = new KeyValue(tri.rotateProperty(), 100);
            KeyFrame kf = new KeyFrame(Duration.seconds(10), kv);
            Timeline tm = new Timeline(kf);
            tm.play();
        });


        // Shear animation
        Button btn_four = new Button("Shear Animation");
        btn_four.setLayoutX(1350);
        btn_four.setOnAction(e -> {
            KeyValue kv = new KeyValue(rc_two.s, null)
        });
        
        
        Pane pn = new Pane(rc,c,tri,rc_two,btn_one,btn_two,btn_three,btn_four);
        pn.setMinWidth(1524);
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
