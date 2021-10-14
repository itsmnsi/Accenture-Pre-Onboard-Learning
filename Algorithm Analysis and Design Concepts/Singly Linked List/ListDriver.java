import java.util.Scanner;
class LinkedList
{
  Node head;
  Node slow_ptr, fast_ptr, second_half;
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
  boolean IsPalindrome(Node head)
  {
    slow_ptr = head;
    fast_ptr = head;
    Node prev_of_slow_ptr = head;
    Node midnode = null;
    boolean res = true;
    if(head!=null && head.next!=null)
    {
      while(fast_ptr!=null && fast_ptr.next!=null)
      {
        fast_ptr = fast_ptr.next.next;
        prev_of_slow_ptr = slow_ptr;
        slow_ptr = slow_ptr.next;
      }
      if(fast_ptr!=null)
      {
        midnode = slow_ptr;
        slow_ptr = slow_ptr.next;
      }
      second_half = slow_ptr;
      prev_of_slow_ptr.next = null;
      Reverse();
      res = CompareLists(head, second_half);
      Reverse();
      if(midnode != null)
      {
        prev_of_slow_ptr.next = midnode;
        midnode.next = second_half;
      }
      else
        prev_of_slow_ptr.next = second_half;
    }
    return res;
  }
  void Reverse()
  {
    Node prev = null;
    Node next;
    Node current = second_half;
    while(current!=null)
    {
      next = current.next;
      current.next = prev;
      prev = current;
      current = next;
    }
    second_half = prev;
  }
  boolean CompareLists(Node head1, Node head2)
  {
    Node temp1 = head1;
    Node temp2 = head2;
    while(temp1!=null && temp2!=null)
    {
      if(temp1.data == temp2.data)
      {
        temp1 = temp1.next;
        temp2 = temp2.next;
      }
      else
        return false;
    }
    if(temp1==null && temp2==null)
      return true;
      return false;
  }
  public void Push(int new_data)
  {
    Node new_node = new Node(new_data);
    new_node.next = head;
    head = new_node;
  }
}
public class ListDriver
{
  public static void main(String args[])
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
    if(list.IsPalindrome(list.head)!=false)
    {
      System.out.println("1");
    }
    else
    {
      System.out.println("0");
    }
  }
}
    
