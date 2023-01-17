import java.util.*;

// Feel free to add new properties and methods to the class.
class Program {
  static class DoublyLinkedList {
    public Node head;
    public Node tail;

    public void setHead(Node node) {
      // Write your code here.
      node.next = head;
      if(head != null){
        head.prev = node;
      }else{
        tail = node;
      }
      head = node;
    }

    public void setTail(Node node) {
      // Write your code here.
      node.prev = tail;
      if(tail != null){
        tail.next = node;
      }else{
        head = node;
      }
      tail = node;
    }

    public void insertBefore(Node node, Node nodeToInsert) {
        // Write your code here.
        Node temp = head;
        if(head.next == null || tail.prev == null) return;
        this.remove(nodeToInsert);
        while(temp.next != null){
          if(temp.value == node.value){
            if(temp == head){
              this.setHead(nodeToInsert);
              break;
            }
            temp.prev.next = nodeToInsert;
            nodeToInsert.next = temp;
            nodeToInsert.prev = temp.prev;
            temp.prev = nodeToInsert;
            break;
          }
          else{
            temp = temp.next;
          }
        }
    }

    public void insertAfter(Node node, Node nodeToInsert) {
      // Write your code here.
       Node temp = head;
        if(head.next == null || tail.prev == null) return;
        this.remove(nodeToInsert);
        while(temp.next != null){
          if(temp.value == node.value){
            if(temp == tail){
              this.setTail(nodeToInsert);
              break;
            }
            temp.next = nodeToInsert;
            temp.next.prev = nodeToInsert;
            nodeToInsert.prev = temp;
            nodeToInsert.next = temp.next;
            break;
          }
          else{
            temp = temp.next;
          }
        }
    }

    public void insertAtPosition(int position, Node nodeToInsert) {
      // Write your code here.
      Node temp = head;
      while(position > 1){
        temp = temp.next;
        position--;
      }
         if(temp == head){
          this.setHead(nodeToInsert);
        }
        else if(temp == tail){
          this.setTail(nodeToInsert);
        }
      else{
         temp.prev.next = nodeToInsert;
        temp.prev = nodeToInsert;
        nodeToInsert.prev = temp.prev;
         nodeToInsert.next = temp;
      }
     
      
    }

    public void removeNodesWithValue(int value) {
      // Write your code here.
      Node temp = head;
      while(temp != tail){
        if(temp.value == value){
          this.remove(temp);
        }
        temp = temp.next;
      }
    }

    public void remove(Node node) {
      // Write your code here.
      if(node == head){
        node.next.prev = null;
      }else if(node == tail){
        node.prev.next = null;
      }
      else{
        Node next = node.next;
        Node prev = node.prev;
         next.prev = prev;
         prev.next = next;
      }

    }

    public boolean containsNodeWithValue(int value) {
      // Write your code here.
      Node temp = head;
      while(temp.next != null){
        if(temp.value == value){
          return true;
        }
        else{
          temp = temp.next;
        }
      }
      return false;
    }
  }

  // Do not edit the class below.
  static class Node {
    public int value;
    public Node prev;
    public Node next;

    public Node(int value) {
      this.value = value;
    }
  }
}
