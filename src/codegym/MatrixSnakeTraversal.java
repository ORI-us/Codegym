/*
Обхід Матриці Змійкою

Обійти матрицю "змійкою" і повернути всі числа в одномірному масиві.
Наприклад:
Для
[[ 1, 2, 3 ],
 [ 4, 5, 6 ],
 [ 7, 8, 9 ]]
повернути
[1, 4, 7, 8, 5, 2, 3, 6, 9]
*/
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
