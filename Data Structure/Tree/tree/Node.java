package tree;

public class Node<E> {

    // 데이터
    private E data;

    // 왼쪽 자식 노드
    private Node<E> leftChildNode;

    // 오른쪽 자식 노드
    private Node<E> rightChildNode;

    public void setLeftChildNode(Node<E> node) {

        this.leftChildNode = node;
    }

    public void setData(E data) {

        this.data = data;
    }

    public E getData() {

        return this.data;
    }

    public Node<E> getLeftChildNode() {

        return this.leftChildNode;
    }

    public void setRightChildNode(Node<E> node) {

        this.rightChildNode = node;
    }

    public Node<E> getRightChildNode() {

        return this.rightChildNode;
    }
}
