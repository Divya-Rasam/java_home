// Heap Memory (easy words):
// Think of your computer memory as two big cupboards:

// Stack → temporary shelf where method/variables live only while running.

// Heap → permanent cupboard where objects live until you throw them away.

// So, instance variables are stored in heap because they belong to objects.

// ✅ Yes, you can use instance variables in the same class (without an object) but only inside non-static methods. In main (which is static), you must use an object.

// ✅ Static variable: best practice → ClassName.variable instead of object.





// public class Objects_Variables {
//     public static void main(String[] args) {
        
//         // 1. Create a Class & Object
// // Create a class called Car with:
// // - instance variables: color (String), speed (int)
// // - method: drive() that prints "Car is driving"

// // Create an object of Car, set color and speed, call drive() and print values

//         Car c = new Car();
//         c.color = "Black";
//         c.speed = 280;
//         c.drive();

//     }
// }


// class Car {
//     String color;
//     int speed;
//     void drive() {
//         System.out.println("Car is driving");
//         System.out.println("The color of the car is " + color + ". Top speed of the car is " + speed + " km/h.");
//     }
// }






















// public class Objects_Variables {
//     public static void main(String[] args) {
        


// // 2. Instance Variable Practice
// // Create a class Student with:
// // - instance variable: age (int)

// // Create two Student objects, set different ages, print ages for both

//         Student s1 = new Student();
//         Student s2 = new Student();

//         s1.age = 18;
//         s2.age = 25;
//         s1.both_age();
//         s2.both_age();

// System.out.println("The age of s1 is " + s1.age);
// System.out.println("The age of s2 is " + s2.age);
//     }
// }

// class Student {
//     int age;
//     void both_age () {
//         System.out.println("The age of the student is " + age);       // can we print in like the age of the s1 is 18 and the age of s2 is 25? like this here???? 
//     }
// }




























// public class Objects_Variables {
//     public static void main(String[] args) {
        

// // 3. Static Variable Practice
// // Create a class School with:
// // - static variable: schoolName (String) = "ITVedant"
// // - instance variable: studentName (String)

// // Create two School objects with different student names
// // Print student names via objects, print schoolName via class name

//         School s1 = new School();
//         School s2 = new School();
//         s1.studentName = "Divya";
//         s2.studentName = "Ojas";
//         System.out.println("The name of students are " +  s1.studentName + ", " + s2.studentName + ". The school name of both students is " + School.schoolName + ".");
//         s1.info();

//     }
// }

// class School {
//     static String schoolName = "ITVedant";
//     String studentName;
//     void info () {
//         System.out.println("The school name of both students is " + schoolName + ".");
//     }
// }

































// public class Objects_Variables {
//     public static void main(String[] args) {

// // 4. Mix of Instance & Static
// // Create a class BankAccount with:
// // - static variable: bankName = "HDFC"
// // - instance variable: accountHolder (String), balance (double)

// // Create 2 accounts with different holders and balances
// // Print account details and shared bankName

//         BankAccount ba1 = new BankAccount();
//         BankAccount ba2 = new BankAccount();
//         ba1.accountHolder = "Divya";
//         ba2.accountHolder = "Ojas";
//         ba1.balance = 20000;
//         ba2.balance = 2500.45;


//         System.out.println(ba1.accountHolder + "'s balance is " + ba1.balance + " and " + ba2.accountHolder + "'s balance is " + ba2.balance + ". They both share same bank, named " + BankAccount.bankName );

//         ba1.accountDetails();
//         ba2.accountDetails();

//     }
// }
// // 👉 Answer: always use ClassName.staticVariable.

// class BankAccount {
//     static String bankName = "HDFC";
//     String accountHolder;
//     double balance;
//     void accountDetails () {
//         System.out.println(accountHolder + " has balance " + balance + " at " + bankName);             
//     }
// }


























public class Objects_Variables {
    public static void main(String[] args) {

// 5. Bonus Challenge
// Modify BankAccount to add a static variable totalAccounts
// Increment it each time a new account is created
// Print totalAccounts after creating 3 accounts

// The trick is → increment inside constructor (runs whenever object is created).

        BankAccount ba1 = new BankAccount();
        BankAccount ba2 = new BankAccount();
        BankAccount ba3 = new BankAccount();

        ba1.accountHolder = "Divya";
        ba2.accountHolder = "Ojas";
        ba3.accountHolder = "Zoro";

        ba1.balance = 20000;
        ba2.balance = 2500.45;
        ba3.balance = 5000;

        System.out.println(ba1.accountHolder + " has " + ba1.balance);
        System.out.println(ba2.accountHolder + " has " + ba2.balance);
        System.out.println(ba3.accountHolder + " has " + ba3.balance);

        System.out.println("Bank Name : " + BankAccount.bankName);
        System.out.println("Total Accounts : " + BankAccount.totalAccounts);              // as it is static


    }
}


class BankAccount {
    static String bankName = "HDFC";
    static int totalAccounts = 0;          // shared across all accounts
    String accountHolder;
    double balance;
    
    // Constructor → runs each time new object created
    BankAccount() {
        totalAccounts++;
    }
    
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
































































































// 🔹 Part A – Quick Quiz

// What is the difference between a class and an object?
// a class is a blueprint of an object
// object is the real thing which we use
// like from the class bluprint we make a real thing object and use it in our code
// objects are instances of class , created with new keyword
// all instances are objects but not all objects are instances

// Where are instance variables stored in memory?
// heap memory (can you help me understand heap memory in very easy words)

// How many copies of a static variable exist if you create 5 objects of the class?
// 1 i think as its static

// How do you access an instance variable?
// need to make an object with a new keyword and then we can use it with .
// ex: if there is a instance variable in the class CAR
// we make object in main class
// Car c = new Car;
// c.instancevariable; 
// or if method
// c.instancemethod();
// can we used instance variable in the same class???????

// How do you access a static variable (best practice)?
// same like instance variable
// making an object first
// but the static variable doesnt change it is static for all the objects



// public class Objects_Variables {
//     public static void main(String[] args) {
        
//         // 1. Create a Class & Object
// // Create a class called Car with:
// // - instance variables: color (String), speed (int)
// // - method: drive() that prints "Car is driving"

// // Create an object of Car, set color and speed, call drive() and print values

//         Car c = new Car();
//         c.color = "Black";
//         c.speed = 280;
//         c.drive();

//     }
// }


// class Car {
//     String color;
//     int speed;
//     void drive() {
//         System.out.println("Car is driving");
//         System.out.println("The color of the car is " + color + ". Top speed of the car is " + speed + " km/h.");
//     }
// }


// public class Objects_Variables {
//     public static void main(String[] args) {
        


// // 2. Instance Variable Practice
// // Create a class Student with:
// // - instance variable: age (int)

// // Create two Student objects, set different ages, print ages for both

//         Student s1 = new Student();
//         Student s2 = new Student();

//         s1.age = 18;
//         s2.age = 25;
//         s1.both_age();
//         s2.both_age();

//     }
// }

// class Student {
//     int age;
//     void both_age () {
//         System.out.println("The age of the student is " + age);       // can we print in like the age of the s1 is 18 and the age of s2 is 25? like this here???? 
//     }
// }




// public class Objects_Variables {
//     public static void main(String[] args) {
        

// // 3. Static Variable Practice
// // Create a class School with:
// // - static variable: schoolName (String) = "ITVedant"
// // - instance variable: studentName (String)

// // Create two School objects with different student names
// // Print student names via objects, print schoolName via class name

//         School s1 = new School();
//         School s2 = new School();
//         s1.studentName = "Divya";
//         s2.studentName = "Ojas";
//         System.out.println("The name of students are " +  s1.studentName + ", " + s2.studentName);
//         s1.info();

//     }
// }

// class School {
//     static String schoolName = "ITVedant";
//     String studentName;
//     void info () {
//         System.out.println("The school name of both students is " + schoolName + ".");
//     }
// }



// public class Objects_Variables {
//     public static void main(String[] args) {

// // 4. Mix of Instance & Static
// // Create a class BankAccount with:
// // - static variable: bankName = "HDFC"
// // - instance variable: accountHolder (String), balance (double)

// // Create 2 accounts with different holders and balances
// // Print account details and shared bankName

//         BankAccount ba1 = new BankAccount();
//         BankAccount ba2 = new BankAccount();
//         ba1.accountHolder = "Divya";
//         ba2.accountHolder = "Ojas";
//         ba1.balance = 20000;
//         ba2.balance = 2500.45;

//         System.out.println(ba1.accountHolder + "'s balance is " + ba1.balance + " and " + ba2.accountHolder + "'s balance is " + ba2.balance + ". They both share same bank, named " + bankName );
//         // why bank name is not coming in thissssss

//     }
// }


// class BankAccount {
//     static String bankName = "HDFC";
//     String accountHolder;
//     double balance;
//     void accountDetails () {
//         System.out.println("");              // can we do in here like divyas balance is this and ojas's is this and they both share this bank.... kind of 
//     }
// }



