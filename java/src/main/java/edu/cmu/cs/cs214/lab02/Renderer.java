package edu.cmu.cs.cs214.lab02;
import edu.cmu.cs.cs214.lab02.shapes.Shape;

public class Renderer {
  private Shape shape; 
  // Аль ч Shape ашиглах боломжтой болсон.
    
  public Renderer(Shape shape) {
    this.shape = shape;
    }

    public void draw() {
        // assume implementation
    System.out.println("Shape print\n" + "Its area is " + shape.getArea());
    System.out.println("Its perimetr is " + shape.getPerimetr());
    }
}
