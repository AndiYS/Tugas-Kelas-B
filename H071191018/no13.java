import java.util.Scanner;

public class no13{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Jumlah Kelas");
        int a = input.nextInt();
        int kelas[] = new int[a];
        for(int i = 0; i < a ; i++){
            int jumlah = input.nextInt();
            int nilai[] = new int [jumlah];
            int kasus = 0;
            int jumlahNilai = 0;
            
            for(int j = 0; j < nilai.length; j++){
                nilai[j] = input.nextInt();
                jumlahNilai += nilai [j];
            }
            double rata = jumlahNilai/jumlah;

            for(int j =0 ; j < nilai.length; j++){
                if (nilai [j] < rata){
                    kasus++;
                }
            }
            kelas [i] = kasus;
        }
        for(int i = 0; i < kelas.length; i++){
            System.out.println(kelas[i]);
        }
    }
}