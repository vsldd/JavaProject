package lab2;

public class Main {

    public static void main(String[] args) {

        int x = 8;
        int y = 2;
        int result_sum = sum(x, y);
        int result_substract = substract(x, y);
        int result_multiply = multiply(x, y);
        int result_divide = divide(x, y);
        int sumii = sumi(x,y);
        int dividii = dividi(x,y);


        System.out.println (result_sum);
        System.out.println (result_substract);
        System.out.println (result_multiply);
        System.out.println (result_divide);
        System.out.println (sumii);
        System.out.println (dividii);

    }

        public static int sum(int first, int second) {

        int result_sum = first + second;
        return result_sum;
    }

    public static int multiply(int first, int second) {

        int result_multiply = first * second;
        return result_multiply;
    }

    public static int divide (int first, int second) {

        int result_divide = first / second;
        return result_divide;
    }

    public static int substract (int first, int second) {

        int result_substract = (first - second);
        return result_substract;
    }



    public static int sumi(int first, int second) {

        int result = first + second;
        return result;
    }

    public static int dividi (int first, int second) {

        int result = first / second;
        return result;
    }

}
