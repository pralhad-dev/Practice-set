package lecture18;

public class PersonClient {
    public static void main(String[] args) {
        Person person = new Person();
        person.id =10;
        person.name ="PRalhad";
        person.greet();
        System.out.println(person.id);
        System.out.println(person.name);

    }
}
