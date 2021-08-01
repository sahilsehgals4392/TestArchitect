package Learnings;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JavaStreams_Count {


    public static void main(String[] args) {
        List<String> names = Arrays.asList("Peter", "Sam", "Greg", "Ryan", "Carlo");

        names.stream().filter(name -> isNotSam(name)).
                map(User::new).forEach(System.out::println);


        // COLLLECTORS
        List<User> listOfUser = names.stream().
                filter(name -> isNotSam(name)).
                map(User::new).
                collect(Collectors.toList());

      int sumOfAges=  listOfUser.stream().mapToInt(user -> user.getAge()).sum();
        System.out.println("Sum of Ages: "+sumOfAges);
    }


    private static boolean isNotSam(String name) {
        return !name.equals("Sam");
    }


    static class User {
        private String name;
        private int age = 22;

        User(String name) {
            this.name = name;
        }

        public Integer getAge() {
            return age;
        }

        @Override
        public String toString() {
            return "User{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
}
