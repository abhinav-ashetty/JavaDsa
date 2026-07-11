//package com.abhinav;
//public class LL {
//   Node head;
//   static class Node{
//       int value;
//       Node next;
//       public Node(int value){
//           this.value = value;
//           this.next = null;
//       }
//       public Node(int value, Node next){
//           this.value = value;
//           this.next = next;
//       }
//   }
//   public void insertFirst(int value){
//       if (head == null){
//           head = new Node(value);
//           return;
//       }
//       Node newnode = new Node(value);
//       newnode.next = head;
//       head = newnode;
//   }
//   public void insertLast(int value){
//       if (head == null){
//           head = new Node(value);
//           return;
//       }
//       Node temp = head;
//       while(temp.next != null) {
//           temp = temp.next;
//       }
//       temp.next = new Node(value);
//   }
//
//   public void display(){
//       Node temp = head;
//       while(temp != null){
//           System.out.print(temp.value + " -> ");
//           temp = temp.next;
//       }
//       System.out.println("END");
//   }
//   public void deleteFirst(){
//       if(head== null){
//           System.out.println("The list is empty");
//           return;
//       }
//       head = head.next;
//   }
//
//   public void deleteLast(){
//       if(head== null){
//           System.out.println("The list is empty");
//           return;
//       }
//       if(head.next == null){
//           head = null;
//           return;
//       }
//       Node temp = head;
//       while(temp.next.next != null){
//           temp = temp.next;
//       }
//       temp.next = null;
//   }
//
//   public void reverseLL(){
//       if(head == null || head.next == null){
//           return;
//       }
//
//       Node previousNode = head;
//       Node currentNode = head.next;
//       while(currentNode != null)
//       {
//           Node nextNode = currentNode.next;
//           currentNode.next = previousNode;
//           previousNode = currentNode;
//           currentNode = nextNode;
//       }
//       head.next = null;
//       head = previousNode;
//   }
//   public void reverseLLRecursive(Node head){
//       Node head = reverseLLRecursive(head.next);
//   }
//
//   public static void main(String[] args) {
//       LL list = new LL();
//       list.insertFirst(1);
//       list.insertFirst(2);
//       list.insertLast(3);
//       list.insertLast(4);
//       list.display();
//       list.deleteFirst();
//       list.deleteLast();
//       list.display();
//       list.reverseLL();
//       list.display();
//   }
//}
