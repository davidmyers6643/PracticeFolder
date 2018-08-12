import java.util.*;

public class Collection {

    public static void main(String[] args) {


        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(20);    // adding an element
        numbers.add(0, 21); // specifying an index
        numbers.add(22);

// [21, 20, 22]
//        numbers.size(); // 3
//        numbers.get(2); // 22
//        numbers.indexOf(20);    // 1
//        numbers.indexOf("cat");
        System.out.println(numbers);


        ArrayList<String> roasts = new ArrayList<>();
        roasts.add("light");
        roasts.add("medium");
        roasts.add("medium");
        roasts.add("dark");
        roasts.contains("dark"); // true
        roasts.contains("espresso"); // false
        roasts.lastIndexOf("medium"); // 2
        roasts.isEmpty(); // false
        ArrayList<String> emptyList = new ArrayList<>();
        emptyList.isEmpty(); // true
        roasts.remove("espresso"); // false
        roasts.remove("medium"); // true
        System.out.println(roasts);
// [light, medium, dark]
        roasts.remove(2); // "dark"
        System.out.println(roasts);
    }

}