/*

Stack is a liner data structure and operations will be done using first in last out

1.push() - add element in stack.if stack already full then that is known as over flow
2.pop() - will remove top of the element .if no elements available in stack then that is known as under flow
3.peek() or top() - will give top of the element
4.isEmpty() - will check stack is empty or not
 */

import java.util.ArrayList;
import java.util.List;

public class StackExample {
    public List<Integer> data;
    int size=0;

    StackExample()
    {
        data=new ArrayList<>();
    }

    void push(int number)
    {
        data.add(number);
        size++;
    }

    int top()
    {
        return data.get(size-1);
    }

    Boolean pop()
    {
        if(size==0)
        {
            System.out.println("Stack is underflow");
            return false;
        }else {
            data.remove(size-1);
            size--;
            return true;
        }
    }

    Boolean isEmpty()
    {
        if(size==0)
        {
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        StackExample a = new StackExample();
        a.push(1);
        a.push(2);
        a.push(3);

        for (int i = 0; i < 3; i++) {
            if (!a.isEmpty()) {
                System.out.println(a.top());
            }
            System.out.println(a.pop());
        }

    }
}
