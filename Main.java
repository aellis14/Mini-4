import java.until.Scanner;

class Main {
  public static void main(String[] args) 
  {
    Scanner scan = new Scanner(System.in);

    System.out.println("What is your boyfriends name");
    String name = scan.next();
    System.out.println("How old is he?");
    int age = scan.nextInt();
    System.out.println("Is he cute?");
   {
   boolean isHeads = true;
   if (isHeads)
   {
     System.out.println("Yes he is very!");
   }
   else
   {
     System.out.println("Just leave me alone mom");
   }
     System.out.println(greeting(name));

     int age = getAge(birthYear, currentYear);
     System.out.println("His age is " + age);

     System.out.println(country(name));
    }

    //getAge method calculates age
    static int getAge (int birthYear, int currentYear)
    {
      int age = currentYear - birthYear;
      return age;
    }

    static String city (String name)
    {
      String country = "Where does he live" + name;
      return area;
  }
}