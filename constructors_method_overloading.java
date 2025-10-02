public class constructors_method_overloading {
    
}


// 🔹 Constructor
// Special method with the same name as the class.
// Runs automatically when we create an object with new.
// Used for initializing values.

// class Car {
//     String color;

//     // Constructor
//     Car() {
//         color = "Black"; 
//         System.out.println("Car is created!");
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Car c1 = new Car(); // prints "Car is created!"
//         System.out.println(c1.color); // Black
//     }
// }






// 🔹 Method Overloading
// Same method name, different parameter list.
// JVM decides which method to run based on arguments.
// Used to make code more readable and flexible.

// class Calculator {
//     int add(int a, int b) {
//         return a + b;
//     }

//     double add(double a, double b) {
//         return a + b;
//     }

//     int add(int a, int b, int c) {
//         return a + b + c;
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Calculator c = new Calculator();
//         System.out.println(c.add(2, 3));       // calls int version → 5
//         System.out.println(c.add(2.5, 3.5));   // calls double version → 6.0
//         System.out.println(c.add(1, 2, 3));    // calls 3-arg version → 6
//     }
// }





// 🔹 Constructor Overloading
// Multiple constructors with same class name but different parameters.
// Lets you create objects in different ways.

// class Student {
//     String name;
//     int age;

//     // Constructor 1 (no parameters)
//     Student() {
//         name = "Unknown";
//         age = 0;
//     }

//     // Constructor 2 (one parameter)
//     Student(String n) {
//         name = n;
//         age = 0;
//     }

//     // Constructor 3 (two parameters)
//     Student(String n, int a) {
//         name = n;
//         age = a;
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Student s1 = new Student();             // "Unknown", 0
//         Student s2 = new Student("Divya");      // "Divya", 0
//         Student s3 = new Student("Ojas", 25);   // "Ojas", 25

//         System.out.println(s1.name + " " + s1.age);
//         System.out.println(s2.name + " " + s2.age);
//         System.out.println(s3.name + " " + s3.age);
//     }
// }





// 💡 Key Difference Between Overloading Method vs Constructor:
// Method overloading → happens for normal methods, makes them flexible.
// Constructor overloading → happens for constructors, allows different ways to initialize objects.