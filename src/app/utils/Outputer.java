package app.utils;

import app.entities.BinaryTree;

public class Outputer {

    public static void printInOrder(BinaryTree tree) {
        System.out.print("Inorder traversal: ");
        tree.traverseInOrder(tree.root);
        System.out.println();
    }

    public static void printPreOrder(BinaryTree tree) {
        System.out.print("Preorder traversal: ");
        tree.traversePreOrder(tree.root);
        System.out.println();
    }

    public static void printPostOrder(BinaryTree tree) {
        System.out.print("Postorder traversal: ");
        tree.traversePostOrder(tree.root);
        System.out.println();
    }
}
