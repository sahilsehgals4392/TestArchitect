package Learnings;

import java.util.Arrays;

public class EnumsInJava {

    enum Color {
        RED, GREEN, YELLOW, ORANGE;
    }

    enum Fruits {
        APPLE("RED"), BANANA("YELLOW"), GRAPES("GREEN");
        private String value;

        public String getValue() {
            return this.value;
        }

        private Fruits(String value) {
            this.value = value;
        }

    }

    public static void printColor(EnumsInJava.Color color) {
        System.out.println(color.name());
    }

    public static void printFruitValueAndName(EnumsInJava.Fruits fruits) {
        System.out.println(fruits.name());
        System.out.println(fruits.getValue());
    }

    public static void main(String[] args) {
        printColor(Color.GREEN);
        printFruitValueAndName(Fruits.APPLE);
        printFruitValueAndName(Fruits.GRAPES);
        printFruitValueAndName(Fruits.BANANA);
        printFruitValueAndName(Fruits.valueOf("GRAPES"));
        Arrays.stream(Fruits.values()).forEach(s -> System.out.println(
                s.name() + "  Value :" + s.getValue()
        ));

    }
}
