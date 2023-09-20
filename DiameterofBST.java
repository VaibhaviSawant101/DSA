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

class TreeInfo
{
    int ht;
    int dim;

    TreeInfo(int ht, int dim)
    {
        this.ht = ht;
        this.dim = dim;
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



    public static TreeInfo diameter(Node root)
    {
        if(root == null)
        {
            TreeInfo t = new TreeInfo(0, 0);
            return t;
        }

        TreeInfo left = diameter(root.left);
        TreeInfo right = diameter(root.right);

        int height = Math.max(left.ht, right.ht)+1;

        int dim1 = left.dim;
        int dim2 = right.dim;
        int dim3 = left.ht+right.ht+1;

        int diam = Math.max(Math.max(dim1, dim2), dim3);
        TreeInfo t = new TreeInfo(height, diam);
        return t;

    }
}

public class DiameterofBST {
    public static void main(String[] args) {
        BinarySearchTree b1 = new BinarySearchTree();
        int[] arr = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        Node root = b1.buildTree(arr);
        int sum = b1.diameter(root).dim;
        System.out.println(sum);
    }
}
