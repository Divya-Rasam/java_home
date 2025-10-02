// What happens if a method doesn’t return a value? ❌
// Explanation: If a method doesn’t return anything, you must declare it with void.
// Example:

// void greet() {
//     System.out.println("Hello");
// }

// You cannot use return with a value in a void method.
// In simple words: "The method just does something, but doesn’t give any value back."










// public class Methods_in_Java {
//     public static void main(String[] args) {
        
// //   1. Simple Instance Method
// // Create a class Person with:
// // Instance variable: name (String)
// // Instance method: greet() → prints "Hello, my name is <name>"
// // Create an object and call the method.    

//         Person p = new Person();
//         p.name = "Divya";
//         p.greet();


//     }
// }


// class Person {
//     String name;
//     void greet () {
//         System.out.println("Hello, my name is " + name);
//     }
// }













// public class Methods_in_Java {
//     public static void main(String[] args) {
        
// // 2. Instance Method with Return Value
// // Create a class Calculator with:
// // Instance method add(int a, int b) → returns sum of a + b
// // Create an object and print the result of add(5, 7)

//         Calculator c = new Calculator();
//         c.add(5, 7);
//         c.add(2, 7);


//     }
// }

// class Calculator {
//     void add (int a, int b) {
//         int sum = a + b;
//         System.out.println("Sum of the digits " + a + " and " + b + " is " + sum);
//     }
// }



// corrected with return vakue
public class Methods_in_Java {
    public static void main(String[] args) {
        
// 2. Instance Method with Return Value
// Create a class Calculator with:
// Instance method add(int a, int b) → returns sum of a + b
// Create an object and print the result of add(5, 7)

        Calculator c = new Calculator();
        int result = c.add(5, 7);

        int a = 17, b = 6;
        int res = c.add(a, b);

        System.out.println("Sum of the digits " + a + " and " + b + " is " + res);
        System.out.println("Sum of the digits is " + result);
    }
}

class Calculator {
    int add (int a, int b) {
        int sum = a + b;
        return sum;
    }
}


















// public class Methods_in_Java {
//     public static void main(String[] args) {
        
// // 3. Static Method
// // Create a class MathUtils with:
// // Static method square(int x) → returns x*x
// // Call the method without creating an object and print square(6)

//         MathUtils.square(6);

//     }
// }

// class MathUtils {
//     static void square(int x) {
//         int square = x * x;
//         System.out.println("Square root of " + x + " is " + square);
//     }
// }




























// public class Methods_in_Java {
//     public static void main(String[] args) {
        
// // 4. Mix of Static and Instance
// // Create a class Employee with:
// // Static variable: companyName = "ITVedant"
// // Instance variable: employeeName
// // Instance method: details() → prints employeeName + companyName
// // Create 2 employees with different names and call details()

//         Employee e1 = new Employee();
//         Employee e2 = new Employee();

//         e1.employeeName = "Divya";
//         e2.employeeName = "Oju";

//         e1.details();
//         e2.details();

//         System.out.println("Employee " + e1.employeeName + " and employee " + e2.employeeName + " works at " + Employee.companyName);

//     }
// }

// class Employee {
//     static String companyName = "ITVedant";
//     String employeeName;
//     void details () {
//         System.out.println("Employee " + employeeName + " works at " + companyName);
//     }
// }


























// public class Methods_in_Java {
//     public static void main(String[] args) {
        
// // 5. Bonus Challenge
// // Create a class Counter with:
// // Static variable: count
// // Constructor → increments count by 1 every time a new object is created
// // Create 3 objects and print Counter.count

//         Counter c1 = new Counter();
//         Counter c2 = new Counter();
//         Counter c3 = new Counter();

//         System.out.println("Count is " + Counter.count);

//     }
// }

// class Counter {
//     static int count = 0;
//     Counter () {
//         count++;
//     }
// }







































// 1. Instance Method
// Belongs to an object of the class.
// Needs an object to be called.
// Can access instance variables.
// Can return a value or be void.

// class Car {
//     String color;
//     void drive() {
//         System.out.println("Car color: " + color);
//     }
// }

// Car c = new Car();
// c.color = "Red";
// c.drive(); // calling instance method














// 2. Static Method
// Belongs to the class, not an object.
// Can be called without creating an object.
// Can only access static variables directly, not instance variables.
// Defined using static.

// class Car {
//     static int wheels = 4;
//     static void showWheels() {
//         System.out.println("Wheels: " + wheels);
//     }
// }

// Car.showWheels(); // calling static method




// | Feature                   | Instance Method | Static Method |
// | ------------------------- | --------------- | ------------- |
// | Belongs to                | Object          | Class         |
// | Keyword                   | —               | static        |
// | Can be called without obj | No              | Yes           |
// | Can access instance vars  | Yes             | No            |
// | Can access static vars    | Yes             | Yes           |












































// Part A – Quick Quiz (Sentence Style)

// What is the difference between an instance method and a static method?
// instance method doesnt have any keyword, static has keyword static
// instance method need ojuect to be called, static doesnt need 
// instance method belongs to object static belongs to class

// Can a static method access instance variables directly? Why/why not?
// no, static method can only acces static it cant access instance because instance needs object to be called

// How do you call an instance method?
// instance method is called by first makinf an object of the class and then accessing the methos with .method()

// How do you call a static method?
// static method can be called directly without any object

// Can an instance method access static variables?
// yes 

// What keyword is used to define a static method?
// static keyword before the name

// What happens if a method doesn’t return a value?
// i dont really know this - can you explain this in wasy words

// Why do we use methods in Java?
// to carry out any task


// public class Methods_in_Java {
//     public static void main(String[] args) {
        
// //   1. Simple Instance Method
// // Create a class Person with:
// // Instance variable: name (String)
// // Instance method: greet() → prints "Hello, my name is <name>"
// // Create an object and call the method.    

//         Person p = new Person();
//         p.name = "Divya";
//         p.greet();


//     }
// }


// class Person {
//     String name;
//     void greet () {
//         System.out.println("Hello, my name is " + name);
//     }
// }




// public class Methods_in_Java {
//     public static void main(String[] args) {
        
// // 2. Instance Method with Return Value
// // Create a class Calculator with:
// // Instance method add(int a, int b) → returns sum of a + b
// // Create an object and print the result of add(5, 7)

//         Calculator c = new Calculator();
//         c.add(5, 7);
//         c.add(2, 7);


//     }
// }

// class Calculator {
//     void add (int a, int b) {
//         int sum = a + b;
//         System.out.println("Sum of the digits " + a + " and " + b + " is " + sum);
//     }
// }

// public class Methods_in_Java {
//     public static void main(String[] args) {
        
// // 3. Static Method
// // Create a class MathUtils with:
// // Static method square(int x) → returns x*x
// // Call the method without creating an object and print square(6)

//         MathUtils.square(6);

//     }
// }

// class MathUtils {
//     static void square(int x) {
//         int square = x * x;
//         System.out.println("Square root of " + x + " is " + square);
//     }
// }



// public class Methods_in_Java {
//     public static void main(String[] args) {
        
// // 4. Mix of Static and Instance
// // Create a class Employee with:
// // Static variable: companyName = "ITVedant"
// // Instance variable: employeeName
// // Instance method: details() → prints employeeName + companyName
// // Create 2 employees with different names and call details()

//         Employee e1 = new Employee();
//         Employee e2 = new Employee();

//         e1.employeeName = "Divya";
//         e2.employeeName = "Oju";

//         e1.details();
//         e2.details();

//         System.out.println("Employee " + e1.employeeName + " and employee " + e2.employeeName + " works at " + Employee.companyName);

//     }
// }

// class Employee {
//     static String companyName = "ITVedant";
//     String employeeName;
//     void details () {
//         System.out.println("Employee " + employeeName + " works at " + companyName);
//     }
// }


// public class Methods_in_Java {
//     public static void main(String[] args) {
        
// // 5. Bonus Challenge
// // Create a class Counter with:
// // Static variable: count
// // Constructor → increments count by 1 every time a new object is created
// // Create 3 objects and print Counter.count

//         Counter c1 = new Counter();
//         Counter c2 = new Counter();
//         Counter c3 = new Counter();

//         System.out.println("Count is " + Counter.count);

//     }
// }

// class Counter {
//     static int count = 0;
//     Counter () {
//         count++;
//     }
// }

