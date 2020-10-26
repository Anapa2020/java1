package ru.progwards.java1.lessons.basics;

public class Astronomy {

        public static final double PI = 3.14;
        public static final double EARTH_SQUARE = 6371.2;
        public static final double MERCURY_SQUARE = 2439.7;
        public static final double JUPITER_SQUARE = 71492;

        public static Double sphereSquare(Double r){
            Double S = 4 * PI * (r * r);
            return S;
        }
        public static Double earthSquare(){

            return sphereSquare(EARTH_SQUARE);
        }
        public static Double mercurySquare(){

            return sphereSquare(MERCURY_SQUARE);
        }
        public static Double jupiterSquare(){

            return sphereSquare(JUPITER_SQUARE);
        }
        public static Double earthVsMercury(){
            return earthSquare()/mercurySquare();

        }
        public static Double earthVsJupiter(){
            return earthSquare()/jupiterSquare();
        }

        public static void main(String[] args) {
            System.out.println("Площадь поверхности Земли " + earthSquare());
            System.out.println("Площадь поверхности Меркурия " + mercurySquare());
            System.out.println("Площадь поверхности Юпитера " + jupiterSquare());
            System.out.println("Отношение площади поверхности Земли к площади поверхности Меркурия " + earthVsMercury());
            System.out.println("Отношение площади поверхности Земли к площади поверхности Юпитера " + earthVsJupiter());

        }
    }

