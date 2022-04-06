package com.jamesjhansen;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Current test case ideas:
 * 
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
 * 11. Uncomplete tree
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
                                    " D  E  F  G    ";
    
    //Tree with only right children
    BinaryTree<String> rightChild3 = new BinaryTree<>("D", null, null);
    BinaryTree<String> rightChild2 = new BinaryTree<>("C", null, rightChild3);
    BinaryTree<String> rightChild1 = new BinaryTree<>("B", null, rightChild2);
    BinaryTree<String> rightTree = new BinaryTree<>("A", null, rightChild1);
    static String rightTreeString = "     A        \n" +
                                    "      \\       \n" +
                                    "       B      \n" +
                                    "        \\     \n" +
                                    "         C     \n" +
                                    "          \\   \n" +
                                    "           D   \n";

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
    BinaryTree<String> completeTree = new BinaryTree<>("A", completeChildB, completeChildC); //GHDIJEBFCA
    static String completeTreeString = "           A          \n" +
                                       "         /   \\       \n" +
                                       "        B     C       \n" +
                                       "       /\\    /       \n" +
                                       "      D  E  F         \n" +
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
    BinaryTree<String> fullChildG = new BinaryTree<>("G", fullChildN, fullChildO);
    BinaryTree<String> fullChildF = new BinaryTree<>("F", fullChildL, fullChildM);
    BinaryTree<String> fullChildE = new BinaryTree<>("E", fullChildJ, fullChildK);
    BinaryTree<String> fullChildD = new BinaryTree<>("D", fullChildH, fullChildI);
    BinaryTree<String> fullChildC = new BinaryTree<>("C", fullChildF, fullChildG);
    BinaryTree<String> fullChildB = new BinaryTree<>("B", fullChildD, fullChildE);
    BinaryTree<String> fullChild = new BinaryTree<>("A", fullChildB, fullChildC);
    static String fullChildString = "               A             \n" +
                                    "           /       \\        \n" +
                                    "          B         C        \n" +
                                    "         /  \\      / \\     \n" +
                                    "        D    E     F    G     \n" +
                                    "       /\\   /\\    /\\   /\\\n" +
                                    "      H  I  J K  L  M  N  O      ";
    
    //Not complete tree
    static BinaryTree<String> uncompleteLeaf4 = new BinaryTree<>("F", null, null);
    static BinaryTree<String> uncompleteLeaf3 = new BinaryTree<>("E", null, null);
    static BinaryTree<String> uncompleteLeaf2 = new BinaryTree<>("C", uncompleteLeaf4, null);
    static BinaryTree<String> uncompleteLeaf1 = new BinaryTree<>("B", null, uncompleteLeaf3);
    static BinaryTree<String> uncompleteRoot = new BinaryTree<>("A", uncompleteLeaf1, uncompleteLeaf2);
    static String uncompleteRootString = "      A       \n" +
                                         "    /   \\    \n" +
                                         "   B     C    \n" +
                                         "    \\  /     \n" +
                                         "     E  F       ";

                                


    @Test
    void testPostOrderTraverse(){

        
        //GetPostOrder Test 1: Empty Tree
        System.out.println("postOrderTraverse Test 1: Empty Tree");
        System.out.println("Tree:");
        System.out.println(emptyTreeString);
        String expected1 = "";
        //String actual1 = emptyTree.postorderTraverseP();
        System.out.println("Expected: " + expected1);
        //System.out.println("Actual: " + actual1);
        //assertEquals(expected1 , actual1);
        System.out.println();
        
        //GetPostOrder Test 2: Single Node Tree
        System.out.println("postOrderTraverse Test 2 (BinaryTree): Single Node Tree");
        System.out.println("Tree:");
        System.out.println(rootTreeString);
        String expected2 = "A";
        String actual2 = rootTree.postorderTraverseP();
        System.out.println("Expected: " + expected2);
        System.out.println("Actual: " + actual2);
        assertEquals(expected2 , actual2);
        System.out.println();

        //GetPostOrder Test 3: Tree with a Root and Left Tree
        System.out.println("postOrderTraverse Test 3 (BinaryTree): Tree with a Root and Left Tree");
        System.out.println("Tree:");
        System.out.println(rootandLeftTreeString);
        String expected3 = "BA";
        String actual3 = rootAndLeftTree.postorderTraverseP();
        System.out.println("Expected: " + expected3);
        System.out.println("Actual: " + actual3);
        assertEquals(expected3 , actual3);
        System.out.println();

        //GetPostOrder Test 4: Full Tree, Height of Two
        System.out.println("postOrderTraverse Test 4 (BinaryTree): Full Tree, Height of Two");
        System.out.println("Tree:");
        System.out.println(fullThreeNodeTreeString);
        String expected4 = "BCA";
        String actual4 = fullThreeNodeTree.postorderTraverseP();
        System.out.println("Expected: " + expected4);
        System.out.println("Actual: " + actual4);
        assertEquals(expected4 , actual4);
        System.out.println();

        //GetPostOrder Test 5: Tree with Only Right Children
        System.out.println("postOrderTraverse Test 5 (BinaryTree): Tree with Only Right Children");
        System.out.println("Tree:");
        System.out.println(rightTreeString);
        String expected5 = "DCBA";
        String actual5 = rightTree.postorderTraverseP();
        System.out.println("Expected: " + expected5);
        System.out.println("Actual: " + actual5);
        assertEquals(expected5 , rightTree.postorderTraverseP());
        System.out.println();

        //GetPostOrder Test 6: Tree with Only Left Children
        System.out.println("postOrderTraverse Test 6 (BinaryTree): Tree with Only Left Children");
        System.out.println("Tree:");
        System.out.println(completeTreeString);
        String expected6 = "DCBA";
        String actual6 = leftTree.postorderTraverseP();
        System.out.println("Expected: " + expected6);
        System.out.println("Actual: " + actual6);
        assertEquals(expected6 , leftTree.postorderTraverseP());
        System.out.println();

        //GetPostOrder Test 7: Complete, but not full tree
        System.out.println("postOrderTraverse Test 7 (BinaryTree): Complete, but Not Full Tree");
        System.out.println("Tree:");
        System.out.println(completeTreeString);
        String expected7 = "GHDIJEBFCA";
        String actual7 = completeTree.postorderTraverseP();
        System.out.println("Expected: " + expected7);
        System.out.println("Actual: " + actual7);
        assertEquals(expected7 , actual7);
        System.out.println();

        //GetPostOrder Test 8: Full tree, height of 4
        System.out.println("postOrderTraverse Test 8 (BinaryTree): Full Tree, height four");
        System.out.println("Tree:");
        System.out.println(fullChildString);
        String expected8 = "HIDJKEBLMFNOGCA";
        String actual8 = fullChild.postorderTraverseP();
        System.out.println("Expected: " + expected8);
        System.out.println("Actual: " + actual8);
        assertEquals(expected8 , actual8);
        System.out.println();

        //GetPostOrder Test 9: Uncomplete tree
        System.out.println("postOrderTraverse Test 9: (BinaryTree): uncomplete Tree");
        System.out.println("Tree:");
        System.out.println(uncompleteRootString);
        String expected9 = "EBFCA";
        String actual9 = uncompleteRoot.postorderTraverseP();
        System.out.println("Expected: " + expected9);
        System.out.println("Actual: " + actual9);
        assertEquals(expected9 , actual9);
        System.out.println();



    }

    @Test
    void testPostOrderTraverse_callbinaryNodeMethod(){

        //GetPostOrder Test 1: Empty Tree
        System.out.println("postOrderTraverse Test 1: Empty Tree");
        System.out.println("Tree:");
        System.out.println(emptyTreeString);
        String expected1 = "";
        //String actual1 = emptyTree.postorderTraverseP();
        System.out.println("Expected: " + expected1);
        //System.out.println("Actual: " + actual1);
        //assertEquals(expected1 , actual1);
        System.out.println();
        
        //GetPostOrder Test 2: Single Node Tree
        System.out.println("postOrderTraverse Test 2 (BinaryTree): Single Node Tree");
        System.out.println("Tree:");
        System.out.println(rootTreeString);
        String expected2 = "A";
        String actual2 = rootTree.postorderTraverse_callBinaryNodeMethodP();
        System.out.println("Expected: " + expected2);
        System.out.println("Actual: " + actual2);
        assertEquals(expected2 , actual2);
        System.out.println();

        //GetPostOrder Test 3: Tree with a Root and Left Tree
        System.out.println("postOrderTraverse Test 3 (BinaryTree): Tree with a Root and Left Tree");
        System.out.println("Tree:");
        System.out.println(rootandLeftTreeString);
        String expected3 = "BA";
        String actual3 = rootAndLeftTree.postorderTraverse_callBinaryNodeMethodP();
        System.out.println("Expected: " + expected3);
        System.out.println("Actual: " + actual3);
        assertEquals(expected3 , actual3);
        System.out.println();

        //GetPostOrder Test 4: Full Tree, Height of Two
        System.out.println("postOrderTraverse Test 4 (BinaryTree): Full Tree, Height of Two");
        System.out.println("Tree:");
        System.out.println(fullThreeNodeTreeString);
        String expected4 = "BCA";
        String actual4 = fullThreeNodeTree.postorderTraverse_callBinaryNodeMethodP();
        System.out.println("Expected: " + expected4);
        System.out.println("Actual: " + actual4);
        assertEquals(expected4 , actual4);
        System.out.println();

        //GetPostOrder Test 5: Tree with Only Right Children
        System.out.println("postOrderTraverse Test 5 (BinaryTree): Tree with Only Right Children");
        System.out.println("Tree:");
        System.out.println(rightTreeString);
        String expected5 = "DCBA";
        String actual5 = rightTree.postorderTraverse_callBinaryNodeMethodP();
        System.out.println("Expected: " + expected5);
        System.out.println("Actual: " + actual5);
        assertEquals(expected5 , rightTree.postorderTraverseP());
        System.out.println();

        //GetPostOrder Test 6: Tree with Only Left Children
        System.out.println("postOrderTraverse Test 6 (BinaryTree): Tree with Only Left Children");
        System.out.println("Tree:");
        System.out.println(leftTreeString);
        String expected6 = "DCBA";
        String actual6 = leftTree.postorderTraverse_callBinaryNodeMethodP();
        System.out.println("Expected: " + expected6);
        System.out.println("Actual: " + actual6);
        assertEquals(expected6 , leftTree.postorderTraverseP());
        System.out.println();

        //GetPostOrder Test 7: Complete, but not full tree
        System.out.println("postOrderTraverse Test 7 (BinaryTree): Complete, but Not Full Tree");
        System.out.println("Tree:");
        System.out.println(completeTreeString);
        String expected7 = "GHDIJEBFCA";
        String actual7 = completeTree.postorderTraverse_callBinaryNodeMethodP();
        System.out.println("Expected: " + expected7);
        System.out.println("Actual: " + actual7);
        assertEquals(expected7 , actual7);
        System.out.println();

        //GetPostOrder Test 8: Full tree, height of 4
        System.out.println("postOrderTraverse Test 8 (BinaryTree): Full Tree, height four");
        System.out.println("Tree:");
        System.out.println(fullChildString);
        String expected8 = "HIDJKEBLMFNOGCA";
        String actual8 = fullChild.postorderTraverse_callBinaryNodeMethodP();
        System.out.println("Expected: " + expected8);
        System.out.println("Actual: " + actual8);
        assertEquals(expected8 , actual8);
        System.out.println();

        //GetPostOrder Test 9: Uncomplete tree
        System.out.println("postOrderTraverse Test 9: (BinaryTree): uncomplete Tree");
        System.out.println("Tree:");
        System.out.println(uncompleteRootString);
        String expected9 = "EBFCA";
        String actual9 = uncompleteRoot.postorderTraverse_callBinaryNodeMethodP();
        System.out.println("Expected: " + expected9);
        System.out.println("Actual: " + actual9);
        assertEquals(expected9 , actual9);
        System.out.println();

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
        System.out.println("GetHeight Test 6 (BinaryTree): Full Tree with Height of 4");
        System.out.println("Tree:");
        System.out.println(emptyTreeString);
        int expected6 = 0;
        int actual6 = emptyTree.getHeight();
        System.out.println("Expected: " + expected6);
        System.out.println("Actual: " + actual6);
        assertTrue(expected6 == actual6);
        System.out.println();

        //GetHeight Test 7: Complete, but not Full Tree
        System.out.println("GetHeight Test 7 (BinaryTree): Complete, but not Full Tree");
        System.out.println("Tree:");
        System.out.println(completeTreeString);
        int expected7 = 4;
        int actual7 = completeTree.getHeight();
        System.out.println("Expected: " + expected7);
        System.out.println("Actual: " + actual7);
        assertTrue(expected7 == actual7);
        System.out.println();

        //GetHeight Test 8: Incomplete Tree
        System.out.println("GetHeight Test 7 (BinaryTree): Incomplete Tree");
        System.out.println("Tree:");
        System.out.println(uncompleteRootString);
        int expected8 = 3;
        int actual8 = uncompleteRoot.getHeight();
        System.out.println("Expected: " + expected8);
        System.out.println("Actual: " + actual8);
        assertTrue(expected8 == actual8);
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

        //GetHeight_callBinaryNodeMethod Test 5: Full Tree with Height of 3
        System.out.println("GetHeight Test 5 (BinaryNode): Full Tree with Height of 3");
        System.out.println("Tree:");
        System.out.println(full2RootString);
        int expected5 = 3;
        int actual5 = full2Root.getHeight_callBinaryNodeMethod();
        System.out.println("Expected: " + expected5);
        System.out.println("Actual: " + actual5);
        assertTrue(expected5 == actual5);
        System.out.println();

        //GetHeight_callBinaryNodeMethod Test 6: Empty Tree
        System.out.println("GetHeight Test 6 (BinaryNode): Empty Tree");
        System.out.println("Tree:");
        System.out.println(emptyTreeString);
        int expected6 = 0;
        int actual6 = emptyTree.getHeight_callBinaryNodeMethod();
        System.out.println("Expected: " + expected6);
        System.out.println("Actual: " + actual6);
        assertTrue(expected6 == actual6);
        System.out.println();

        //GetHeight Test 7: Complete, but not Full Tree
        System.out.println("GetHeight Test 7 (BinaryTree): Complete, but not Full Tree");
        System.out.println("Tree:");
        System.out.println(completeTreeString);
        int expected7 = 4;
        int actual7 = completeTree.getHeight_callBinaryNodeMethod();
        System.out.println("Expected: " + expected7);
        System.out.println("Actual: " + actual7);
        assertTrue(expected7 == actual7);
        System.out.println();

        //GetHeight Test 8: Incomplete Tree
        System.out.println("GetHeight Test 7 (BinaryTree): Incomplete Tree");
        System.out.println("Tree:");
        System.out.println(uncompleteRootString);
        int expected8 = 3;
        int actual8 = uncompleteRoot.getHeight_callBinaryNodeMethod();
        System.out.println("Expected: " + expected8);
        System.out.println("Actual: " + actual8);
        assertTrue(expected8 == actual8);
        System.out.println();
        
    } //end testGetHeight_callBinaryNodeMethod

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

        //GetNumberofNodes test 9: Complete, but no full tree
        System.out.println("getNumberOfNodes test 9: Complete, but not full tree");
        System.out.println("Tree image: \n" + completeTreeString);
        int expectedNodes9 = 10;
        int actualNodes9 = completeTree.getNumberOfNodes();
        System.out.println("Expected number of nodes in this tree: " + expectedNodes9);
        System.out.println("Actual number of nodes in this tree: " + actualNodes9);
        assertEquals(expectedNodes9,actualNodes9);

        //GetNumberofNodes test 10: Full tree, height 4
        System.out.println("getNumberOfNodes test 10: Full tree height 4");
        System.out.println("Tree image: \n" + fullChildString);
        int expectedNodes10 = 15;
        int actualNodes10 = fullChild.getNumberOfNodes();
        System.out.println("Expected number of nodes in this tree: " + expectedNodes10);
        System.out.println("Actual number of nodes in this tree: " + actualNodes10);
        assertEquals(expectedNodes10,actualNodes10);

        //GetNumberofNodes test 11: Uncomplete tree
        System.out.println("getNumberOfNodes test 11: Uncomplete tree ");
        System.out.println("Tree image: \n" + uncompleteRootString);
        int expectedNodes11 = 5;
        int actualNodes11 = uncompleteRoot.getNumberOfNodes();
        System.out.println("Expected number of nodes in this tree: " + expectedNodes11);
        System.out.println("Actual number of nodes in this tree: " + actualNodes11);
        assertEquals(expectedNodes11,actualNodes11);
        

        

    }

    @Test 
    void testGetNumberOfNodes_callBinaryNodeMethod() {

        //GetNumberofNodes test 1: Empty Tree
        System.out.println("getNumberOfNodes test 1: Empty Tree");
        System.out.println("Tree image: \n" + emptyTreeString);
        int expectedNodes1 = 0;
        int actualNodes1 = emptyTree.getNumberOfNodes_callBinaryNodeMethod();
        System.out.println("Expected number of nodes in this tree: " + expectedNodes1);
        System.out.println("Actual number of nodes in this tree: " + actualNodes1);
        assertEquals(expectedNodes1,actualNodes1);

        //GetNumberofNodes test 2: Tree with one node
        System.out.println("getNumberOfNodes test 2: Tree with one root node");
        System.out.println("Tree image: \n" + rootTreeString);
        int expectedNodes2 = 1;
        int actualNodes2 = rootTree.getNumberOfNodes_callBinaryNodeMethod();
        System.out.println("Expected number of nodes in this tree: " + expectedNodes2);
        System.out.println("Actual number of nodes in this tree: " + actualNodes2);
        assertEquals(expectedNodes2,actualNodes2);

        //GetNumberofNodes test 3: Tree with one node and one left child
        System.out.println("getNumberOfNodes test 3: Tree with one root node and left child");
        System.out.println("Tree image: \n" + rootandLeftTreeString);
        int expectedNodes3 = 2;
        int actualNodes3 = rootAndRightTree.getNumberOfNodes_callBinaryNodeMethod();
        System.out.println("Expected number of nodes in this tree: " + expectedNodes3);
        System.out.println("Actual number of nodes in this tree: " + actualNodes3);
        assertEquals(expectedNodes3,actualNodes3);

        //GetNumberofNodes test 4: Tree with one node and one right child
        System.out.println("getNumberOfNodes test 4: Tree with one root node and right child");
        System.out.println("Tree image: \n" + rootandRightTreeString);
        int expectedNodes4 = 2;
        int actualNodes4 = rootAndRightTree.getNumberOfNodes_callBinaryNodeMethod();
        System.out.println("Expected number of nodes in this tree: " + expectedNodes4);
        System.out.println("Actual number of nodes in this tree: " + actualNodes4);
        assertEquals(expectedNodes4,actualNodes4);

        //GetNumberofNodes test 5: Complete tree with height of two
        System.out.println("getNumberOfNodes test 5: Complete tree with height of two");
        System.out.println("Tree image: \n" + fullThreeNodeTreeString);
        int expectedNodes5 = 3;
        int actualNodes5 = fullThreeNodeTree.getNumberOfNodes_callBinaryNodeMethod();
        System.out.println("Expected number of nodes in this tree: " + expectedNodes5);
        System.out.println("Actual number of nodes in this tree: " + actualNodes5);
        assertEquals(expectedNodes5,actualNodes5);

        //GetNumberofNodes test 6: Complete tree with height of three
        System.out.println("getNumberOfNodes test 6: Complete tree with height of two");
        System.out.println("Tree image: \n" + full2RootString);
        int expectedNodes6 = 7;
        int actualNodes6 = full2Root.getNumberOfNodes_callBinaryNodeMethod();
        System.out.println("Expected number of nodes in this tree: " + expectedNodes6);
        System.out.println("Actual number of nodes in this tree: " + actualNodes6);
        assertEquals(expectedNodes6,actualNodes6);

        //GetNumberofNodes test 7: Tree with only right children
        System.out.println("getNumberOfNodes test 7: Complete tree with height of two");
        System.out.println("Tree image: \n" + rightTreeString);
        int expectedNodes7 = 4;
        int actualNodes7 = rightTree.getNumberOfNodes_callBinaryNodeMethod();
        System.out.println("Expected number of nodes in this tree: " + expectedNodes7);
        System.out.println("Actual number of nodes in this tree: " + actualNodes7);
        assertEquals(expectedNodes7,actualNodes7);

        //GetNumberofNodes test 8: Tree with only left children
        System.out.println("getNumberOfNodes test 8: Complete tree with height of two");
        System.out.println("Tree image: \n" + leftTreeString);
        int expectedNodes8 = 4;
        int actualNodes8 = leftTree.getNumberOfNodes_callBinaryNodeMethod();
        System.out.println("Expected number of nodes in this tree: " + expectedNodes8);
        System.out.println("Actual number of nodes in this tree: " + actualNodes8);
        assertEquals(expectedNodes8,actualNodes8);

        //GetNumberofNodes test 9: Complete, but no full tree
        System.out.println("getNumberOfNodes test 9: Complete, but not full tree");
        System.out.println("Tree image: \n" + completeTreeString);
        int expectedNodes9 = 10;
        int actualNodes9 = completeTree.getNumberOfNodes_callBinaryNodeMethod();
        System.out.println("Expected number of nodes in this tree: " + expectedNodes9);
        System.out.println("Actual number of nodes in this tree: " + actualNodes9);
        assertEquals(expectedNodes9,actualNodes9);

        //GetNumberofNodes test 10: Full tree, height 4
        System.out.println("getNumberOfNodes test 10: Full tree height 4");
        System.out.println("Tree image: \n" + fullChildString);
        int expectedNodes10 = 15;
        int actualNodes10 = fullChild.getNumberOfNodes_callBinaryNodeMethod();
        System.out.println("Expected number of nodes in this tree: " + expectedNodes10);
        System.out.println("Actual number of nodes in this tree: " + actualNodes10);
        assertEquals(expectedNodes10,actualNodes10);

        //GetNumberofNodes test 11: Uncomplete tree
        System.out.println("getNumberOfNodes test 11: Uncomplete tree ");
        System.out.println("Tree image: \n" + uncompleteRootString);
        int expectedNodes11 = 5;
        int actualNodes11 = uncompleteRoot.getNumberOfNodes_callBinaryNodeMethod();
        System.out.println("Expected number of nodes in this tree: " + expectedNodes11);
        System.out.println("Actual number of nodes in this tree: " + actualNodes11);
        assertEquals(expectedNodes11,actualNodes11);

    }

    @Test
    void testbuildTreeFromPreAndInorder() {

    }
    
    public static void main(String[] args){
        System.out.println(full2Root.postorderTraverseP());
    }
}
