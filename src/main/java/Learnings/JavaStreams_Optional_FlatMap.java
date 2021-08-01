package Learnings;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class JavaStreams_Optional_FlatMap {


    public static void main(String[] args) {
        List<User> users = Arrays.asList(
                new User("James", 22, Arrays.asList("1", "2")),
                new User("Max", 43, Arrays.asList("3", "5")),
                new User("Carlo", 49, Arrays.asList("5", "6")),
                new User("Mclaren", 22, Arrays.asList("7", "9"))
        );

        users.stream().filter(user -> validateUserHasMatchingPhoneNumber(user,"5")).forEach(user -> System.out.println("User names " +user.getName()));


        //Find if any user has phone number 5
        Optional<String> stringOptional = users.stream().map(user -> user.getPhoneNumbers().stream()).flatMap(stringStream -> stringStream.filter(phoneNo -> phoneNo.equals("5"))).findAny();
        stringOptional.ifPresent(s -> System.out.println(s));

    }

    private static boolean validateUserHasMatchingPhoneNumber(User user, String phoneNo) {
        if (user.getPhoneNumbers().contains(phoneNo)) {
            return true;
        }
        return false;
    }

    static class User {
        public String getName() {
            return name;
        }

        private String name;

        public Integer getAge() {
            return age;
        }

        private Integer age;

        public List<String> getPhoneNumbers() {
            return phoneNumbers;
        }

        private List<String> phoneNumbers;

        User(String name, int age, List<String> phoneNumbers) {

            this.name = name;
            this.age = age;
            this.phoneNumbers = phoneNumbers;
        }

    }
}
