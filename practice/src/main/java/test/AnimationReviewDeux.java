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
import javafx.scene.transform.Shear;
import javafx.scene.transform.Transform;
import javafx.stage.Stage;

public class AnimationReviewDeux extends Application {
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
        Button reset_btn = new Button("Reset");
        reset_btn.setOnAction(e -> {
            c.getTransforms().clear();
            r.getTransforms().clear();
            tri.getTransforms().clear();
        });
        reset_btn.setLayoutX(100);

        Button shear_btn = new Button("Shear");
        shear_btn.setOnAction(e -> {
            r.getTransforms().add(new Shear(0,0.5));
        });
        shear_btn.setLayoutX(200);


        Button translate_btn = new Button("Translate");
        translate_btn.setOnAction(e -> {
            double transX = 10;
            double transY = 20;
            Transform move = Transform.translate(transX, transY);
            r.getTransforms().add(move);
        });
        translate_btn.setLayoutX(300);

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
            double degrees = 10;
            double rotX = 10;
            double rotY = 10;

            Transform rotate = Transform.rotate(degrees, rotX, rotY);
            tri.getTransforms().add(rotate);
        });
        rotate_btn.setLayoutX(500);

        // Animation buttons 
        Button move_animButton = new Button("Move Animation");
        move_animButton.setOnAction(e -> {
            KeyValue kv = new KeyValue(r.translateXProperty(), 100);
            KeyFrame kf = new KeyFrame(Duration.seconds(10), kv);
            Timeline tm = new Timeline(kf);
            tm.play();
        });
        move_animButton.setLayoutX(600);

        Button scale_aniButton = new Button("Scale Animation");
        scale_aniButton.setOnAction(e -> {
            KeyValue kv = new KeyValue(c.scaleXProperty(), 50);
            KeyFrame kf = new KeyFrame(Duration.seconds(10), kv);
            Timeline tm_one = new Timeline(kf);
            tm_one.play();
            KeyValue k_v = new KeyValue(c.scaleYProperty(), 50);
            KeyFrame k_f = new KeyFrame(Duration.seconds(10), k_v);
            Timeline tm_two = new Timeline(k_f);
            tm_two.play();
        });
        scale_aniButton.setLayoutX(800);

        Button rotate_aniButton = new Button("Rotate Animation");
        rotate_aniButton.setOnAction(e -> {
            KeyValue kv = new KeyValue(tri.rotateProperty(), 30);
            KeyFrame kf = new KeyFrame(Duration.seconds(10), kv);
            Timeline tm = new Timeline(kf);
            tm.play();
        });
        rotate_aniButton.setLayoutX(1000);

        

        Pane pn = new Pane(r,c,tri,reset_btn,shear_btn,translate_btn,scale_btn,rotate_btn,move_animButton,scale_aniButton,rotate_aniButton);
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
