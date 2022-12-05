/*
 * N Burkhart
12/5/22
Class used to represent a question on the quiz.
 */
package studybot1000;

import java.awt.List;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author nobur7839
 */
public class Question {

    //attributes
    String title;
    String answer;
    String opt1, opt2, opt3, opt4;
    boolean correct;

    //constructor
    public Question(String title, String opt1, String opt2, String opt3, String opt4) {
        this.title = title;
        this.opt1 = opt1;
        answer = opt1;   //answer by default is the first
        this.opt2 = opt2;
        this.opt3 = opt3;
        this.opt4 = opt4;
    }

    //getters and setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isCorrect() {
        return correct;
    }

    public void setCorrect(boolean correct) {
        this.correct = correct;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getOption(int i) {
        return switch (i) {
            case 1 ->
                opt1;
            case 2 ->
                opt2;
            case 3 ->
                opt3;
            case 4 ->
                opt4;
            default ->
                "invalid index";
        };
    }

    public void setOption(int i, String s) {
        switch (i) {
            case 1:
                opt1 = s;
            case 2:
                opt2 = s;
            case 3:
                opt3 = s;
            case 4:
                opt4 = s;
            default:
                System.out.println("invalid index");
        }
    }

    //behaviours
    public void shuffle() {
        String[] stringArr = {opt1, opt2, opt3, opt4};
        
        var stringList = Arrays.asList(stringArr);
        Collections.shuffle(stringList);
        stringList.toArray(stringArr);
        
        opt1 = stringArr[0];
        opt2 = stringArr[1];
        opt3 = stringArr[2];
        opt4 = stringArr[3];
    }

    
    
    @Override
    public String toString() {
        return "Question{" + "title=" + title + ", answer=" + answer + ", opt1=" + opt1 + ", opt2=" + opt2 + ", opt3=" + opt3 + ", opt4=" + opt4 + ", correct=" + correct + '}';
    }
    
    

}
