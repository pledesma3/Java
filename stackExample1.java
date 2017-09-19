 //Pedro Ledesma 
//CSC 311 
//Professor Chatterjee
//This program is the stack example from lecture 
class StackMethods{
	int[] stack;		//array for the stack
	int top;			//variable for the top element in the stack
	int size;			//variable for size of the stack
	
	public StackMethods(int arraySize){
		size = arraySize;		//initialize the stack size
		stack = new int[size];
		top = -1;
		
	}
	
	public void push(int value){
		if(top == size -1)	//print this if you are trying to push more elements than the given size
			System.out.println("Stack Overflow ");
		else
		{
			top = top + 1;			//place the pushed value onto the stack array
			stack[top] = value;		//create a new top value when that value is pushed on stack
		}
	}
	
	public int pop(){		//method to pop values out from stack LIFO
		
		int returnValue = -1;		//if stack is empty return -1
		if(!isEmpty() )				//if stack is not empty
		{
			returnValue = stack[top];	//pop out the last value pushed on stack
			top--;
		}
		else						//if empty then print stack underflow
			System.out.println("Stack Underflow");
		
		return returnValue;
	}
	
	public boolean isEmpty(){	//if the stack is empty, return -1
		
		return top == -1;
	}
	
	public void display(){		//method to display the stack
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
		StackMethods newStack = new StackMethods(5); //the stack size will be 5
		newStack.display();		//Display the empty stack
		newStack.push(10);		//push value 10 onto stack
		newStack.push(20);		//push value 20 onto stack
		newStack.display();		//display what is currently on the stack
		newStack.push(100);		//push value 100 onto the stack
		newStack.push(90);		//push value 90 onto the stack
		newStack.push(80);		//push value 80 onto the stack
		newStack.display();		//display what is currently on the stack	
		newStack.pop();			//pop out the last number pushed onto the stack
		newStack.display();		//display the stack
		System.out.println(newStack.peek()); //print out the value that is at the peek of the stack
	}

}
