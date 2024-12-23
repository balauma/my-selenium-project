public class PrintRepeatAlphabet {
    public static void main(String[] args){
        String name = "deepesh";
        int a=0;
        for(int i=0;i<name.length(); i++){
            char c = name.charAt(i);
            if(c=='a'){
                a++;
            }
        }
        System.out.println("Numbe of A in the name : " + a);
    }
}
