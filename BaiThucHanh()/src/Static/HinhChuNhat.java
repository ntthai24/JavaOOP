package Static;

import java.util.Scanner;

public class HinhChuNhat extends HinhHoc {
    public HinhChuNhat() {
        super();
    }

    Scanner sc = new Scanner(System.in);
    public void Nhapdulieu() {
        System.out.print("Nhap chieu dai: ");
        Cdai = sc.nextFloat();
        System.out.print("Nhap chieu rong: ");
        Crong = sc.nextFloat();
    }
    public void Tinhtoan() {
        cv = ( Cdai + Crong ) * 2;
        dt = Cdai * Crong;
    }
    public void Xuatthongtin() {
        System.out.println("Chu vi cua hinh chu nhat la: " + cv);
        System.out.println("Dien tich cua hinh chu nhat la: " + dt);
    }
}
