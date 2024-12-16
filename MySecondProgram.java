public class MySecondProgram {
    public static void main(String[] args) {
        compareTwoNumbers(10, 10);
        compareTwoNumbers(11, 10);
        compareTwoNumbers(9, 10);
        compareTwoNumbers(100, 10);

    }
    public static void compareTwoNumbers(int a, int b){
        System.out.println("Number A is :" + a);
        System.out.println("Number B is :" + b);
        if (a == b) {
            System.out.println("A is equal to B");
        } else if (a > b) {
            System.out.println("A is greater than b");
        } else if (b > a) {
            System.out.println("B is greater than A");
        }
        System.out.println("****************************");

    }
}
