import java.util.Scanner;

public class no12{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int H[] = new int[N] ;
        String warna[] = new String[N] ;
        boolean found = false ;
        for(int i = 0; i < N ; i++){
            H[i] = input.nextInt();
            warna[i] = input.next();
        }
        int X = input.nextInt();
        String warnax = input.next();
        for (int i = 0; i < N; i++){
            if(H[i] == X && warna[i].equalsIgnoreCase(warnax)){
                found = true;
                System.out.println("sepatu warna" +warna[i]+ "berukuran" +H[i]+ "di temukan pada indeks ke" +i);
            }
            found = false;
        }
    }
}