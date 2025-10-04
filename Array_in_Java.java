public class Array_in_Java {
    public static void main(String[] args) {
        // now lets do theory and practical questions like we did for all topics

    }
}


























// An array is a collection of elements stored in a single variable.
// All elements must be of the same data type.
// Fixed size → Once created, the size cannot change.
// Indexing starts from 0 → First element is arr[0], second is arr[1], etc.

// 1D array → simple list of elements [10, 20, 30]
// 2D array → table/matrix [ [1,2,3], [4,5,6], [7,8,9] ]
// Use loops to easily access or update array elements.




// 1️⃣ 1D Array (Single Dimensional)
// Declaration & Initialization
// // 1. Declare first, assign later
// int[] numbers;
// numbers = new int[5]; // space for 5 integers
// numbers[0] = 10;
// numbers[1] = 20;

// // 2. Declare & allocate size
// int[] numbers2 = new int[5];

// // 3. Declare & initialize with values directly
// int[] numbers3 = {10, 20, 30, 40, 50};

// Accessing Elements
// System.out.println(numbers3[0]); // 10
// numbers3[1] = 25;                 // Update element at index 1

// Loop through 1D array
// int[] arr = {5, 10, 15, 20};

// // Using for loop
// for (int i = 0; i < arr.length; i++) {
//     System.out.println(arr[i]);
// }

// // Using enhanced for loop
// for (int num : arr) {
//     System.out.println(num);
// }


















// 2️⃣ 2D Array (Two Dimensional)
// Declaration & Initialization
// // 1. Declare first, assign later
// int[][] matrix;
// matrix = new int[3][3]; // 3 rows × 3 columns
// matrix[0][0] = 1;
// matrix[0][1] = 2;

// // 2. Declare & allocate size together
// int[][] matrix2 = new int[2][2];

// // 3. Declare & initialize directly
// int[][] matrix3 = {
//     {1, 2, 3},
//     {4, 5, 6},
//     {7, 8, 9}
// };

// Accessing Elements
// System.out.println(matrix3[1][2]); // 6 (2nd row, 3rd column)
// matrix3[0][0] = 10;                // Update first element

// Loop through 2D array
// int[][] mat = {
//     {1, 2, 3},
//     {4, 5, 6},
//     {7, 8, 9}
// };

// // Using nested for loop
// for (int i = 0; i < mat.length; i++) {
//     for (int j = 0; j < mat[i].length; j++) {
//         System.out.print(mat[i][j] + " ");
//     }
//     System.out.println();
// }

// // Output:
// // 1 2 3
// // 4 5 6
// // 7 8 9

// Tips & Tricks
// arr.length → gives size of 1D array
// matrix.length → number of rows in 2D array
// matrix[i].length → number of columns in row i
// Arrays are fixed size. To change size, you need ArrayList.




// Visual Diagram of 1D vs 2D Array
// 1D Array
// Index:  0   1   2   3   4
// Array: [10, 20, 30, 40, 50]


// Single line
// Access with arr[index] → arr[2] = 30

// 2D Array
// mat[3][3] = {
//    {1, 2, 3},   // row 0
//    {4, 5, 6},   // row 1
//    {7, 8, 9}    // row 2
// }

// Indexes:
//           col0 col1 col2
// row0 ->   1    2    3
// row1 ->   4    5    6
// row2 ->   7    8    9
// Access with mat[row][col] → mat[1][2] = 6

// ✅ Key idea:
// 1D array → just a line of elements → 1 index
// 2D array → grid/table → 2 indexes (row & column)
// Nested loop → outer loop for rows, inner loop for columns