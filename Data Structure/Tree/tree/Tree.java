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

    /**
     * 전위 순회<br/>
     * ROOT > LEFT > RIGHT 순서로 순회
     */
    public void preOrder(Node<E> node) {

        if (node != null) {
            System.out.println(node.getData());
            preOrder(node.getLeftChildNode());
            preOrder(node.getRightChildNode());
        }
    }

    /**
     * 중위 순회<br/>
     * LEFT > ROOT > RIGHT 순서로 순회
     */
    public void inOrder(Node<E> node) {

        if (node != null) {
            inOrder(node.getLeftChildNode());
            System.out.println(node.getData());
            inOrder(node.getRightChildNode());
        }
    }

    /**
     * 후위 순회 <br/>
     * LEFT > RIGHT > ROOT 순서로 순회
     */
    public void postOrder(Node<E> node) {

        if (node != null) {
            postOrder(node.getLeftChildNode());
            postOrder(node.getRightChildNode());
            System.out.println(node.getData());
        }
    }
}
