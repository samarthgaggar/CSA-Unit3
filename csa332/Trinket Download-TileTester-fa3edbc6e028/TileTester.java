/*
 * Activity 3.3.2
 */
public class TileTester
{
  private static final String[] tileValues =
  { "lion", "lion",
    "penguin", "penguin",
    "dolphin", "dolphin",
    "fox", "fox",
    "monkey", "monkey",
    "turtle", "turtle" }; 

  @SuppressWarnings("ForLoopReplaceableByForEach")
  public static void main(String[] args)
  {
    Tile[][] gameboard = new Tile[3][4];
    int tileCount = 0;

    for (int row = 0; row < gameboard.length; row++)
    {
      for (int column = 0; column < gameboard[row].length; column++)
      {
        gameboard[row][column] = new Tile(tileValues[tileCount]);
        tileCount++;
      }
    }

    for (int row = 0; row < gameboard.length; row++)
    {
      for (int column = 0; column < gameboard[row].length; column++)
      {
        System.out.print(gameboard[row][column] + " ");
      }
      System.out.println();
    }
  }
}
