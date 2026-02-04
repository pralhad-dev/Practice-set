package lecture16;

public class power {
    public static void main(String[] args) {
        int ans = powOfNo(3,4);
        System.out.println(ans);
    }

    private static int powOfNo(int a, int b) {
        if (b==0){
            return 1;
        }
        int result = a* powOfNo(a,b-1);
        return result;


    }
}
