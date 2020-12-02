/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techquizapp.gui;

import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import techquizapp.pojo.User;
import techquizapp.pojo.UserProfile;

/**
 *
 * @author adarshkumar
 */

public class AdminOptionsFrame extends javax.swing.JFrame {

    /**
     * Creates new form AdminOptionsFrame
     */
    //Color oldColor;
    User user;
    public AdminOptionsFrame() {
        initComponents();
        ImageIcon imageIcon = new ImageIcon("/Users/adarshkumar/Documents/NetBeansProjects/TechQuizApp/src/main/java/techquizapp/gui/administrator.png");
        //ImageIcon imageIcon = new ImageIcon("/Users/adarshkumar/Documents/NetBeansProjects/TechQuizApp/src/main/java/techquizapp/gui/algorithm.png");
        jlblImage.setIcon(imageIcon);
        setLocationRelativeTo(null);
        lblUserName.setText("Hello "+UserProfile.getUserName());
        //oldColor = lblLogout.getForeground();
    }
    
    public AdminOptionsFrame(User user){
        this();
        this.user = user;
        lblUserName.setText("Hello "+ user.getUserId());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jrSetPaper = new javax.swing.JRadioButton();
        jrEditPaper = new javax.swing.JRadioButton();
        jrRegisterStudent = new javax.swing.JRadioButton();
        jrViewScore = new javax.swing.JRadioButton();
        btnDoTask = new javax.swing.JButton();
        lblUserName = new javax.swing.JLabel();
        lblLogout = new javax.swing.JLabel();
        jlblImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Quicksand", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ONLINE QUIZ ADMINISTRATION PANEL");

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Quicksand", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Make A Choice");

        jrSetPaper.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jrSetPaper);
        jrSetPaper.setFont(new java.awt.Font("Quicksand", 1, 18)); // NOI18N
        jrSetPaper.setForeground(new java.awt.Color(255, 255, 255));
        jrSetPaper.setText("Set A Paper");

        jrEditPaper.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jrEditPaper);
        jrEditPaper.setFont(new java.awt.Font("Quicksand", 1, 18)); // NOI18N
        jrEditPaper.setForeground(new java.awt.Color(255, 255, 255));
        jrEditPaper.setText("Edit Paper");

        jrRegisterStudent.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jrRegisterStudent);
        jrRegisterStudent.setFont(new java.awt.Font("Quicksand", 1, 18)); // NOI18N
        jrRegisterStudent.setForeground(new java.awt.Color(255, 255, 255));
        jrRegisterStudent.setText("Register Student");

        jrViewScore.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jrViewScore);
        jrViewScore.setFont(new java.awt.Font("Quicksand", 1, 18)); // NOI18N
        jrViewScore.setForeground(new java.awt.Color(255, 255, 255));
        jrViewScore.setText("View Scores");

        btnDoTask.setBackground(new java.awt.Color(0, 0, 0));
        btnDoTask.setFont(new java.awt.Font("Quicksand", 1, 18)); // NOI18N
        btnDoTask.setForeground(new java.awt.Color(255, 255, 255));
        btnDoTask.setText("Do Task");
        btnDoTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoTaskActionPerformed(evt);
            }
        });

        lblUserName.setBackground(new java.awt.Color(0, 0, 0));
        lblUserName.setFont(new java.awt.Font("Quicksand", 1, 18)); // NOI18N
        lblUserName.setForeground(new java.awt.Color(255, 255, 255));
        lblUserName.setText("My name");

        lblLogout.setBackground(new java.awt.Color(0, 0, 0));
        lblLogout.setFont(new java.awt.Font("Quicksand", 1, 18)); // NOI18N
        lblLogout.setForeground(new java.awt.Color(255, 255, 255));
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

        jlblImage.setText("jLabel5");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblUserName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblLogout)
                .addGap(25, 25, 25))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jlblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jrEditPaper)
                                .addComponent(jrSetPaper)
                                .addComponent(jrRegisterStudent)
                                .addComponent(jrViewScore))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnDoTask, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)))
                        .addGap(115, 115, 115))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(214, 214, 214))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(135, 135, 135))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLogout)
                    .addComponent(lblUserName))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel2)
                        .addGap(35, 35, 35)
                        .addComponent(jrSetPaper)
                        .addGap(18, 18, 18)
                        .addComponent(jrEditPaper)
                        .addGap(18, 18, 18)
                        .addComponent(jrRegisterStudent)
                        .addGap(18, 18, 18)
                        .addComponent(jrViewScore)
                        .addGap(48, 48, 48)
                        .addComponent(btnDoTask, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jlblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(69, Short.MAX_VALUE))
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

    private void lblLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseClicked
        // TODO add your handling code here:
        LoginFrame loginFrame = new LoginFrame();
        loginFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblLogoutMouseClicked

    private void btnDoTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoTaskActionPerformed
        // TODO add your handling code here:
        if (jrSetPaper.isSelected()){
            SetPaperFrame setPaper = new SetPaperFrame();
            setPaper.setVisible(true);
        }
        else if (jrEditPaper.isSelected()){
            EditPaperFrame editPaperFrame = new EditPaperFrame();
            editPaperFrame.setVisible(true);
        }
        else if (jrRegisterStudent.isSelected()){
            RegisterStudentFrame registerStudentFrame = new RegisterStudentFrame(user);
            registerStudentFrame.setVisible(true);
            
        }
        else if (jrViewScore.isSelected()){
            ViewScoresFrame viewScoresFrame = new ViewScoresFrame();
            viewScoresFrame.setVisible(true);
            
        }
        else{
            JOptionPane.showMessageDialog(null, "Please Select an Option", "No Selection", JOptionPane.ERROR_MESSAGE);
            return;
        }
        this.dispose();
    }//GEN-LAST:event_btnDoTaskActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(AdminOptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminOptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminOptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminOptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminOptionsFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDoTask;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jlblImage;
    private javax.swing.JRadioButton jrEditPaper;
    private javax.swing.JRadioButton jrRegisterStudent;
    private javax.swing.JRadioButton jrSetPaper;
    private javax.swing.JRadioButton jrViewScore;
    private javax.swing.JLabel lblLogout;
    private javax.swing.JLabel lblUserName;
    // End of variables declaration//GEN-END:variables
}
