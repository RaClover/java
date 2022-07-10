import java.util.Stack;

public class Solution11 {

    /*
    * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

Implement the MinStack class:

MinStack() initializes the stack object.
void push(int val) pushes the element val onto the stack.
void pop() removes the element on the top of the stack.
int top() gets the top element of the stack.
int getMin() retrieves the minimum element in the stack.
You must implement a solution with O(1) time complexity for each function*/

    Stack<Integer> stack;
    int min ;

    public void MinStack() {
        min = Integer.MAX_VALUE;
        stack = new Stack<>();
    }

    public void push(int val) {
        if(val <= min){
            stack.push(min);
            min =val;
        }
        stack.push(val);
    }


    public void pop() {
        int val = stack.pop();
        if(val == min){
            min = stack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min;
    }
}
