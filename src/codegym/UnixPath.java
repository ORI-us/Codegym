
package codegym;

public class UnixPath 
{
    private String Ret;
  public String simplify(String input) 
  {
      System.out.println(input);

      StringBuffer text = new StringBuffer(input);
      
      int k = 0;
      while(true)
      {
          k = text.indexOf("//");
          if(k >= 0)
              text.delete(k, k+1);
          else
             break;
      }
      
      k = 0;
      while(true)
      {
          k = text.indexOf("/../");
          
          if(k == 0)
          {
              text.delete(k, k+3);
          }
          else if(k > 0)
          {
          for(int i = k-1; i >=0; i--)
              if((text.charAt(i) == '/' && text.charAt(i+1) != '.') || i == 0)
              {
                 text.delete(i, k+3);
                 break;
              }
          }
          else
              break;
      }
          
      k = 0;
      while(true)
      {
          k = text.indexOf(".");
          if(k >= 0)
              text.delete(k, k+2);
          else
             break;
      }
      
      k = text.length()-1;
      
      if(k > 1 && text.charAt(k) == '/')
          text.deleteCharAt(k);

      
    Ret = text.toString();
    return Ret;
  }
}
