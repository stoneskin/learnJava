# Control Flow Statements in Java

Control flow statements in Java allow you to control the order in which statements are executed in your program based on certain conditions or criteria.

## 1 If-Else Statements

**Definition**

If-else statements allow you to execute different blocks of code based on whether a specified boolean condition is true or false.

**Syntax**

```java
    if (condition) {
        // code to execute if condition is true
    } else {
        // code to execute if condition is false
    }
```

**Example**

```java
    int x = 5;
    if (x > 10) {
        System.out.println("x is greater than 10");
    } else {
        System.out.println("x is less than or equal to 10");
    }
```

**Multiple If-Else Statements**

```java
    int score = 85;
    if (score >= 90) {
        System.out.println("A grade");
    } else if (score >= 80) {
        System.out.println("B grade");
    } else if (score >= 70) {
        System.out.println("C grade");
    } else {
        System.out.println("Failing grade");
    }
```

## 2 Switch Statements

**Definition**

Switch statements provide a way to execute different parts of code based on the value of an expression. It's an alternative to long if-else-if chains when dealing with multiple conditions on a single variable.

**Concepts:**
> [!NOTE]
> **Case:** Each possible value for the switch expression.
> **Break:** Used to exit the switch block after a case is executed.
> **Default:** Executes if none of the cases match the switch expression.

**Example:**

```java
    int day = 3;
    String dayString;

    switch (day) {
        case 1:
            dayString = "Monday";
            break;
        case 2:
            dayString = "Tuesday";
            break;
        case 3:
            dayString = "Wednesday";
            break;
        // More cases...
        default:
            dayString = "Invalid day";
    }
    System.out.println(dayString);
```

## 3 Key Concepts

> [!IMPORTANT]
> 1. The `if` statement can be used alone or with else if and else clauses.
> 2. Multiple conditions can be chained using `else if`.
> 3. The `switch` statement is often more efficient than multiple `if-else` statements when comparing a single variable against multiple values.
> 4. In a `switch` statement, the `break` keyword is used to prevent fall-through to the next case.
> 5. The `default` case in a `switch` statement is optional and executed when no other case matches.

## 4 Practice Quiz

### Questions

1. What will be the output of the following code?
    > ```java
    > int x = 5;
    > if (x > 10) {
    >     System.out.println("x is greater than 10");
    > } else {
    >    System.out.println("x is less than or equal to 10");
    > }
    >```

    > A) Greater than 10 <br>
    B) Equal to 10 <br>
    C) Less than 10 <br>
    D) No output 

2. Which of the following is true about switch statements?

    > A) They can handle ranges of values. <br>
    B) They work with variables of types `int`,`char`, `byte`, `short`, `String`, and `enum`. <br>
    C) The default case is mandatory. <br>
    D) A break statement is not necessary after each case.
    ><details>
    ><summary><i>Answer</i></summary>
    >(<i>B is correct. The `default` is not required; The `Break` statements are optional but recommended to prevent fall-through to the next case. </i>)
    ></details>

3. What is the output of the following code?

    >```java
    >int day = 3;
    >switch (day) {
    >    case 1:
    >        System.out.println("Monday");
    >        break;
    >    case 2:
    >        System.out.println("Tuesday");
    >        break;
    >    case 3:
    >        System.out.println("Wednesday");
    >        break;
    >    default:
    >        System.out.println("Invalid day");
    >        break;
    >}
    >```
    > A) Monday  <br>
    B) Tuesday  <br>
    C) Wednesday  <br>
    D) Invalid day
    ><details>
    ><summary><i>Answer</i></summary>
    > <i> C) Wednesday.</i>
    ></details>

### Short Answer

1. What happens if you omit the break statement in a switch case in Java?
    ><details>
    ><summary><i>Answer</i></summary>
    > <i> If the break statement is omitted, the program will continue executing the code of the following case(s) until it finds a break statement or reaches the end of the switch block. This is known as "fall-through."</i>
    ></details>

### Coding problem

1. Write a program that asks the user for their age and prints "You are eligible to vote" if they are 18 or older, and "You are not eligible to vote" if they are under 18.

    ><details>
    ><summary><i>Answer</i></summary>
    > <i> [VotingAge.java](./coding/VotingAge.java)</i>
    ></details>
2. Write a switch statement that checks a char variable grade for grades 'A', 'B', 'C', 'D', or 'F' and prints out "Excellent", "Good", "Average", "Poor", or "Invalid Grade" respectively. Handle the default case for any other input.

    ><details>
    ><summary><i>Answer</i></summary>
    > <i> [heckGrades.java](./coding/CheckGrades.java)</i>
    ></details>
