package com.HashSetInterface_Methods;
import java.util.HashSet;
public class StudentId {


        public static void main(String[] args) {
            // Create a HashSet for student IDs
            HashSet<String> studentIdsSet = new HashSet<>();

            // Add student IDs using add() method
            studentIdsSet.add("S101");
            studentIdsSet.add("S102");
            studentIdsSet.add("S103");

            // Display the original student IDs
            System.out.println("Original Student IDs: " + studentIdsSet);

            // Create another HashSet and add more student IDs
            HashSet<String> additionalStudentIds = new HashSet<>();
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
            HashSet<String> checkIdsSet = new HashSet<>();
            checkIdsSet.add("S101");
            checkIdsSet.add("S102");

            System.out.println("Does the set contain all elements from checkIdsSet? " + studentIdsSet.containsAll(checkIdsSet));

            // Check if the set is empty using isEmpty() method
            System.out.println("Is the student IDs set empty? " + studentIdsSet.isEmpty());

            // Clear all elements from the set using clear() method
            studentIdsSet.clear();

            // Display the student IDs after clearing the set
            System.out.println("Student IDs after clearing the set: " + studentIdsSet);
        }
    }



