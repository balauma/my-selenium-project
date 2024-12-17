public class Calculator {
    public static void main(String[] args) {
        calculationTwonumbers(10, 11, "add");
        calculationTwonumbers(10, 11, "sub");
        calculationTwonumbers(10, 11, "mul");
        calculationTwonumbers(10, 11, "div");

    }
    public static void calculationTwonumbers( int a, int b,String action ){
        switch(action.toLowerCase()){
            case "add":
                int add = a + b;
                System.out.println(String.format("Addition of %s &%s is: %s", a,b,add));
                break;
            case "sub":
                int sub = a - b;
                System.out.println(String.format("Subtraction of %s &%s is: %s", a,b,sub));
                break;
            case "mul":
                int mul = a * b;
                System.out.println(String.format("Multiplication of %s & %s is: %s", a, b, mul));
                break;
            default:
                System.out.println("action not found: " +action);
        }

    }
}
