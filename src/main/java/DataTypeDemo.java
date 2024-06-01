import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class DataTypeDemo {
    public static void main(String[] args) {
        // Kiểu số nguyên :
        // byte (1), short (2), int (4), long (8)
        int age = 18;
        System.out.println("age = "+age);
        // kiểu số thực :
        // float (4) , double (8)
        double pi = 3.14159;
        float f1 = 3.14159F;
        System.out.println("pi = " + pi);
        System.out.println("f1 = " + f1);
        // Kiểu logic
        // Kiểu boolean (1)
         boolean isLoading = true;
        System.out.println("isLoading = " + isLoading);

        // Kiểu kí tự
        // char (2)
        char c = 'c';

        // kiểu 1 chuỗi kí tự
        // String
        String s = "java-code";
        System.out.println("s = " + s);

        // Kiểu thời gian
        // LocalDate,LocalTime,LocalDateTime
        LocalDate today = LocalDate.now();
        System.out.println("today = " + today);
        LocalDate date = LocalDate.of(2019,3,20);
        System.out.println("date = " + date);

        // Kiểu enum
        UiState state = UiState.LOADING;
        System.out.println("state = " + state);

        // Kiểu Array (mảng)
        int[] numbers = {2,4,6,8,1,3};
        System.out.println("numbers.length = " + numbers.length);
        // Chỉ số : Bắt đầu từ 0
        System.out.println("numbers[0] = " +numbers[0] );
        // Cách khác:
        String[] fruits = new String[] {"quả cam","Quả mận","Quả táo"};
        System.out.println("fruits = " + Arrays.toString(fruits));
        System.out.println("fruits = " + fruits.length);
        char[] charracters = new char[10]; // Ứng trước độ dài các mảng

        // Cập nhập giá trị theo chỉ số
        charracters[0] = 'k';
        System.out.println("charracters = " + charracters[0]);

    }
}
