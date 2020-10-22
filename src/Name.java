public class Name {
    public  String sayHello(String greeting, String name){
        String c1 = greeting + ", ";
        String c2 = name + "!";
        return  c1 + c2;
    }

    public static void main(String[] args) {
        String greeting = "Привет,";
        String name = "Доли!";
        System.out.print(greeting);
        System.out.println(name);


    }

}

