package com.jamesjhansen;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests methods from tasks 1-4
 */
class TreesTestCases {

    //Empty tree
    BinaryTree<String> emptyTree = new BinaryTree<>();
    static String emptyTreeString = "";

    //Tree with one node
    BinaryTree<String> rootTree = new BinaryTree<>("A",null,null);
    String rootTreeString = "     A     ";

    //Tree with root and left child
    BinaryTree<String> rootAndLeftLeaf = new BinaryTree<>("B",null,null);
    BinaryTree<String> rootAndLeftTree = new BinaryTree<>("A",rootAndLeftLeaf,null);
    String rootandLeftTreeString = "     A     \n" +
                                          "   /       \n" +
                                          "  B        ";

    //Tree with root and right child
    BinaryTree<String> rootAndRightLeaf = new BinaryTree<>("B",null,null);
    BinaryTree<String> rootAndRightTree = new BinaryTree<>("A",null,rootAndRightLeaf);
    String rootandRightTreeString ="     A      \n" +
                                          "      \\    \n" +
                                          "       B     ";  
    
    //Full tree, height of two
    BinaryTree<String> fullThreeNodeLeft = new BinaryTree<>("B",null,null);
    BinaryTree<String> fullThreeNodeRight = new BinaryTree<>("C",null,null);
    BinaryTree<String> fullThreeNodeTree = new BinaryTree<>("A", fullThreeNodeLeft,fullThreeNodeRight);
    String fullThreeNodeTreeString = "       A       \n" +
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
    
    } //end testGetHeight

    @Test 
    void testGetHeight_callBinaryNodeMethod() {

        //GetHeight_callBinaryNodeMethod Test 1: Single Node Tree
        System.out.println("GetHeight Test 1 (BinaryNode): Single Node Tree");
        System.out.println("Tree:");
        System.out.println(rootTreeString);
        int expected1 = 1;
        int actual1 = rootTree.getHeight_callBinaryNodeMethod();
        System.out.println("Expected: " + expected1);
        System.out.println("Actual: " + actual1);
        assertTrue(expected1 == actual1);
        System.out.println();

        //GetHeight_callBinaryNodeMethod Test 2: Tree with Root and Left Child
        System.out.println("GetHeight Test 2 (BinaryNode): Tree with Root and Left Child");
        System.out.println("Tree:");
        System.out.println(rootandLeftTreeString);
        int expected2 = 2;
        int actual2 = rootAndLeftTree.getHeight_callBinaryNodeMethod();
        System.out.println("Expected: " + expected2);
        System.out.println("Actual: " + actual2);
        assertTrue(expected2 == actual2);
        System.out.println();

        //GetHeight_callBinaryNodeMethod Test 3: Tree with Root and Right Child
        System.out.println("GetHeight Test 3 (BinaryNode): Tree with Root and Right Child");
        System.out.println("Tree:");
        System.out.println(rootandRightTreeString);
        int expected3 = 2;
        int actual3 = rootAndRightTree.getHeight_callBinaryNodeMethod();
        System.out.println("Expected: " + expected3);
        System.out.println("Actual: " + actual3);
        assertTrue(expected3 == actual3);
        System.out.println();

        //GetHeight_callBinaryNodeMethod Test 4: Full Tree with Height of 2
        System.out.println("GetHeight Test 4 (BinaryNode): Full Tree with Height of 2");
        System.out.println("Tree:");
        System.out.println(fullThreeNodeTreeString);
        int expected4 = 2;
        int actual4 = fullThreeNodeTree.getHeight_callBinaryNodeMethod();
        System.out.println("Expected: " + expected4);
        System.out.println("Actual: " + actual4);
        assertTrue(expected4 == actual4);
        System.out.println();

        //GetHeight_callBinaryNodeMethod Test 6: Empty Tree
        System.out.println("GetHeight Test 5 (BinaryNode): Full Tree with Height of 4");
        System.out.println("Tree:");
        System.out.println(emptyTreeString);
        int expected6 = 0;
        int actual6 = emptyTree.getHeight_callBinaryNodeMethod();
        System.out.println("Expected: " + expected6);
        System.out.println("Actual: " + actual6);
        assertTrue(expected6 == actual6);
        System.out.println();

    } //end testGetHeight_callBinaryNodeMethod

    @Test 
    void testGetNumberOfNodes() {

        //GetNumberOfNodes Test 1: Single Node Tree
        System.out.println("getNumberOfNodes Test 1 (BinaryTree): Single Node Tree");
        System.out.println("Tree:");
        System.out.println(rootTreeString);
        int expected1 = 1;
        int actual1 = rootTree.getNumberOfNodes();
        System.out.println("Expected: " + expected1);
        System.out.println("Actual: " + actual1);
        assertTrue(expected1 == actual1);
        System.out.println();

        //GetNumberOfNodes Test 2: Single Node Tree
        System.out.println("getNumberOfNodes Test 2 (BinaryTree): Tree with Root and Left Child");
        System.out.println("Tree:");
        System.out.println(rootandLeftTreeString);
        int expected2 = 2;
        int actual2 = rootAndLeftTree.getNumberOfNodes();
        System.out.println("Expected: " + expected2);
        System.out.println("Actual: " + actual2);
        assertTrue(expected2 == actual2);
        System.out.println();

    }

    @Test 
    void testGetNumberOfNodes_callBinaryNodeMethod() {

    }
}
