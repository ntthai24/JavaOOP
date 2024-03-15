import java.util.Scanner;

public class Slide7_chuong3 {
    public static void main(String[] args) {
        final float Pi = 3.14f;

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ban kinh hinh tron: ");
        float r = sc.nextFloat();

        System.out.print("Nhap chieu cao hinh tru: ");
        float h = sc.nextFloat();

        // Tính chu vi hình tròn
        float cv = 2*Pi*r;

        // Tính diện tích hình tròn
        float dt = Pi*r*r;

        // Tính thể tích hình trụ
        float tcht = dt*h;

        System.out.println("Chu vi hinh tron la: " + cv);
        System.out.println("Dien tich hinh tron la: " + dt);
        System.out.println("The tich cua hinh tru la: " + tcht);

        sc.close();
    }
}
