package Learnings;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JavaStreams_MapperCollectors {


    public static void main(String[] args) {
        List<String> names = Arrays.asList("Peter", "Sam", "Greg", "Ryan", "Carlo");

        names.stream().filter(name -> isNotSam(name)).
        map(name->{
            User user=new User(name);
            return user;
        }).forEach(user -> System.out.println(user));


        //Another way -->   map(User::new).forEach(user->System.out.println(name));

        // COLLLECTORS
        List<User> listOfUser = names.stream().filter(name->isNotSam(name)).map(User::new).collect(Collectors.toList());
        System.out.println(listOfUser); 

    }

    private static boolean isNotSam(String name) {
        return !name.equals("Sam");
    }


    static class User {
        private String name;
        private Integer age=22;

        User(String name) {
            this.name = name;
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
