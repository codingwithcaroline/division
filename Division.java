/**
*This program defines.
*integer division and
*decimal division.
*@author Caroline Kirkconnell
*@version 4/13/2020
*/
public class Division
{

/**
*@return - used
*@param numerator - used
*@param denominator - used
*/
   public static int intDivide(int numerator, int denominator)
   {
      try {
         return numerator / denominator;
      }
      catch (ArithmeticException error) {
         return 0;
      }
   }
   
   /**
   *@return - used
   *@param numerator - used
   *@param denom - used
   */
   public static double decimalDivide(int numerator, int denom)
   {
      if (denom == 0)
      {
         throw new IllegalArgumentException("The denominator "
            + "cannot be zero.");
      }
      return ((double) numerator / denom);
      
   }
}