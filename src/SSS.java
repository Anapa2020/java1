public class SSS {
    static double toDouble(String str){
        double d1 = Double.parseDouble(str);
        return d1;
    }
    static int maxInt(){
        int i = Integer.MAX_VALUE;
        return i;
    }
    static String toBinary(int n){
        String s = Integer.toBinaryString(n);
        return s;
    }

    public static void main(String[] args) {
        String str = "0";
        System.out.println(toDouble(str));
        int i = 123;
        System.out.println(maxInt());
        int i1 = 123;
        System.out.println(toBinary(i1));


    }


}

