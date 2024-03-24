package Shapes;

import java.util.Scanner;

public class HinhChuNhat extends HinhHoc {
    Scanner sc = new Scanner(System.in);
    public float chieudai;
    public float chieurong;

    public HinhChuNhat(){
        ten = "Hinh Chu Nhat";
    }

    public  void NhapCacCanhCuaHinhChuNhat() {
        System.out.print("Nhap chieu dai: ");
        chieudai = sc.nextFloat();
        System.out.print("Nhap chieu rong: ");
        chieurong = sc.nextFloat();
    }
    public void  TinhChuVi() {
        chuvi = (chieudai + chieurong) * 2;
    }
    public void TinhDienTich() {
        dientich = chieudai * chieurong;
    }
}
