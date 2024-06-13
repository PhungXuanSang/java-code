package exrcise05;

public class NhanVien extends CanBo{
    protected String congViec;


    public NhanVien(String hoTen, String diaChi, GioiTinh gioiTinh, int tuoi, String congViec) {
        super(hoTen, diaChi, gioiTinh, tuoi);
        this.congViec = congViec;
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "diaChi='" + diaChi + '\'' +
                ", gioiTinh=" + gioiTinh +
                ", tuoi=" + tuoi +
                ", hoTen='" + hoTen + '\'' +
                ", congViec='" + congViec + '\'' +
                '}';
    }

}
