package com.DataStructure;
public class DoublyLinkedList {
    Node head;
    class Node{
        Node pre;
        int data;
        Node next;

        Node(int val){
            this.pre=null;
            this.data=val;
            this.next=null;
        }
    }
     void insertAtFirst(int value)
     {
         Node newNode = new Node(value);
         if (head==null)
             head=newNode;
         else
         {
             newNode.next=head;
             head=newNode;
         }
     }

     void insertAtLast(int value)
     {
         Node newNode = new Node(value);
         Node temp=head;
         if (head==null){
             head=newNode;
             return;
         }

         while (temp.next!=null)
         {
             temp=temp.next;
         }
         newNode.pre=temp;
         temp.next=newNode;

     }
     Node getNodeFromIndex(int index)
    {
        Node temp=head;
        while(index!=0)
        {
        temp=temp.next;
        index--;
        }
        return temp;
    }
     public void insertAtAnyPos(int index,int val)
     {
         Node newNode = new Node(val);
         if (head==null)
             head=newNode;
         Node preOfNewNode =getNodeFromIndex(index-1) ;
         Node nextToNewNode=preOfNewNode.next;
//         System.out.println("Next to NewNode "+nextToNewNode.data);
//         System.out.println("Before NewNode "+ preOfNewNode.data);
         newNode.next=nextToNewNode;
         newNode.pre=preOfNewNode;
         preOfNewNode.next=newNode;
         nextToNewNode.pre=newNode;
         System.out.println("Inserted node "+val+" At index "+index);

     }

     void deleteFromStart()
     {
        // Node temp = head;
         if(head==null)
             System.out.println("Cannot delete List is empty!");
         if (head.next==null) {
             head = null;
             return;
         }
         Node previous = head.next;
         head=previous;
         head.pre=null;
     }
    void deleteFromLast()
    {
       Node temp = head;
       while (temp.next!=null)
       {
           temp=temp.next;
       }
       Node preNode = temp.pre;
       preNode.next=null;

    }
    public void printList()
    {
        if(head==null)
        {
            System.out.println("List is empty!!");
            return;
        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + "->");
            temp=temp.next;
        }
        System.out.print("NULL\n");
    }
    public static void main(String[] args) {
        DoublyLinkedList dl = new DoublyLinkedList();
        dl.insertAtFirst(12);
        dl.insertAtFirst(55);
        dl.insertAtFirst(67);
        dl.insertAtFirst(43);
        dl.insertAtFirst(65);
        dl.insertAtAnyPos(4,77);
        dl.printList();
        dl.deleteFromStart();
        dl.printList();
        dl.deleteFromStart();
        dl.printList();
        dl.deleteFromLast();
        dl.printList();
    }


}
