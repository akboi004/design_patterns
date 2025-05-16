package PrototypePattern;

import java.util.ArrayList;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {
		List<Shape> shape = new ArrayList<>();
		List<Shape> shapeClone = new ArrayList<>();

		Circle circle = new Circle();
		circle.x = 10;
		circle.y = 20;
		circle.color = "Black";
		circle.radius = 15;
		shape.add(circle);

		Circle anotherCircle = (Circle) circle.clone();
		shapeClone.add(anotherCircle);

		System.out.println("Original Shapes:");
		for (Shape s : shape) {
			System.out.println(s);
		}

		System.out.println("Another Shapes: ");
		for (Shape s2 : shapeClone) {
			System.out.println(s2);
		}

		System.out.println("\nAre the original and clone the same object?");
		System.out.println("circle == anotherCircle : " + (circle == anotherCircle));

		// Optional: check values (shallow equality)
		System.out.println("circle.equals(anotherCircle) : " + circle.equals(anotherCircle));

	}
}
