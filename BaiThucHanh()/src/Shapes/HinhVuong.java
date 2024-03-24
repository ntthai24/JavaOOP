package Shapes;

import java.util.Scanner;

public class HinhVuong extends HinhChuNhat {
    Scanner sc = new Scanner(System.in);
    public HinhVuong() {
        ten = "Hinh Vuong";
    }
    public void NhapCanhHinhVuong() {
        System.out.println("Nhap canh hinh vuong: ");
        chieudai = chieurong = sc.nextFloat();
    }
}
