/*
Vectors:
vector implements list interface
Vectors are like arraylist which can have dynamic size..
Similar to arraylist it keeps on increasing its size if there is a need
Size of arraylist increases by 1.5 times and size of vector increases 2 times
the only difference between arraylist and vector is that it is synchronized
What is syncronized?
assuming we have a calculation of 1*2*3*4 and 1 core !
so the calculation will be like 
1*2*3*4
|_| | |
 2  | |
 |__| |
   6  |
   |__|
    24
but if we have 2 cores for example so it will be like
1*2*3*4
|_| |_|
 2   12
 |___|
  24

so it saves the time !
so it there are multiple cores the work is splitted up and all work on their own !
but vector uses syncronized method which is like if a opearion is given like 1*2 and other
operation is given like 3*4 then if 1st operation is called first it locks it and 2nd operation
can not be performed so until 1*2 is done 3*4 is waiting !
So this can make the program slow iff we are going to code only ! 
in perpose like gaming this method is suited perfectly.

so for coding purpose it is recommended we use arraylist.
*/      

/*
stack:
stack is a datastructure which follows last in first out implementation
that is the element which is at the last element is removed first or
the element is inserted first remains till the longest time.
Stack can be made by using linkedlist and array both
in java- stack extends vector that is why it is usually prefered not to use the given stack class of java
*/
import java.util.Stack;
class Node<E>
{
    E data;
    Node<E> next;
    public Node(E data)
    {
        this.data = data;
        next = null;
    }
}
class myStack<E>
{
    Node<E> head;
    public void push(E data)
    {
        Node<E> toAdd = new Node<E>(data); 
        if(head == null){
            head = toAdd;
            return;
        }
        Node<E> temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = toAdd;
    }

    public E peek()
    {
        Node<E> temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        return temp.data;
    }

    public void print(){
        Node<E> temp = head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public E pop() throws Exception{
        if(head == null){
            throw new Exception("Removing from an epty stack");
        }
        if(head.next == null)
        {
            E ans = head.data;
            head = null;
            return ans;
        }else{
            Node<E> temp = head;
            while(temp.next.next != null){
                temp = temp.next;
            }
            E ans = temp.next.data;
            temp.next = null;
            return ans;
        }
    }
}
class Solution
{
    public static void main(String[] args)
    {
        Stack<Integer> stack = new Stack();
        // to push add the element at the end we use add(E e) method
        for(int i=1; i<=10; i++)
            stack.push(i);
        System.out.println(stack);
        // to know the top element we use peek()method 
        System.out.println(stack.peek());
        //to remove the element from the top we use pop method
        int popped = stack.pop();
        System.err.println(popped);
        System.err.println(stack); c

        /*
        now since it extends vector class it is synchronized so every method is directly or 
        indirectly synchronized in stack. and since it extends vector and vector extends list 
        therefore it uses arrays.
        */
        //let us make stack using linkedlist
        myStack<Integer> mystack = new myStack<Integer>();
        mystack.push(10);
        mystack.push(20);
        System.out.println("Top is: "+mystack.peek());
        mystack.print();
        try {
            System.out.println("Removed: "+mystack.pop());
            // System.out.println("Top is : "+mystack.peek());
        } catch (Exception e) {
            System.out.println(e);
        }
        mystack.push(30);
        mystack.print();
    }
}