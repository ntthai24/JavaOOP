package Getter_Setter;

public class MainClassSV {
    public static void main(String[] args) {

        SinhVien sinhVien1 = new SinhVien();
        SinhVien sinhVien2 = new SinhVien();

        sinhVien1.setTen("");
        sinhVien1.setTuoi(23);

        sinhVien2.setTen("Peter");
        sinhVien2.setTuoi(19);

        //in ra man hinh
        System.out.println("Sinh vien thu nhat la: " + sinhVien1.getTen() + ", tuoi:  " + sinhVien1.getTuoi() );
        System.out.println("Sinh vien thu hai la: " + sinhVien2.getTen() + ", tuoi: " + sinhVien2.getTuoi() );

    }
}
