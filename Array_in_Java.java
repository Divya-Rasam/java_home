public class Array_in_Java {
    public static void main(String[] args) {
        
        // // 1D Array (Single Dimensional)
        // // Declare first, assign later

        // int [] numbers;      // Declaration
        // numbers = new int[5];   // Allocate space for 5 integers

        // numbers[0] = 10;
        // numbers[1] = 20;
        // numbers[2] = 30;
        // numbers[3] = 40;
        // numbers[4] = 50;

        // System.out.println(numbers[3]);     // 40
        // numbers[3] = 80;
        // System.out.println(numbers[3]);     // 80




        // // Loop through 1D array

        // int [] arr = {5, 10, 15, 20, 25};

        // // Using for loop
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.println(arr[i]);
        // }

        // System.out.println();

        // // Using enhanced for loop
        // for (int num : arr) {
        //     System.out.println(num);
        // }












        // // Declare and allocate size at the same time

        // int [] numbers = new int [5];







        // // Declare and initialize with values

        // int [] numbers = {10, 20, 30, 40, 50};














        // // 2D Array (Two Dimensional)
        // // A 2D array is like a matrix → rows × columns.
        // // Declare first, assign later

        // int [] [] matrix;         // Declaration
        // matrix = new int[3][3];     // Allocate 3 rows * 3 columns

        // matrix[0][0] = 1;
        // matrix[0][1] = 2;
        // matrix[0][2] = 3;
        // matrix[1][0] = 4;
        // matrix[1][1] = 5;
        // matrix[1][2] = 6;
        // matrix[2][0] = 7;
        // matrix[2][1] = 8;
        // matrix[2][2] = 9;

        // System.out.println(matrix[1][2]);    // 6    (2nd row, 3rd column)
        // matrix[0][0] = 10;        // Update first element
        // System.out.println(matrix[0][0]);   // 10  







        // // Declare and allocate size together

        // int [][] matrix = new int [3][3];





        // Declare and initialize directly

        int [][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Loop through 2D array

        // Using nested for loop 

        for (int i = 0; i < matrix.length; i++) {         // Outer loop → goes through rows
            for (int j = 0; j < matrix[i].length; j++) {            // Inner loop → goes through columns of row 
                System.out.print(matrix[i][j] + " ");
            }                                                   
            System.out.println();                // move to next line after printing one row
        }


        System.out.println("Matrix length " + matrix.length);              // number of rows in 2D array

        System.out.println("number of columns in row i = " + matrix[1].length);                     // number of columns in row i










        int[][] mat = {
            {1, 2},
            {3, 4, 5},
            {6}
        };


        System.out.println("Matrix length " + mat.length); 
        System.out.println("Mat[0] length " + mat[0].length);   
        System.out.println("Mat[1] length " + mat[1].length);  
        System.out.println("Mat[2] length " + mat[2].length);  

        // mat.length = 3           // 3 rows
        // mat[0].length = 2        // 2 elements in first row
        // mat[1].length = 3        // 3 elements in second row
        // mat[2].length = 1        // 1 element in third row





















        // Create and print a 1D array of 5 integers.


        // int [] array = new int [5];

        int [] array = {1, 2, 3, 4, 5};

        for ( int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }




        System.out.println();




        // Find the sum of all elements in a 1D array.

        int sum = 0;

        for ( int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        System.out.println("Sum of all elements is " + sum);





        // Create a 2D array (3x3) and print all elements using nested for loops.





        
    }
}




// 🔹 Part A – Quick Theory (Sentence-style)

// Answer in your own words — short & simple.

// What is an array in Java?
// array is a set of same data types elements.

// What are the two main types of arrays in Java?
// 1 d array and 2 d array

// Can an array hold elements of different data types? Why or why not?
// no an array cant hold different data types because (i dont know thw reason please explain me in easy words) i think maybe while acccesing then it will get an error if there are multiple data types

// What does arr.length return?
// arr.length returns the length of that particular array

// What is the index of the first element in an array?
// 0

// What will happen if you try to access an invalid index (like arr[10] when size is 5)?
// it will give error

// What is the difference between a 1D and 2D array?
// one d array is just a single array, 2d array has rows and colums like a matrix

// What does matrix.length give?
// it will give the length of the rows of the matrix array if it is a 2d array

// What does matrix[i].length give?
// it will give the length of the columm of the row with index i

// Can arrays have different row lengths in 2D arrays? If yes, how?
// yes it can have, like in one row there can be 2 columns in 2nd row there can be 4 in 3rd there can be 7 and etc , 

// 🔹 Part B – Code Practice

// Write small Java programs (or explain what happens):

        // // Create and print a 1D array of 5 integers.


        // // int [] array = new int [5];

        // int [] array = {1, 2, 3, 4, 5};

        // for ( int i = 0; i < array.length; i++) {
        //     System.out.print(array[i] + " ");
        // }


        //         // Find the sum of all elements in a 1D array.

        // int sum = 0;

        // for ( int i = 0; i < array.length; i++) {
        //     sum += array[i];
        // }

        // System.out.println("Sum of all elements is " + sum);




















































































































































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