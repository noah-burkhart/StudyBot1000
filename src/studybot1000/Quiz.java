package studybot1000;

import java.util.ArrayList;

public class Quiz {

    private ArrayList<Question> questions;
    private int score;
    private int size;

    public Question getQuestion(int index) {
        return questions.get(index);
    }

    public void setQuestion(int index, Question question) {
        questions.add(index, question);
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getSize() {
        return size;
    }

    public void addQuestion(Question q) {
        questions.add(q);
    }

    public void removeQuestion(Question q) {
        questions.remove(q);
    }

    public void addScore() {
        score++;
    }

    public void removeScore() {
        score--;
    }

    public void eraseScore() {
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
