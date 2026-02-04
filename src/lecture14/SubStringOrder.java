package lecture14;

public class SubStringOrder {
    public static void main(String[] args) {
            String s = "abc";

            for (int i=1; i<s.length();i++){
                for (int j= 0; j+i<=s.length();j++) {
                    System.out.println(s.substring(j,j+i));
                }
            }
    }
}
