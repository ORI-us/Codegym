/*
A character string is said to have period k if it can be formed by concatenating one or more repetitions 
of another string of length k. For example, the string "abcabcabcabc" has period 3, since 
it is formed by 4 repetitions of the string "abc". It also has periods 6 (two repetitions of "abcabc")
and 12 (one repetition of "abcabcabcabc"). 
Write a program to read a character string and determine its smallest period Return (String) substring;
 */
package codegym;

/**
 *
 * @author orius
 */
public class KmpSmallestPeriod {
    public String findSmalletstPeriod(String input) {
        StringBuffer period = new StringBuffer();
        
        for(int j = 0; j<=input.length(); j++)
        {
            period.append(input.charAt(j));
            
            for(int i = j+1; i<input.length(); i+=period.length())
            {
                StringBuffer P = new StringBuffer();
                P.append(input.substring(i, i + period.length()));

                if(period.toString().equals(P.toString()) == false)
                {
                    break;
                }
                else
                    return P.toString();
            }
        }
        
    return period.toString();
  }
}
