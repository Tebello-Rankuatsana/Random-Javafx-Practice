package test;

import java.io.IOException;
import javafx.scene.shape.Path;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.ClosePath;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class AnimationPractice extends Application{
    @Override 
    public void start(Stage stage) throws IOException{
        // Creating the shapes yet to be animated
        Circle circ = new Circle();
        circ.setRadius(50);
        circ.setLayoutX(150);
        circ.setLayoutY(350);
        circ.setStroke(Color.RED);

        Rectangle rect = new Rectangle();
        rect.setX(250);
        rect.setY(350);
        rect.setWidth(100);
        rect.setHeight(75);
        rect.setStroke(Color.AQUA);

        Polygon poly = new Polygon(
            400,550.0,
            625,650.0,
            400.0,550.0,
            450.0,650.0,
            650.0,550.0
        );
        poly.setFill(Color.RED);

        // Path p_shape = new Path(
        //     new MoveTo(50,100),
        //     new LineTo(100,200),
        //     new LineTo(150,300),
        //     // new LineTo(),
        //     // new LineTo(),
        //     new ClosePath()
        // );
        Rectangle rect_two = new Rectangle();
        rect_two.setX(450);
        rect_two.setY(350);
        rect_two.setWidth(100);
        rect_two.setHeight(65);
        rect_two.setFill(Color.AQUA);
        rect_two.setStroke(Color.BLACK);

        // Buttons that control animation

        
        
        
        Pane pn = new Pane(circ,rect,poly,rect_two);
        pn.setMinHeight(700);
        pn.setMinWidth(1024);


        Scene sc = new Scene(pn);
        stage.setScene(sc);
        stage.setTitle("Animation Practice");
        stage.show();
    }

    public static void main(String[] args){
        launch();
    }
}
