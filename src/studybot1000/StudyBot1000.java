/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studybot1000;

/**
 *
 * @author nobur7839
 */
public class StudyBot1000 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         Question q = new Question("title", "one", "two", "three", "four");
         System.out.println(q.toString());
         q.shuffle();
         System.out.println(q.toString());
    }
    
}
