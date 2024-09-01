# 5 Methods

Methods are reusable blocks of code that perform specific tasks. They are essential for organizing code, promoting reusability, and implementing abstraction in Java programs

## 5.1 Defining Methods

A method is defined using the `public` or `private` access modifier, followed by the return type, method name, and parameter list. The parameter list consists of a comma-separated list of parameter types and variable names. The method body is enclosed in curly braces `{}`.

### Syntax:

```java
[public|private] <return type> <method name>(<parameter type> <parameter name>,...) {
    // method body
    // code to be executed when the method is called
    return returnValue; // optional,if the method returns a value
}
```

### Key points:

- **Access modifier** (e.g., public, private) determines the visibility of the method
- **Return type**specifies the type of value the method returns (use 'void' if it doesn't return anything)
- **Method name** should be descriptive and follow camelCase convention
- **Parameters** are inputs to the method (optional)

### Example:

Here is an example of a method that takes two integers as parameters and returns their sum:

```java
public int add(int a, int b) {      

    return a + b;

}
```

In this example, the method `add` takes two integer parameters `a` and `b`, and returns their sum. The method body consists of a single line that returns the sum of `a` and `b`.


## 5.2 Calling Methods

To use a method, you need to call it. Method calls can be made within the same class or from other classes, depending on the method's access modifier.


### Example:

Here is an example of a method call:

```java
int result = add(5, 10);
```
Full example:

```java
//Main.java
public class Main {
    public static void main(String[] args) {
        int result = add(5, 10);
        System.out.println(result);
    }

    public static int add(int a, int b) {
        return a + b;
    }

}
```

In this example,  The `main` method call the add method with arguments 5 and 10. The result of the method call is stored in the variable `result`. 

## 5.3 Parameters

Parameters are variables that are passed to a method when it is called. They are used to pass data to the method and to receive data from the method.

### Types of parameters

There are three types of parameters:

1. **Input parameters** - These are the parameters that are used to pass data to the method. The values of these parameters are set by the caller of the method.

2. **Output parameters** - These are the parameters that are used to receive data from the method. The values of these parameters are set by the method and can be used by the caller of the method.

3. **Input/Output parameters** - These are the parameters that are used to pass data to and receive data from the method. The values of these parameters are set by the caller of the method and can be used by the method.

### Example:

Here is an example of a method that takes two integers as input parameters, adds them, and returns the result:

```java
public int add(int a, int b) {      

    return a + b;

}
```

In this example, the method `add` takes two integer parameters `a` and `b`, and returns their sum. The method body consists of a single line that returns the sum of `a` and `b`.



In this example, the method `multiply` takes two integer parameters `a` and `b`, and an integer array `result` as input/output parameters. The method body consists of a single line that sets the first element of the `result` array to the product of `a` and `b`.   

## 5.4 Return Values

A method can return a value, which can be used by the caller of the method. The return type of a method specifies the type of value that the method returns. The return type can be `void` if the method doesn't return anything.

### Example:

Here is an example of a method that takes two integers as input parameters, adds them, and returns the result:

```java
public double calculateAverage(int[] numbers) {
    int sum = 0;
    for (int num : numbers) {
        sum += num;
    }
    return (double) sum / numbers.length;
}
```
##  5.5 void Methods
Here is an example of a method that takes two integers as input/output parameters, multiplies them, and returns the result:

```java
public void multiply(int a, int b, int[] result) {      

    result[0] = a * b;

}
```

## 5.6 Overloading Methods

Java allows you to define multiple methods with the same name, but different parameter lists. This is called overloading.

### Example:

Here is an example of a method that takes two integers as input parameters, adds them, and returns the result:


```java
public int add(int a, int b) {      

    return a + b;

}

public int add(int a, int b, int c) {      

    return a + b + c;

}
```

In this example, the `add` method takes two integer parameters `a` and `b`, and returns their sum. The `add` method also takes three integer parameters `a`, `b`, and `c`, and returns their sum.   

## 5.7 Static Methods vs Instance Methods

In Java, a method can be either static or instance.

- A static method belongs to the class and not to any instance of the class. It can be called using the class name, without creating an object of the class.

- An instance method belongs to an instance of the class and can only be called using an object of the class.

### Example:

Here is an example of a static method:

```java
public static void printHello() {
    System.out.println("Hello");
}
```

In this example, the `printHello` method is a static method. It belongs to the `Main` class and can be called using the class name, without creating an object of the class.

- **Static methods** belong to the class and can be called without creating an object
- **Instance methods** belong to objects of the class

### Example:

```java
    public class MathOperations {
        public static int add(int a, int b) { // Static method
            return a + b;
        }

        public int subtract(int a, int b) { // Instance method
            return a - b;
        }
    }

    // Usage static mthoed
    int sum = MathOperations.add(5, 3); // Calling static method

    // usage of instance method
    MathOperations math = new MathOperations();
    int difference = math.subtract(10, 4); // Calling instance method
```

## 5.8 Practice Quiz

1. Which of the following is a correct method header in Java?
> A public void calculateArea(double radius);
B) public double calculateArea(double radius) 
C) public calculateArea(double radius)
D) void public calculateArea(double radius)
E) public static calculateArea(double radius)

2. (Method Overloading) Consider the following Java code:

>```java
>    public class Calculator {
>    public int add(int a, int b) {
>        return a + b;
>    }
>
>    // ... other methods ...
>}
>```

Which of the following methods could be added to the Calculator class without causing a compilation error?

> A. public int add(double a, double b)   <br> 
B. public double add(int a, int b)  <br> 
C. public int add(int a, int b, int c)  <br> 
D. public void add(int a, int b)

><details>
><summary><i>Answer</i></summary>
>   (<i>Answer: A and C.</i>)
></details>

3. Which lines in the code above will result in a compilation error?

 > ```java
 > public class Example {
 >   int x = 10;
 >   public void myMethod() {
 >       int y = 20;
 >       System.out.println(x); // Line 1
 >       System.out.println(y); // Line 2
 >   }
>
 >   public static void main(String[] args) {
 >       Example obj = new Example();
 >       obj.myMethod();
 >       System.out.println(x); // Line 3
 >       System.out.println(y); // Line 4
 >   }
 >}
> ```

> A. Line 1 and Line 2   <br> 
B. Line 2 and Line 4  <br> 
C. Line 3 and Line 4  <br> 
D. Line 1 and Line 4

><details>
><summary><i>Answer</i></summary>
>   (<i>Answer: B</i>)
></details>

4. Consider the following Java method:

> ```java
> public static String reverseString(String str) {
>     // ... implementation ...
> }
> ```

Which of the following statements accurately describes the method's behavior?

> A. The method takes a String as input and returns a new String that is the reverse of the input.  <br> 
B. The method takes a String as input and modifies the input String to be reversed.  <br> 
C. The method takes a String as input and returns the length of the input String.  <br> 
D. The method takes a String as input and returns a boolean indicating whether the input String is a palindrome.

><details>
><summary><i>Answer</i></summary>
>   (<i>Answer: A and C.</i>)
></details>

6. Write a method named calculateArea that takes two parameters, length and width, both of type int. The method should return the area of a rectangle as an int.

> ```java
> public int calculateArea(int length, int width) {
>     // Your code here
> }
> ```

><details>
><summary><i>Answer</i></summary>
> 
> public int calculateArea(int length, int width) {  <br> 
>     return length * width;  <br> 
> }   <br> 
> 
></details>

7. Write a method named findMax that takes an array of integers as a parameter and returns the maximum value in the array.
Example:
> ```java
> public int findMax(int[] numbers) {
>     // Your code here
> }
> ```


><details>
><summary><i>Answer</i></summary>
> 
> public int findMax(int[] numbers) {
>     int max = numbers[0];
>     for (int num : numbers) {
>         if (num > max) {
>             max = num;
>        }
>    }
>  r> 
> 
></details>