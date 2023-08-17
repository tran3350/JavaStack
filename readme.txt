Stacks: Last-In-First-Out (LIFO)

This project showcases the concept of stacks, which is a fundamental data structure in computer science. Stacks operate on the principle of last in, first out (LIFO), where items are added (pushed) and removed (popped) from the top of the stack.

Features:
- `push(item)`: Add an item to the top of the stack.
- `pop()`: Remove and retrieve the top item from the stack.
- `isEmpty()`: Check if the stack is empty.

Usage:
1. Initialize a stack using the `Stack` class from the `java.util` package.
2. Use the `push(item)` method to add items to the stack.
3. Utilize the `pop()` method to remove and retrieve items from the stack.
4. Use `isEmpty()` to check if the stack is empty.

Example:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        
        // Push items onto the stack
        for (int i = 0; i < 15; i++) {
            s.push(i);
        }
        
        // Peek at the top item without removing it
        System.out.println(s.peek());

        System.out.println("\nStart unstacking\n");
        
        // Pop items from the stack
        while (!s.isEmpty()) {
            System.out.print(s.pop() + " peeking: ");
            System.out.println(s.isEmpty() ? "Stack is empty" : s.peek());
        }
    }
}

This project illustrates the core concepts of stacks and how to use them effectively in Java. Explore the push and pop operations as well as the isEmpty method to manage and manipulate data in a last-in-first-out manner.


Please note that formatting might change depending on the environment you're using to view the `readme.txt` file.
