
package studybot1000;

import java.util.ArrayList;

public class Quiz {
    private ArrayList<Question> questions;
    private int score;
    private int size;

    private Question getQuestion(int index) {
        return questions.get(index);
    }
    
    private void setQuestion(int index, Question question){
        questions.add(index, question);
    }
    
    private int getScore() {
        return score;
    }
    
    private void setScore(int score) {
        this.score = score;
    }
    
    private int getSize() {
        return size;
    }
    
    private void addQuestion(Question q) {
        questions.add(q);
    }
    
    private void removeQuestion(Question q) {
        questions.remove(q);
    }
    
    private void addScore() {
        score ++;
    }
    
    private void removeScore() {
        score --;
    }
    
    private void eraseScore() {
        score = 0;
    }
    
    public Quiz() {
        questions = null;
        score = 0;
        size = 0;
    }
    
    public Quiz(ArrayList<Question> q) {
        this();
        questions = q;
    }
    
}
