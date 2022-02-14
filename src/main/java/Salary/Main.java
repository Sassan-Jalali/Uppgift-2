package Salary;

import java.util.Comparator;
import java.util.List;
import java.util.Arrays;

 import java.util.stream.Stream;

public class Main {

    public static void main(String[]args){


     class Person {

        private String name;
        private String gender;
        private double salary;

         public Person(String name, String gender, double salary) {
             this.name = name;
             this.gender = gender;
             this.salary = salary;
         }

         public String getName() {
             return name;
         }

         public String getGender() {
             return gender;
         }

         public double getSalary() {
             return salary;
         }

         @Override
         public String toString() {
             return "Person{" +
                     "name='" + name + '\'' +
                     ", gender='" + gender + '\'' +
                     ", salary=" + salary +
                     '}';
         }
     }


    List<Person> Persons = List.of(
            new Person("Alice","Female",34000),
            new Person("Bob","Male",33500),
            new Person("Kira","Non-binary",36000),
            new Person("Micke","Male",35000),
            new Person("Sheridan","Female",34000),
            new Person("Svante","Male",37000),
            new Person("Sixten", "Male",32000),
            new Person("Camilla","Female",39000),
            new Person("Linda","Female",35500),
            new Person("Karl","Male",37000)


    );


             System.out.println("The average salary for our female workers is " +
                     Persons
                     .stream()
                     .filter(person -> person.getGender().equals("Female"))
                     .sorted(Comparator.comparing(Person::getGender))
                     .mapToDouble(Person::getSalary)
                     .average()
                             .orElseThrow());




        System.out.println("The average salary for our Male workers is " +
                Persons
                        .stream()
                        .filter(person -> person.getGender().equals("Male"))
                        .sorted(Comparator.comparing(Person::getGender))
                        .mapToDouble(Person::getSalary)
                        .average()
                        .orElseThrow());

        System.out.println("Our highest earning worker is " +
                Persons
                        .stream()
                        .max(Comparator.comparing(Person::getSalary))
                        .orElseThrow());


        System.out.println("Our lowest earning worker is " +
                Persons
                        .stream()
                        .min(Comparator.comparing(Person::getSalary))
                        .orElseThrow());



}

}

