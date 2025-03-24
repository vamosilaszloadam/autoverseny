package com.example;

import java.util.Random;

import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

//Rectangle

public class Car extends StackPane {
    String name;
    Random ran = new Random();
    Text text = new Text();
    Rectangle rec = new Rectangle(50, 30);
    public Car(String name, Color color, int y) {
        this.name = name;
        this.text.setText(name);

        if(color.getHue() > 200 ) {
            text.setFill(Color.WHITE);
        }else{
            text.setFill(Color.BLACK);
        }
        // System.out.println(name + " " + color.getHue());
        
        this.rec.setFill(color);
        // this.rec.setY(0);
        // this.rec.setX(0); //20
        this.rec.setLayoutY(0);
        this.rec.setLayoutX(0); //20
        // this.getChildren().add(rec);
        // this.getChildren().add(text);
        this.getChildren().addAll(rec, text);
        // this.setScaleX(20);
        // this.setScaleY(y);
        this.setLayoutX(20);
        this.setLayoutY(y);
        // this.setHeight(30);
        // this.setWidth(50);
    }
    public void move() {
        // double x = this.getX() + ran.nextInt(18);
        double x = this.getLayoutX() + ran.nextInt(18);
        // this.setX(x);
        this.setLayoutX(x);
    }
}
