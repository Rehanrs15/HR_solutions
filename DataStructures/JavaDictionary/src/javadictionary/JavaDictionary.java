/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javadictionary;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Dictionary; 
import java.util.HashMap;
import java.util.Hashtable;

/**
 *
 * @author rehan r
 */
public class JavaDictionary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here4
          
  HashMap<Integer,String> hm=new HashMap<Integer,String>();  
  
  hm.put(100,"Amit");  
  hm.put(101,"Vijay");  
  hm.put(102,"Rahul");  
  System.out.print(hm.keySet()); 
  Object[] array = hm.keySet().toArray();
  if(hm.keySet().contains(100)){
      System.out.println("sdfds");
  }
  System.out.println(hm);
      
            
 }

   
    
}
