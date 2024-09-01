# 04 Loops

## 1. Java Loops for AP CSA

Loops are fundamental programming constructs that allow you to execute a block of code repeatedly. In Java, there are three main types of loops: for loops, while loops, and do-while loops. For AP Computer Science A, you'll primarily focus on for loops and while loops.

## 2. For Loops

A for loop is used to execute a block of code repeatedly based on a specified number of iterations. The syntax for a for loop is as follows:

Syntax:
```java
for (initialization; condition; iteration) {
    // Code to be executed
}
```

Example:
```java
for (int i = 0; i < 10; i++) {
    System.out.println(i);
}
```
In this example, the for loop initializes the variable `i` to 0, checks if `i` is less than 10, and increments `i` by 1 after each iteration. The code inside the loop is then executed 10 times, with the value of `i` changing from 0 to 9 in each iteration.

>- int i = 0 is the initialization part.
>- i < 5 is the condition that must be true for the loop to continue.
>- i++ is the iteration part that increments i by 1 after each iteration.

## 3. while Loops

A while loop is used to execute a block of code repeatedly as long as a specified condition is true. The syntax for a while loop is as follows:

Syntax:

```java 
while (condition) {
    // Code to be executed
}
```

Example:

```java
int i = 0;
while (i < 10) {
    System.out.println(i);
    i++;
}
```

In this example, the while loop checks if `i` is less than 10. If it is, the code inside the loop is executed, and `i` is then incremented by 1. This process repeats until `i` is no longer less than 10.  

>-    i < 5 is the condition that must be true for the loop to continue.
>-   i++ is the iteration part that increments i by 1 after each iteration.
>-   Key Differences and Use Cases
>-    For Loop: Use when the number of iterations is known beforehand. It is often used with arrays or collections where the size is fixed.
>-   While Loop: Use when the number of iterations is not known beforehand. It is often used in situations where the loop termination depends on a condition that changes over time.

## 4. do-while Loops

A do-while loop is similar to a while loop, but it guarantees that the code inside the loop is executed at least once. The syntax for a do-while loop is as follows:


Syntax:

```java 
do {
    // Code to be executed
} while (condition);

```

Example:

```java
int i = 0;  

do {
    System.out.println(i);
    i++;
} while (i < 10);
```

In this example, the do-while loop checks if `i` is less than 10. If it is, the code inside the loop is executed, and `i` is then incremented by 1. This process repeats until `i` is no longer less than 10. The loop then terminates, and the code after the loop is executed.






## 4. Choosing Between For and While Loops

>- Use a for loop when you know the number of iterations in advance
>- Use a while loop when you don't know how many times the loop will execute
>- Do-While Loop: Use when the loop body must be executed at least once 

## 5. Common Loop Patterns

### 5.1. Iterating through an array:

```java
    int[] numbers = {1, 2, 3, 4, 5};

    for (int i = 0; i < numbers.length; i++) {
        System.out.println(numbers[i]); // prints 1, 2, 3, 4, 5
    }
```

### 5.2. Accumulating a sum

```java
    int sum = 0;
    for (int i = 1; i <= 10; i++) {
        sum += i;
    }
    System.out.println("Sum: " + sum);
```

### 5.3. Finding the maximum value:

```java
    int[] numbers = {1, 5, 3, 9, 7};
    int max = numbers[0];
    for (int i = 1; i < numbers.length; i++) {
        if (numbers[i] > max) {
            max = numbers[i];
        }
    }
    System.out.println("Max: " + max);
```

### 5.4. Counting the number of elements in an array:


```java
    int[] numbers = {1, 2, 3, 4, 5};
    int count = 0;
    for (int i = 0; i < numbers.length; i++) {
        count++;
    }
    System.out.println("Count: " + count);
```

### 5.5. Finding the index of the first occurrence of a value in an array:

```java
    int[] numbers = {1, 2, 3, 4, 5};
    int index = -1;
    for (int i = 0; i < numbers.length; i++) {
        if (numbers[i] == 3) {
            index = i;
            break;
        }
    }
    System.out.println("Index: " + index);
```

## 6. Loop Control Statements

> - break: Exits the loop immediately
> - continue: Skips the rest of the current iteration and moves to the next

Example:

```java
for (int i = 0; i < 10; i++) {
    if (i == 3) {
        continue; // Skip printing 3
    }
    if (i == 5) {
        break; // exit the loop
    }        
    System.out.println(i);
}           
```

Output:

```
0
1
2
4 
```


## 7. Practice Quize

### 7.1 Multiple choice:

1. What is the correct syntax for a for loop in Java?

> A) for (int i = 0; i < 10; i++)
> B) for (int i = 0; i < 10; i--)
> C) for (int i = 0; i > 10; i++)
> D) for (int i = 0; i < 10; i = i + 2)

> <details>
> <summary><i>Answer</i></summary>
> Answer: A
> </details>

2. What is the output of the following code snippet?

```java
int i = 0;
while (i < 5) {
    System.out.print(i + " ");
    i++;
}
```
> A) 0 1 2 3 4   <br> 
> B) 1 2 3 4 5   <br> 
> C) 0 1 2 3 4 5   <br> 
> D) 1 2 3 4  

> <details>
> <summary><i>Answer</i></summary>
> Answer: A
> </details>

3. Which loop is more appropriate for iterating over a known range of numbers?

> A) for loop   <br> 
> B) while loop   <br> 
> C) Both are equally appropriate   <br> 
> D) Neither   

> <details>
> <summary><i>Answer</i></summary>
> Answer: A
> </details>

4. Which of the following is true about the while loop?

> A) It requires a known number of iterations.   <br> 
> B) It checks the condition after executing the loop body.   <br> 
> C) It is more flexible when the number of iterations is not known beforehand.   <br> 
> D) It cannot be used to iterate over a collection.

> <details>
> <summary><i>Answer</i></summary>
> Answer: C
> </details>

5. What is the output of the following code snippet?

>```java
>    int i = 0;
>    do {
>        System.out.print(i + " ");
>        i++;
>    } while (i < 5);
>```

> A) 0 1 2 3 4   <br> 
> B) 1 2 3 4 5   <br> 
> C) 0 1 2 3 4 5   <br> 
> D) 1 2 3 4

> <details>
> <summary><i>Answer</i></summary>
> Answer: A
> Explanation: The do-while loop executes the block of code at least once before checking the condition. It starts with i equal to 0, prints i, increments i by 1, and continues until i is no longer less than 5, resulting in the output 0 1 2 3 4.
> </details>

6. Which loop should be used when you need to ensure that the loop body is executed at least once?

> A) for loop   <br> 
> B) while loop   <br> 
> C) do-while loop   <br> 
> D) Any of the above
    > <details>
    > <summary><i>Answer</i></summary>
    > Answer: C
    >   Explanation: `do-while` loop should be used when you need to ensure that the loop body is executed at least once because it checks the condition after executing the loop body.
   > </details>

### 7.2. Free Response Question:

1. What is the output of the following code snippet?

```java
for (int i = 0; i < 3; i++) {
    for (int j = 0; j < 2; j++) {
        System.out.print("(" + i + "," + j + ") ");
    }
}
```

2. Write a method called countFactors that takes an integer parameter n and returns the number of factors of n (including 1 and n itself). Your method should use a loop to determine this count.
For example:
countFactors(12) should return 6 (factors are 1, 2, 3, 4, 6, 12)
countFactors(7) should return 2 (factors are 1 and 7) 

```java
public class FactorCounter {
    public static int countFactors(int n) {
        // Your code here
    }

    public static void main(String[] args) {
        System.out.println(countFactors(12)); // Should print 6
        System.out.println(countFactors(7));  // Should print 2
    }
}
```
