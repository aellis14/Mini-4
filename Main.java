import java.until.Scanner;

class Main {
  public static void main(String[] args) 
  {
   Scanner scan = new Scanner(System.in);

   System.out.println("What is your boyfriends name?");
   String name = scan.next();
   System.out.println("How old is he?");
   int age = scan.nextInt();
   System.out.println("when did you guys meet?");
   int day = scan.nextInt();
   System.out.println("What year his it?");
   int currentYear = scan.nextInt();
   System.out.println("What his your birth year?");
   int birthYear = scan.nextInt();

   System.out.println(greeting(name));

   int age = getAge(birthYear, currentYear);
   System.out.println("His age is " + age);

   System.out.println(city(name));
  } 
    
  //getAge method calulates age
  static int getAge (int birthYear, int currentYear)
  {
    int age = currentYear - birthYear;
    return age;
  }

  //gretting method returns a personalized greeting
  static String greeting(String name)
  {
    String hello = ("Hello. I am glad to have you here, " + name);
    return hello;
  }

  static String city(String name)
  {
    String city = ("What city does he live in " + name);
    return city;
  }

}