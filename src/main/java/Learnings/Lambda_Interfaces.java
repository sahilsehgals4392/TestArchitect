package Learnings;

public class Lambda_Interfaces {
    public static void main(String[] args) {

        System.out.println("Lambda exp for Interfaces");

        Game gameField=()-> System.out.println("This is to play");
        gameField.play();
    }
}

interface Game {
    void play();
}
