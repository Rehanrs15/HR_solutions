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
public interface TreeInterface {
    
    public void Preorder(Node t);
    public void Inorder(Node t);
    public void Postorder(Node t);
    public void CreateNode();
    public void Insert(int element);
    public int number_of_nodes();
    public int height_of_tree(Node t);
    public void display();
    public void intilise();
}
