package com.hackerrank.datastructures;

public class TreeInorderTracersal {



/* you only have to complete the function given below.  
Node is defined as  

class Node {
    int data;
    Node left;
    Node right;
}

*/

     public static void inOrder(Node root) {
        
        if(root.left!=null)
       inOrder( root.left);
       
        System.out.print(root.data+" ");
        if(root.right!=null)
       inOrder( root.right);
               
        

    }

}