package com.hackerrank.datastructures;

public class PrintTheElemetntsOfALinkedList {



    // Complete the printLinkedList function below.

    
     
    class  SinglyLinkedListNode {
          int data;
          SinglyLinkedListNode next;
      }
     
     
      static void printLinkedList(SinglyLinkedListNode head) {

          SinglyLinkedListNode temp=head;
          
          while(temp!=null) {
              
              System.out.println(temp.data);
              
              temp=temp.next;
              
          }
          
          
          

        }
}

