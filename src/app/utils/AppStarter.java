package app.utils;

import app.entities.BinaryTree;
import app.entities.Node;

public class AppStarter {
    public static void starter() {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(2);
        tree.root.left = new Node(5);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(7);
        tree.root.right.right = new Node(11);
        tree.root.left.right = new Node(1);
        tree.root.right.left = new Node(8);
        tree.root.left.left.left = new Node(4);
        tree.root.right.right.right = new Node(12);
        tree.root.left.left.right = new Node(6);
        tree.root.left.right.left = new Node(9);
        tree.root.right.left.right = new Node(10);

        Outputer.printInOrder(tree);
        Outputer.printPreOrder(tree);
        Outputer.printPostOrder(tree);
    }
}
