package lecture5;

public class prob1 {
    public static void main(String[] args) {
//        int n =10;
//        for (int i =0; i<=n;i++) {
//            System.out.print(" "+i);
//        }

      //  int n = 13;

//        int a = 0, b = 1;
//        for (int i = 1; i <= n; i++) {
//            System.out.print(a+ " ");
//
//            int temp = a + b;
//            a = b;
//            b = temp;
//        }
//



        int n =13;
        int flag = 0;

        if (n <=1) {
            System.out.println("NOT PRime");
        }

        for (int i =2 ; i< n/2 ;i++) {
            if (n %2 ==0) {
                flag =1;
                break;
            }
        }

        if (flag ==0) {
            System.out.println("PRime Number");
        } else {
            System.out.println("Not Prime munber");
        }

    }
}
