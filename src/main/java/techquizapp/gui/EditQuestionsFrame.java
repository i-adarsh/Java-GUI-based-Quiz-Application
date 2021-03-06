/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techquizapp.gui;

/**
 *
 * @author adarshkumar
 */

import java.awt.Color;
import java.awt.Font;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import techquizapp.dao.ExamDAO;
import techquizapp.dao.QuestionsDAO;
import techquizapp.pojo.Exam;
import techquizapp.pojo.Question;
import techquizapp.pojo.QuestionStore;

public class EditQuestionsFrame extends javax.swing.JFrame {

    /**
     * Creates new form EditQuestionsFrame
     */
    private Exam editExam;
    private QuestionStore qstore,newQStore;
    Question question;
    int count = 1;
    int nextPressed = 1;
    String qstn,option1,option2,option3,option4,correctOption;
    public EditQuestionsFrame() {
        initComponents();
        
    }
    public EditQuestionsFrame(Exam editExam) {
        initComponents();
        qstore = new QuestionStore();
        newQStore = new QuestionStore();
        this.editExam = editExam;
        loadQuestions();
        ImageIcon imageIcon = new ImageIcon("/Users/adarshkumar/Documents/NetBeansProjects/TechQuizApp/Images/edit.png");
        jlblImage.setIcon(imageIcon);
        setLocationRelativeTo(null);
        lblTitle.setText("EDITING "+editExam.getLanguage().toUpperCase()+" PAPER");
        question = qstore.getQuestion(0);
        txtQuestion.setText(question.getQuestion());
        txtOption1.setText(question.getAnswer1());
        txtOption2.setText(question.getAnswer2());
        txtOption3.setText(question.getAnswer3());
        txtOption4.setText(question.getAnswer4());
        correctComboOption.setSelectedItem(question.getCorrectAnswer());
        lblquestionNumber.setText("Question Number  "+question.getQno()+" : ");
        btnPrevious.setEnabled(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblUserName = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        lblLogout = new javax.swing.JLabel();
        lblquestionNumber = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtQuestion = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        txtOption1 = new javax.swing.JTextField();
        txtOption2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtOption3 = new javax.swing.JTextField();
        txtOption4 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        correctComboOption = new javax.swing.JComboBox<>();
        btnNext = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnDone = new javax.swing.JButton();
        jlblImage = new javax.swing.JLabel();
        btnPrevious = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        lblUserName.setBackground(new java.awt.Color(0, 0, 0));
        lblUserName.setFont(new java.awt.Font("Quicksand", 1, 18)); // NOI18N
        lblUserName.setForeground(new java.awt.Color(255, 255, 255));
        lblUserName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUserName.setText("User");

        lblTitle.setBackground(new java.awt.Color(0, 0, 0));
        lblTitle.setFont(new java.awt.Font("Quicksand", 1, 26)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("EDITING PAPER");

        lblLogout.setBackground(new java.awt.Color(0, 0, 0));
        lblLogout.setFont(new java.awt.Font("Quicksand", 1, 18)); // NOI18N
        lblLogout.setForeground(new java.awt.Color(255, 255, 255));
        lblLogout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogout.setText("Logout");
        lblLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblLogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblLogoutMouseExited(evt);
            }
        });

        lblquestionNumber.setBackground(new java.awt.Color(0, 0, 0));
        lblquestionNumber.setFont(new java.awt.Font("Quicksand", 1, 18)); // NOI18N
        lblquestionNumber.setForeground(new java.awt.Color(255, 255, 255));
        lblquestionNumber.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblquestionNumber.setText("Question Number  ");

        txtQuestion.setColumns(20);
        txtQuestion.setFont(new java.awt.Font("Quicksand", 1, 18)); // NOI18N
        txtQuestion.setRows(5);
        jScrollPane1.setViewportView(txtQuestion);

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Quicksand", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Option 1");

        txtOption1.setFont(new java.awt.Font("Quicksand", 1, 18)); // NOI18N
        txtOption1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtOption2.setFont(new java.awt.Font("Quicksand", 1, 18)); // NOI18N
        txtOption2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Quicksand", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Option  2");

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Quicksand", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Option  3");

        txtOption3.setFont(new java.awt.Font("Quicksand", 1, 18)); // NOI18N
        txtOption3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtOption3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOption3ActionPerformed(evt);
            }
        });

        txtOption4.setFont(new java.awt.Font("Quicksand", 1, 18)); // NOI18N
        txtOption4.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Quicksand", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Option  4");

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Quicksand", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Correct  Answer");

        correctComboOption.setBackground(new java.awt.Color(255, 255, 255));
        correctComboOption.setFont(new java.awt.Font("Quicksand", 1, 18)); // NOI18N
        correctComboOption.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Option  1", "Option  2", "Option  3", "Option  4" }));

        btnNext.setBackground(new java.awt.Color(0, 0, 0));
        btnNext.setFont(new java.awt.Font("Quicksand", 1, 18)); // NOI18N
        btnNext.setForeground(new java.awt.Color(255, 255, 255));
        btnNext.setText("Next");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnCancel.setBackground(new java.awt.Color(0, 0, 0));
        btnCancel.setFont(new java.awt.Font("Quicksand", 1, 18)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(255, 255, 255));
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnDone.setBackground(new java.awt.Color(0, 0, 0));
        btnDone.setFont(new java.awt.Font("Quicksand", 1, 18)); // NOI18N
        btnDone.setForeground(new java.awt.Color(255, 255, 255));
        btnDone.setText("Done");
        btnDone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoneActionPerformed(evt);
            }
        });

        jlblImage.setBackground(new java.awt.Color(0, 0, 0));
        jlblImage.setFont(new java.awt.Font("Quicksand", 1, 18)); // NOI18N
        jlblImage.setForeground(new java.awt.Color(255, 255, 255));
        jlblImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        btnPrevious.setBackground(new java.awt.Color(0, 0, 0));
        btnPrevious.setFont(new java.awt.Font("Quicksand", 1, 18)); // NOI18N
        btnPrevious.setForeground(new java.awt.Color(255, 255, 255));
        btnPrevious.setText("Previous");
        btnPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviousActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblUserName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblLogout)
                .addGap(21, 21, 21))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(297, 297, 297))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(99, 99, 99)
                                .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22)
                                .addComponent(btnPrevious, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(btnDone, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(txtOption1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(correctComboOption, 0, 176, Short.MAX_VALUE)
                                    .addComponent(txtOption2))
                                .addGap(27, 27, 27)
                                .addComponent(txtOption3, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(txtOption4, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jLabel6)
                                .addGap(150, 150, 150)
                                .addComponent(jLabel7)
                                .addGap(126, 126, 126)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9)
                                .addGap(41, 41, 41))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblquestionNumber)
                                .addGap(40, 40, 40)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUserName)
                    .addComponent(lblLogout))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jlblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblquestionNumber)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel6))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtOption1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtOption2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtOption3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtOption4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(correctComboOption, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDone, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPrevious, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseClicked
        // TODO add your handling code here:
        LoginFrame loginFrame = new LoginFrame();
        loginFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblLogoutMouseClicked

    private void lblLogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseEntered
        // TODO add your handling code here:
        lblLogout.setForeground(Color.blue);
        Font font = new Font("Quicksand",Font.ITALIC,18);
        lblLogout.setFont(font);
    }//GEN-LAST:event_lblLogoutMouseEntered

    private void lblLogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseExited
        // TODO add your handling code here:
        lblLogout.setForeground(Color.white);
        Font font = new Font("Quicksand",Font.BOLD,18);
        lblLogout.setFont(font);
    }//GEN-LAST:event_lblLogoutMouseExited

    private void txtOption3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOption3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOption3ActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // TODO add your handling code here:
        
        boolean result = validateInputs();
        if (result == true){
        Question qn = new Question(question.getExamID(),question.getQno(),question.getLanguage(),option1,option2,option3,option4,correctOption,qstn);
        newQStore.addQuestion(qn);
        count = newQStore.getCount();
        }
        
        try{
            if (count >= 1){
                if (count == qstore.getCount()){
                    
                    JOptionPane.showMessageDialog(null,"Questions Set Press Done to Save in the DB  ...","Successfull",JOptionPane.INFORMATION_MESSAGE);
                    btnNext.setEnabled(false);
                    return;
                }
                clearAll();
                question = qstore.getQuestion(count);
                System.out.println(question);
                System.out.println("Count Next:"+count);
                txtQuestion.setText(question.getQuestion());
                txtOption1.setText(question.getAnswer1());
                txtOption2.setText(question.getAnswer2());
                txtOption3.setText(question.getAnswer3());
                txtOption4.setText(question.getAnswer4());
                correctComboOption.setSelectedItem(question.getCorrectAnswer());
                lblquestionNumber.setText("Question Number  "+question.getQno()+" : ");
                btnPrevious.setEnabled(true);
        }
            
            System.out.println("Count Next:"+count);
        if (count == qstore.getCount()){
            validateInputs();
            Question qn = new Question(question.getExamID(),question.getQno(),question.getLanguage(),option1,option2,option3,option4,correctOption,qstn);
            newQStore.addQuestion(qn);
        }
        if (count > (qstore.getCount()-1)){
            JOptionPane.showMessageDialog(null,"Questions Set Press Done to Save in the DB  ...","Successfull",JOptionPane.INFORMATION_MESSAGE);
            btnNext.setEnabled(false);
            return;
        }
        
        }catch(Exception ex){
            ex.getClass();
            ex.getMessage();
            ex.getLocalizedMessage();
            JOptionPane.showMessageDialog(null, "DB Error", "SQL Error !!!",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        SetPaperFrame paperFrame = new SetPaperFrame();
        paperFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnDoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoneActionPerformed
        // TODO add your handling code here:
        System.out.println("Old : "+qstore.getCount());
        System.out.println("New : "+newQStore.getCount());
        System.out.println("Count : "+count);
        try{
            if (qstore.getCount() == newQStore.getCount()){
                int ans = JOptionPane.showConfirmDialog(null,"Are You Sure, You Want to Store this Test in DataBase ? ","Are You Sure ?",JOptionPane.YES_NO_OPTION);
                if (ans == JOptionPane.YES_OPTION){
                    QuestionsDAO.updateQuestions(newQStore);
                    JOptionPane.showMessageDialog(null, "Questions Updated Successfully", "Success !!!",JOptionPane.INFORMATION_MESSAGE);
                    AdminOptionsFrame adminFrame = new AdminOptionsFrame();
                    adminFrame.setVisible(true);
                    this.dispose();
                }
            }
            else {
                JOptionPane.showMessageDialog(null,"Please Add Total Number of Questions ","Inforamtion",JOptionPane.INFORMATION_MESSAGE);
            }
        }
        catch (SQLException throwables) {
            JOptionPane.showMessageDialog(null, "DB Error", "SQL Error !!!",JOptionPane.ERROR_MESSAGE);
            throwables.printStackTrace();
        }
    }//GEN-LAST:event_btnDoneActionPerformed

    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousActionPerformed
        // TODO add your handling code here:
        if (count <= 0){
            btnPrevious.setEnabled(false);
            return;
        }
//        if (count == 1){
//            question = newQStore.getQuestion(count-1);
//            txtQuestion.setText(question.getQuestion());
//            txtOption1.setText(question.getAnswer1());
//            txtOption2.setText(question.getAnswer2());
//            txtOption3.setText(question.getAnswer3());
//            txtOption4.setText(question.getAnswer4());
//            count--;
//            lblquestionNumber.setText("Question Number  "+question.getQno()+" : ");
//            System.out.println("Count Prev: "+count);
//            if (count <= 1){
//            btnPrevious.setEnabled(false);
//        }
//        if (count == qstore.getCount()){
//            question = newQStore.getQuestion(count-1);
//            newQStore.removeQuestion(count-1);
//            txtQuestion.setText(question.getQuestion());
//            txtOption1.setText(question.getAnswer1());
//            txtOption2.setText(question.getAnswer2());
//            txtOption3.setText(question.getAnswer3());
//            txtOption4.setText(question.getAnswer4());
//            comboOption.setSelectedItem(question.getCorrectAnswer());
//            lblquestionNumber.setText("Question Number  "+question.getQno()+" : ");
//            btnNext.setEnabled(true);
//            count--;
//            System.out.println("Count Prev: "+count);
//            if (count <= 1){
//            btnPrevious.setEnabled(false);
//            }
//            }    
//        }

            try{
            question = newQStore.getQuestion(count-1);
            newQStore.removeQuestion(count-1);
            count = newQStore.getCount();
            clearAll();
            txtQuestion.setText(question.getQuestion());
            txtOption1.setText(question.getAnswer1());
            txtOption2.setText(question.getAnswer2());
            txtOption3.setText(question.getAnswer3());
            txtOption4.setText(question.getAnswer4());
            correctComboOption.setSelectedItem(question.getCorrectAnswer());
            lblquestionNumber.setText("Question Number  "+question.getQno()+" : ");
            btnNext.setEnabled(true);
            System.out.println("Count Prev: "+count);
//            if (count <= 1){
//            btnPrevious.setEnabled(false);
//        }
        }catch(Exception ex){
            ex.printStackTrace();
            ex.getMessage();
            JOptionPane.showMessageDialog(null, "Edit Question Frame","Error !!!",JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_btnPreviousActionPerformed

    /**
     * @param args the command line arguments
     */
    
    private void loadQuestions(){
        try{
            String id = editExam.getExamId();
            ArrayList<Question> questionList = QuestionsDAO.getQuestionsByExamId(id);
            for (Question q :questionList){
                qstore.addQuestion(q);
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "DB Error", "Edit Question Error !!!",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EditQuestionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditQuestionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditQuestionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditQuestionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditQuestionsFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDone;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrevious;
    private javax.swing.JComboBox<String> correctComboOption;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlblImage;
    private javax.swing.JLabel lblLogout;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JLabel lblquestionNumber;
    private javax.swing.JTextField txtOption1;
    private javax.swing.JTextField txtOption2;
    private javax.swing.JTextField txtOption3;
    private javax.swing.JTextField txtOption4;
    private javax.swing.JTextArea txtQuestion;
    // End of variables declaration//GEN-END:variables

    private void clearAll() {
        txtQuestion.setText("");
        txtOption1.setText("");
        txtOption2.setText("");
        txtOption3.setText("");
        txtOption4.setText("");
        correctComboOption.setSelectedIndex(0);
    }
    
    private boolean validateInputs() {
        qstn = txtQuestion.getText().trim();
        option1 = txtOption1.getText().trim();
        option2 = txtOption2.getText().trim();
        option3 = txtOption3.getText().trim();
        option4 = txtOption4.getText().trim();
        correctOption = correctComboOption.getSelectedItem().toString();
        if (qstn.isEmpty() || option1.isEmpty() || option2.isEmpty() || option3.isEmpty() || option4.isEmpty() || correctOption.isEmpty()){
            JOptionPane.showMessageDialog(null,"Please Fill All The Fields", "Information",JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
        return true;
    }
}
