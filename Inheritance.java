public class Inheritance {

    public static void main(String[] args) {

// Exercise 5 – Hierarchical Inheritance

// Create a parent class Person with a method introduce() that prints "I am a person".
// Create two child classes Student and Teacher that inherit from Person.
// Student should have a method study() that prints "Student is studying".
// Teacher should have a method teach() that prints "Teacher is teaching".
// Create objects of Student and Teacher and call both the inherited method and their own methods.

        Student s = new Student();
        Teacher t = new Teacher();
        s.study();
        s.introduce();
        t.teach();
        t.introduce();
        
    }
    
}

class Person {
    void introduce() {
        System.out.println("I am a person");
    }
}

class Student extends Person {
    void study() {
        System.out.println("Student is studying");
    }
}

class Teacher extends Person {
    void teach() {
        System.out.println("Teacher is teaching");
    }
}

// 💡 Tip: This is exactly how shared functionality (like introduce()) is reused by multiple classes.























// ✔ Perfect example of a three-level inheritance chain.
// 💡 Note: The child can access all methods up the chain — you showed that clearly.

// public class Inheritance {

//     public static void main(String[] args) {

// // Exercise 4 – Multilevel Inheritance

// // Create a parent class Grandparent with a method grandparentMethod() that prints "Grandparent method".
// // Create a child class Parent that inherits Grandparent and has a method parentMethod().
// // Create a child class Child that inherits Parent and has a method childMethod().

// // Create an object of Child and call all three methods.

//         Child c = new Child();
//         c.childMethod();
//         c.parentMethod();
//         c.grandparentMethod();
        
//     }
    
// }

// class Grandparent {
//     void grandparentMethod() {
//         System.out.println("Grandparent method");
//     }
// }

// class Parent extends Grandparent {
//     void parentMethod() {
//         System.out.println("Parent Method");
//     }
// }

// class Child extends Parent {
//     void childMethod() {
//         System.out.println("Child method");
//     }
// }
















// Bonus Tip: Shape s2 = new Circle(); → This shows runtime polymorphism (dynamic method dispatch). Excellent inclusion!

// public class Inheritance {

//     public static void main(String[] args) {

// // Exercise 3 – Method Overriding

// // Create a parent class Shape with a method area() that prints "Area of shape".
// // Create a child class Circle that overrides area() to print "Area of circle".

// // Create objects of both Shape and Circle and call the area() method.

//         Shape s = new Shape();
//         Shape s2 = new Circle();
//         Circle c = new Circle();
//         s2.area();
//         s.area();
//         c.area();
        
//     }
    
// }

// class Shape {
//     void area () {
//         System.out.println("Area of shape");
//     }
// }

// class Circle extends Shape {
//     @Override
//     void area() {
//         System.out.println("Area of circle");
//     }
// }












// Note: Even if you didn’t write super(), Java automatically calls it if no argument is needed — but explicitly writing it shows good understanding.


// public class Inheritance {

//     public static void main(String[] args) {

// // Exercise 2 – Using super()

// // Create a parent class Vehicle with a constructor that prints "Vehicle is created".
// // Create a child class Car that inherits Vehicle and has a constructor that prints "Car is created" and calls the parent constructor using super().

// // Create an object of Car.

//         Car c = new Car();
        
//     }
    
// }

// class Vehicle {
//     Vehicle () {
//         System.out.println("Vehicle is created");
//     }
// }

// class Car extends Vehicle {
//     Car() {
//         super();
//         System.out.println("Car is created");
//     }
// }













// public class Inheritance {

//     public static void main(String[] args) {

// // Exercise 1 – Single Inheritance

// // Create a parent class Animal with a method eat() that prints "Animal is eating".
// // Create a child class Dog that inherits from Animal and has a method bark() that prints "Dog is barking".

// // Create an object of Dog and call both eat() and bark() methods.

//         Dog d = new Dog();
//         d.eat();
//         d.bark();

//     }
    
// }

// class Animal {
//     void eat() {
//         System.out.println("Animal is eating");
//     }
// }

// class Dog extends Animal {
//     void bark() {
//         System.out.println("Dog is barking");
//     }
// }
























































































































// --------------------------------------------------------------------------------------------------------------

// public class Inheritance {

//     public static void main(String[] args) {

// // Exercise 1 – Single Inheritance

// // Create a parent class Animal with a method eat() that prints "Animal is eating".
// // Create a child class Dog that inherits from Animal and has a method bark() that prints "Dog is barking".

// // Create an object of Dog and call both eat() and bark() methods.

//         Dog d = new Dog();
//         d.eat();
//         d.bark();
        
//     }
    
// }

// class Animal {
//     void eat() {
//         System.out.println("Animal is eating");
//     }
// }

// class Dog extends Animal {
//     void bark() {
//         System.out.println("Dog is barking");
//     }
// }


// ----------------------------------------------------------------------------------------------------------------------

// public class Inheritance {

//     public static void main(String[] args) {

// // Exercise 2 – Using super()

// // Create a parent class Vehicle with a constructor that prints "Vehicle is created".
// // Create a child class Car that inherits Vehicle and has a constructor that prints "Car is created" and calls the parent constructor using super().

// // Create an object of Car.

//         Car c = new Car();
        
//     }
    
// }

// class Vehicle {
//     Vehicle () {
//         System.out.println("Vehicle is created");
//     }
// }

// class Car extends Vehicle {
//     Car() {
//         super();
//         System.out.println("Car is created");
//     }
// }

// -------------------------------------------------------------------------------------------------------------------------

// public class Inheritance {

//     public static void main(String[] args) {

// // Exercise 2 – Using super()

// // Create a parent class Vehicle with a constructor that prints "Vehicle is created".
// // Create a child class Car that inherits Vehicle and has a constructor that prints "Car is created" and calls the parent constructor using super().

// // Create an object of Car.

//         Car c = new Car();
        
//     }
    
// }

// class Vehicle {
//     Vehicle () {
//         System.out.println("Vehicle is created");
//     }
// }

// class Car extends Vehicle {
//     Car() {
//         super();
//         System.out.println("Car is created");
//     }
// }

// -------------------------------------------------------------------------------------------------------------------------

// public class Inheritance {

//     public static void main(String[] args) {

// // Exercise 3 – Method Overriding

// // Create a parent class Shape with a method area() that prints "Area of shape".
// // Create a child class Circle that overrides area() to print "Area of circle".

// // Create objects of both Shape and Circle and call the area() method.

//         Shape s = new Shape();
//         Shape s2 = new Circle();
//         Circle c = new Circle();
//         s2.area();
//         s.area();
//         c.area();
        
//     }
    
// }

// class Shape {
//     void area () {
//         System.out.println("Area of shape");
//     }
// }

// class Circle extends Shape {
//     @Override
//     void area() {
//         System.out.println("Area of circle");
//     }
// }

// -----------------------------------------------------------------------------------------------------------------------------

// public class Inheritance {

//     public static void main(String[] args) {

// // Exercise 4 – Multilevel Inheritance

// // Create a parent class Grandparent with a method grandparentMethod() that prints "Grandparent method".
// // Create a child class Parent that inherits Grandparent and has a method parentMethod().
// // Create a child class Child that inherits Parent and has a method childMethod().

// // Create an object of Child and call all three methods.

//         Child c = new Child();
//         c.childMethod();
//         c.parentMethod();
//         c.grandparentMethod();
        
//     }
    
// }

// class Grandparent {
//     void grandparentMethod() {
//         System.out.println("Grandparent method");
//     }
// }

// class Parent extends Grandparent {
//     void parentMethod() {
//         System.out.println("Parent Method");
//     }
// }

// class Child extends Parent {
//     void childMethod() {
//         System.out.println("Child method");
//     }
// }


// -----------------------------------------------------------------------------------------------------------------------------

// public class Inheritance {

//     public static void main(String[] args) {

// // Exercise 5 – Hierarchical Inheritance

// // Create a parent class Person with a method introduce() that prints "I am a person".
// // Create two child classes Student and Teacher that inherit from Person.
// // Student should have a method study() that prints "Student is studying".
// // Teacher should have a method teach() that prints "Teacher is teaching".
// // Create objects of Student and Teacher and call both the inherited method and their own methods.

//         Student s = new Student();
//         Teacher t = new Teacher();
//         s.study();
//         s.introduce();
//         t.teach();
//         t.introduce();
        
//     }
    
// }

// class Person {
//     void introduce() {
//         System.out.println("I am a person");
//     }
// }

// class Student extends Person {
//     void study() {
//         System.out.println("Student is studying");
//     }
// }

// class Teacher extends Person {
//     void teach() {
//         System.out.println("Teacher is teaching");
//     }
// }













































































// 1. What is Inheritance?
// Inheritance is a way for one class to use the properties (variables) and behaviors (methods) of another class.
// The class that gets the properties is called the child class, and the class that gives the properties is called the parent class.
// This helps reuse code so you don’t have to write the same things again.

// Example in simple words:
// Parent class = Animal (has methods like eat, sleep)
// Child class = Dog (inherits eat, sleep from Animal + can have its own method bark)




// 2. Base Class vs Derived Class
// | Term                                   | Meaning                                                            |
// | -------------------------------------- | ------------------------------------------------------------------ |
// | Base Class / Parent Class / Superclass | Existing class with common attributes & methods                    |
// | Derived Class / Child Class / Subclass | New class that **inherits** from parent, can add or change methods |




// 3. Types of Inheritance

// A. Single Inheritance
// One child inherits from one parent.
// Example: Child extends Parent
// Use super() to call parent’s constructor or methods from child.
// Parent ------> Child

// B. Multilevel Inheritance
// A child inherits from parent, and then another class inherits from that child.
// Example: GrandChild extends Child extends Parent
// Parent ------> Child ------> GrandChild

// C. Hierarchical Inheritance
// One parent is inherited by multiple children.
// Example: Animal → Dog, Cat, Bird
//             Parent
//          /    |    \
//        Child1 Child2 Child3

// D. Multiple Inheritance
// A child class inherits from more than one parent.
// Java does NOT allow multiple inheritance of classes directly (to avoid conflicts like “Diamond Problem”).
// But it supports multiple inheritance using interfaces.
//          Parent1    Parent2
//               \      /
//                 Child



// Key Points to Remember
// Child class inherits variables and methods of parent class.
// Child can add new methods or override existing ones.
// Java uses extends keyword for class inheritance.
// Use super() to access parent constructor or methods.
// Multiple inheritance in Java → only via interfaces, not classes.




































// 1. Main purpose of inheritance ✅
// In simple words: reuse code and allow child classes to use variables and methods of the parent class.

// 2. Difference between parent class and child class ✅
// Parent class: Provides variables and methods.
// Child class: Inherits from parent using extends. Can add new features or override methods.
// super() is used inside the child class to access parent’s methods or constructor.

// 3. Single vs Multilevel inheritance ✅
// Single inheritance: Parent → Child
// Multilevel inheritance: Parent → Child → Grandchild

// 4. True/False: In Java, a class can extend more than one class directly 
// Correct answer: False
// Java does not allow multiple inheritance of classes directly to avoid conflicts like the “Diamond Problem.”

// 5. How Java achieves multiple inheritance ✅
// A class can implement multiple interfaces, which allows it to inherit behavior from multiple sources without ambiguity.

// 6. Purpose of super() keyword ✅
// super() is used to call parent class constructor or access parent methods/variables when there’s a conflict or to explicitly call them.