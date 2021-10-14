import java.util.Scanner;
class LinkedList
{
  Node head;
  class Node
  {
    int data;
    Node next;
    Node(int d)
    {
      data = d;
      next = null;
    }
  }
  void DeleteAllNode(int key)
  {
    Node temp = head;
    while(temp!=null && temp.next!=null)
    {
      if(temp.next.data == key)
      {
        temp.next = temp.next.next;
      }
      else
      {
        temp = temp.next;
      }
    }
    if(head!=null && head.data==key)
    {
      head = head.next;
    }
  }
  public void Push(int new_data)
  {
    Node new_node = new Node(new_data);
    new_node.next = head;
    head = new_node;
  }
  public void Display()
  {
    Node temp = head;
    System.out.print("The list after deletion: ");
    while(temp!=null)
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
public class DeleteMain
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    LinkedList list = new LinkedList();
    int val = sc.nextInt();
    int a[] = new int[val];
    for(int i=0;i<val;i++)
    {
      a[i] = sc.nextInt();
      list.Push(a[i]);
    }
    System.out.println("Enter the element to be deleted: ");
    int b = sc.nextInt();
    list.DeleteAllNode(b);
    list.Reverse();
    list.Display();
  }
}
