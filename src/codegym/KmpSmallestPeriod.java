/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
