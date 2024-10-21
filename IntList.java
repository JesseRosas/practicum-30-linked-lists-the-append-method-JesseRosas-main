// IntList Class to Complete
public class IntList {
  private IntNode head;

  public IntList() {
  // Inits as empty list
    head = null;
  }

  public boolean isEmpty() {
    return head == null;
  }

  // ** TO COMPLETE **
  public void append(int new_value) {
    IntNode n = new IntNode(new_value);
  
    if (head == null) {
      head = n;
    } else {
      IntNode tempPtr = head;
      while (tempPtr.getNext() != null) {
        tempPtr = tempPtr.getNext();
      }
      tempPtr.setNext(n);
    }
  }
  
  
    
    
    // Check if list empty. If so, make first node.

    
    // if not empty, search for last node and append

}

    
  // Display Method
  public void displayList() {
    if(head == null) 
      System.out.println("* empty list * ");
    else {
      IntNode tempPtr = head;
      
      while(tempPtr != null) {
        System.out.print(tempPtr.getValue() + "  ");
        tempPtr = tempPtr.getNext();
      }
    }
  }
}
