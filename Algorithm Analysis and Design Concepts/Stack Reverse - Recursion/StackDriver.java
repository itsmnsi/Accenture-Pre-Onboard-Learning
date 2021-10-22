import java.util.Scanner;
class LinkedList
{
  Node head;
  class Node
  {
    int value;
    Node next;
    Node(int d)
    {
      value = d;
      next = null;
    }
  }
  public int createStack(int new_value)
  {
    Node new_node = new Node(new_value);
    new_node.next = head;
    head = new_node;
    return new_value;
  }
  public void displayStack()
  {
    Node temp = head;
    while(temp!=null)
    {
      System.out.println(temp.value+" ");
      temp = temp.next;
    }
  }
  public void stackReverse()
  {
    Node previousNode = null;
    Node nextNode;
    Node currentNode = head;
    while(currentNode!=null)
    {
      nextNode = currentNode.next;
      currentNode.next = previousNode;
      previousNode = currentNode;
      currentNode = nextNode;
    }
    head = previousNode;
  }
}
public class StackDriver
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    LinkedList list = new LinkedList();
    System.out.print("Enter length of list: ");
    int val = sc.nextInt();
    if(val<=0)
    {
      System.out.println("Invalid Length");
    }
    else
    {
      int a[] = new int[val];
      for(int i=0;i<val;i++)
      {
        a[i] = i+1;
        list.createStack(a[i]);
      }
      System.out.println("Elements in stack");
      list.stackReverse();
      list.displayStack();
      System.out.println("\nElements in the stack after reversal");
      list.stackReverse();
      list.displayStack();
    }
  }
}
