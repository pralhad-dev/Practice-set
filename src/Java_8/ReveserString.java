package Java_8;

public class ReveserString {
    public static void main(String[] args) {
        String str = "Pralhad";

        String reversed =  new  StringBuilder(str).reverse().toString();
        System.out.println(reversed);

        char[] ch =str.toCharArray();
        int left =0;
        int right =ch.length-1;

        while(left < right) {
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] =temp;
            left++;
            right--;

        }
        System.out.println(ch);
    }
}
