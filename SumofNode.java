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

    public static int sumofNodes(Node root)
    {
        if(root == null)
            return 0;

        int x = sumofNodes(root.left);
        int y = sumofNodes(root.right);
        return x+y+root.data;
    }
}

public class SumofNode {
    public static void main(String[] args) {
        BinarySearchTree b1 = new BinarySearchTree();
        int[] arr = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        Node root = b1.buildTree(arr);
        int sum = b1.sumofNodes(root);
        System.out.println(sum);
    }
}
