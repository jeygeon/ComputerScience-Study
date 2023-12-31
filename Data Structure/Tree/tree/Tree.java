package tree;

public class Tree<E> {

    private Node root;

    public void setRoot(Node node) {
        this.root = node;
    }

    public Node getRoot() {
        return this.root;
    }

    public Node<E> makeNode(Node leftChildNode, E data, Node rightChildNode) {

        Node<E> node = new Node<E>();
        node.setLeftChildNode(leftChildNode);
        node.setData(data);
        node.setRightChildNode(rightChildNode);
        return node;
    }

    public void preOrder() {

    }

    public void inOrder() {

    }

    public void postOrder() {

    }
}
