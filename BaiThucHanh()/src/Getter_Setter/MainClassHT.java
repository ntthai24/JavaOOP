package Getter_Setter;

public class MainClassHT {
    public static void main(String[] args) {
        HinhTron hinhTron = new HinhTron();

        hinhTron.setBanKinh(1);

        float chuVi = hinhTron.tinhChuVi();
        float dienTich = hinhTron.tinhDienTich();
        System.out.println("Chu vi hinh tron la: " + chuVi + "; Va dien tich la: " + dienTich);
    }
}
