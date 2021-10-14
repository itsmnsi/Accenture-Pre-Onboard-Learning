import java.util.Scanner;

class Node
{
  int data;
  Node next;
  public Node(int data)
  {
    this.data = data;
    next = null;
  }
}

class LinkedList
{
  Node head;
  void append(int data)
  {
    Node newNode = new Node(data);
    Node current = head;
    if(head==null)
    {
      head = newNode;
      return;
    }
    else
    {
      while(current.next!=null)
      {
        current = current.next;
      }
      current.next = newNode;
      return;
    }
  }
  public void Display()
  {
    Node temp = head;
    while(temp != null)
    {
      System.out.println(temp.data+" ");
      temp = temp.next;
    }
  }
  public void Reverse()
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

public class List
{
  public static void main(String[] args)
  {
    LinkedList list = new LinkedList();
    Scanner sc = new Scanner(System.in);
    String str;
    do
    {
      System.out.println("Enter the value:");
      int value = sc.nextInt();
      list.append(value);
      System.out.println("Do you want to add another node? Type Yes/No");
      str = sc.next();
    }while(str.equals("Yes")||(str.equals("yes")));
    System.out.println("The elements in the linked list are:");
    list.Display();
    list.Reverse();
    System.out.println("\n The elements in the reversed linked list are:");
    list.Display();
  }
}
