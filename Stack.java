/*last in first out
stacks; all about the push and pop
to add to a stack, push a plate on the stack, pop to remove
push(); pushes an item onto the stack
pop() pop an item off the stack
isEmpty()Test: stack contains no elements returns true if stack soes not contain any elements
use it with a while loop
Move from array to stack
int COUNTER = 0
loop COUNTER from 0 to LINE.length
S.push (LINE[COUNTER])
end loop 
loop while not S.isEMpty()
output( S.pop())
 end loop*/
 
 import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Stack <Integer> s = new Stack<>();
		for (int i = 0; i < 15; i++){
		s.push(i);
		System.out.println(s.peek());
	}
	System.out.println("\n Start unstacking \n");
	while(!s.isEmpty())
	{
	System.out.print(s.pop() + " peeking: ");
	System.out.println(s.peek());
	}
}
}
