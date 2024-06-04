import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        Random random = new Random();

        // Tạo số nguyên ngẫu nhiên
        int n = random.nextInt();
        System.out.println("n = " + n);

        // 0<=n<max
        int m = random.nextInt(100);
        System.out.println("m = " + m);

        // min <= k <= max
        // min +random.nextInt(max - min + 1)
        int min = 100;
        int max = 999;
        int k = min + random.nextInt(max - min + 1);
        System.out.println("k = " + k);

        // Thực hành: Lấy ngẫu nhiên phần tử trong mảng
        String[] fruits = {"Cam","Quýt","Táo","Dứa"};
        int i = random.nextInt(fruits.length);
        System.out.println("i = " + i);
        System.out.println(fruits[i]);

    }
}
