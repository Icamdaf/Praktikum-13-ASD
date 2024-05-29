public class BinaryTreeArrayMain20 {
    public static void main(String[] args) {
        BinaryTreeArray20 bta = new BinaryTreeArray20();
         int[] data = {4,6,8,10,5,7,9,0,0,0};

        int idxLast = 6;

        bta.add(98);
        bta.add(23);
        bta.add(24);
        bta.add(61);
        bta.add(36);
         bta.populateData(data, idxLast);
        System.out.print("\nInOrder Traversal : ");
        bta.traverseInOrder(0);
        System.out.println("\n");

        System.out.print("Pre-order traversal: ");
        bta.traversePreOrder();
        System.out.println();

        System.out.print("Post-order traversal: ");
        bta.traversePostOrder();
        System.out.println();
    }
}