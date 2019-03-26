import java.util.*;

public class Sample {

    public static void main(String[] args) {
        List<String> fruitList = new ArrayList<>();
        fruitList.add("123");
        fruitList.add("abd");

        for (String s : fruitList) {
            System.out.println(s.toUpperCase());
        }

        Map<Person, String> map = new HashMap<>();

        Person p1 = new Person("Jack", 12);
        Person p2 = new Person("Rose", 11);
        Person p3 = new Person("Jack", 12);
        map.put(p1, "male");
        map.put(p2, "female");
        map.put(p3, "male");
        System.out.println(map.size());

    }
}
