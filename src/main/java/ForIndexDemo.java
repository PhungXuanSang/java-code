public class ForIndexDemo {
    public static void main(String[] args) {
        //[1..10]
        for (int i =1;i<=10;i++){
            System.out.println("i = " + i);
        }
        //[10..1]
        for (int i =10;i>=1;i--){
            System.out.println("i = " + i);
        }
        //[2,4,6,8,10]
        for (int i =2;i<=10;i+=2){
            System.out.println("i = " + i);
        }
        // Lặp các phần tử trong array
        int[] numders = {1,5,6,8,4,3,9};
        for (int i = 0; i <numders.length ; i++) {
            System.out.println("numders = " + numders[i]);
        }
    }
}
