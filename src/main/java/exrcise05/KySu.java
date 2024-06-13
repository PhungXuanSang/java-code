package exrcise05;

public class KySu extends CanBo{
    protected String nganhDaoTao;




    public KySu(String hoTen, String diaChi, GioiTinh gioiTinh, int tuoi, String nganhDaoTao) {
        super(hoTen, diaChi, gioiTinh, tuoi);
        this.nganhDaoTao = nganhDaoTao;
    }

    @Override
    public String toString() {
        return "KySu{" +
                "nganhDaoTao='" + nganhDaoTao + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", gioiTinh=" + gioiTinh +
                ", tuoi=" + tuoi +
                ", hoTen='" + hoTen + '\'' +
                '}';
    }
}
