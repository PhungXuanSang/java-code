package exrcise05;

public class CanBo {
    protected String hoTen;
    protected int tuoi;
    protected GioiTinh gioiTinh;
    protected String diaChi;

    public CanBo(String hoTen, String diaChi, GioiTinh gioiTinh, int tuoi) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.gioiTinh = gioiTinh;
        this.tuoi = tuoi;
    }

    public CanBo() {
    }

    @Override
    public String toString() {
        return "CanBo{" +
                "hoTen='" + hoTen + '\'' +
                ", tuoi=" + tuoi +
                ", gioiTinh=" + gioiTinh +
                ", diaChi='" + diaChi + '\'' +
                '}';
    }
}
