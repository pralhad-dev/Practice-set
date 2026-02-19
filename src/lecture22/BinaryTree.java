package lecture22;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTree {

    //10 true 20 true 30 false false true 40 false false true 60 false true 70 false false
    class Node {
        int data;
        Node left;
        Node right;
    }

    private Node root;
    Scanner sc = new Scanner(System.in);


    public BinaryTree() {
        this.root = createTree();

    }

    private Node createTree() {
        int item = sc.nextInt();
        Node nn = new Node();
        nn.data = item;

        boolean hlc = sc.nextBoolean();
        if (hlc) {
            nn.left = createTree(); //recu creates left  subtree
        }

        boolean hrc = sc.nextBoolean();
        if (hrc) {
            nn.right = createTree();
        }
        return nn;
    }

    public void display() {
        display(this.root);
    }

    private void display(Node root) {
        if (root == null) {
            return;
        }
        String s = root.data + "";
        if (root.left != null) {
            s += root.left.data + ". <==" + s;

        } else {
            s += ". <==" + s;
        }
        if (root.left != null) {
            s = s + "==>" + root.right.data;

        } else {
            s += "==>" + s;
        }
        System.out.println(s);
        display(root.left);
        display(root.right);
    }

    public int Max() {
        return max(root);
    }

    private int max(Node root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }
        int lm = max(root.left);
        int rm = max(root.right);

        return Math.max(root.data, Math.max(lm, rm));
    }

    public boolean Find(int target) {
        return find(root, target);
    }

    private boolean find(Node root, int target) {
        if (root == null) {
            return false;
        }
        if (root.data == target) {
            return true;
        }
        boolean left = find(root.left, target);
        boolean right = find(root.right, target);

        return left || right;

    }

    public int Height() {
        return height(root);
    }

    private int height(Node root) {
        if (root == null) {
            return -1;
        }
        int l = height(root.left);
        int r = height(root.right);
        return Math.max(l, r) + 1;

    }

    public void PreOrder1() {
        preOrder1(this.root);
    }

    private void preOrder1(Node root) {
        if (root == null) {
            return;
        }
        System.out.println(root.data);
        preOrder1(root.left);
        preOrder1(root.right);
    }

    //postOrder
    //in-order

    public void LevelOrder() {
        Queue<Node> q = new LinkedList<>();
        if (root == null) {
            return;
        }
        q.add(root);

        while (!q.isEmpty()) {
            Node temp = q.remove();
            System.out.println(temp.data + " ");

            if (temp.left != null) {
                q.add(temp.left);
            }
            if (temp.right != null) {
                q.add(temp.right);
            }
        }
    }


    private void preOrder(Node root) {
    }

    public static void main(String[] args) {
        BinaryTree dt = new BinaryTree();
        dt.display();
        System.out.println("MAx" + dt.Max());
        System.out.println("isPresen:" + dt.Find(70));
        System.out.println("height:" + dt.Height());
        //System.out.println(dt.LevelOrder());
    }
}



