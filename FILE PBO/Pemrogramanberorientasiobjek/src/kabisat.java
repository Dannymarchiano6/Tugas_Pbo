import java.util.Scanner;

public class kabisat {
    public static void main(String[] args) {
        int tahun;
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan tahun :");
        tahun = input.nextInt();

        if(tahun % 400 == 0){
            System.out.print( tahun + "Merupakan tahun kabisat \n");
        } else if (tahun % 100 == 0){
            System.out.print( tahun + "Bukan tahun Kabisat \n");
        } else if (tahun % 4 == 0){
            System.out.print( tahun + "Merupakan tahun kabisat \n");
        }else{
            System.out.print(tahun + "Bukan tahun Kabisat \n");
        }
        input.close();
    }
}
