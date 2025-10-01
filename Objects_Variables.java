public class Objects_Variables {
    
}





// Instance variables → unique per object
// Static variables → shared for all objects, access with ClassName.variable
// Methods can use instance variables or static variables depending on requirement











// 🔹 1. Creating a Class
// A class is a blueprint for objects.
// class Car {
//     String color;        // instance variable
//     int speed;           // instance variable

//     void drive() {       // method
//         System.out.println("Car is driving");
//     }
// }



// 🔹 2. Creating an Object
// Objects are instances of a class, created using new.
// Car myCar = new Car();  // create an object
// myCar.color = "Red";    // access instance variable
// myCar.drive();          // call method






// 🔹 3. Instance Variables
// Declared inside a class, outside any method
// Each object has its own copy
// Stored in heap memory
// Default values if not initialized
// Accessed using object reference
// class Student {
//     int age;        // instance variable
// }

// Student s1 = new Student();
// Student s2 = new Student();

// s1.age = 20;      // only s1 has age 20
// s2.age = 25;      // s2 has age 25








// 🔹 4. Static Variables
// Declared with static keyword
// Belongs to class, shared across all objects
// Only one copy exists, memory allocated when class loads
// Accessed via class name (preferred)
// class Student {
//     static String schoolName = "ITVedant"; // static variable
//     int age;                               // instance variable
// }

// Student s1 = new Student();
// Student s2 = new Student();

// s1.age = 20;
// s2.age = 25;

// System.out.println(Student.schoolName);   // shared across objects






// | Feature               | Instance Variable    | Static Variable                       |
// | --------------------- | -------------------- | ------------------------------------- |
// | Belongs to            | Object               | Class                                 |
// | Memory                | Allocated per object | Allocated once at class load          |
// | Shared across objects | No                   | Yes                                   |
// | Accessed via          | Object reference     | Class name (preferred)                |
// | Use case              | Object-specific data | Shared/common data across all objects |

