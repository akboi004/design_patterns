package PrototypePattern;

public abstract class Shape {

	// The purpose of creating abstract class is that we can declare instance
	// variables but in interface we can only create a method and also
	// we can create constructor too.

	public int x;
	public int y;
	public String color;

	public Shape() {

	}

	public Shape(Shape target) {
		if (target != null) {
			this.x = target.x;
			this.y = target.y;
			this.color = target.color;
		}
	}

	public abstract Shape clone();

	@Override
	public String toString() {
		return "Shape [x=" + x + ", y=" + y + ", color=" + color + "]";
	}

}
