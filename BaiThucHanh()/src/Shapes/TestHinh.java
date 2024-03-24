package Shapes;

public class TestHinh {
    public static void main(String[] args) {
        // Hinh Tron
        HinhTron htron = new HinhTron();

            htron.NhapBanKinh();
            htron.TinhChuVi();
            htron.TinhDienTich();

            htron.xuatTen();
            htron.inChuVi();
            htron.inDienTich();

        // Hinh Tru
        HinhTru htru = new HinhTru();
        
        htru.NhapChieuCao();
        htru.NhapBanKinh();
        htru.TinhDienTich();
        htru.TinhTheTich();

        htru.xuatTen();
        htru.inTheTich();

        // Hinh Chu Nhat
        HinhChuNhat hcn = new HinhChuNhat();

        hcn.NhapCacCanhCuaHinhChuNhat();
        hcn.TinhChuVi();
        hcn.TinhDienTich();
        
        hcn.xuatTen();
        hcn.inChuVi();
        hcn.inDienTich();

        // Hinh Vuong
        HinhVuong hv = new HinhVuong();

        hv.NhapCanhHinhVuong();
        hv.TinhChuVi();
        hv.TinhDienTich();
        
        hv.xuatTen();
        hv.inChuVi();
        hv.inDienTich();
    }
}
