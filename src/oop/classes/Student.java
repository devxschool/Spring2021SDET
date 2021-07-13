package oop.classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Student {

    String name;
    String favoriteColor;
    int favoriteNumber;
    String favoriteFood;
    Set<String> favoriteBooks;
    ArrayList<Double> GPA;



    public Student(String fullName, String favoriteColor, int favoriteNumber,
                   String favoriteFoodType, Set<String> setOfBooks, ArrayList<Double> studentGrades){

        name = fullName;
        this.favoriteColor = favoriteColor;
        this.favoriteNumber = favoriteNumber;
        favoriteFood = favoriteFoodType;
        setOfBooks = favoriteBooks;
        GPA = studentGrades;
    }

    public static void main(String[] args) {

        //Student student1 = new Student("Elon Musk", "Red", 13, "Asian Cuisine");
        Set<String> setOfBook = new HashSet<>();
        setOfBook.add("Master mind");
        setOfBook.add("Kung fu rules");

        ArrayList<Double> AishasGPA = new ArrayList<>();
        AishasGPA.add(3.50);
        AishasGPA.add(4.00);

        Student Aisha = new Student("Aisha Namyr", "Purple", 7, "Korean Kitchen", setOfBook, AishasGPA);

//        System.out.println(student1.favoriteColor);
//        System.out.println(student1.favoriteFood);

        System.out.println("The favorite number is: " + Aisha.favoriteNumber + "\nFavorite color is: " +
                Aisha.favoriteColor);
    }
}
