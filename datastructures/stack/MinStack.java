package stack;

import java.util.Stack;

public class MinStack {
    /*public Stack<int[]> s=new Stack<>();
    public MinStack() {

    }

    public void push(int val) {

        if(s.isEmpty())
        {
            s.push(new int[]{val,val});
        }else
        {
            int top=s.peek()[1];
            s.push(new int[]{val,Math.min(val,top)});
        }

    }

    public void pop() {
        s.pop();
    }

    public int top() {
        return s.peek()[0];
    }

    public int getMin() {
        return s.peek()[1];
    }

    public static void main(String[] args) {

    }*/
    Node head;
    public void push(int val) {

       if(head==null)
       {
           head=new Node(val,val,null);
       }else {
           head=new Node(Math.min(getMin(),val),val,head);
       }

    }

    public void pop() {
        head=head.next;
    }

    public int top() {
        return head.value;
    }

    public int getMin() {
        return head.min;
    }
    public class Node
    {
        int value;
        int min;
        Node next;
        Node(int min,int val,Node next)
        {
            this.min=min;
            this.next=next;
            this.value=val;
        }
    }
}


/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
