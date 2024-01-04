package com.LinkedSetInterface_Methods;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class StudentIdsLinkedHashSetExample {
    public static void main(String[] args) {
        // Create a LinkedHashSet for student IDs
        LinkedHashSet<String> studentIdsSet = new LinkedHashSet<>();

        // Add student IDs using add() method
        studentIdsSet.add("S101");
        studentIdsSet.add("S102");
        studentIdsSet.add("S103");

        // Display the original student IDs
        System.out.println("Original Student IDs: " + studentIdsSet);

        // Create another LinkedHashSet and add more student IDs
        LinkedHashSet<String> additionalStudentIds = new LinkedHashSet<>();
        additionalStudentIds.add("S104");
        additionalStudentIds.add("S105");

        // Add all elements from additionalStudentIds to studentIdsSet using addAll() method
        studentIdsSet.addAll(additionalStudentIds);

        // Display the updated student IDs
        System.out.println("Updated Student IDs after adding more: " + studentIdsSet);

        // Remove a specific student ID using remove() method
        String idToRemove = "S103";
        studentIdsSet.remove(idToRemove);

        // Display the student IDs after removal
        System.out.println("Student IDs after removing '" + idToRemove + "': " + studentIdsSet);

        // Remove all elements in additionalStudentIds from studentIdsSet using removeAll() method
        studentIdsSet.removeAll(additionalStudentIds);

        // Display the student IDs after removing all from additionalStudentIds
        System.out.println("Student IDs after removing all from additionalStudentIds: " + studentIdsSet);

        // Check if the set contains all elements from another set using containsAll() method
        LinkedHashSet<String> checkIdsSet = new LinkedHashSet<>();
        checkIdsSet.add("S101");
        checkIdsSet.add("S102");

        System.out.println("Does the set contain all elements from checkIdsSet? " + studentIdsSet.containsAll(checkIdsSet));

        // Check if the set is empty using isEmpty() method
        System.out.println("Is the student IDs set empty? " + studentIdsSet.isEmpty());

        // Clear all elements from the set using clear() method
        studentIdsSet.clear();

        // Display the student IDs after clearing the set
        System.out.println("Student IDs after clearing the set: " + studentIdsSet);

        // Re-add student IDs for further demonstration
        studentIdsSet.add("S201");
        studentIdsSet.add("S202");

        // Use Iterator to iterate over the elements
        //hasNext() is used to check if there are more elements in the collection.
        //next() retrieves the next element in the iteration.
        Iterator<String> iterator = studentIdsSet.iterator();
        System.out.println("\nIterating over Student IDs using Iterator:");
        while (iterator.hasNext()) {
            String studentId = iterator.next();
            System.out.println(studentId);
        }
    }
}
