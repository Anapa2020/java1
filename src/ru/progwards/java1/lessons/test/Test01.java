package ru.progwards.java1.lessons.test;

public class Test01 {
    static String textGrade(int grade) {
        if (grade== 0){
            return "не оценено";
        }
        else if (grade>0 && grade <=20){
            return "очень плохо";
        }
        else if (grade>21 && grade <=40){
            return "плохо";
        }
        else if (grade>=41 && grade <=60){
            return "удовлетворительно";
        }
        else if (grade>61 && grade <=80){
            return "хорошо";
        }
        else if (grade>81 && grade <=100){
            return "отлично";
        }
        else if (grade==101 && grade <= 10000){

        }
        return "не определено";

    }

}






/*
        Напишите метод, который возвращает текстовую характеристику оценки по числовой.

0 - не оценено
1..20 - очень плохо
21..40 - плохо
41..60 - удовлетворительно
61..80 - хорошо
81..100 - отлично
в остальных случаях - не определено

Сигнатура метода static String textGrade(int grade)

Например, textGrade(45) должна вернуть "удовлетворительно"


        */