import java.util.LinkedList;
import java.util.Queue;

class Node
{
    int data;
    Node left;
    Node right;

    Node(int data)
    {
        this.data = data;
        this.left = left;
        this.right = right;
    }
}

class BinarySearchTree {
    static int idx = -1;

    public static Node buildTree(int[] arr) {
        idx++;
        if (arr[idx] == -1) {
            return null;
        }

        Node newnode = new Node(arr[idx]);
        newnode.left = buildTree(arr);
        newnode.right = buildTree(arr);

        return newnode;
    }

    public static void levelOrderTraversal(Node root)
    {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty())
        {
            Node curr = q.remove();
            if(curr == null)
            {
                if(q.isEmpty())
                {
                    break;
                }
                else
                {
                    System.out.println();
                    q.add(null);
                }
            }
            else
            {
                System.out.print(curr.data+" ");
                if(curr.left != null) {
                    q.add(curr.left);
                }
                if(curr.right != null) {
                    q.add(curr.right);
                }
            }
        }
    }
}

public class LEVELORDER {
    public static void main(String[] args) {
        BinarySearchTree b1 = new BinarySearchTree();
        int[] arr = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        Node root = b1.buildTree(arr);
        b1.levelOrderTraversal(root);
    }
}
