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

    @Test
    void testPostOrderTraverse(){


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
        System.out.println(rootandLeftTreeString);
        System.out.println();
        System.out.println();
        System.out.println(rootandRightTreeString);
        System.out.println();
        System.out.println();
        System.out.println(fullThreeNodeTreeString);
    }
}
