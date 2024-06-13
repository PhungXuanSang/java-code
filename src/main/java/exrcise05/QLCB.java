package exrcise05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QLCB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<CanBo> list = new ArrayList<>();
        CanBo canBo = new CanBo();

        System.out.println("Thêm Mới cán bộ");
        System.out.println("1.Công nhân -- 2. Kỹ sư -- 3. Nhân Viên");
        int check = scanner.nextInt();
        scanner.nextLine();
        switch (check){
            case 1:
                System.out.println("Bạn Muoons them moi cong nhan");
                System.out.print("Mời bạn nhập vào tên: ");
                String hoTen = scanner.nextLine();
                System.out.print("Mời bạn nhap vào tuoi:");
                int tuoi = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Mời bạn chọn gioi tính: 1.NAM -- 2.NU -- 3.Khác");
                int checkGioiTinh = scanner.nextInt();
                GioiTinh gioiTinh =null;
                if (checkGioiTinh==1){
                     gioiTinh = GioiTinh.NAM;
                } else if (checkGioiTinh == 2) {
                    gioiTinh = GioiTinh.NU;
                } else if (checkGioiTinh == 3) {
                    gioiTinh = GioiTinh.KHAC;
                }else {
                    System.out.println("Bạn vui lòng chọn só 1,2,3");
                }
                scanner.nextLine();
                System.out.print("Mời bạn nhap vao dia chi: ");
                String diaChi = scanner.nextLine();
                System.out.println("Mời bạn nhập vào bậc(Tu 1 den 10 )");
                int bac = scanner.nextInt();
                canBo = new CongNhan(hoTen,diaChi,gioiTinh,tuoi,bac);
                list.add(canBo);
                System.out.println(list);
                break;
            case 2:

                break;
            case 3:
                break;
            default:
                System.out.println("Mời chọn so 1,2,3");
        }
    }

}
