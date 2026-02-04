package lecture5;

public class Prim {
    public static void main(String[] args) {
        int n=13;

        int cout =0;
        for (int i =2 ;i<n;i++) {
            if (n % i ==0) {
                cout++;
                break;
            }
        }

        if (cout ==0) {
            System.out.println("PRime");
        } else {
            System.out.println(" Not Prime");
        }
    }
}
