package ru.progwards.java1.lessons.classes;

public class ComplexNum {
    int a;
    int b;

    public ComplexNum(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public String toString() {
        return a + "+" + b + "i";

    }

    public ComplexNum add(ComplexNum num) {
        return new ComplexNum(this.a + num.a, this.b + num.b);

    }

    public ComplexNum sub(ComplexNum num) {
        return new ComplexNum(this.a - num.a, this.b - num.b);

    }

    public ComplexNum mul(ComplexNum num) {
        return new ComplexNum((this.a * num.a - this.b * num.b), (this.b * num.a + this.a * num.b));

    }

    public ComplexNum div(ComplexNum num) {
        return new ComplexNum((this.a * num.a + this.b * num.b) / (num.a * num.a + num.b * num.b),
                (this.b * num.a - this.a * num.b) / (num.a * num.a + num.b * num.b));

    }

    public static void main(String[] args) {
        ComplexNum result1 = new ComplexNum(1, 56);
        ComplexNum result2 = new ComplexNum(5, -1);

        System.out.println("сложение комплексных чисел " + result1.add(result2));
        System.out.println("вычитание комплексных чисел " + result1.sub(result2));
        System.out.println("умножение комплексных чисел " + result1.mul(result2));
        System.out.println("деление комплексных чисел " + result1.div(result2));
    }
}

