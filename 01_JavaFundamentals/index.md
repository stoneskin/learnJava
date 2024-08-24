# 01 Java Fundamentals (variables, data types, operators)

## 1 Variables

A variable in Java is a container that holds a value. It has a name and a specific data type.

Definition: A variable is a named storage location in a program's memory that can hold different values during the execution of the program.

Example:

```java
    int age = 25;
    String name = "John Doe";
```

## 2 Data Types

A data type defines the kind of data a variable can hold and the operations that can be performed on it.

Java has two categories of data types:

1. Primitive Data Types
2. Reference Data Types

### 2.1 Primitive Data Types:

- **byte**: Stores a single byte of data (-128 to 127)
- **short**: Stores a two-byte integer (-32768 to 32767)
- **int**: Stores a four-byte integer (-2147483648 to 2147483647)
- **long**: Stores an eight-byte integer (-9223372036854775808 to 9223372036854775807)
- **float**: Stores a single-precision floating-point number (32 bits)
- **double**: Stores a double-precision floating-point number (64 bits)
- **char**: Stores a single character (Unicode character)
- **boolean**: Stores a boolean value (true or false)

```java
    // example of primitive data type
    byte myByte = 127;
    int myInt = 1000000;
    double myDouble = 3.14159;
    boolean isJavaFun = true;
    char myChar = 'A';
```

### 2.2 Reference Data Types

- **String**: Represents a sequence of characters.
- **Array**: Stores a collection of elements of the same data type.
- **Classes and Objects**: Represent real-world entities

```java
    String greeting = "Hello, World!";
    int[] numbers = {1, 2, 3, 4, 5};
    MyClass obj= new MyClass();
```

## 3 Operators

Operators are symbols that perform operations on variables and values.

- **Arithmetic Operators**: +, -, *, /, %, ++, --
- **Relational Operators**: ==, !=, >, <, >=, <=
- **Logical Operators**: && (and), || (or), ! (not)
- **Assignment Operators**: =, +=, -=, *=, /=, %=
- **Bitwise Operators**: &, |, ^, ~, <<, >>, >>>
- **Ternary Operator**: condition ? ifTrue : ifFalse;


### 3.1 Arithmetic Operators:

```sh
    + (addition)
    - (subtraction)
    * (multiplication)
    / (division)
    % (modulo - remainder)
    ++ (increment)
    -- (decrement)
```

**Example:**

```java
    int a = 10;
    int b = 3;
    int sum = a + b;  // 13
    int difference = a - b;  // 7
    int product = a * b;  // 30
    int quotient = a / b;  // 3
    int remainder = a % b;  // 1
```

***increment and decrement operator postfix and prefix are not equivalent***

```java
    int a=10,b=20,c=10,d=20;
    int incrementA = a++; // a becomes 11, incrementA is 10
    int decrementB = b--; // b becomes =19, decrementB is 20
    int incrementC= ++c; //  c becomes 11, incrementC  is 11
    int decrementD= --d; // d becomes 19m decrementB is 19

```

### 3.2 Relational Operators

also call Comparison Operators

```sh
    == (equal to)
    != (not equal to)
    > (greater than)
    < (less than)
    >= (greater than or equal to)
    <= (less than or equal to)
```

**Example**

```java
    boolean isGreater = 10 > 5; // Comparison
```

```java
    int x = 5;
    int y = 8;
    boolean isEqual = (x == y);  // false
    boolean isGreater = (x > y);  // false
    boolean notEqual = (x != y);  // true

```

### 3.3 Logic Operators

```sh
    && (logical AND)
    || (logical OR)
    ! (logical NOT)
```

**Example**

```java
    boolean result = (5 > 3) && (2 < 4); // Logical AND
```

### 3.4 Assignment Operators

```sh
    = (assignment)
    += (addition assignment)
    -= (subtraction assignment)
    *= (multiplication assignment)
    /= (division assignment)
    %= (modulo assignment)
```

**Example**

```java
    int x = 5;
    x += 3; // Equivalent to x = x + 3
```

## 4 Practice Quiz

### 4.1 Multiple Choice

1. What is the correct way to declare a variable of type integer with a value of 100?
    > a) int x = 100;
    > b) integer x = 100;
    > c) x = 100;
    > d) int x = 100.0;

2. Which of the following is not a primitive data type in Java?
    > a) int
    > b) float
    > c) String
    > d) char

3. What is the output of the following code?
    > a) 3
    > b) 1
    > c) 0
    > d) 3.33

```java
    int a = 10;
    int b = 3;
    System.out.println(a % b);
```
 
4. Which operator is used for logical AND in Java?
    > a) &
    > b) ||
    > c) &&
    > d) AND

5. What is the result of the following expression?
    > a) true
    > b) false
    > c) 1
    > d) 0
    
>
```java
    boolean x = true;
    boolean y = false;
    System.out.println(x || y);
```

6. What is the value of the variable x after the following code executes?
    > a) 5

    > b) 3

    > c) 8

    > d) 2

    >```Java
    >    int x = 5;
    >    x += 3;
    >```

7. Which operator would you use to determine if a number is even
    > a) /
    > b) %
    > c) *
    > d) +
8. Given the declaration int num = 10;, which of the following is a valid way to decrement the value of num by 2?
    > a) num = num - 2;
    > b) num -= 2;
    > c) num--; num--;
    > d) All of the above

### 4.2 Short Answer

1. Explain the difference between an integer and a floating-point number in Java.
2. Write a Java code snippet to declare and initialize variables for a person's name (String), age (int), and height (double).

### 4.3 Coding Problem

**Write a Java program that:**

    Given two integers `a` and `b`. (if could, Prompts the user to enter two integers)
    Calculates the sum, difference, product, quotient, and remainder of the two numbers.
    Prints the results in a formatted output.
**Note**: For the coding problem, you would typically be expected to write and compile the code, then provide the output or code itself as your answer.