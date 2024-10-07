package src;

import java.util.ArrayList;
import java.util.Scanner;

public class TextUI {
    ArrayList<String> options;
    Scanner scan = new Scanner(System.in);


    ArrayList<String> promptChoice(ArrayList<String>options, int limit, String msg){
        displayList(options, "Drinks menu:");
        ArrayList<String> choices = new ArrayList<String>();
        while(choices.size() < limit){
            String input = promptText("Vælg en drink");
            choices.add(input);
        }
        return choices;
    }

    void displayList(ArrayList<String>list, String msg){
        System.out.println(msg);
        for (String option : list) {
            System.out.println(option);
        }
    }

    String promptText(String msg){
        System.out.println(msg);
        return scan.nextLine();
    }

    int promptNumeric(String msg){

        System.out.println(msg);
        String input = scan.nextLine();
        int age = Integer.parseInt(input);
        return age;
    }
}
