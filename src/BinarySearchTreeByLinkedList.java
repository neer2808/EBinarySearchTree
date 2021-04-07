public class BinarySearchTreeByLinkedList {
  public static Node insert( Node root, Node newnode)
  {
    if( root == null)
    {
      root = newnode;
      return root;
    }
    if(root.data> newnode.data)
    {
        if( root.left == null)
        {
            root.left = newnode;

        }
        else
        {
          insert(root.left, newnode);
        }
    }
    else if (root.data< newnode.data)
    {
        if( root.right == null)
        {
            root.right = newnode;
        }
        else
        {
          insert(root.right,newnode);
        }
    }
    return  root;
  }
  // DLR
  public static void preorder(Node root)
  {
    if(root == null)
    {
        return;

    }
    System.out.println(root.data);
    preorder(root.left);
    preorder(root.right);
  }


  public static boolean search( Node root, Node searchNode)
  {
    if(root == null)
    {
        return  false;
    }
    if(root.data == searchNode.data)
    {
      return true;
    }
    boolean result = false;

    if(root.data> searchNode.data)
    {
      result= search ( root.left, searchNode);
    }
    else if( root.data<searchNode.data)
    {
      result =search(root.right,searchNode);
    }
    return result;
  }
}
