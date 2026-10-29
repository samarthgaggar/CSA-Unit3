/*
 * Activity 3.1.2
 */
public class TraversalAlgorithmsWhile
{
  public static void main(String[] args)
  {
    algorithm1();
    algorithm2();
    algorithm3();
    algorithm4();
  }
  public static void algorithm1()
  {
    int[] goals = {1, 2, 0, 3, 2, 4, 2, 1, 0, 2, 0, 1, 3, 2};

    int p = 1;
    while (p < goals.length)
    {
      if (goals[p - 1] == 0)
      {
        System.out.println("Previous game had no goals!");
      }
      p++;
    }
  }
  public static void algorithm2()
  {
    int[] goals = {1, 2, 0, 3, 2, 4, 2, 1, 0, 2, 0, 1, 3, 2};

    int sum = 0;
    int n = 0;
    while (n < goals.length)
    {
      sum += goals[n];
      n++;
    }
    System.out.println("All goals: " + sum);
  }
  public static void algorithm3()
  {
    String[] misc = {"A", "B", "C", "D", "E", "F"};

    int j = misc.length - 1;
    while (j >= 0)
    {
      System.out.print(misc[j] + " ");
      j--;
    }
  }
  public static void algorithm4()
  {
    String[] misc = {"A", "B", "C", "D", "E", "F"};

    int skip = 1;
    while (skip < misc.length)
    {
      System.out.print(misc[skip] + " ");
      skip += 2;
    }
  }
}
