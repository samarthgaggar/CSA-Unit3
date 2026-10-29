/*
 * Activity 3.2.3
 */
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample
{
   public static void main(String[] args)
   {
      ArrayList<String> animalList = new ArrayList<>();
      animalList.add("Dog");
      animalList.add("Cat");
      animalList.add("Rabbit");

      Scanner scanner = new Scanner(System.in);
      String command = "";

      while (!command.equals("q"))
      {
         System.out.println("\nList:");
         for (int i = 0; i < animalList.size(); i++)
         {
            System.out.println((i + 1) + ". " + animalList.get(i));
         }

         System.out.print("\n(a)dd, (i)nsert, (r)emove, re(p)lace, (q)uit: ");
         command = scanner.nextLine().trim().toLowerCase();

         if (command.equals("a"))
         {
            System.out.print("Item: ");
            animalList.add(scanner.nextLine());
         }
         else if (command.equals("i"))
         {
            System.out.print("Position (1-" + (animalList.size() + 1) + "): ");
            String positionText = scanner.nextLine();
            try
            {
               int position = Integer.parseInt(positionText);
               if (position < 1 || position > animalList.size() + 1)
               {
                  System.out.println("Invalid position.");
               }
               else
               {
                  System.out.print("Item: ");
                  animalList.add(position - 1, scanner.nextLine());
               }
            }
            catch (NumberFormatException exception)
            {
               System.out.println("Invalid position.");
            }
         }
         else if (command.equals("r") || command.equals("p"))
         {
            if (animalList.isEmpty())
            {
               System.out.println("The list is empty.");
               continue;
            }

            System.out.print("Position (1-" + animalList.size() + "): ");
            try
            {
               int position = Integer.parseInt(scanner.nextLine());
               if (position < 1 || position > animalList.size())
               {
                  System.out.println("Invalid position.");
               }
               else if (command.equals("r"))
               {
                  animalList.remove(position - 1);
               }
               else
               {
                  System.out.print("New item: ");
                  animalList.set(position - 1, scanner.nextLine());
               }
            }
            catch (NumberFormatException exception)
            {
               System.out.println("Invalid position.");
            }
         }
         else if (!command.equals("q"))
         {
            System.out.println("Invalid command.");
         }
      }

      scanner.close();
      System.out.println("Goodbye!");
   }
}
