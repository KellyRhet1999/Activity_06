import java.util.ArrayList;
/**
* Rhet Kelly
* 10/07/19
* Activity_06
* Holds set of integer values with temperature.
*/

public class Temperatures
{
   private ArrayList<Integer> temperatures;

/**
* @param temperaturesIn is the value of the temperatures.
*/

   public Temperatures(ArrayList<Integer> temperaturesIn)
   {
      temperatures = temperaturesIn;
   }
   
   /**
   * @return returns the low temperature.
   */
   
   public int getLowTemp()
   {
      if (temperatures.isEmpty())
      {
         return 0;
      }
      int low = temperatures.get(0);
      for (int i = 0; i < temperatures.size(); i++)
      {
         if (temperatures.get(i) < low)
         {
            low = temperatures.get(i);
         }
      }
      return low;
   }
   
   /**
   * @return returns the high temperature.
   */
   
   public int getHighTemp()
   {
      if (temperatures.isEmpty())
      {
         return 0;
      }
      int high = temperatures.get(0);
      for (Integer temp : temperatures)
      {
         if (temp > high)
         {
            high = temp;
         }
      }
      return high;
   }
   
   /**
   * @param lowIn is the minimum.
   * @return returns the minimum.
   */
   
   public int lowerMinimum(int lowIn)
   {
      return lowIn < getLowTemp() ? lowIn : getLowTemp();
   }
   
   /**
   * @param highIn is the maximum.
   * @return returns the maximum.
   */
   
   public int higherMaximum(int highIn)
   {
      return highIn > getHighTemp() ? highIn : getHighTemp();
   }
   
   /**
   * @return returns the string.
   */
   public String toString()
   {
      return "\tTemperatures: " + temperatures
         + "\n\tLow: " + getLowTemp()
         + "\n\tHigh: " + getHighTemp();
   }
   
}