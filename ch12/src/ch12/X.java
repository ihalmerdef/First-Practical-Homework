package ch12;
abstract class X { abstract void method(); }
abstract class Y extends X { void Method() { } }
abstract class Z extends Y { void Method() { System.out.println("Class Z"); } }