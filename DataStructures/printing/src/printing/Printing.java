/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package printing;

import java.util.ArrayList;

/**
 *
 * @author rehan r
 */
public class Printing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[][] a1 = {{1,2,3},{4,5,6}};
        ArrayList inter = new ArrayList();
        int j = 0; 
        int k  = 0;
        for(int i = 0; i< a1[1].length; i++){
             
            if(a1[0][j]!=a1[1][i]){
                k++;
            }
            System.out.println(a1[j][i]);
            if(i == a1[1].length - 1){
                i = 0;
                j++;
            }
            if(j == a1[0].length){
                System.exit(0);
            }
        }
        
    }
    
}
