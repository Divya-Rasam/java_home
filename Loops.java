package java_home_revision;

public class Loops {
    public static void main(String[] args) {
        
// 1. For Loop
// Print numbers from 1 to 10 using a for loop

        for (int i = 1; i < 11; i++) {
            System.out.print(i + " ");
        } 


System.out.println();

        // 2. While Loop
// Print numbers from 10 to 1 using a while loop

        int i = 10;

        while ( i > 0 ) {
            System.out.print(i + " ");
            i--;
        }

System.out.println();

        // 3. Do-While Loop
// Take an integer n = 5
// Print "I love Java" n times using do-while

        int n = 5;

        do {
            System.out.println("I love Java");
            n--;
        } while (n > 0);


System.out.println();

        // 4. Break Statement
// Print numbers 1 to 10
// Stop printing if number reaches 6

        for ( int j = 1; j < 11; j++) {
            if (j == 6) break;
            System.out.println(j);
        }


System.out.println();

        // 5. Continue Statement
// Print numbers 1 to 10
// Skip printing number 5


        for ( int j = 1; j < 11; j++) {
            if (j == 5) continue;
            System.out.println(j);
        }




// 6. Nested Loops (bonus)
// Print a 3x3 multiplication table using nested for loops

System.out.println();

        for (int k = 3; k <= 3; k++) {
                for ( int j = 1; j < 11; j++) {
                        System.out.println(k + " * " + j + " = " + k*j );
                }
        }





System.out.println();


        for(int a = 1; a <= 3; a++){
                for(int j = 1; j <= 3; j++){
                        System.out.println(a + " * " + j + " = " + (a*j));
                }
        }



    }
}












