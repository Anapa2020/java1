package ru.progwards.java1.lessons.test;

class Rectangle {
    private double a;
    private double b;


    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double area() {

        return a*b;
    }



    public int compareTo(Rectangle anRectangle){
        Double a = area();
        Double b = anRectangle.area();
        int comp = a.compareTo(b);
        return comp;
    }
}
// Это одно и тоже
//     public int compareTo(Rectangle anRectangle){
//        return Double.compare(area(), anRectangle.area());
//   }

