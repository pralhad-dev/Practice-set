package lecture9;

public class twosum {
    public static void main(String[] args) {
        int[] n = {2, 7, 11, 15};
        int target = 9;
      int[] indices =  twoSumFun(n,target);
        System.out.println("Indices: " + indices[0] + ", " + indices[1]);

    }

    private static int[] twoSumFun(int[] n, int target) {
        int start = 0;
        int end = n.length-1;

        while (start < end) {
            int sum = n[start] +n[end];

            if (sum == target) {
                return new int[]{start,end};
            } else if(sum <target) {
                start++;
            } else {
                end--;
            }


        }
        return new int[]{start,end};
    }

}
