package Com.SetExamples;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        // Create a HashSet, which is a common implementation of Set
        Set<String> mySet = new HashSet<>();

        // Adding elements to the set
        mySet.add("Apple");
        mySet.add("Banana");
        mySet.add("Orange");
        mySet.add("Apple"); // Adding a duplicate element, will be ignored

        // Print the elements in the set
        System.out.println("Set Elements:");
        for (String element : mySet) {
            System.out.println(element);
        }

        // Check if the set contains a specific element
        System.out.println("Contains 'Banana': " + mySet.contains("Banana"));

        // Remove an element from the set
        mySet.remove("Orange");

        // Print the elements in the set after removal
        System.out.println("Set Elements after removal:");
        for (String element : mySet) {
            System.out.println(element);
        }

        // Check if the set is empty
        System.out.println("Is Set Empty: " + mySet.isEmpty());

        // Get the size of the set
        System.out.println("Set Size: " + mySet.size());

        // Clear all elements from the set
        mySet.clear();

        // Check if the set is empty after clearing
        System.out.println("Is Set Empty after clearing: " + mySet.isEmpty());
    }
}

