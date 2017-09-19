 //Pedro Ledesma 
//CSC 311 
//Professor Chatterjee
//This program is the stack example from lecture 
class StackMethods{
	int[] stack;
	int top;
	int size;
	
	public StackMethods(int arraySize){
		size = arraySize;
		stack = new int[size];
		top = -1;
		
	}
	
	public void push(int value){
		if(top == size -1)
			System.out.println("Stack Overflow ");
		else
		{
			top = top + 1;
			stack[top] = value;
		}
	}
	
	public int pop(){
		
		int returnValue = -1;
		if(!isEmpty() )
		{
			returnValue = stack[top];
			top--;
		}
		else
			System.out.println("Stack Underflow");
		
		return returnValue;
	}
	
	public boolean isEmpty(){
		
		return top == -1;
	}
	
	public void display(){
		System.out.println("The content of the stack is: ");
		for(int i = 0; i <= top; i++)
			System.out.print(stack[i] + " | ");
		System.out.println(" ");
	}
	
	public int peek(){
		return stack[top];
	}
}
public class stackExample1 {
	public static void main(String[] args){
		StackMethods newStack = new StackMethods(5);
		newStack.display();
		newStack.push(10);
		newStack.push(20);
		newStack.display();
		newStack.push(100);
		newStack.push(90);
		newStack.display();
		newStack.pop();
		newStack.display();
		System.out.println(newStack.peek());
	}

}
