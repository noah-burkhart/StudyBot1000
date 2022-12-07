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
        
        /*
         Question q = new Question("title", "one", "two", "three", "four");
         System.out.println(q.toString());
         q.shuffle();
         System.out.println(q.toString());
         */
        
    }
    public static void loadFile(ArrayList<Question> a, ArrayList<String> notes){
        try{
            File f = new File("src/studybot1000/data.txt");
            Scanner s = new Scanner(f);
            
            while(s.hasNextLine()){
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
        }catch(FileNotFoundException e){
            System.out.println("Error: " + e);
        }
    }

}
