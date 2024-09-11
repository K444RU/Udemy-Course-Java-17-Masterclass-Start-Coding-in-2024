package java17masterclass.section11.exercise47;

public class Main {
    public static void main(String[] args) {
        // Test MyLinkedList
        System.out.println("Testing MyLinkedList:");
        MyLinkedList linkedList = new MyLinkedList(null);

        linkedList.addItem(new Node("3"));
        linkedList.addItem(new Node("5"));
        linkedList.addItem(new Node("2"));
        linkedList.addItem(new Node("7"));
        linkedList.addItem(new Node("4"));

        System.out.println("Linked list after adding items:");
        linkedList.traverse(linkedList.getRoot());

        linkedList.removeItem(new Node("5"));
        System.out.println("Linked list after removing '5':");
        linkedList.traverse(linkedList.getRoot());

        linkedList.removeItem(new Node("2"));
        System.out.println("Linked list after removing '2':");
        linkedList.traverse(linkedList.getRoot());

        System.out.println();

        // Test SearchTree
        System.out.println("Testing SearchTree:");
        SearchTree tree = new SearchTree(null);

        tree.addItem(new Node("3"));
        tree.addItem(new Node("5"));
        tree.addItem(new Node("2"));
        tree.addItem(new Node("7"));
        tree.addItem(new Node("4"));

        System.out.println("Binary search tree after adding items (Inorder traversal):");
        tree.traverse(tree.getRoot());

        tree.removeItem(new Node("5"));
        System.out.println("Binary search tree after removing '5' (Inorder traversal):");
        tree.traverse(tree.getRoot());

        tree.removeItem(new Node("2"));
        System.out.println("Binary search tree after removing '2' (Inorder traversal):");
        tree.traverse(tree.getRoot());
    }
}
