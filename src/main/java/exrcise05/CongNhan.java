package exrcise05;

public class CongNhan extends CanBo{
    protected int bac;



    public CongNhan(String hoTen, String diaChi, GioiTinh gioiTinh, int tuoi, int bac) {
        super(hoTen, diaChi, gioiTinh, tuoi);
        this.bac = bac;
    }



    @Override
    public String toString() {
        return "CongNhan{" +
                "bac=" + bac +
                ", hoTen='" + hoTen + '\'' +
                ", tuoi=" + tuoi +
                ", gioiTinh=" + gioiTinh +
                ", diaChi='" + diaChi + '\'' +
                '}';
    }
}
