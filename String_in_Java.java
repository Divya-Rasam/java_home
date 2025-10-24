public class String_in_Java {

    public static void main(String[] args) {
        


    }
    
}























































































// 🧩 What is a String?
// A String is just text.
// Like "Hello", "Java", "Divya is learning".

// In Java, String is actually a class, not a basic data type.
// But Java lets you use it as if it’s a data type — that’s why we can easily write:
// String name = "Divya";


// 💎 Strings are Immutable (unchangeable)
// Once you make a String, you can’t change it.
// If you try to change it, Java secretly makes a new String object.

// Example:
// String s = "Hello";
// s = s.concat(" World");
// System.out.println(s);
// 👉 "Hello" didn’t change.
// 👉 Java made a new string "Hello World" and stored it in s.

// So now:
// Old one → "Hello" (still in memory)
// New one → "Hello World" (new object)

// 🧠 Why are Strings Immutable?
// Thread-safe → If many parts of your program use the same string, no one can change it unexpectedly.
// Safe as HashMap keys → You can use strings as keys safely because they don’t change.
// Saves memory → Thanks to the String Constant Pool (SCP).


// ☕ String Constant Pool (SCP)
// Java keeps a special memory area to store all string literals.
// If you write:
// String a = "Hello";
// String b = "Hello";
// 👉 Java checks the pool.
// Since "Hello" already exists, it makes both a and b point to the same "Hello" in memory.
// That saves space.

// But if you use new:
// String c = new String("Hello");
// 👉 That forces Java to create a new object, even if "Hello" already exists.


// ✨ Creating Strings
// 1️⃣ Using Literal
// String s1 = "Hello";

// 2️⃣ Using new Keyword
// String s2 = new String("Hello");


// ⚙️ Common String Methods
// | Method                  | Meaning                   | Example                         | Output    |
// | ----------------------- | ------------------------- | ------------------------------- | --------- |
// | `length()`              | Number of characters      | `"Hello".length()`              | `5`       |
// | `charAt(index)`         | Character at position     | `"Java".charAt(1)`              | `'a'`     |
// | `toLowerCase()`         | All lowercase             | `"HELLO".toLowerCase()`         | `"hello"` |
// | `toUpperCase()`         | All uppercase             | `"hello".toUpperCase()`         | `"HELLO"` |
// | `substring(start, end)` | Part of string            | `"Java".substring(1,3)`         | `"av"`    |
// | `equals()`              | Compare (case-sensitive)  | `"abc".equals("abc")`           | `true`    |
// | `equalsIgnoreCase()`    | Compare ignoring case     | `"abc".equalsIgnoreCase("ABC")` | `true`    |
// | `contains()`            | Checks if string has part | `"hello".contains("ell")`       | `true`    |
// | `replace()`             | Replace characters        | `"java".replace('a','o')`       | `"jovo"`  |
// | `trim()`                | Remove extra spaces       | `" hi ".trim()`                 | `"hi"`    |






// 💪 StringBuffer — Mutable String
// When you want to change the text again and again, use StringBuffer.
// Because String is immutable, but StringBuffer is mutable (changeable).

// Example:
// StringBuffer sb = new StringBuffer("Hello");
// sb.append(" World");
// System.out.println(sb); // Hello World
// 👉 It adds " World" to the same object — no new object created.

// 🧰 StringBuffer Methods
// | Method                      | What it does         | Example                  |
// | --------------------------- | -------------------- | ------------------------ |
// | `append()`                  | Adds text at end     | `sb.append(" Java")`     |
// | `insert(pos, text)`         | Adds text in between | `sb.insert(5, "Hello")`  |
// | `replace(start, end, text)` | Replaces part        | `sb.replace(0, 5, "Hi")` |
// | `delete(start, end)`        | Removes part         | `sb.delete(0, 5)`        |
// | `reverse()`                 | Reverses it          | `sb.reverse()`           |
// | `toString()`                | Converts to String   | `sb.toString()`          |
// | `length()`                  | Returns length       | `sb.length()`            |
// | `charAt(index)`             | Returns character    | `sb.charAt(0)`           |


// 🧮 String Arrays
// ☝️ 1D String Array
// Stores a list of strings in one line.
// Example:
// String[] names = {"Tony", "Steve", "Bruce"};

// You can access each:
// System.out.println(names[0]); // Tony

// ✌️ 2D String Array
// Stores strings in rows and columns (like a table).
// Example:
// String[][] avengers = {
//     {"Iron Man", "Thor"},
//     {"Hulk", "Black Widow"},
//     {"Captain America", "Hawkeye"}
// };
// Access example:
// System.out.println(avengers[1][0]); // Hulk