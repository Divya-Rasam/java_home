// public class constructors_method_overloading {
//     public static void main(String[] args) {
        
// // 1. Basic Constructor
// // Create a class Animal with a constructor that prints "Animal created".
// // In main, create an Animal object and see what happens.

//         Animal a = new Animal();

//     }
// }


// class Animal {
//     Animal () {
//         System.out.println("Animal created");
//     }
// }



















// public class constructors_method_overloading {
//     public static void main(String[] args) {
        
// // 2. Constructor Overloading
// // Create a class Student with:
// // Constructor 1 → no parameters, prints "Unknown Student"
// // Constructor 2 → takes name, prints "Student name is <name>"
// // Constructor 3 → takes name + age, prints both.
// // Test all 3 constructors in main.

//         Student s1 = new Student();
//         Student s2 = new Student("Divya");
//         Student s3 = new Student("Divya", 25);

//     }
// }

// class Student {
//     Student () {
//        System.out.println("Unknown Student"); 
//     }

//     Student (String name) {
//         System.out.println("Student name is " + name);
//     }

//     Student (String name, int age) {
//         System.out.println("The student named " + name + " is " + age + " years old.");
//     }
// }





















// public class constructors_method_overloading {
//     public static void main(String[] args) {
        
// // 3. Method Overloading
// // Create a class MathOps with methods multiply():
// // multiply(int a, int b) → returns product of 2 numbers
// // multiply(double a, double b) → returns product of 2 doubles
// // multiply(int a, int b, int c) → returns product of 3 numbers
// // Call all 3 in main.

//         MathOps m = new MathOps();
//         int product = m.multiply(2, 2);
//         System.out.println("The product of two integers is " + product);
//         // System.out.println("The product of " + MathOps.a + " and " + MathOps.b + " is " + product);               // can we get output like this for the three??????
// ⚠️ Error because a and b are local variables inside your method.
// They are not part of the class, so you cannot access them like MathOps.a.

//         double productDouble = m.multiply(2.5, 2.0);
//         System.out.println("The product of two double is " + productDouble);

//         int product3int = m.multiply(2, 2, 10);
//         System.out.println("The product of three integers is " + product3int);

//     }
// }

// class MathOps {
//     int multiply (int a, int b) {
//         int product = a * b;
//         return product;
//     }

//     double multiply (double a, double b) {
//         double product = a * b;
//         return product;
//     }

//     int multiply (int a, int b, int c) {
//         int product = a * b * c;
//         return product;
//     }
// }


// // answer to above doubt
// class MathOps {
//     int multiply (int a, int b) {
//         System.out.println("Multiplying " + a + " and " + b);
//         return a * b;
//     }
// }
// Now when you call, it will also print the numbers being multiplied.




















public class constructors_method_overloading {
    public static void main(String[] args) {
        
// 4. Mix of Constructors + Methods
// Create a class Book with:
// Overloaded constructors → (title), (title+author), (title+author+price)
// Method display() → prints book details
// In main, create 3 books using different constructors and call display().

        Book b1 = new Book("Power of subconcious mind");
        Book b2 = new Book("Power of subconcious mind", "Joseph Murry");
        Book b3 = new Book("Power of subconcious mind", "Joseph Murry", 555);

        b1.display();
        b2.display();
        b3.display();

    }
}

// class Book {
//     // 👉 Fix: Use instance variables.    use thissssss
//     String title;
//     String author;
//     int price;

//     Book(String title) {
//         this.title = title;
//         System.out.println("The title of the book is " + title);
//     }

//     Book(String title, String author) {
//         this.title = title;
//         this.author = author;
//         System.out.println("The title of the book is " + title + " and the book is written by " + author);
//     }

//     Book(String title, String author, int price) {
//         this.title = title;
//         this.author = author;
//         this.price = price;
//         System.out.println("The title of the book is " + title + " and the book is written by " + author + ". The cost of the book is " + price);
//     }

//     void display () {
//         System.out.println("Book details are " + title + ", author being " + author + " and price is " + price);          // why this is getting error
//     }
// }









// class Book {
//     String title;
//     String author;
//     int price;

//     Book(String title) {
//         this.title = title;
//     }

//     Book(String title, String author) {
//         this.title = title;
//         this.author = author;
//     }

//     Book(String title, String author, int price) {
//         this.title = title;
//         this.author = author;
//         this.price = price;
//     }

//     void display() {
//         System.out.print("Book details: " + title);

//         if (author != null) {
//             System.out.print(", author: " + author);
//         }

//         if (price != 0) {
//             System.out.print(", price: " + price);
//         }

//         System.out.println(); // for new line
//     }
// }









class Book {
    // 👉 Fix: Use instance variables.    use thissssss
    String title;
    String author;
    int price;

    Book(String title) {
        this.title = title;
        System.out.println("The title of the book is " + title);
    }

    Book(String title, String author) {
        this.title = title;
        this.author = author;
        System.out.println("The title of the book is " + title + " and the book is written by " + author);
    }

    Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
        System.out.println("The title of the book is " + title + " and the book is written by " + author + ". The cost of the book is " + price);
    }

    void display() {
        System.out.print("Book details: " + title);

        if (author != null) {
            System.out.print(", author: " + author);
        }

        if (price != 0) {
            System.out.print(", price: " + price);
        }

        System.out.println(); // for new line
    }
}

// Multiple System.out.print() calls can join content on the same line.
// The if statements decide whether to add more text.
// Finally, one System.out.println() moves to the next line.






















// public class constructors_method_overloading {
//     public static void main(String[] args) {
        
// // 5. Bonus Challenge
// // Create a class Counter with:
// // Static variable count
// // Constructor → increments count whenever a new object is created
// // Add a static method printCount() → prints total objects created
// // In main, create 3 objects and call printCount().

//         Counter c1 = new Counter();
//         Counter c2 = new Counter();
//         Counter c3 = new Counter();

//         Counter.printCount();

//     }
// }

// class Counter {
//     static int count = 0;
//     Counter () {
//         count++;
//     }
//     static void printCount () {
//         System.out.println("Total objects: " + count);
//     }
// }
















// 🔹 Part A – Quick Quiz (Sentence Style)

// What is a constructor in Java?
// constructor is a methos which runs as soon as an object is made with new keyword
// it has same name as class name
// it is used for initializing values
// 👉 Small correction: it’s not actually a “method” (even though it looks like one). It’s a special member function.

// Does a constructor have a return type?
// no it doest i guess

// When is a constructor called?
// when an object is called constructor is automatically called

// What happens if you don’t write any constructor in a class?
// i think not an issue 
// 👉 Correction: Java automatically provides a default constructor (no-arg). But if you write your own constructor, the default one won’t be provided.

// Can constructors be overloaded? If yes, how?
// yesss they can be we can give different parameters for them and while accessing we have to give that type of parameter directly when we make the object we give parameter there itself

// What is method overloading in Java?
// when we have 2 or more methods in one class with same name but different functions , data types and parameters can be different, while accessing we put in the parametes of the same type

// How does the compiler decide which overloaded method to call?
// it sees what type of arguments or values are been given and as per that compiler compiles

// What is the difference between method overloading and constructor overloading?
// the differences are constructors have same name as class but methods can have whatever name they want, constuctors arguments are directly passed while making the object only but method arguments are given with the .method
// Constructor always same name as class, no return type.
// Methods can have any name + may/may not return values.

// Can you overload methods only by changing the return type (keeping parameters same)? Why/why not?
// yeas we can , the compiler goes though and seach for same data types and carry out the code
// 👉 Actually No – because compiler decides based on parameters, not return type. If two methods have same name & same parameters, Java won’t know which one to call.

// Why do we use method overloading?
// when we have to carry out 2 or more functions which might be different than each other, method overloading can be done


// 🔹 Part B – Code Tasks

// public class constructors_method_overloading {
//     public static void main(String[] args) {
        
// // 1. Basic Constructor
// // Create a class Animal with a constructor that prints "Animal created".
// // In main, create an Animal object and see what happens.

//         Animal a = new Animal();

//     }
// }


// class Animal {
//     Animal () {
//         System.out.println("Animal created");
//     }
// }

// Animal created got printed



// public class constructors_method_overloading {
//     public static void main(String[] args) {
        
// // 2. Constructor Overloading
// // Create a class Student with:
// // Constructor 1 → no parameters, prints "Unknown Student"
// // Constructor 2 → takes name, prints "Student name is <name>"
// // Constructor 3 → takes name + age, prints both.
// // Test all 3 constructors in main.

//         Student s1 = new Student();
//         Student s2 = new Student("Divya");
//         Student s3 = new Student("Divya", 25);

//     }
// }

// class Student {
//     Student () {
//        System.out.println("Unknown Student"); 
//     }

//     Student (String name) {
//         System.out.println("Student name is " + name);
//     }

//     Student (String name, int age) {
//         System.out.println("The student named " + name + " is " + age + " years old.");
//     }
// }

// Output
// Unknown Student
// Student name is Divya
// The student named Divya is 25 years old. 



// public class constructors_method_overloading {
//     public static void main(String[] args) {
        
// // 3. Method Overloading
// // Create a class MathOps with methods multiply():
// // multiply(int a, int b) → returns product of 2 numbers
// // multiply(double a, double b) → returns product of 2 doubles
// // multiply(int a, int b, int c) → returns product of 3 numbers
// // Call all 3 in main.

//         MathOps m = new MathOps();
//         int product = m.multiply(2, 2);
//         System.out.println("The product of two integers is " + product);
//         // System.out.println("The product of " + MathOps.a + " and " + MathOps.b + " is " + product);               // can we get output like this for the three??????

//         double productDouble = m.multiply(2.5, 2.0);
//         System.out.println("The product of two double is " + productDouble);

//         int product3int = m.multiply(2, 2, 10);
//         System.out.println("The product of three integers is " + product3int);

//     }
// }

// class MathOps {
//     int multiply (int a, int b) {
//         int product = a * b;
//         return product;
//     }

//     double multiply (double a, double b) {
//         double product = a * b;
//         return product;
//     }

//     int multiply (int a, int b, int c) {
//         int product = a * b * c;
//         return product;
//     }
// }


// Output
// The product of two integers is 4
// The product of two double is 5.0
// The product of three integers is 40


// public class constructors_method_overloading {
//     public static void main(String[] args) {
        
// // 4. Mix of Constructors + Methods
// // Create a class Book with:
// // Overloaded constructors → (title), (title+author), (title+author+price)
// // Method display() → prints book details
// // In main, create 3 books using different constructors and call display().

//         Book b1 = new Book("Power of subconcious mind");
//         Book b2 = new Book("Power of subconcious mind", "Joseph Murry");
//         Book b3 = new Book("Power of subconcious mind", "Joseph Murry", 555);

//         b1.display();
//         b2.display();
//         b3.display();

//     }
// }

// class Book {
//     Book(String title) {
//         System.out.println("The title of the book is " + title);
//     }

//     Book(String title, String author) {
//         System.out.println("The title of the book is " + title + " and the book is written by " + author);
//     }

//     Book(String title, String author, int price) {
//         System.out.println("The title of the book is " + title + " and the book is written by " + author + ". The cost of the book is " + price);
//     }

//     void display () {
//         // System.out.println("Book details are " + Book.title + ", author being " + Book.author + " and price is " + Book.price);          // why this is getting error
//     }
// }


// public class constructors_method_overloading {
//     public static void main(String[] args) {
        
// // 5. Bonus Challenge
// // Create a class Counter with:
// // Static variable count
// // Constructor → increments count whenever a new object is created
// // Add a static method printCount() → prints total objects created
// // In main, create 3 objects and call printCount().

//         Counter c1 = new Counter();
//         Counter c2 = new Counter();
//         Counter c3 = new Counter();

//         Counter.printCount();

//     }
// }

// class Counter {
//     static int count = 0;
//     Counter () {
//         count++;
//     }
//     static void printCount () {
//         System.out.println("Total objects: " + count);
//     }
// }






























































































































































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