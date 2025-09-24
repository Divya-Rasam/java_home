package java_home_revision;

// Arithmetic Practice

// Write a program to calculate:
// sum, difference, product, quotient, and remainder
// for two numbers.

// public class Operators {
    
//     public static void main(String[] args) {
        
//         int a = 5;
//         int b = 2;

//         int add = a + b;
//         int sub = a - b;
//         int mul = a * b;
//         int div = a / b;
//         int mod = a % b;

//         System.out.println(a + " + " + b + " = " + add);
//         System.out.println(a + " - " + b + " = " + sub);
//         System.out.println(a + " * " + b + " = " + mul);
//         System.out.println(a + " / " + b + " = " + div);
//         System.out.println(a + " % " + b + " = " + mod);

//     }
// }













// Assignment Shorthand

// Start with int num = 10;
// Apply += 5, *= 2, -= 4, and print the value after each step.



// public class Operators {
    
//     public static void main(String[] args) {
        
//         int num = 10;
//         int og = num;

//         int add = num += 5;
//         System.out.println(og + " += 5 = " + add);



//         int number = 10;
//         int ognum = number;

//         int mul = number *= 5;
//         System.out.println(ognum + " *= 5 = " + mul);



//         int digit = 10;
//         int ogdig = digit;

//         int sub = digit -= 5;
//         System.out.println(ogdig + " -= 5 = " + sub);


//     }
// }








// Comparison & Logical

// Write a program where:
// age = 20, marks = 85
// Check:
// - is age > 18 AND marks > 50 ?
// - is age < 18 OR marks > 90 ?


// public class Operators {
    
//     public static void main(String[] args) {
        
//         int age = 20;
//         int marks = 85;

//          if (age > 18 && marks > 50) {
//             System.out.println("True: Age is greater than 18 and marks are greater than 50.");
//          } else {
//             System.out.println("False: Age is not greater than 18 and marks are not greater than 50.");
//          }


//           if (age < 18 || marks > 90) {
//             System.out.println("True: Age is less than 18 or marks are greater than 90.");
//          } else {
//             System.out.println("False: Age is not less than 18 or marks are not greater than 90.");
//          }


//     }
// }












// Pre vs Post Increment

// int x = 5;
// System.out.println(x++);   // post-increment
// System.out.println(++x);   // pre-increment
// Explain why outputs differ.


// public class Operators {
    
//     public static void main(String[] args) {
        
//         int x = 5;

// System.out.println(x++);   // post-increment

// int a = 5;
// System.out.println(++a);   // pre-increment

// // x++ will add after executing the code so 5 is the answer
// // ++x will add before  so it will give 6 answer


//     }
// }









// Ternary Shortcut

// int marks = 45;
// Use ternary to print:
// "Pass" if marks >= 40, else "Fail".


// public class Operators {
    
//     public static void main(String[] args) {
        
//         int marks = 45;

//         String output = (marks > 40) ? "Pass" : "Fail";

//         System.out.println(output);


//     }
// }









// 🔹 Part C – Bitwise (for Fun 🧠)



public class Operators {
    
    public static void main(String[] args) {
        
        int a = 5;   // binary 0101
        int b = 3;   // binary 0011

        System.out.println(a & b);   // AND
        System.out.println(a | b);   // OR
        System.out.println(a ^ b);   // XOR
        System.out.println(~a);      // NOT
        System.out.println(a << 1);  // Left shift
        System.out.println(a >> 1);  // Right shift



    }
}



































// these are answers for the above chattttt

// 📝 Practice Sheet on Operators
// 🔹 Part A – Quick Quiz

// What is the difference between == and =?
// == is used for comparison where as = is for assignment

// If a = 5; b = 2; what is the value of a / b?
// 2 (with 1 remainder)

// If x = 10; x += 5; what is x now?
// 15

// What does a++ mean vs ++a?
// a++ is post increment, first carry out operation then increment
// ++a is pre increment, first increment then operation

// Write the output:

// int a = 7, b = 3;
// System.out.println(a % b);
// = 1



// // Arithmetic Practice

// // Write a program to calculate:
// // sum, difference, product, quotient, and remainder
// // for two numbers.

// public class Operators {
    
//     public static void main(String[] args) {
        
//         int a = 5;
//         int b = 2;

//         int add = a + b;
//         int sub = a - b;
//         int mul = a * b;
//         int div = a / b;
//         int mod = a % b;

//         System.out.println(a + " + " + b + " = " + add);
//         System.out.println(a + " - " + b + " = " + sub);
//         System.out.println(a + " * " + b + " = " + mul);
//         System.out.println(a + " / " + b + " = " + div);
//         System.out.println(a + " % " + b + " = " + mod);

//     }
// }






// // Assignment Shorthand

// // Start with int num = 10;
// // Apply += 5, *= 2, -= 4, and print the value after each step.



// public class Operators {
    
//     public static void main(String[] args) {
        
//         int num = 10;
//         int og = num;

//         int add = num += 5;
//         System.out.println(og + " += 5 = " + add);



//         int number = 10;
//         int ognum = number;

//         int mul = number *= 5;
//         System.out.println(ognum + " *= 5 = " + mul);



//         int digit = 10;
//         int ogdig = digit;

//         int sub = digit -= 5;
//         System.out.println(ogdig + " -= 5 = " + sub);


//     }
// }




// // Comparison & Logical

// // Write a program where:
// // age = 20, marks = 85
// // Check:
// // - is age > 18 AND marks > 50 ?
// // - is age < 18 OR marks > 90 ?


// public class Operators {
    
//     public static void main(String[] args) {
        
//         int age = 20;
//         int marks = 85;

//          if (age > 18 && marks > 50) {
//             System.out.println("True: Age is greater than 18 and marks are greater than 50.");
//          } else {
//             System.out.println("False: Age is not greater than 18 and marks are not greater than 50.");
//          }


//           if (age < 18 || marks > 90) {
//             System.out.println("True: Age is less than 18 or marks are greater than 90.");
//          } else {
//             System.out.println("False: Age is not less than 18 or marks are not greater than 90.");
//          }


//     }
// }