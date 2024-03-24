package Shapes;

import java.util.Scanner;

public class HinhTru extends HinhTron {
    Scanner sc = new Scanner(System.in);
    public float chieucao;

    public HinhTru() {
        ten = "Hinh Tru";
    }

    public void NhapChieuCao() {
        System.out.print("Nhap chieu cao: ");
        chieucao = sc.nextFloat();
    }
    public void TinhTheTich() {
        thetich = chieucao * dientich;
    }
}
