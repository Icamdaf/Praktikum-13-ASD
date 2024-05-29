public class BinaryTreeMain20 {
    public static void main(String[] args) {
        BinaryTree20 bt = new BinaryTree20();

         bt.addRec(6);
        bt.add(6);
         bt.addRec(4);
        bt.add(4);
         bt.addRec(3);
        bt.add(3);
         bt.addRec(8);
        bt.add(8);
         bt.addRec(5);
        bt.add(5);
         bt.addRec(7);
        bt.add(7);
         bt.addRec(9);
        bt.add(9);
         bt.addRec(10);
        bt.add(10);
         bt.addRec(15);
        bt.add(15);


        System.out.print("Leaf : ");
        bt.displayLeafData();
        System.out.println(""); 

        System.out.print("Jumlah Leaf : " +bt.countLeafNodes());
        System.out.println(""); 

        System.out.print("Min : "+ bt.findMin());
        System.out.println(""); 

        System.out.print("Max : " + bt.findMax());
        System.out.println(""); 

        System.out.print("PreOrder Traversal : ");
        bt.traversePreOrder (bt.root);
        System.out.println(""); 

        System.out.print("inOrder Traversal : ");
        bt.traverseInOrder(bt.root);
        System.out.println("");
        
        System.out.print("PostOrder Traversal :");
        bt.traversePostOrder(bt.root);
        System.out.println("");

        System.out.println("Find Node : "+bt.find(5));
        System.out.println("Delete Node 8 ");
        bt.delete(8);
        System.out.println("");

        System.out.print ("PreOrder Traversal :");
        bt.traversePreOrder(bt. root);
        System.out.println("");
    }
}