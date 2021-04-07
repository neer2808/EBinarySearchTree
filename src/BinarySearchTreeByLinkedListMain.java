public class BinarySearchTreeByLinkedListMain {
  public static void main(String[] args) {
    Node rootnode = new Node(50);
    Node n1 = new Node(40);
    Node n2 = new Node(90);
    Node n3 = new Node( 43);
    Node n4 = new Node(78);
    BinarySearchTreeByLinkedList.insert(null,rootnode);
    BinarySearchTreeByLinkedList.insert(rootnode, n1);
    BinarySearchTreeByLinkedList.insert(rootnode, n2);
    BinarySearchTreeByLinkedList.insert(rootnode, n3);
    BinarySearchTreeByLinkedList.preorder(rootnode);
    System.out.println(BinarySearchTreeByLinkedList.search(rootnode,n4));
  }
}
