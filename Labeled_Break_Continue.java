public class Labeled_Break_Continue {
    public static void main(String[] args) {

        // 1. Labeled Break

        outerLoop:           // This is the label for outer loop
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i * j == 4) {
                    break outerLoop;  // Exits the outer loop, not just inner
                }
                System.out.println(i + " " + j);
            }
        }

        System.out.println("Loop ended");



        System.out.println();









        //  2. Labeled Continue

        outerLoop: 
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i == j) {
                    continue outerLoop;  // Skips to next i, outer loop iteration
                }
                System.out.println(i + " " + j);
            }
        }




















System.out.println();
System.out.println();

    //         Exercise 1 – Labeled Break
    // Write a program to find the first pair of numbers (i, j) in nested loops (1 to 5) whose product is 6, and stop all loops 
    // immediately when found. Print the pair.

        outerLoop:
        for ( int i = 1; i < 6; i++ ) {
            for ( int j = 1; j < 6; j++) {
                if ( i * j == 6) {
                    System.out.println(i + "," + j);
                    break outerLoop;
                } 
            }
        }










System.out.println();
System.out.println();

    //         Exercise 2 – Labeled Continue

    // Write a program with nested loops: i = 1 to 3, j = 1 to 3.
    // Skip the current iteration of the outer loop whenever i == j.
    // Print all other pairs (i, j).

    outerLoop:
    for ( int i = 1; i < 4; i++) {
        for ( int j = 1; j < 4; j++ ) {
            if ( i == j ) {
                continue outerLoop;
            }
            System.out.println(i + "," + j);
        }
    }















System.out.println();
System.out.println();

    //     Exercise 3 – Combination

    // Loop i = 1 to 4 (outer) and j = 1 to 4 (inner).
    // If i + j == 5, skip that iteration of outer loop using a labeled continue.
    // Otherwise, print i and j.

    outerLoop:
    for ( int i = 1; i < 5; i++ ) {
        for ( int j = 1; j < 5; j++) {
            if ( i + j == 5 ) {
                continue outerLoop;
            }
            System.out.println( i + "," + j );
        }
    }


















    }
}













// 1. Labeled Break
// Normally, a break stops the nearest loop only.
// But sometimes you have nested loops (a loop inside another loop) and you want to exit the outer loop immediately, not just the inner one. That’s when labeled break comes in handy.
// You give a name (label) to the outer loop, and then break that label from inside the inner loop.

// Example in simple terms:

// outerLoop:           // This is the label for outer loop
// for (int i = 1; i <= 3; i++) {
//     for (int j = 1; j <= 3; j++) {
//         if (i * j == 4) {
//             break outerLoop;  // Exits the outer loop, not just inner
//         }
//         System.out.println(i + " " + j);
//     }
// }
// System.out.println("Loop ended");

// Here, when i*j == 4, both loops stop immediately because of break outerLoop.
// Without label, only the inner loop would stop.




// 2. Labeled Continue
// Normally, a continue skips the current iteration of the nearest loop.
// But if you want to skip an iteration of the outer loop while inside an inner loop, you can use labeled continue.
// Example in simple terms:

// outerLoop: 
// for (int i = 1; i <= 3; i++) {
//     for (int j = 1; j <= 3; j++) {
//         if (i == j) {
//             continue outerLoop;  // Skips to next i, outer loop iteration
//         }
//         System.out.println(i + " " + j);
//     }
// }

// Here, when i == j, it skips the current iteration of the outer loop, so the inner loop doesn’t finish normally.

// Key Points to Remember
// | Statement  | Normal Behavior                     | Labeled Behavior                           |
// | ---------- | ----------------------------------- | ------------------------------------------ |
// | `break`    | Stops **nearest loop**              | Stops the **loop with the label**          |
// | `continue` | Skips iteration of **nearest loop** | Skips iteration of **loop with the label** |


// ✅ In short: Label = name of loop, break/continue + label = act on that specific loop instead of the closest one.




















// Main difference between normal break and labeled break ✅
// Your answer is mostly correct. A small clarification:
// A normal break exits only the nearest loop.
// A labeled break allows you to exit a specific outer loop, not just the inner one.
// Minor note: The label is always for the outer loop, not the inner loop itself. Using a labeled break inside a single loop is possible, but it behaves like a normal break (so your answer for Q2 touches this).



// Can a labeled break be used inside a single loop? ✅
// Yes, technically you can put a label, but it behaves the same as a normal break because there’s no outer loop to affect. So your intuition was correct.



// What happens when a labeled continue is used inside an inner loop? ⚠️
// Slight correction: A labeled continue skips the current iteration of the labeled outer loop, not both loops.
// The inner loop stops the current iteration, and the outer loop moves to its next iteration.
// It does not skip both loops entirely.



// True/False question ✅
// Correct. Without a label, continue cannot affect the outer loop from inside a nested loop.


// Why are labeled break/continue useful? ✅
// Exactly. They are helpful when you want to control outer loops from inside nested loops.



// Main thing to remember:
// Labeled break → exit outer loop.
// Labeled continue → skip current iteration of outer loop.