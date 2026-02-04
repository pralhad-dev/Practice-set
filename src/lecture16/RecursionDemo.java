package lecture16;

public class RecursionDemo {
    public static void main(String[] args) {
        int n = 10;
        printStmt(n);
    }

    private static void printStmt(int n) {

        if (n == 0) {
            return;
        }
        printStmt(n - 1);

        System.out.println(n);
    }
}
