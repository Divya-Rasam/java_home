public class Labeled_Break_Continue {
    public static void main(String[] args) {


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





        outerLoop: 
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i == j) {
                    continue outerLoop;  // Skips to next i, outer loop iteration
                }
                System.out.println(i + " " + j);
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