package InterviewPrep;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {3, 2, 3};
        int result = findMajorityElement(arr);
        System.out.println(result);
    }

    private static int findMajorityElement(int[] arr) {
        int counter = 0;
        int candidate = 0;

        for (int i : arr) {
            if (counter == 0) {
                candidate = i;
            }

            if (i == candidate) {
                counter++;
            } else {
                counter--;

            }
        }
        return candidate;
    }
}
