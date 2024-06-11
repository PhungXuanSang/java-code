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

    System.out.print("Nhập vào xâu ký tự thu 1: ");
    String s1  = scanner.nextLine();
    System.out.print("Nhập vào xâu ký tự thu 2: ");
    String s2  = scanner.nextLine();
    System.out.println(s2+s1);
}
void question03(){
    System.out.print("Nhập vào Tên: ");
    String s1  = scanner.nextLine().trim();
    String s2 = String.valueOf(s1.charAt(0));
    if (s2.equals(s2.toUpperCase())){
        System.out.println("Viết hoa: " + s1.toUpperCase());
    }else {
        System.out.println("Viết thường: " + s1.toLowerCase());
    }

}
void question04(){
    System.out.print("Nhập vào teen: " );
    String s1 = scanner.nextLine().trim();
    String s2 = s1.toUpperCase();
    for (int i = 0;i<s2.length();i++){
        System.out.println("s2.charAt(i) = " + s2.charAt(i));
    }

}
void question05(){
    System.out.print("Nhập vào ho: " );
    String s1 = scanner.nextLine().trim();
    System.out.print("Nhập vào ten: " );
    String s2 = scanner.nextLine().trim();

    System.out.println("Ho tên đầy đủ: "+(s1+" "+s2));
}
void question06(){
    System.out.print("Nhập vào ho va ten day du: " );
    String s1 = scanner.nextLine().trim();
    for (int i = 0; i < s1.length(); i++) {
        System.out.println(s1.charAt(1));
    }
}
}
