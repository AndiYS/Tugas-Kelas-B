import java.util.Scanner;
class no10{
  public static void main(String[] args)
  {
    Scanner read = new Scanner(System.in);
    int m = read.nextInt();
    int n = read.nextInt();
    int matrice[][] = new int[m][n];
    for(int i = 0; i < m; i++)
    {
      for(int j = 0; j < n; j++)
      {
        matrice[i][j] = read.nextInt();
      }
    }
    for(int i = 0; i < n; i++)
    {
      for(int j = m-1; j >= 0; j--)
      {
        System.out.print(matrice[j][i] + " ");
      }
      System.out.println();
    }
  }
}