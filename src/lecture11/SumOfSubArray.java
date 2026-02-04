package lecture11;

public class SumOfSubArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
            for (int start =0 ; start<arr.length;start++){
                int sum=0;

                for(int end = start; end <arr.length; end++) {
                sum +=arr[end];
                System.out.println("total Sum:"+sum);
            }
        }
    }
}
