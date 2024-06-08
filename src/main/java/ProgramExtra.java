import java.util.Scanner;

public class ProgramExtra {
    public static void main(String[] args) {
        // question_01
        Scanner scanner = new Scanner(System.in);
//        System.out.print(" Moi ban nhap vao 1 so bat ky: ");
//        double f = scanner.nextDouble();
//        Double f1 = f * 2.45;
//        Double f2 = f * 12;
//        System.out.printf(" Tinh bang foot: %.2f cm %n Tinh bang inch: %.2f ich %n",f1,f2);
//        // question_02
//        System.out.println("--------------------------------");
//        System.out.print("Ban hay nhap vao so trong khoang tu 0 toi 68399:");
//        int i = scanner.nextInt();
//        if (i>=0 && i<= 68399){
//         int   h = i % 3600 ;
//         int hour = (i - h) / 3600;
//         int second = h % 60;
//         int minute = (h - second)/60;
//            System.out.printf("Gio: %d:%d:%d",hour,minute,second);
//        }else {
//            System.out.println("So ban nhap khong nam trong khoang 0 toi 68399 moi ban nhap lai:");
//        }
//
//        scanner.nextLine();
        // Question_03
//        int max, min;
//        System.out.print("Nhap so thu 1 : ");
//        int a = scanner.nextInt();
//        System.out.print("Nhap so thu 2 : ");
//        int b = scanner.nextInt();
//        System.out.print("Nhap so thu 3 : ");
//        int c = scanner.nextInt();
//        System.out.print("Nhap so thu 4 : ");
//        int d = scanner.nextInt();
//        max = a; min= a;
//        if (max < b) max= b;
//        if(max < c) max= c;
//        if(max < d ) max= d;
//        if(b < min) min= b;
//        if(c < min) min= c;
//        if(d < min) min= d;
//        System.out.println("So lon nhat " + max);
//        System.out.println("So nho nhat " + min);

        // question
//        System.out.print("Moi nhap vao so tu nhien a: ");
//        int i4 = scanner.nextInt();
//        System.out.print("Moi nhap vao so t u nhien b: ");
//        int  i5 = scanner.nextInt();
//
//        int hieu = i4 - i5;
//        System.out.println(hieu > 0 ? "số thu nhat lon hon so thu 2" : " So thu nhat be hon so thu 2");
        //Question 5:
//        System.out.print("Moi nhap vao so tu nhien a: ");
//        int i6 = scanner.nextInt();
//        System.out.print("Moi nhap vao so t u nhien b: ");
//        int  i7 = scanner.nextInt();
//        if (i6 % i7 ==0){
//            System.out.println("So a co chia het cho so b");
//        }else {
//            System.out.println("so a khong chia het cho so b");
//        }
        // question 6;
        System.out.print("Moi nhap vao diem mon toan: ");
        float f6 = scanner.nextFloat();
        System.out.print("Moi nhap vao diem mon ly: ");
        float  f7 = scanner.nextFloat();
        System.out.print("Moi nhap vao diem mon hoa: ");
        float  f8 = scanner.nextFloat();

        float tb = (f6 +f6 +f7 + f8) / 4;
        if (tb>=9){
            System.out.println("Loai xuat xac");
        } else if (8<=tb && tb<9) {
            System.out.println("loai gioi");
            
        } else if (7<=tb && tb<8) {
            System.out.println("Loai kha");
        } else if (6<= tb && tb <7) {
            System.out.println("laoi trung binh kha");
        } else if (5<=tb && tb <6) {
            System.out.println("loai trung binh");
        } else if (tb<5) {
            System.out.println("Loai kem");
        }
    //     


    }
}