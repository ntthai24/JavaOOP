import java.util.Scanner;

public class Silde5_chuong3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ban kinh hinh tron: ");
        float r = sc.nextFloat();

        final float Pi = 3.14f;

        //Tính chu vi hình tròn
        float cv = 2*Pi*r;

        //Tính diện tích hình tròn
        float dt = Pi*r*r;

        System.out.println("Chu vi cua hinh tron la: " + cv);
        System.out.println("Dien tich cua hinh tron la: " + dt);

        sc.close();
    }
}
