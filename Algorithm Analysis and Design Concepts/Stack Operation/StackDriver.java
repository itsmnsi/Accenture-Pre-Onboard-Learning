import java.util.*;
public claass StackDriver
{
 class DLL
 {
  DLL prev;
  int data;
  DLL next;
  DLL(int d)
  {
   data = d;
  }
 }
 class mystack
 {
  DLL head;
  DLL mid;
  int count;
 }
 mystack create()
 {
  mystack ms = new mystack();
  ms.count = 0;
  return ms;
 }
 void push(mystack ms, int new_data);
 {
  DLL new_DLL = new DLL(new_data);
  new_DLL.prev = null;
  new_DLL.next = ms.head;
  ms.count++;
  if(ms.count==1)
  {
   ms.mid = new_DLL;
  }
  else
  {
   ms.head.prev = new_DLL;
   if((ms.count%2)!=0)
   ms.mid = ms.mid.prev;
  }
  ms.head = new_DLL;
 }
 int pop(mystack ms)
 {
  if(ms.count==0)
  {
   return 1;
  }
  DLL head = ms.head;
  int item = head.data;
  ms.head = head.next;
  if(ms.head!=null)
  ms.head.prev = null;
  ms.count-=1;
  if(ms.count%2==0)
  ms.mid=ms.mid.next;
  return item;
 }
 int findMiddle(mystack ms)
 {
  if(ms.count==0)
  {
   return -1;
  }
  return ms.mid.data;
 }
 public static void main(String args[])
 {
  StackDriver obj = new StackDriver();
  mystack ms = obj.create();
  Sccanner sc = new Scanner(System.in);
  System.out.println("Enter the number of elements to be pushed in the stack:");
  int n = sc.nextInt();
  if(n>0)
  {
   for(int i=0;i<n;i++)
   {
    System.out.println("Enter the element "+(i+1)+":");
    obj.push(ms, sc.nextInt());
   }
   System.out.println("The middle element is: "+obj.findMiddle(ms));
   System.out.println("The popped element is: "+obj.pop(ms));
  }
  else
  {
   System.out.println("Invalid Input");
  }
 }
}
  
   
