package Static;

import java.util.Scanner;

public class HinhTron extends HinhHoc {
    public HinhTron() {
        super();
    }

    Scanner sc = new Scanner(System.in);
    public void Nhapdulieu() {
        System.out.print("Nhap ban kinh: ");
        r = sc.nextFloat();
    }
    public void Tinhtoan() {
        float cv = Pi * r * 2;
        float dt = Pi * r * r;
    }
    public void Xuatthongtin() {
        System.out.println("Chu vi cua hinh tron la: " + cv);
        System.out.println("Dien tich cua hinh tron la: " + dt);
    }
}
