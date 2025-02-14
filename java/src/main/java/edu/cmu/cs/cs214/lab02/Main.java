package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.Circle;
import edu.cmu.cs.cs214.lab02.shapes.Rectangle;
import edu.cmu.cs.cs214.lab02.shapes.Shape;
import edu.cmu.cs.cs214.lab02.shapes.Square;

public class Main {
public static void main(String[] args) {

  Shape[] shapes = {
    new Rectangle(2, 3),
    new Circle(5),
    new Square(4)
  };
  
  for (Shape shape : shapes) {
    Renderer renderer = new Renderer(shape);
    renderer.draw();
  }
  }
}

