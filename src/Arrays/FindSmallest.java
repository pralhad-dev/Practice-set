package Arrays;

public class FindSmallest {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5};
    int min = arr[0];

    for (int i : arr){
      if ( i < min) {
        min =i;
      }
    }

    System.out.println(min);
  }
}
