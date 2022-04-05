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
                                          "        B   ";  
    
    //Full tree, height of two
    BinaryTree<String> fullThreeNodeLeft = new BinaryTree<>("B",null,null);
    BinaryTree<String> fullThreeNodeRight = new BinaryTree<>("C",null,null);
    BinaryTree<String> fullThreeNodeTree = new BinaryTree<>("A", fullThreeNodeLeft,fullThreeNodeRight);
    static String fullThreeNodeTreeString = "       A       \n" +
                                            "     /   \\    \n" +
                                            "    B      C   "; 

    //Full Tree with height of 3
    BinaryTree<String> full2LeftLeaf = new BinaryTree<>("D", null, null);
    BinaryTree<String> full2RightLeaf = new BinaryTree<>("E", null, null);
    BinaryTree<String> full2InnerLeft = new BinaryTree<>("B", full2LeftLeaf, full2RightLeaf);
    BinaryTree<String> full2InnerRight = new BinaryTree<>("C", null, null);
    BinaryTree<String> full2Root = new BinaryTree<>("A", full2InnerLeft, full2InnerRight);
    static String full2Height3 = "      A       \n" +
                                 "    /   \\    \n" +
                                 "   B     C    \n" +
                                 "  / \\        \n" +
                                 " D   E        ";
                                 

    @Test
    void testPostOrderTraverse(){


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
    System.out.println(full2Height3);
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

    }

    @Test 
    void testGetNumberOfNodes_callBinaryNodeMethod() {

    }
    
    public static void main(String[] args){
        System.out.println(rootandLeftTreeString);
        System.out.println();
        System.out.println();
        System.out.println(rootandRightTreeString);
        System.out.println();
        System.out.println();
        System.out.println(fullThreeNodeTreeString);
    }
}
