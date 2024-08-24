# 02 Introduction input/Output

Input/Output (I/O) in Java refers to the process of reading data from a source (input) and writing data to a destination (output) Java provides several classes and methods to handle I/O operations, but for AP CSA, we'll focus on the most common ones

## 1 Key Concepts and Definitions

1. **System.out**: A PrintStream object that allows you to output data to the console.
2. **System.in**: An InputStream object that allows you to read input from the console.
3. **Scanner**: A class used to parse primitive types and strings from input sources.
4. **PrintWriter**: A class used to write formatted text to character-output streams.
5. **File I/O**: Operations involving reading from or writing to files, which require understanding of File, FileReader, FileWriter, BufferedReader, and other related classes.

## 2 Examples

### 2.1 Using `System.out` for output

```java
    System.out.println("Hello, World!"); // Prints and moves to a new line
    System.out.print("No new line"); // Prints without moving to a new line
    System.out.printf("Formatted output: %d", 42); // Prints formatted output
```

### 2.2 Using `Scanner` and `System.in` for input

```java
    import java.util.Scanner;

    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter your name: ");
    String name = scanner.nextLine();

    System.out.print("Enter your age: ");
    int age = scanner.nextInt();

    System.out.println("Hello, " + name + "! You are " + age + " years old.");

    scanner.close(); // Always close the Scanner when done
```

### 2.3 Using PrintWrite for file output

```java
    import java.io.PrintWriter;
    import java.io.FileNotFoundException;

    try {
        PrintWriter writer = new PrintWriter("output.txt");
        writer.println("This is a line of text.");
        writer.printf("Formatted output: %d\n", 42); //\n is line break
        writer.close();
    } catch (FileNotFoundException e) {
        System.out.println("Error: File not found");
    }
```

### 2.4 using File Input/Output

```java
    import java.io.*;

    public class FileIOExample {
        public static void main(String[] args) {
            // Writing to a file
            try (FileWriter writer = new FileWriter("example.txt")) {
                writer.write("Hello, File I/O in Java!");
            } catch (IOException e) {
                e.printStackTrace();
            }

            // Reading from a file
            try (BufferedReader reader = new BufferedReader(new FileReader("example.txt"))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
```

### 2.5 Escape Sequences

```java
    System.out.print("new line\n"); // \n is line break
    System.out.print("\"quote\"");  //\" escape the double quote
    System.out.print("\\");  // \\ will print a backslash
```

## 3 Practice Quiz

### 3.1 Multiple Choice

1. Which of the following correctly creates a Scanner object to read from the console?
    > a) Scanner input = new Scanner(); <br> 
    b) Scanner input = new Scanner(System.in); <br> 
    c) Scanner input = new Scanner(console); <br> 
    d) Scanner input = System.in.getScanner(); <br> 
    e) Scanner input = new Scanner(System.out);

2. Consider the following code segment:
    >```java
    >    Scanner sc = new Scanner(System.in);
    >    int x = sc.nextInt();
    >    String s = sc.nextLine();
    >    System.out.println(s);
    >```
   What will be printed if the user enters "42 Java" (without quotes) as input?
    > a) 42
    b) Java  <br> 
    c) 42 Java <br> 
    d) An empty line <br> 
    e) A runtime error will occur

    ><details>
    ><summary><i>Answer</i></summary>
    >(<i>D is correct. After reading the integer 42 with nextInt(), the newline character is left in the input buffer. The subsequent nextLine() consumes this newline, resulting in an empty string being assigned to s.</i>)
    ></details>

3. Which of the following statements about System.out.printf() is true?
    > a) It always moves the cursor to a new line after printing  <br> 
    b) It can only print string values  <br> 
    c) It allows for formatted output using format specifiers <br> 
    d) It is part of the Scanner class

4. What is the purpose of the following code?

    >```java
    >    PrintWriter writer = new PrintWriter("data.txt");
    >    writer.close();
    >```
    >    a) It reads data from a file named "data.txt" <br> 
        b) It creates an empty file named "data.txt" <br> 
        c) It deletes a file named "data.txt" <br> 
        d) It appends data to an existing file named "data.txt" <br> 
        e) It renames a file to "data.txt"
    ><details>
    ><summary><i>Answer</i></summary>
    >   (<i>B is correct. This code creates a new empty file named "data.txt" or overwrites an existing file with that name.</i>)
    ></details>
5. Which of the following is the correct way to read a double value from user input using a Scanner object named input?
    > a) `double d = input.nextDouble();` <br> 
    b) `double d = input.readDouble();` <br> 
    c) `double d = input.getDouble();` <br> 
    d) `double d = (double)input.next();` <br> 
    e) `double d = Double.parseDouble(input.next());`

6. When writing to a file, which exception might you need to handle?
    > a) ArrayIndexOutOfBoundsException <br> 
    b) IOException <br> 
    c) NullPointerException <br> 
    d) ArithmeticException 

### 3.2 Short Answer

1. Explain the difference between System.out.print() and System.out.println()

### 3.3 Coding Problem:

1. Write a Java program that prompts the user to enter their name and age. Then, print a greeting message that includes the user's name and age.

2. Write a Java method named calculateAverage that takes the path to a text file as an argument. This file contains numbers, one per line. The method should read these numbers, calculate their average, and print the result. Handle possible exceptions, and ensure resources are properly closed.
    > [*Answer*](https://gist.github.com/stoneskin/294f517e0a138fcad5487e8a8ecc8d6d)
