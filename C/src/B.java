class B extends Circle {
 private double length;

 B(double radius, double length) {
 Circle(radius);
 length = length;
 }

 @Override
public double getArea() {
 return getArea() * length;
 }
}