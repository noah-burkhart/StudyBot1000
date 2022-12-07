/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studybot1000;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author nobur7839
 */
public class StudyBot1000 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList<Question> q = new ArrayList();
        ArrayList<String> notes = new ArrayList();

        loadFile(q, notes);
        Quiz quiz = new Quiz(q);
        quiz.shuffle();

        Scanner s = new Scanner(System.in);

        int state = 0; //0 is menu, 1 is notes, 2 is quiz
        switch (state) {
            case 0:
                //if it is in menu mode
                while (state == 0) {
                    System.out.println("Type \"n\" to view notes, or \"q\" to start a quiz");
                    String input = s.nextLine();

                    if (input.equalsIgnoreCase("n")) {
                        state = 1;
                    } else if (input.equalsIgnoreCase("q")) {
                        state = 2;
                    } else {
                        System.out.println("Incorrect prompt, try again.");
                    }
                }
            case 1:
                ///if it is in notes mode
                System.out.println("NOTES:");
                for (int i = 0; i < notes.size(); i++) {
                    System.out.println(notes.get(i));
                }
                while (state == 1) {
                    System.out.println("Type \"m\" to return to menu");
                    String input = s.nextLine();
                    if (input.equalsIgnoreCase("m")) {
                        state = 0;
                    } else {
                        System.out.println("Incorrect input, try again");
                    }
                }
            //state must be quiz
            default:
                //quiz code here
                break;
        }
    }

    public static void loadFile(ArrayList<Question> a, ArrayList<String> notes) {
        try {
            File f = new File("src/studybot1000/data.txt");
            Scanner s = new Scanner(f);

            while (s.hasNextLine()) {
                String note = s.nextLine();
                String question = s.nextLine();
                String opt1 = s.nextLine();
                String opt2 = s.nextLine();
                String opt3 = s.nextLine();
                String opt4 = s.nextLine();

                Question q = new Question(question, opt1, opt2, opt3, opt4);
                notes.add(note);
                a.add(q);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e);
        }
    }

}
