/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import static javaapplication1.JavaApplication1.answer;
import static javaapplication1.JavaApplication1.endgame;
import static javaapplication1.JavaApplication1.fiftyhint;
import static javaapplication1.JavaApplication1.friendhint;
import static javaapplication1.JavaApplication1.init;
import static javaapplication1.JavaApplication1.nextq;
import static javafx.application.Platform.exit;

/**
 *
 * @author damia
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        endgametxt = new javax.swing.JLabel();
        qcorrecttxt = new javax.swing.JLabel();
        hintstxt = new javax.swing.JLabel();
        callfriend = new javax.swing.JButton();
        fiftyfifty = new javax.swing.JButton();
        safetytxt = new javax.swing.JLabel();
        moneywon = new javax.swing.JLabel();
        youwon = new javax.swing.JLabel();
        moneyearnedtxt = new javax.swing.JLabel();
        exitgame = new javax.swing.JButton();
        playagain = new javax.swing.JButton();
        nametxt = new javax.swing.JTextField();
        starttxt = new javax.swing.JLabel();
        startbtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        timertxt = new javax.swing.JLabel();
        questxt = new javax.swing.JLabel();
        incorrecttxt = new javax.swing.JLabel();
        correcttxt = new javax.swing.JLabel();
        cashout = new javax.swing.JButton();
        nextqbtn = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        bg = new javax.swing.JLabel();
        backg = new javax.swing.JPanel();
        winnings = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        endgametxt.setFont(new java.awt.Font("Agency FB", 1, 48)); // NOI18N
        endgametxt.setForeground(new java.awt.Color(0, 153, 255));
        endgametxt.setText("Well done");
        getContentPane().add(endgametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 300, 410, 60));

        qcorrecttxt.setFont(new java.awt.Font("Agency FB", 1, 28)); // NOI18N
        qcorrecttxt.setForeground(new java.awt.Color(204, 204, 204));
        qcorrecttxt.setText("Questions correct: ");
        getContentPane().add(qcorrecttxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 420, 280, 40));

        hintstxt.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        hintstxt.setForeground(new java.awt.Color(0, 102, 102));
        hintstxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hintstxt.setText("HINTS");
        getContentPane().add(hintstxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 100, -1));

        callfriend.setFont(new java.awt.Font("Agency FB", 1, 17)); // NOI18N
        callfriend.setText("Call a Friend");
        callfriend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                callfriendActionPerformed(evt);
            }
        });
        getContentPane().add(callfriend, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 100, 60));

        fiftyfifty.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        fiftyfifty.setText("50 / 50");
        fiftyfifty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiftyfiftyActionPerformed(evt);
            }
        });
        getContentPane().add(fiftyfifty, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, 100, 60));

        safetytxt.setFont(new java.awt.Font("Agency FB", 1, 28)); // NOI18N
        safetytxt.setForeground(new java.awt.Color(204, 204, 204));
        safetytxt.setText("Questions correct: ");
        getContentPane().add(safetytxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 550, 320, 120));

        moneywon.setFont(new java.awt.Font("Agency FB", 1, 90)); // NOI18N
        moneywon.setForeground(new java.awt.Color(0, 102, 0));
        moneywon.setText("$1000000");
        getContentPane().add(moneywon, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 380, 330, 120));

        youwon.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        youwon.setForeground(new java.awt.Color(0, 102, 102));
        youwon.setText("You won:");
        getContentPane().add(youwon, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 350, 130, 40));

        moneyearnedtxt.setFont(new java.awt.Font("Agency FB", 1, 28)); // NOI18N
        moneyearnedtxt.setForeground(new java.awt.Color(0, 102, 0));
        moneyearnedtxt.setText("Money earned:");
        getContentPane().add(moneyearnedtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 460, 280, 40));

        exitgame.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        exitgame.setForeground(new java.awt.Color(153, 0, 0));
        exitgame.setText("EXIT GAME");
        exitgame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitgameActionPerformed(evt);
            }
        });
        getContentPane().add(exitgame, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 520, 170, -1));

        playagain.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        playagain.setForeground(new java.awt.Color(0, 153, 0));
        playagain.setText("PLAY AGAIN");
        playagain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playagainActionPerformed(evt);
            }
        });
        getContentPane().add(playagain, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 520, 170, -1));

        nametxt.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        nametxt.setForeground(new java.awt.Color(0, 51, 102));
        getContentPane().add(nametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(487, 470, 250, 50));

        starttxt.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        starttxt.setForeground(new java.awt.Color(0, 153, 255));
        starttxt.setText("Welcome, please enter your name");
        getContentPane().add(starttxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 410, 430, 40));

        startbtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        startbtn.setForeground(new java.awt.Color(0, 102, 0));
        startbtn.setText("START GAME");
        startbtn.setFocusPainted(false);
        startbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startbtnActionPerformed(evt);
            }
        });
        getContentPane().add(startbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 540, 180, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/millban_2.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        timertxt.setFont(new java.awt.Font("Agency FB", 1, 40)); // NOI18N
        timertxt.setForeground(new java.awt.Color(255, 255, 102));
        timertxt.setText("30");
        getContentPane().add(timertxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 420, 40, -1));

        questxt.setFont(new java.awt.Font("Agency FB", 1, 32)); // NOI18N
        questxt.setForeground(new java.awt.Color(204, 255, 255));
        questxt.setText("question text");
        getContentPane().add(questxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 470, 570, 70));

        incorrecttxt.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        incorrecttxt.setForeground(new java.awt.Color(153, 0, 0));
        incorrecttxt.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        incorrecttxt.setText("INCORRECT!");
        getContentPane().add(incorrecttxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 190, 350, 150));

        correcttxt.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        correcttxt.setForeground(new java.awt.Color(51, 153, 0));
        correcttxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        correcttxt.setText("CORRECT!");
        getContentPane().add(correcttxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 180, 420, 180));

        cashout.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        cashout.setText("Ca$h Out");
        cashout.setFocusPainted(false);
        cashout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cashoutActionPerformed(evt);
            }
        });
        getContentPane().add(cashout, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 330, 170, 70));

        nextqbtn.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        nextqbtn.setText("Next Question ->");
        nextqbtn.setFocusPainted(false);
        nextqbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextqbtnActionPerformed(evt);
            }
        });
        getContentPane().add(nextqbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 330, 170, 70));

        btn3.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        btn3.setText("button 3");
        btn3.setFocusPainted(false);
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        getContentPane().add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 620, 250, 40));

        btn4.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        btn4.setFocusPainted(false);
        btn4.setLabel("button 4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        getContentPane().add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 620, 250, 40));

        btn1.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        btn1.setFocusPainted(false);
        btn1.setLabel("button 1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 563, 250, 40));

        btn2.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        btn2.setFocusPainted(false);
        btn2.setLabel("button 2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 560, 250, 40));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/bg5_1.png"))); // NOI18N
        bg.setMinimumSize(new java.awt.Dimension(1079, 558));
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 800, 570));

        backg.setBackground(new java.awt.Color(0, 0, 0));
        backg.setLayout(null);

        winnings.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        winnings.setForeground(new java.awt.Color(51, 102, 0));
        winnings.setText("$0");
        backg.add(winnings);
        winnings.setBounds(40, 630, 120, 29);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/currentmon_1.png"))); // NOI18N
        backg.add(jLabel2);
        jLabel2.setBounds(0, 590, 201, 95);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/moneylvls.png"))); // NOI18N
        backg.add(jLabel1);
        jLabel1.setBounds(0, 169, 201, 420);

        getContentPane().add(backg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1360, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //ANSWER BUTTONS THAT CALL ANSWER METHOD
    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        answer(1,JavaApplication1.currentq.ans); //first parameter is button number (1 in this case), second parameter is the button number of the answer for the current question
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        answer(2,JavaApplication1.currentq.ans); //first parameter is button number (2 in this case), second parameter is the button number of the answer for the current question
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        answer(3,JavaApplication1.currentq.ans); //first parameter is button number (3 in this case), second parameter is the button number of the answer for the current question
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        answer(4,JavaApplication1.currentq.ans); //first parameter is button number (4 in this case), second parameter is the button number of the answer for the current question
    }//GEN-LAST:event_btn4ActionPerformed

    private void nextqbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextqbtnActionPerformed
        nextq(); //once the "next question" button is pressed, call the nextq method to display the next question
    }//GEN-LAST:event_nextqbtnActionPerformed

    private void startbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startbtnActionPerformed
        nextq(); 
        username = nametxt.getText();//when the start game button is pressed, save the user's name as the username variable and call the nextq method to get the next question
        startbtn.setVisible(false); //and update the gui a little bit
        starttxt.setVisible(false);
        nametxt.setVisible(false);
    }//GEN-LAST:event_startbtnActionPerformed

    private void cashoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cashoutActionPerformed
        endgame("cash"); //if cashout button is pressed, call endgame method with reason "cash"
    }//GEN-LAST:event_cashoutActionPerformed

    private void exitgameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitgameActionPerformed
        System.exit(0); //if exit game button is pressed, exit the window
    }//GEN-LAST:event_exitgameActionPerformed

    private void playagainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playagainActionPerformed
        init(); //if playagain button is pressed, call initialization method
    }//GEN-LAST:event_playagainActionPerformed

    private void callfriendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_callfriendActionPerformed
        callfriend.setEnabled(false);
        friendhint();
    }//GEN-LAST:event_callfriendActionPerformed

    private void fiftyfiftyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiftyfiftyActionPerformed
        fiftyhint();
        fiftyfifty.setEnabled(false);
    }//GEN-LAST:event_fiftyfiftyActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    
    public static String username;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JPanel backg;
    public static javax.swing.JLabel bg;
    public static javax.swing.JButton btn1;
    public static javax.swing.JButton btn2;
    public static javax.swing.JButton btn3;
    public static javax.swing.JButton btn4;
    public static javax.swing.JButton callfriend;
    public static javax.swing.JButton cashout;
    public static javax.swing.JLabel correcttxt;
    public static javax.swing.JLabel endgametxt;
    public static javax.swing.JButton exitgame;
    public static javax.swing.JButton fiftyfifty;
    public static javax.swing.JLabel hintstxt;
    public static javax.swing.JLabel incorrecttxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    public static javax.swing.JLabel moneyearnedtxt;
    public static javax.swing.JLabel moneywon;
    public static javax.swing.JTextField nametxt;
    public static javax.swing.JButton nextqbtn;
    public static javax.swing.JButton playagain;
    public static javax.swing.JLabel qcorrecttxt;
    public static javax.swing.JLabel questxt;
    public static javax.swing.JLabel safetytxt;
    public static javax.swing.JButton startbtn;
    public static javax.swing.JLabel starttxt;
    public static javax.swing.JLabel timertxt;
    public static javax.swing.JLabel winnings;
    public static javax.swing.JLabel youwon;
    // End of variables declaration//GEN-END:variables
}
