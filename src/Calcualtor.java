 class Calculator {
    static int operation_usage = 0;

    static int add(int a, int b) {
        operation_usage++;
        return a + b;
    }

    static int sub(int a, int b) {
        operation_usage++;
        return a - b;
    }

    static int mul(int a, int b) {
        operation_usage++;
        return a * b;
    }

    static int div(int a, int b) {
        operation_usage++;
        return a / b;

    }

    static void showOperationCount() {
        System.out.println("Total Operation Count:" + operation_usage);
    }
}
    public class Calcualtor{
        public static void main(String[] args) {
            System.out.println("Addition:" + Calculator.add(5, 3));
            System.out.println("Subtraction:" + Calculator.sub(7, 5));
            System.out.println("Multiplication:" + Calculator.mul(5, 5));
            System.out.println("Division:" + Calculator.div(6, 2));

            Calculator.showOperationCount();
        }
    }


