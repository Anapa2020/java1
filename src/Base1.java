public class Base1 {
    public static void printJava(){
        String str = "Хорошо идут дела";
        String str1 = "Изучаю Java я!";
        String str2 = "  ";
        System.out.println(str);
        System.out.println(str1);
        System.out.println(str+str2+str1);
        System.out.println(str1+str2+str);
    }
    public static void printJava(String java1, String java2) {
        java1 = "Чтобы Java понимать";
        java2 = "Надо функции писать";
        String c3 = "!";
        String c4 = ", ";
        System.out.println(java1);
        System.out.println(java2+c3);
        System.out.println(java1+c4+java2+c3);
        System.out.println(java2+c4+java1+c3);

    }
    public static String plusJava(String message){
       String str = "Java - ";
       String str2 = " язык программирования";
       System.out.println(message);
       return str+message+str2;
    }

    public static void main(String[] args) {
        printJava(); //без параметров
        String message = ("Java - , язык программирования");
        plusJava("самый популярный");
        printJava("Буду, буду программистом", "Код пишу я чисто, чисто");
        String str = "str = ";
        System.out.println(str + plusJava("самый популярный"));
        System.out.println(str + plusJava("объектно-ориентированный"));
        System.out.println(plusJava("очень интересный"));

    }


}
