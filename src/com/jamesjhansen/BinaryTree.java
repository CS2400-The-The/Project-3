package com.jamesjhansen;

import java.util.concurrent.atomic.AtomicInteger;

public class BinaryTree<T> implements BinaryTreeInterface<T>
{
   private BinaryNode<T> root;

   public BinaryTree()
   {
      root = null;
   } // end default constructor

   public BinaryTree(T rootData)
   {
      root = new BinaryNode<>(rootData);
   } // end constructor

   public BinaryTree(T rootData, BinaryTree<T> leftTree, BinaryTree<T> rightTree)
   {
      initializeTree(rootData, leftTree, rightTree);
   } // end constructor

   /**
    * calls recursive method buildTreeFromPreAndInorder
    * @param preorder
    * @param inorder
    */
   public BinaryTree(String preorder, String inorder) {
      AtomicInteger preIndex = new AtomicInteger(0);
      root = buildTreeFromPreAndInorder(preorder, inorder, preIndex, 0, inorder.length()-1);
   }

   /**
    * constructs tree from string representing preorder traversal and String representing inorder
    * assumes both strings are valid to construct a binary tree
    * @param preorder
    * @param inorder
    * @param preIndex
    * @param start
    * @param end
    * @return
    */
   public BinaryNode<T> buildTreeFromPreAndInorder(String preorder, String inorder, AtomicInteger preIndex, int start, int end) {
      if (start > end)
         return null;

      BinaryNode nNode = new BinaryNode(preorder.charAt(preIndex.getAndIncrement()));

      if (start == end)
         return nNode;

      int match = nodeIndex(inorder, start, end, (char)nNode.getData());
      nNode.setLeftChild(buildTreeFromPreAndInorder(inorder, preorder, preIndex, start, match-1));
      nNode.setRightChild(buildTreeFromPreAndInorder(inorder, preorder, preIndex, match+1, end));

      return nNode;
   }

   /**
    * returns index of match with data that is in inorder String
    * @param inorder
    * @param start
    * @param end
    * @param data
    * @return
    */
   public int nodeIndex(String inorder, int start, int end, char data) {
      int i;
      for (i=start; i<=end; i++) {
         if (inorder.charAt(i) == data)
            return i;
      }
      return i;
   }

   public void setTree(T rootData, BinaryTreeInterface<T> leftTree,
                                   BinaryTreeInterface<T> rightTree)
   {
      initializeTree(rootData, (BinaryTree<T>)leftTree,
                               (BinaryTree<T>)rightTree);
   } // end setTree

   public void setRootData(T rootData)
   {
      root.setData(rootData);
   } // end setRootData
   
   public T getRootData()
   {
      if (isEmpty())
         throw new EmptyTreeException();
      else
         return root.getData();
   } // end getRootData
   
   public boolean isEmpty()
   {
      return root == null;
   } // end isEmpty
   
   public void clear()
   {
      root = null;
   } // end clear
   
   protected void setRootNode(BinaryNode<T> rootNode)
   {
      root = rootNode;
   } // end setRootNode
   
   protected BinaryNode<T> getRootNode()
   {
      return root;
   } // end getRootNode
   
   private void initializeTree(T rootData, BinaryTree<T> leftTree, BinaryTree<T> rightTree)
   {
      root = new BinaryNode<>(rootData);
      
      if ((leftTree != null) && !leftTree.isEmpty())
         root.setLeftChild(leftTree.root);
      
      if ((rightTree != null) && !rightTree.isEmpty())
      {
         if (rightTree != leftTree)
            root.setRightChild(rightTree.root);
         else
            root.setRightChild(rightTree.root.copy());
      } // end if
      
      if ((leftTree != null) && (leftTree != this))
         leftTree.clear();
      
      if ((rightTree != null) && (rightTree != this))
         rightTree.clear();
   } // end initializeTree

   public void printInorder() {
      printInorder(root);
      System.out.println();
   }

   private void printInorder(BinaryNode node)
   {
      if (node == null)
         return;

      printInorder(node.getLeftChild());

      System.out.print(node.getData() + " ");

      printInorder(node.getRightChild());
   }

   /** -------------------------------------------------------------------- */
   /** Task 1: Implement the 4 methods
    *     . In BinaryTree.java
    *          1. public void postorderTraverse();
    *          2. private void postorderTraverse(BinaryNode<T> node)
    *          3. public void postorderTraverse_callBinaryNodeMethod()
    *     . In BinaryNode.java
    *          4. public void postorderTraverse_binaryNodeMethod() */
   
   /** calls postorderTraverse(BinaryNode<T> node)
    * prints (using post-order traversal) all nodes in the "whole" tree */
   public void postorderTraverse()
   {
      if (root == null)
         throw new EmptyTreeException();
      postorderTraverse(root.getLeftChild());
      postorderTraverse(root.getRightChild());
      System.out.println(root.getData());
   }
   
   /** A Recursive Method in the BinaryTree Class   
    * prints (using post-order traversal) all nodes in the subtree rooted at this node.*/
   private void postorderTraverse(BinaryNode<T> node)
   {
      if (node.hasLeftChild())
         postorderTraverse(node.getLeftChild());

      if (node.hasRightChild())
         postorderTraverse(node.getRightChild());

      System.out.println(node.getData());
   }
 
   /** The following calls postorderTraverse_binaryNodeMethod(), which is a recursive binaryNode class method   
    * prints (using post-order traversal) all nodes in the "whole" tree */
   public void postorderTraverse_callBinaryNodeMethod()
   {
      if (root == null)
         throw new EmptyTreeException();
      root.getLeftChild().postorderTraverse_binaryNodeMethod();
      root.getRightChild().postorderTraverse_binaryNodeMethod();
      System.out.println(root.getData());
   }
   
   /** -------------------------------------------------------------------- */
   /** Task 2: Implement the 2 methods
    *     . In BinaryTree.java
    *          1. public int getHeight_callBinaryNodeMethod()
    *     . In BinaryNode.java
    *          2. public int getHeight_binaryNodeMethod()*/
   
   /** calls getHeight(BinaryNode<T> node)
   @return  The height of the "whole" tree */
   public int getHeight()
   {
	   return getHeight(root);
   } // end getHeight
   
   /** A Recursive Method in the BinaryTree Class  
    * Computes the height of the subtree rooted at this node.
   @return  The height of the subtree rooted at this node. */
   private int getHeight(BinaryNode<T> node)
   {
      int height = 0;
      if (node != null)
         height = 1 + Math.max(getHeight(node.getLeftChild()),
                               getHeight(node.getRightChild()));
      return height;
   } // end getHeight
   
   /** The following calls getHeight_binaryNodeMethod() which is a recursive binaryNode class method
    * Computes the height of the "whole" tree.
   @return  The height of the "whole" tree. */
   public int getHeight_callBinaryNodeMethod()
   {
	   return root.getHeight_binaryNodeMethod();
   } // end getHeight_callBinaryNodeMethod

   /** -------------------------------------------------------------------- */
   /** Task 3: Implement the 2 methods
    *     . In BinaryTree.java
    *          1. public int getNumberOfNodes()
    *          2. private int getNumberOfNodes(BinaryNode<T> node)*/
   
   /** calls getNumberOfNodes(BinaryNode<T> node) 
   @return  The number of nodes in the "whole" tree */
   public int getNumberOfNodes()
   {
      int numberOfNodes = 0;
      if (root != null)
         numberOfNodes = getNumberOfNodes(root);
      return numberOfNodes;
   } // end getNumberOfNodes
   
   /** A Recursive Method in the BinaryTree Class   
    * Counts the nodes in the subtree rooted at this node.
   @return  The number of nodes in the subtree rooted at this node. */
   private int getNumberOfNodes(BinaryNode<T> node)
   {
      int leftNumber = 0;
      int rightNumber = 0;
      if (node.getLeftChild() != null)
         leftNumber = getNumberOfNodes(node.getLeftChild());
      if (node.getRightChild() != null)
         rightNumber = getNumberOfNodes(node.getRightChild());
      return 1 + leftNumber + rightNumber;
   } // end getNumberOfNodes
   
   /** The following calls getNumberOfNodes_binaryNodeMethod() which is a recursive binaryNode class method
    * Counts the nodes in the "whole" tree
   @return  The number of nodes in the "whole" tree. */
   public int getNumberOfNodes_callBinaryNodeMethod()
   {
	   int numberOfNodes = 0;
	   if (root != null)
		   numberOfNodes = root.getNumberOfNodes_binaryNodeMethod();
	   return numberOfNodes;
   } // end getNumberOfNodes_callBinaryNodeMethod
   
} // end BinaryTree
