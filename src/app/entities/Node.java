package app.entities;

public class Node {

    public int key;
    public app.entities.Node left;
    public app.entities.Node right;

    public Node(int item) {
        key = item;
        left = null;
        right = null;
    }
}
