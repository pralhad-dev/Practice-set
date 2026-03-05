package InterviewPrep;

public class FindMissing {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5};

        int length = arr.length+1;

        int expectedSum = length *(length+1)/2;
        int actualSum = 0;
        for (int num :arr) {
            actualSum +=num;
        }
        System.out.println(expectedSum-actualSum);
    }
}
