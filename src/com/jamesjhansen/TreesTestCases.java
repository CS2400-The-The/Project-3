package com.jamesjhansen;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Current test case ideas:
 * 
 * for post order:
 * 1. Empty Tree
 * 2. Tree with one node (root)
 * 3. Tree with two nodes, root and left
 * 4. Tree with two nodes, root and right
 * 4.5 Complete Tree with height of two
 * 4.69 Complete Tree with height of three
 * 5. Tree with only node and right children
 * 6. Tree with only node and left children
 * 7. Complete, but not full tree
 * 8. Full tree,
 * 9. Random mix 
 */
public class TreesTestCases extends BinaryTree{

    //Creation of trees

    //Emptytree
    BinaryTree<String> emptyTree = new BinaryTree<>();
    String emptyTreeString = "";

    //Tree with one node
    BinaryTree<String> rootTree = new BinaryTree<>("A",null,null);
    String rootTreeString = "     A     ";

    //Tree with root and left child
    BinaryTree<String> rootAndLeftLeaf = new BinaryTree<>("B",null,null);
    BinaryTree<String> rootAndLeftTree = new BinaryTree<>("A",rootAndLeftLeaf,null);
    static String rootandLeftTreeString = "     A     \n" +
                                          "   /       \n" +
                                          "  B        ";

    //Tree with root and right child
    BinaryTree<String> rootAndRightLeaf = new BinaryTree<>("B",null,null);
    BinaryTree<String> rootAndRightTree = new BinaryTree<>("A",null,rootAndRightLeaf);
    static String rootandRightTreeString ="     A      \n" +
                                          "      \\    \n" +
                                          "       B     ";  
    
    //Full tree, height of two
    BinaryTree<String> fullThreeNodeLeft = new BinaryTree<>("B",null,null);
    BinaryTree<String> fullThreeNodeRight = new BinaryTree<>("C",null,null);
    BinaryTree<String> fullThreeNodeTree = new BinaryTree<>("A", fullThreeNodeLeft,fullThreeNodeRight);
    static String fullThreeNodeTreeString = "       A       \n" +
                                            "     /   \\    \n" +
                                            "    B     C     "; 
 
    //Full tree, height of three
    static BinaryTree<String> full2LeftLeaf = new BinaryTree<>("D", null, null);
    static BinaryTree<String> full2RightLeaf = new BinaryTree<>("E", null, null);
    static BinaryTree<String> full2InnerLeft = new BinaryTree<>("B", full2LeftLeaf, full2RightLeaf);
    static BinaryTree<String> full2LeftLeaf2 = new BinaryTree<>("F", null, null);
    static BinaryTree<String> full2RightLeaf2 = new BinaryTree<>("G", null, null);
    static BinaryTree<String> full2InnerRight = new BinaryTree<>("C", full2LeftLeaf2, full2RightLeaf2);
    static BinaryTree<String> full2Root = new BinaryTree<>("A", full2InnerLeft, full2InnerRight);
    static String full2 = "      A       \n" +
                          "    /   \\    \n" +
                          "   B     C    \n" +
                          "  / \\  / \\  \n" +
                          " D   E  F  G    ";
    
    //Tree with only right children
    BinaryTree<String> rightChild3 = new BinaryTree<>("D", null, null);
    BinaryTree<String> rightChild2 = new BinaryTree<>("C", null, rightChild3);
    BinaryTree<String> rightChild1 = new BinaryTree<>("B", null, rightChild2);
    BinaryTree<String> rightTree = new BinaryTree<>("A", null, rightChild1);
    static String rightTreeString = "     A        \n" +
                                    "     \\       \n" +
                                    "      B      \n" +
                                    "       \\     \n" +
                                    "        C     \n" +
                                    "         \\   \n" +
                                    "          D   \n";

    //Tree with only left children
    BinaryTree<String> leftChild3 = new BinaryTree<>("D", null, null);
    BinaryTree<String> leftChild2 = new BinaryTree<>("C", leftChild3, null);
    BinaryTree<String> leftChild1 = new BinaryTree<>("B", leftChild2, null);
    BinaryTree<String> leftTree = new BinaryTree<>("A", leftChild1, null);
    static String leftTreeString = "       A       \n" +
                                   "      /        \n" +
                                   "     B         \n" +
                                   "    /          \n" +
                                   "   C           \n" +
                                   "  /            \n" +
                                   " D             \n";

    //Complete, but not full tree
    BinaryTree<String> completeChildJ = new BinaryTree<>("J", null, null);
    BinaryTree<String> completeChildI = new BinaryTree<>("I", null, null);
    BinaryTree<String> completeChildH = new BinaryTree<>("H", null, null);
    BinaryTree<String> completeChildG = new BinaryTree<>("G", null, null);
    BinaryTree<String> completeChildF = new BinaryTree<>("F", null, null);
    BinaryTree<String> completeChildE = new BinaryTree<>("E", completeChildI, completeChildJ);
    BinaryTree<String> completeChildD = new BinaryTree<>("D", completeChildG, completeChildH);
    BinaryTree<String> completeChildC = new BinaryTree<>("C", completeChildF, null);
    BinaryTree<String> completeChildB = new BinaryTree<>("B", completeChildD, completeChildE);
    BinaryTree<String> completeTree = new BinaryTree<>("A", completeChildB, completeChildC);
    static String completeTreeString = "           A          \n" +
                                       "         /   \\       \n" +
                                       "        B     C       \n" +
                                       "       /\\    /       \n" +
                                       "      D   E F         \n" +
                                       "     /\\  /\\         \n" +
                                       "    G  H I J           ";

    //Full tree, height of four
    BinaryTree<String> fullChildO = new BinaryTree<>("O", null, null);
    BinaryTree<String> fullChildN = new BinaryTree<>("N", null, null);
    BinaryTree<String> fullChildM = new BinaryTree<>("M", null, null);
    BinaryTree<String> fullChildL = new BinaryTree<>("L", null, null);
    BinaryTree<String> fullChildK = new BinaryTree<>("K", null, null);
    BinaryTree<String> fullChildJ = new BinaryTree<>("J", null, null);
    BinaryTree<String> fullChildI = new BinaryTree<>("I", null, null);
    BinaryTree<String> fullChildH = new BinaryTree<>("H", null, null);
    BinaryTree<String> fullChildG = new BinaryTree<>("G", null, null);
    BinaryTree<String> fullChildF = new BinaryTree<>("F", null, null);
    BinaryTree<String> fullChildE = new BinaryTree<>("E", null, null);
    BinaryTree<String> fullChildD = new BinaryTree<>("D", null, null);
    BinaryTree<String> fullChildC = new BinaryTree<>("C", null, null);
    BinaryTree<String> fullChildB = new BinaryTree<>("B", null, null);
    BinaryTree<String> fullChild = new BinaryTree<>("A", null, null);
    static String fullChildString = "               A             \n" +
                                    "           /       \\        \n" +
                                    "          B         C        \n" +
                                    "         /  \\      / \\     \n" +
                                    "        D    E     F    G     \n" +
                                    "       /\\   /\\    /\\   /\\\n" +
                                    "      H  I  J K  L  M  N  O      ";


    @Test
    void testPostOrderTraverse(){

        assertEquals("A B",full2Root.postorderTraverse().toString());



    }

    @Test
    void testPostOrderTraverse_callbinaryNodeMethod(){

    }

    @Test 
    void testGetHeight(){
    
    }

    @Test 
    void testGetHeight_callBinaryNodeMethod(){

    }

    @Test 
    void testGetNumberOfNodes() {

    }

    @Test 
    void testGetNumberOfNodes_callBinaryNodeMethod() {

    }
    
    public static void main(String[] args){
        System.out.println(full2Root.postorderTraverse().toString());
    }
}
