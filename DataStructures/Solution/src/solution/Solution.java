/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package solution;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Solution{
   public static void main(String []argh)
   {
      String string = "abaaaaa";
       String reverse="";
      for(int i = string.length() - 1;i >=0;i--){
          reverse = reverse+string.charAt(i);
      }
      if(string.equals(reverse)){
          System.out.println("palindrome");
      }
      else{
          System.out.println("not palindrome");
      }
   }
}