import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try out your code here
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int a = n/100;
    int b= n%10;
    int c= a + b;
    System.out.println(c);
  }
}