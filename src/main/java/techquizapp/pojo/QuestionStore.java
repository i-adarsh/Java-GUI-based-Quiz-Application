/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techquizapp.pojo;

import java.util.ArrayList;

/**
 *
 * @author adarshkumar
 */
public class QuestionStore {

    @Override
    public String toString() {
        return "QuestionStore{" + "questionList=" + questionList + '}';
    }
    ArrayList <Question> questionList;

    public ArrayList<Question> getAllQuestions() {
        return questionList;
    }

    public void setQuestionList(ArrayList<Question> questionList) {
        this.questionList = questionList;
    }

    public QuestionStore() {
        questionList = new ArrayList<>();
    }
    public Question getQuestionByQNo(int questionNumber){
        for (Question question : questionList){
            if (question.getQno() == questionNumber)
                return question;
        }
        return null;
    }
    public void addQuestion(Question q){
        questionList.add(q);
    }
    public Question getQuestion(int pos){
        return questionList.get(pos);
    }
    public void removeQuestion(int pos){
        questionList.remove(pos);
    }
    public void setQuestionAt(int pos, Question q){
        questionList.add(pos, q);
    }
    public int getCount(){
        return questionList.size();
    }
    
}
