public class Lesson3 {

    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        System.out.println(sum(a, b));

        int[] m = {2, 6, 8};
        System.out.println(sum(m));
    }


    public static int sum(int x, int y) {
        // TODO liida kokku ja tagasta x ja y väärtus

        int sum = x + y;
        return sum;
    }

    public static int sum(int[] x) {
        // Todo liida kokku kõik numbrid massivis x

        int sum = 0;
        for (int i = 0; i <= x.length; i++) {

            sum = sum + x[i];
        }
        return sum;
    }

    public static int factorial(int x) {
        // TODO tagasta x faktoriaal.
        // Näiteks
        // x = 5
        // return 4*3*2*1 = 24
        return 0;
    }

    public static int[] sort(int[] a) {
        // TODO sorteeri massiiv suuruse järgi
        // Näiteks {2, 6, 8, 1}
        // Väljund {1, 2, 6, 8}
        return new int[0];
    }

    public static String reverseString(String a) {
        // TODO tagasta string tagurpidi
        // Näiteks:
        // a = "Test";
        // return tseT";
        return "";
    }

    public static boolean isPrime(int x) {
        // TODO tagasta kas sisestatud arv on primaar arv (jagub ainult 1 ja iseendaga)
        return false;
    }

}