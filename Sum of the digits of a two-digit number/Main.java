import java.util.*;
import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try out your code here
    Scanner in = new Scanner(System.in);
    int n1 = in.nextInt();
   int a = n1/10;
    int b = n1%10;
    int c =a + b;
    System.out.println(c);
  }
}