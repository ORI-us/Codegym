
package codegym;

public class MatrixTraversal {
 public int[] print(int[][] input) {
    int lenght = input[0].length*input.length;
    int[] k = new int[lenght];
    int z = 0;

    int Left  = 0;
    int Right = input[0].length-1;
    int Up    = 0;
    int Down  = input.length-1;
    
    while(z < lenght)
    {
            for(int i = Left; i<=Right && z<lenght; i++, z++)
            {
              k[z] = input[Up][i];
            }
            Up++;
                        
            for(int i = Up; i<=Down && z<lenght; i++, z++)
            {
              k[z] = input[i][Right];
            }
            Right--;
            
            for(int i = Right; i>=Left && z<lenght; i--, z++)
            {
              k[z] = input[Down][i];
            }
            Down--;
            
            for(int i = Down; i>=Up && z<lenght; i--, z++)
            {
              k[z] = input[i][Left];
            }
            Left++;
    }
         
    return k;
  }
}
