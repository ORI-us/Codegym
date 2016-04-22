
package codegym;

import java.util.*;

public class GnomeFood {
   public int[] find(int[] gnames, int[] portions) 
   {
       int length = gnames.length;
              
       int[] sort_g = gnames.clone();
       int[] sort_p = portions.clone();
       
       Arrays.sort(sort_g);
       Arrays.sort(sort_p);
       
       int[] food = new int[length];
       
       for(int i = 0; i<length; i++)
       {
           for(int j = 0; j<length; j++)
           {
               if(sort_g[i] == gnames[j])
               {
                   for(int k = 0; k<length; k++)
                   {
                       if(sort_p[i] == portions[k])
                       {
                           food[j] = k;
                           break;
                       }
                   }
                   break;
               }
           }
       }
       
       return food;
   }
}
