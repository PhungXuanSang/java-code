import java.util.Scanner;

public class Exercise04 {
    Scanner scanner = new Scanner(System.in);
    void question01(){

        System.out.println("Nhập vào xâu ký tự: ");
        String s  = scanner.nextLine();
        String[] words = s.split(" ");
        int count =0;
        for (String word : words){
            if (!word.isEmpty()){
                count++;
            }
        }
        System.out.println("Số ký tu trong xâu = " + count);
    }
void question02(){

    System.out.println("Nhập vào xâu ký tự thu 1: ");
    String s1  = scanner.nextLine();
    System.out.println("Nhập vào xâu ký tự thu 2: ");
    String s2  = scanner.nextLine();
    System.out.println(s2+s1);
}
void question03(){
    System.out.println("Nhập vào Tên: ");
    String s1  = scanner.nextLine();


}
}
