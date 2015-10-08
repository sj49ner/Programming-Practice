//defines enum having months of the year 
//prints the value of all the enum elements.
public class SampathCollectionListMonthesInEnum
{
  public enum Month
  {
    January, February, March, April, May, June, July, August, September, October, November, December
  }
 
  public static void main(String[] args)
  {
    int count = 1;
    // loop thru our enum
    for (Month m: Month.values())
    {
      System.out.printf("Month %d = %s\n", count++, m);
    }
  }
}
