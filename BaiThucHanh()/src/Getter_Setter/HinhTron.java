package Getter_Setter;

public class HinhTron {
    private final float Pi = 3.14f;
    private float banKinh;

    public float getBanKinh()
    {
        return banKinh;
    }
     public void setBanKinh(float banKinh)
    {
        this.banKinh = banKinh;
    }
    public float tinhChuVi()
    {
        return Pi * banKinh * 2;
    }
    public float tinhDienTich()
    {
        return Pi * banKinh * banKinh;
    }
}
