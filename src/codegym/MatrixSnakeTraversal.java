
package codegym;

public class MatrixSnakeTraversal {
      public int[] print(int[][] input) {
      int[] k = new int[input[0].length*input.length];

      int z = 0;
      for(int j=0; j<input[0].length; j++)
      {
          if(j%2 == 0)
          {
            for(int i=0; i<input.length; i++)
            {
                k[z] = input[i][j];
                z++;
            }
          }
          else
          {
            for(int i=input.length-1; i>=0; i--)
            {
                k[z] = input[i][j];
                z++;
            }
          }
      }
            
      return k;
  }
}
