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
 * 5. Full Tree with height of two
 * 6. Full Tree with height of three
 * 7. Tree with only node and right children
 * 8. Tree with only node and left children
 * 9. Complete, but not full tree
 * 10. Full tree, height four, 
 */
public class TreesTestCases extends BinaryTree{

    //Creation of trees

    //Emptytree
    BinaryTree<String> emptyTree = new BinaryTree<>();
    static String emptyTreeString = "";

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
    static String full2RootString = "      A       \n" +
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

        //GetHeight Test 1: Single Node Tree
        System.out.println("GetHeight Test 1 (BinaryTree): Single Node Tree");
        System.out.println("Tree:");
        System.out.println(rootTreeString);
        int expected1 = 1;
        int actual1 = rootTree.getHeight();
        System.out.println("Expected: " + expected1);
        System.out.println("Actual: " + actual1);
        assertTrue(expected1 == actual1);
        System.out.println();

        //GetHeight Test 2: Tree with Root and Left Child
        System.out.println("GetHeight Test 2 (BinaryTree): Tree with Root and Left Child");
        System.out.println("Tree:");
        System.out.println(rootandLeftTreeString);
        int expected2 = 2;
        int actual2 = rootAndLeftTree.getHeight();
        System.out.println("Expected: " + expected2);
        System.out.println("Actual: " + actual2);
        assertTrue(expected2 == actual2);
        System.out.println();

        //GetHeight Test 3: Tree with Root and Right Child
        System.out.println("GetHeight Test 3 (BinaryTree): Tree with Root and Right Child");
        System.out.println("Tree:");
        System.out.println(rootandRightTreeString);
        int expected3 = 2;
        int actual3 = rootAndRightTree.getHeight();
        System.out.println("Expected: " + expected3);
        System.out.println("Actual: " + actual3);
        assertTrue(expected3 == actual3);
        System.out.println();

        //GetHeight Test 4: Full Tree with Height of 2
        System.out.println("GetHeight Test 4 (BinaryTree): Full Tree with Height of 2");
        System.out.println("Tree:");
        System.out.println(fullThreeNodeTreeString);
        int expected4 = 2;
        int actual4 = fullThreeNodeTree.getHeight();
        System.out.println("Expected: " + expected4);
        System.out.println("Actual: " + actual4);
        assertTrue(expected4 == actual4);
        System.out.println();

        //GetHeight Test 5: Full Tree with Height of 3
        System.out.println("GetHeight Test 5 (BinaryTree): Full Tree with Height of 3");
        System.out.println("Tree:");
        System.out.println(full2RootString);
        int expected5 = 3;
        int actual5 = full2Root.getHeight();
        System.out.println("Expected: " + expected5);
        System.out.println("Actual: " + actual5);
        assertTrue(expected5 == actual5);
        System.out.println();

        //GetHeight Test 6: Empty Tree
        System.out.println("GetHeight Test 5 (BinaryTree): Full Tree with Height of 4");
        System.out.println("Tree:");
        System.out.println(emptyTreeString);
        int expected6 = 0;
        int actual6 = emptyTree.getHeight();
        System.out.println("Expected: " + expected6);
        System.out.println("Actual: " + actual6);
        assertTrue(expected6 == actual6);
        System.out.println();
    
    }

    @Test 
    void testGetHeight_callBinaryNodeMethod(){

    }

    @Test 
    void testGetNumberOfNodes() {

        //GetNumberofNodes test 1: Empty Tree
        System.out.println("getNumberOfNodes test 1: Empty Tree");
        System.out.println("Tree image: \n" + emptyTreeString);
        int expectedNodes1 = 0;
        int actualNodes1 = emptyTree.getNumberOfNodes();
        System.out.println("Expected number of nodes in this tree: " + expectedNodes1);
        System.out.println("Actual number of nodes in this tree: " + actualNodes1);
        assertEquals(expectedNodes1,actualNodes1);

        //GetNumberofNodes test 2: Tree with one node
        System.out.println("getNumberOfNodes test 2: Tree with one root node");
        System.out.println("Tree image: \n" + rootTreeString);
        int expectedNodes2 = 1;
        int actualNodes2 = rootTree.getNumberOfNodes();
        System.out.println("Expected number of nodes in this tree: " + expectedNodes2);
        System.out.println("Actual number of nodes in this tree: " + actualNodes2);
        assertEquals(expectedNodes2,actualNodes2);

        //GetNumberofNodes test 3: Tree with one node and one left child
        System.out.println("getNumberOfNodes test 3: Tree with one root node and left child");
        System.out.println("Tree image: \n" + rootandLeftTreeString);
        int expectedNodes3 = 2;
        int actualNodes3 = rootAndRightTree.getNumberOfNodes();
        System.out.println("Expected number of nodes in this tree: " + expectedNodes3);
        System.out.println("Actual number of nodes in this tree: " + actualNodes3);
        assertEquals(expectedNodes3,actualNodes3);

        //GetNumberofNodes test 4: Tree with one node and one right child
        System.out.println("getNumberOfNodes test 4: Tree with one root node and right child");
        System.out.println("Tree image: \n" + rootandRightTreeString);
        int expectedNodes4 = 2;
        int actualNodes4 = rootAndRightTree.getNumberOfNodes();
        System.out.println("Expected number of nodes in this tree: " + expectedNodes4);
        System.out.println("Actual number of nodes in this tree: " + actualNodes4);
        assertEquals(expectedNodes4,actualNodes4);

        //GetNumberofNodes test 5: Complete tree with height of two
        System.out.println("getNumberOfNodes test 5: Complete tree with height of two");
        System.out.println("Tree image: \n" + fullThreeNodeTreeString);
        int expectedNodes5 = 3;
        int actualNodes5 = fullThreeNodeTree.getNumberOfNodes();
        System.out.println("Expected number of nodes in this tree: " + expectedNodes5);
        System.out.println("Actual number of nodes in this tree: " + actualNodes5);
        assertEquals(expectedNodes5,actualNodes5);

        //GetNumberofNodes test 6: Complete tree with height of three
        System.out.println("getNumberOfNodes test 6: Complete tree with height of two");
        System.out.println("Tree image: \n" + full2RootString);
        int expectedNodes6 = 7;
        int actualNodes6 = full2Root.getNumberOfNodes();
        System.out.println("Expected number of nodes in this tree: " + expectedNodes6);
        System.out.println("Actual number of nodes in this tree: " + actualNodes6);
        assertEquals(expectedNodes6,actualNodes6);

        //GetNumberofNodes test 7: Tree with only right children
        System.out.println("getNumberOfNodes test 7: Complete tree with height of two");
        System.out.println("Tree image: \n" + rightTreeString);
        int expectedNodes7 = 4;
        int actualNodes7 = rightTree.getNumberOfNodes();
        System.out.println("Expected number of nodes in this tree: " + expectedNodes7);
        System.out.println("Actual number of nodes in this tree: " + actualNodes7);
        assertEquals(expectedNodes7,actualNodes7);

        //GetNumberofNodes test 8: Tree with only left children
        System.out.println("getNumberOfNodes test 8: Complete tree with height of two");
        System.out.println("Tree image: \n" + leftTreeString);
        int expectedNodes8 = 4;
        int actualNodes8 = leftTree.getNumberOfNodes();
        System.out.println("Expected number of nodes in this tree: " + expectedNodes8);
        System.out.println("Actual number of nodes in this tree: " + actualNodes8);
        assertEquals(expectedNodes8,actualNodes8);




        

    }

    @Test 
    void testGetNumberOfNodes_callBinaryNodeMethod() {

    }
    
    public static void main(String[] args){
        System.out.println(full2Root.postorderTraverse().toString());
    }
}
