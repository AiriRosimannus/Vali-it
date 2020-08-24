public class Lesson1MathUtil {

    public static void main(String[] args) {
        System.out.println(min(4, 5));
        System.out.println(max(6, 3));
        System.out.println(abs(6));
        System.out.println(isEven(5));
        System.out.println(min(4, 5, -5));
        System.out.println(max(4, 5, 8));
    }


    public static int min(int a, int b) {
        // TODO tagasta a ja b väikseim väärtus;
        if (a < b) {
            return a;

        } else {
            return b;

        }
    }


    public static int max(int a, int b) {
        // TODO tagasta a ja b suurim väärtus
        if (a > b) {
            return a;

        } else {
            return b;

        }
    }

    public static int abs(int a) {
        // TODO tagasta a absoluut arv
        if (a > 0) {
            return a;
        } else {
            return -a;
        }
    }

    public static boolean isEven(int a) {
        // TODO tagasta true, kui a on paaris arv
        // tagasta false kui a on paaritu arv
        if (a % 2 == 2) {
            return true;
        } else {
            return false;
        }
    }


    public static int min(int a, int b, int c) {
        // TODO tagasta a, b ja c väikseim väärtus
        if (a < b && a < c) {
            return a;

        } else if (b < a && b < c) {
            return b;

        } else {
            return c;

        }
    }


    public static int max(int a, int b, int c) {
        // TODO tagasta a, b ja c suurim väärtus
        if (a > b && a > c) {
            return a;

        } else if (b > a && b > c) {
            return b;

        } else {
            return c;

        }
    }
}





