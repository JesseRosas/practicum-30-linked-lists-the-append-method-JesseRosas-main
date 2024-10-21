// Test Driver for Append Method of Intlist Class
public class Main {
  public static void main(String[] args) {
    
    // Create a new, empty linked list
    IntList nums_list = new IntList();

    // Test 1
    System.out.println("Expected output: * empty list *");
    nums_list.displayList();
    System.out.println();

    // Append node to empty listed list
    nums_list.append(10);

    // Test 2
    System.out.println("Expected output: 10");
    nums_list.displayList();
    System.out.println();

    // Append nodes to existing linked list
    nums_list.append(20);
    nums_list.append(30);

    // Test 3
    System.out.println("Expected output: 10 20 30");
    num_list.displayList();
  }

}
