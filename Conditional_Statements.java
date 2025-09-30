package java_home_revision;

public class Conditional_Statements {
    
    public static void main(String[] args) {

            // 1. Simple if
            // Single condition. Executes block only if true.

// Write a program to check if a number is positive.
// Print "Positive" if it is, else do nothing.

        int num = -8;
        if (num > 0) {
            System.out.println("Positive");
        }




        // 2. if – else
        // Two options: if true → do this, else → do that.

// Take an integer variable marks (0-100)
// Print "Pass" if marks >= 40
// Print "Fail" if marks < 40

        int marks = 30;

        if (marks >= 40) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }






        // 3. if – else if – else
        // Multiple conditions / ranges. Use else if for more than 2 paths.

// Take marks (0-100)
// Print grades:
// 90+ : "A"
// 75-89 : "B"
// 40-74 : "C"
// below 40 : "Fail"

        int Marks = 42;

        if (Marks >= 90) {
            System.out.println("A");
        } else if (Marks >= 75) {
            System.out.println("B");
        } else if (Marks >= 40) {
            System.out.println("C");
        } else {
            System.out.println("Fail");
        }



// Switch cannot check ranges

        // 4. switch
        // Check one variable against many fixed values. Cannot use ranges. Always use break to avoid executing multiple cases.
        
// Create a variable day (1-7)
// Print day name using switch case:
// 1 = Monday, 2 = Tuesday, ..., 7 = Sunday
// If number is not 1-7, print "Invalid day"

        int day = 8;

        switch (day) {
            case 1 : System.out.println("Monday"); break;
            case 2 : System.out.println("Tuesday"); break;
            case 3 : System.out.println("Wed"); break;
            case 4 : System.out.println("Thur"); break;
            case 5 : System.out.println("Fri"); break;
            case 6 : System.out.println("Sat"); break;
            case 7 : System.out.println("Sunday"); break;
            default: System.out.println("Invalid Day");
        }
            







        // 5. Nested if (bonus)
// Take age and marks
// If age >= 18 AND marks >= 50, print "Eligible for scholarship"
// Else, print "Not eligible"

        int age = 1;
        int Mark = 50;

        // if (age >= 18 && Mark >= 50) {
        //     System.out.println("Eligible for scholarship");
        // } else {
        //     System.out.println("Not eligible");
        // }


        // nested 

        if (age >= 18) {
            if (Mark >= 50) {
                System.out.println("Eligible for scholarship");
            }
        }else {
            System.out.println("Not eligible");
        }


        // perfect nested

        if (age >= 18) {
            if (Mark >= 50) {
                System.out.println("Eligible for scholarship");
            } else {
                System.out.println("Not eligible");
            }
        }else {
            System.out.println("Not eligible");
        }

//         Your nested if was missing the else for the inner condition in the first example.
// This is why we usually use combined condition with && (simpler).




// Key Takeaways:
// Use if → 1 condition
// Use if-else → 2 paths
// Use if-else-if-else → multiple conditions or ranges
// Use switch → multiple fixed values, cannot use ranges
// Break in switch → stops the next cases from running
// Nested if → one if inside another



        
    }

}
