public class Main {

    public static void main(String[] args) {
        // bute значения (от -128 до 127);
        // short значения (от -32768 до 32767);
        // int значения (от -214748364 до 2147483647);
        // long значения (от -9223372036854775808 до 9223372036854775807);
        // float значения (от 1.4e-45f до 3.4e+38f);
        // double значения (от 4.9e-324 до 1.7e+308);
        // char значения (от '\u0000' или 0 до '\uffff' или 65,535);
        // boolean значениея (true или folse);

        System.out.println(calculate(1,2,3,4));
        System.out.println(task10and20(10,10));
        isPositiveOrNegative(0);
        System.out.println(isNegative(-20));
        greetings("Вован");
        System.out.println(leapYear(2019));

    }

    public static float calculate(float a, float b, float c, float d) {
        return ((float)a * (b + (c / d)));
    }
    public static boolean task10and20(int x1, int x2){
        int a = x1+x2;
        return 10>=a || a <=20;
    }
    public static void isPositiveOrNegative(int x) {
        if(x>=0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }
    public static boolean isNegative(int x) {
        if(x<=0) {
        return true;
        }
        return false;
    }
    public static void greetings(String name) {
        System.out.println("Привет, " + name + " !");
    }
    public static boolean leapYear (int year){
        if ((year %400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            return true;
        } else {
            return false;
        }

    }

}




