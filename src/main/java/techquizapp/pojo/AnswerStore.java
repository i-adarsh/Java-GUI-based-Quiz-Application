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
public class AnswerStore {
    
    ArrayList <Answer> answersList;
    public AnswerStore (){
        answersList = new ArrayList<>();
    }
    public void addAnswer(Answer answer){
        answersList.add(answer);
    }

    public Answer getAnswers(int position) {
        return answersList.get(position);
    }
    public void removeAnswer(int position){
        answersList.remove(position);
    }

    public ArrayList<Answer> getAllAnswers() {
        return answersList;
    }

    public void setAnswersAt(int position, Answer answer) {
        answersList.add(position, answer);
    }
    public int getCount(){
        return answersList.size();
    }
    public Answer getAnswerByQno(int qno){
        for(Answer answer: answersList){
            if (answer.getQuestionNumber() == qno){
                return answer;
            }
        }
        return null;
    }
    public int removeAnswer(Answer answer){
        int position = answersList.indexOf(answer);
        answersList.remove(position);
        return position;
    }
}
