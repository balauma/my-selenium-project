public class StringPrinting {
    public static void main(String[] arg) {
        printInNewLine2("Deepesh is a bad man");
    }

    public static void printInNewLine(String name) {
        //First approach
        int len = name.length();
        System.out.println("Length of the input string is  : " + len);
        for (int i = 0; i < len; i++) {
            System.out.println(i);
            System.out.println("Character is : " + name.charAt(i));
        }

        // Second approach
        String[] strArr = name.split("");
        for (int i = 0; i < len; i++) {
            System.out.println(i);
            System.out.println("Character is position in array: " + strArr[i]);
        }
        //Third Approach
        for (String c : strArr) {
            System.out.println("For Each loop: " + c);
        }

    }

    public static void printInNewLine2(String s1) {
        String[] strArr = s1.split(" ");
        for (int j = 0; j < strArr.length; j++) {
            System.out.println(j);
            System.out.println("Character is position in array: " + strArr[j]);
        }

    }

}
