
package codegym;

public class JoinCharacters {
    public int join(char[] input) {

    int k = 0;
    for(int i=0; i<input.length; i++)
    {
      int z = Character.getNumericValue(input[i]);
      if(z >= 0 && z <= 9) 
      {
          k*=10;
          k+=z;
      }
    }
    
    return k;
  }
}
