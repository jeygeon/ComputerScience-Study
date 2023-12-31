package tree;

public class Main {
    public static<E> void main(String[] args) {

        /*
                            (1)
                    (2)            (3)
                (4)     (5)            (6)

         */
        Tree<E> tree = new Tree<E>();

        Node<E> node4 = tree.makeNode(null, (E) "4", null);
        Node<E> node5 = tree.makeNode(null, (E) "5", null);
        Node<E> node2 = tree.makeNode(node4, (E) "2", node5);

        Node<E> node6 = tree.makeNode(null, (E) "6", null);
        Node<E> node3 = tree.makeNode(null, (E) "3", node6);

        Node<E> node1 = tree.makeNode(node2, (E) "1", node3);

        // preOrder
        tree.preOrder();

        // inOrder
        tree.inOrder();

        // postOrder
        tree.postOrder();
    }
}