/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package binarytree;

/**
 *
 * @author rehan r
 */
import java.util.*;
public class CreateTree implements TreeInterface{

    
    public int min;
    Node root;
    Scanner in = new Scanner(System.in);
    public CreateTree(){
        root = null;
    }
    
    
    @Override
    public void CreateNode() {
        root = new Node();
        System.out.println("enter the Root element");
        int element = in.nextInt();
        root.element = element;
        root.left = null;
        root.right = null;
        min = root.element;
    }
    
     @Override
    public void Insert(int element) {
        Node t = new Node();
        t.element = element;
        t.left = null;
        t.right = null;
        Node p,q;
        q = null;
        p = root;
        while(p != null){
            q = p;
            if(element < p.element){
                p = p.left;
            }
            else{
                p = p.right;
            }
        }
        
        if(element < q.element){
            q.left = t;
        }
        else{
            q.right = t;
        }
    }
    
    

   

    @Override
    public int number_of_nodes() {
        return 0;
    }

    @Override
    public int height_of_tree(Node root) {
        if(root == null){
            return 0;
        }
        else if(root.left == null && root.right == null){
            return 1;
        }
        else{
           return Math.max(1 + height_of_tree(root.left), 1+height_of_tree(root.right));
        }
    }

    @Override
    public void Preorder(Node t) {
        if(t != null){
            System.out.print(t.element+" ");
            Preorder(t.left);
            Preorder(t.right);
        }
    }

    @Override
    public void Inorder(Node t) {
        if(t != null){
            Inorder(t.left);
            System.out.print(t.element+" ");
            Inorder(t.right);
            if(t.element < min){
                min = t.element;
            }
        }
    }

    @Override
    public void Postorder(Node t) {
        if(t != null){
            Postorder(t.left);
            Postorder(t.right);
            System.out.print(t.element+" ");
        }
    }

    public void display(){
        System.out.println("INORDER:");
        Inorder(root);
        System.out.println("");
        System.out.println("PREORDER:");
        Preorder(root);
        System.out.println("");
        System.out.println("POSTORDER:");
        Postorder(root);
        System.out.println("");
    }

    int c = 0;
    private int number_of_leaf_nodes(Node root) {
        if(root == null)
            return 0;
        else if(root.left == null && root.right == null)
            c++;
        else
            number_of_leaf_nodes(root.left);
            number_of_leaf_nodes(root.right);
        return c;
    }

    @Override
    public void intilise() {
       int n = number_of_leaf_nodes(root);
       System.out.println("Number of leaf nodes = "+n);
       int n1 = number_of_nodes(root);
       System.out.println("Number of nodes = "+n1);
    }

    private int number_of_nodes(Node root) {
        if(root == null)
            return 0;
        else if (root.left == null && root.right == null)
            return 1;
        else
            return ((1 + number_of_nodes(root.left)+ number_of_nodes(root.right)));
    }
    
    public void print_siblings(Node root){
       while(root != null){
            if(ispresent(root.left) && root.left != null){
                System.out.println("sibling of "+ root.left.element+"is "+root.right.element);
            }
            root = root.left;
        }  
       
        while(root != null){
            if(ispresent(root.right) && root.right != null){
                System.out.println("sibling of "+ root.left.element+"is "+root.right.element);
            }
            root = root.right;
        }  
    }
    
    public boolean ispresent(Node n){
        if(n == null)
            return false;
        else 
            return true;
    }
    
    public void printsiblings(){
        print_siblings(root);
    }
    
    public void DepthOfTree(){
        int x = height_of_tree(root);
        System.out.println(x);
    }
    
    public int nextBigger(Node n,int val){
        ArrayList a = new ArrayList();
        int i =0;
        while(n != null){
            if(val < n.element){
                a.add(i++, n.element);
                n = n.left;
            }
            else if(val > n.element){
                n = n.right;
            }
        }
        System.out.println(Collections.min(a));
        return 0;
    }
    
    public void call(int v){
       int x =  nextBigger(root,v);
    }
}
