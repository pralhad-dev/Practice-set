package String;

public class FindLongest {
  public static void main(String[] args) {
    String sentence = "Java SpringBoot Microservices Kafka";

    String[] words = sentence.split(" ");
    String longest = "";

    for (String word : words) {
      if (word.length() > longest.length()) {
        longest = word;
      }
    }
    System.out.println(longest);
  }
}
