package lecture16;

public class LinearArray {
    public static void main(String[] args) {
        int[] arr = {1,6,-7,9,10,-14,11};
        int ans =ls(arr,11,0);
        System.out.println(ans);
    }

    private static int ls(int[] arr, int target,int index) {
        if (arr[index] ==arr.length){
            return -1;
        }
        if (arr[index] ==target) {
            return index;
        }

        return ls(arr,target,index+1);

    }

}
