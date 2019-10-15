import java.util.Scanner;
class no9{
  public static void main(String[] args)
  {
    Scanner read = new Scanner(System.in);
    String words = read.nextLine();
    char chars;
    for(int i = words.length()-1 ; i >= 0; i--)
    {
      chars = words.charAt(i);
      System.out.printf("%c",chars == '(' ? ')': chars == ')' ? '(':chars);
    }
  }
}