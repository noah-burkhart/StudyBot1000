package studybot1000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Quiz {

    private ArrayList<Question> questions;
    private int score;

    //constructors
    public Quiz() {
        questions = null;
        score = 0;
        size = 0;
    }

    public Quiz(ArrayList<Question> q) {
        this();
        questions = q;
    }

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
        return questions.size();
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

    public void shuffle() {

        Question[] qs = new Question[questions.size()];
        for (int i = 0; i < questions.size(); i++) {
            qs[i] = questions.get(i);
        }
        var questionList = Arrays.asList(qs);
        Collections.shuffle(questionList);
        questionList.toArray(qs);

        for (int i = 0; i < questions.size(); i++) {
            questions.set(i, qs[i]);
        }
    }

}
