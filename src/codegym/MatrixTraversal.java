/*
Обхід матриці по спіралі

Обійти матрицю по спіралі і записати всі числа в одмірний масив.
Для матриці
[[1,   2,  3,  4],
 [5,   6,  7,  8]
 [9,  10, 11, 12]
 [13, 14, 15, 16]]
вивести [1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10]
*/
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
