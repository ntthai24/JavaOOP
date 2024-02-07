import java.util.Scanner;

public class Slide30 {
    public static void main(String[] args) {
        int soDu,Tong=0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap mot so nguyen: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Vui long nhap mot so nguyen lon hon 0.");
        } else {
            while (n != 0) {
                Tong += n % 10;
                n /= 10;
            }
            System.out.println("Tong cua cac chu so vua nhap la: " + Tong);
        }
        sc.close();
    }
}
