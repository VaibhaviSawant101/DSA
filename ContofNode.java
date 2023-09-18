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

    public static int countNodes(Node root)
    {
        if(root == null)
        {
            return 0;
        }
        int x = countNodes(root.left);
        int y = countNodes(root.right);
        return x+y+1;
    }
}

public class ContofNode {
    public static void main(String[] args) {
        BinarySearchTree b1 = new BinarySearchTree();
        int[] arr = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        Node root = b1.buildTree(arr);
        int count = b1.countNodes(root);
        System.out.println(count);
    }
}
