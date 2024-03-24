package Shapes;

import java.util.Scanner;

public class HinhTron extends HinhHoc {
        Scanner sc = new Scanner(System.in);
        public float bankinh;

        public HinhTron() {
            ten = "Hinh Tron";
        }

        public void NhapBanKinh() {
            System.out.print("Nhap ban kinh: ");
            bankinh = sc.nextFloat();
        }
        public void TinhChuVi() {
            chuvi = 2 * Pi * bankinh;
        }
        public void TinhDienTich() {
            dientich = Pi * bankinh * bankinh;
        }
}
