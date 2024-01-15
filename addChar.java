public class addChar
{
  public static void main(String[] args)
  {
    whatsForDinner(500);
  }
  public static String whatsForDinner(int calories)
  {
    String dinner = "";
    if (calories >= 600)
    {
      dinner = "Pizza";
    }
    else if(calories >= 400 && calories <= 599)
    {
      dinner = "Pasta";
    }
    else if(calories >=250 && calories <= 399)
    {
      dinner = "Baked fish";
    }
    else
    {
      dinner = "Salad";
    }
    return dinner;
  }
}
