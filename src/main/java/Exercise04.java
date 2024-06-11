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
    String cleanedInput = s1.trim().replaceAll("\\s+", " ");
    //  thay thế tất cả các khoảng trắng liên
    // tiếp (bao gồm cả khoảng trắng, tab, dòng mới, v.v.)
    // thành một khoảng trắng duy nhất.

    String[] words = cleanedInput.split(" ");
    if (words.length==3){
        String ho = words[0];
        String ten = words[words.length-1];
        String tenDem = words[1].trim();
        System.out.println("ho = " + ho);
        System.out.println("tenDem = " + tenDem);
        System.out.println("ten = " + ten);

    } else if (words.length == 4) {
        String ho = words[0];
        String ten = words[words.length-1];
        String tenDem = (words[1] + " "+ words[2]).trim();
        System.out.println("ho = " + ho);
        System.out.println("tenDem = " + tenDem);
        System.out.println("ten = " + ten);
    }else {
        System.out.println("Tên qua dai hoac khong dung dinh dang");
    }

}
void question07(){
    System.out.print("Nhập vào ho va ten day du: " );
    String s1 = scanner.nextLine().trim();
    String cleanedInput = s1.trim().replaceAll("\\s+", " ");
    System.out.println("chuan hoa phan A:"+cleanedInput);
    String[] words = cleanedInput.split(" ");
    String s2 = String.valueOf(s1.toUpperCase().charAt(0));
    System.out.println("s2 = " + s2);


}
}
