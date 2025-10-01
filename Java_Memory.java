// ⚠️ Can you declare a local variable as static? Why/why not?
// You wrote: “no as the local variable cannot be accese outside that block”
// 👉 Almost right, but the actual reason:

// Local variables live only until the method ends.

// Static lives as long as the class is loaded.
// So they conflict → that’s why you cannot declare local as static.













// public class Java_Memory {
//     public static void main(String[] args) {
        
// // 1. Local Variable

// // Write a method that declares a local variable int x = 10 and prints it.
// // Call the method from main().

//         Local_variable lv = new Local_variable();
//         lv.declare();


//     }
// }


// class Local_variable {
//         void declare () {
//         int x = 10;
//         System.out.println("The value of x is " + x);
//     }
// }
        






























// public class Java_Memory {
//     public static void main(String[] args) {
        

// // 2. Instance Variable

// // Create a Student class with an instance variable name.
// // Make two objects with different names and print both.

//         Student s1 = new Student();
//         Student s2 = new Student();
//         s1.name = "Divya";
//         s2.name = "Ojas";

//         System.out.println("The name of student 1 is " + s1.name + " and the name of student 2 is " + s2.name);

//     }
// }


// class Student {
//     String name;
// }






































// public class Java_Memory {
//     public static void main(String[] args) {
        

// // 3. Static Variable

// // Create a School class with a static variable schoolName = "ITVedant".
// // Make two students with different names, but print their common school.

//         School s1 = new School();
//         School s2 = new School();

//         s1.name = "Divya";
//         s2.name = "Ojas";

//         System.out.println("The name of the student 1 is " + s1.name + " and the name of the student 2 is " + s2.name + ". The both study in the same school named " + School.schoolName);


//     }
// }

// class School {
//     static String schoolName = "ITVedant";
//     String name;
// }





































// public class Java_Memory {
//     public static void main(String[] args) {

// // 4. Mix of Static + Instance
// // Create a BankAccount class with:
// // static variable bankName = "HDFC"
// // instance variables accountHolder and balance
// // Make two accounts and print both details + shared bank.

//         BankAccount1 ac1 = new BankAccount1();
//         BankAccount1 ac2 = new BankAccount1();

//         ac1.accountHolder = "Divya";
//         ac2.accountHolder = "Oju";

//         ac1.balance = 50000;
//         ac2.balance = 100000;

//         System.out.println(ac1.accountHolder + "'s balance is " + ac1.balance + " where as " + ac2.accountHolder + "'s balance is " + ac2.balance + " but they both share same bank named " + BankAccount1.bankName);
//         // why it is showing error what is wrong in this
//     }
// }

// class BankAccount1 {
//     static String bankName = "HDFC";
//     String accountHolder;
//     int balance;
// }




































public class Java_Memory {
    public static void main(String[] args) {


// 5. Bonus – Static Counter

// Modify BankAccount to have a static variable totalAccounts.
// Every time a new account is created, increment it in the constructor.
// Print totalAccounts after creating 3 accounts.

        BankAccount2 ac1 = new BankAccount2();
        BankAccount2 ac2 = new BankAccount2();
        BankAccount2 ac3 = new BankAccount2();

        ac1.accountHolder = "Divya";
        ac2.accountHolder = "Oju";
        ac3.accountHolder = "Zoro";

        ac1.balance = 50000;
        ac2.balance = 100000;
        ac3.balance = 100;

        System.out.println("Total accounts are : " + BankAccount2.totalAccounts); 
    }
}

class BankAccount2 {
    static String bankName = "HDFC";
    static int totalAccounts = 0;
    String accountHolder;
    int balance;
    BankAccount2 () {
        totalAccounts++;                   // // every new account increases counter
    }
}
























































        
















// class Student {
//     // Instance variable (Heap)
//     int age;

//     // Static variable (Method Area)
//     static String schoolName = "ITVedant";

//     void showInfo() {
//         // Local variable (Stack)
//         String course = "Java"; 

//         System.out.println("Age: " + age);
//         System.out.println("School: " + schoolName);
//         System.out.println("Course: " + course);
//     }
// }










































































































































// 📌 Breakdown:
// age → each student object has its own.
// schoolName → same for all students.
// course → only lives inside showInfo() method.









// // 🔹 Java Variables Comparison
// | Feature              | **Local Variable**                 | **Instance Variable**                        | **Static Variable**                          |
// | -------------------- | ---------------------------------- | -------------------------------------------- | -------------------------------------------- |
// | **Where declared?**  | Inside method/constructor/block    | Inside class, **outside** methods            | Inside class, with **static** keyword        |
// | **Memory Location**  | **Stack**                          | **Heap** (inside object)                     | **Method Area**                              |
// | **Lifetime**         | Exists till method finishes        | Exists till object exists                    | Exists till program ends / class unloaded    |
// | **Default Value**    | ❌ No default → must be initialized | ✅ Gets default (0, null, false) if not given | ✅ Gets default (0, null, false) if not given |
// | **Belongs To**       | Method/block                       | Object (per instance)                        | Class (shared by all objects)                |
// | **How many copies?** | Created **every time** method runs | Each object gets its own copy                | Only **one copy** for all objects            |
// | **Access**           | Only inside the method/block       | With **object reference** → `obj.var`        | With **class name (best)** → `ClassName.var` |
// | **Can be static?**   | ❌ No                               | ❌ No                                         | ✅ Yes (that’s what it is)                    |
// | **Example**          | `int x = 5;` inside method         | `String name;` inside class                  | `static String schoolName = "ABC";`          |










// 1. Heap Memory
// A big cupboard where all objects live.
// Created when you use new.
// Stores: objects, arrays, instance variables.
// Cleaned by Garbage Collector (GC) automatically.
// If full → OutOfMemoryError.

// 📌 Example:
// Car c = new Car("Ford"); // Object lives in heap
// c = null;                // Now no reference → GC cleans it
















// 2. Stack Memory
// Small temporary shelf.
// Stores: method calls, local variables, object references (not the object itself).
// Created when method starts, removed when method ends.

// 📌 Example:
// void test() {
//    int x = 10; // local variable → stack
//    Car c = new Car("BMW"); // c (reference) in stack, object in heap
// }















// 3. Method Area
// Stores class info, static variables, method code.
// Shared across the whole program.

// 📌 Example:
// static int count; // stored in method area








// 4. PC Register
// JVM’s “notebook” that tracks which instruction a thread is executing.
// Internal use → you don’t touch it in code.









// 🔹 Garbage Collection (GC)
// Java janitor → cleans unused objects in heap.
// Object becomes garbage if no reference points to it.

// 📌 Example:
// Car c = new Car("Audi"); // Heap
// c = null;                // GC will remove "Audi" object


















// ✅ Super Shortcut:
// Heap → Objects + instance variables.
// Stack → Method calls + local variables + references.
// Method Area → Static stuff + class info.
// PC Register → Execution tracker.