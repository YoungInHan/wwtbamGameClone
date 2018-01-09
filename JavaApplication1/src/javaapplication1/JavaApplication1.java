/*  This program is a version of the popular game show "Who Wants to Be a Millionaire?"
 *  It is a trivia game where the user enters their name, then is presented
 *  with 15 trivia questions with 4 possible answers each. If the user gets a
 *  question correct, they win money. If they get a question wrong, they lose.
 *  Made by Damian Reiter and Daniel Han, 2017
 */

package javaapplication1;

import java.awt.Color;
import java.awt.Frame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.File;
import java.net.URL;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;

public class JavaApplication1 {
    //Initializing variables
    public static Question[] q = new Question[15];
    public static Question currentq;
    public static int counter;
    public static int moneywon;
    public static int nulls = -1;
    public static int time = 30;
    
    
    // getting images for backgrounds
    // ***************************************************************************************
    // You will have to change the path of these images to get them to work on your computer
    public static ImageIcon bag = new ImageIcon(JavaApplication1.class.getResource("/javaapplication1/bg5_1.png"));
    public static ImageIcon startbg = new ImageIcon(JavaApplication1.class.getResource("/javaapplication1/millbg.png"));
    // You will have to change the path of these images to get them to work on your computer
    // ***************************************************************************************
    
    //Timer object used for question timer
    public static Timer timer = new Timer(1002, new ActionListener(){ //Timer with 1 second trigger time
            @Override
            public void actionPerformed(ActionEvent e){ //action performed method, triggers every second
                //if there is time remaining, subtract 1
                if(time > 0)
                    time--;
                //set text of timer to the value of "time" variable
                NewJFrame.timertxt.setText(String.valueOf(time));
                //if time is 0, end game with reason "time"
                if(time == 0)
                    endgame("time");
            }
        });
    
    public static void main(String[] args) {
        //creating main JFrame, this is the first thing that happens when you run this file
        NewJFrame frame = new NewJFrame();
        //set main JFrame visible
        frame.setVisible(true);
        //call initialization method to set different elements visible
        init();
    }

    public static void answer(int btn, int ans) {
        //if button number = answer number (property of current question)
        if(btn == ans){
            //then add 1 to counter (counter is how many questions have been correctly answered)
            counter++;
            //if counter is not 15, trigger correct method with false parameter
            if(counter!=15)
                correct(false);
            else if(counter == 15) //if counter = 15, trigger correct method with true parameter
                correct(true);
            
            //play clap noise
            playSound("clap.wav");
        }else if(btn != ans){
            //if button number != answer number, end the game with reason "incorrect"
            endgame("incorrect");
        }
    }
    
    public static void nextq(){ //nextquestion method
        //set time to 20
        time = 20;
        NewJFrame.timertxt.setText(String.valueOf(time)); //set timer text (in the window) to the value of time variable (which will be 30)
        //start timer
        timer.start();
        //variable to choose next question
        int nxt = 0;
        if(counter != 15)
        do{
            nxt = (int)(15 * Math.random()); //set nxt to some random number from 1-15
        }while(q[nxt] == null); //if element in question array exists at location [nxt], 
        nulls = -1;             // |
        qscreen();              // V
        currentq = q[nxt];      // then set that question in the array to "currentq" to be used
        NewJFrame.questxt.setText("<html>" + currentq.text + "</html>"); //set the question text to the text set in currentq
        NewJFrame.btn1.setText(currentq.b1); //set all button texts to the correct texts based on the current question
        NewJFrame.btn2.setText(currentq.b2);
        NewJFrame.btn3.setText(currentq.b3);
        NewJFrame.btn4.setText(currentq.b4);
        q[nxt] = null; //finally set the element in the questions array at nxt to null so it cannot be chosen again
    }
    
    public static void correct(boolean win){ //correct method, called when user gets a question correct
        NewJFrame.btn1.setVisible(false);
        NewJFrame.btn2.setVisible(false);
        NewJFrame.btn3.setVisible(false);
        NewJFrame.btn4.setVisible(false);
        NewJFrame.questxt.setVisible(false);
        NewJFrame.timertxt.setVisible(false);
        NewJFrame.bg.setIcon(null);                 //changing the gui
        NewJFrame.nextqbtn.setVisible(true);
        NewJFrame.correcttxt.setVisible(true);
        NewJFrame.cashout.setVisible(true);
        NewJFrame.qcorrecttxt.setVisible(true);
        NewJFrame.moneyearnedtxt.setVisible(true);
        NewJFrame.hintstxt.setVisible(false);
        NewJFrame.fiftyfifty.setVisible(false);
        NewJFrame.callfriend.setVisible(false);
        NewJFrame.btn1.setEnabled(true);
        NewJFrame.btn2.setEnabled(true);
        NewJFrame.btn3.setEnabled(true);
        NewJFrame.btn4.setEnabled(true);
        
        NewJFrame.correcttxt.setText("CORRECT!");
        
        switch(counter){ //switch to update the user's current money won based on amount of questions correct
            case 1: moneywon = 100;
                    break;
            case 2: moneywon = 200;
                    break;
            case 3: moneywon = 300;
                    break;
            case 4: moneywon = 500;
                    break;
            case 5: moneywon = 1000;
                    break;
            case 6: moneywon = 2000;
                    break;
            case 7: moneywon = 4000;
                    break;
            case 8: moneywon = 8000;
                    break;
            case 9: moneywon = 16000;
                    break;
            case 10: moneywon = 32000;
                    break;
            case 11: moneywon = 64000;
                    break;
            case 12: moneywon = 125000;
                    break;
            case 13: moneywon = 250000;
                    break;
            case 14: moneywon = 500000;
                    break;
            case 15: moneywon = 1000000;
                    break;
            
        }
        
        if(counter == 5 || counter == 10){ //if statement to check if the user has hit 5 or 10 questions correct, which garuntees them a certain amount of money
            NewJFrame.safetytxt.setVisible(true);
            NewJFrame.safetytxt.setText("<html> You have gotten " + counter + " questions correct. You are now guaranteed at least $" + moneywon + "</html>");
        }
        
        //display current statistics of game to user such as money won and questions correct
        NewJFrame.qcorrecttxt.setText("Questions correct: " + counter);
        NewJFrame.moneyearnedtxt.setText("Money earned: $" + moneywon);
        NewJFrame.winnings.setText("$" + String.valueOf(moneywon)); //set money won text (in bottom left of screen)
        timer.stop(); //stop the timer
        
        if(win){ //if win is true (if counter = 15) display a special "you are a millionaire" message to the user and remove the "next question" and "cash out" buttons
            NewJFrame.correcttxt.setText("<html> Congratulations " + NewJFrame.username + ", you are a millionaire!</html>");
            NewJFrame.correcttxt.setHorizontalAlignment(JLabel.CENTER);
            NewJFrame.playagain.setVisible(true);
            NewJFrame.exitgame.setVisible(true);
            NewJFrame.nextqbtn.setVisible(false);
            NewJFrame.cashout.setVisible(false);
        }
        
    }
    
    public static void playSound(String urla) { //play sound method
        try{
            // ***************************************************************************************
            // You will have to change the path of this sound effect for it to work on your computer
            File sound = new File(JavaApplication1.class.getResourceAsStream("/javaapplication1/clap.wav"));
            // You will have to change the path of this sound effect for it to work on your computer
            // ***************************************************************************************
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(sound);
            Clip clip = AudioSystem.getClip(); //set clip
            clip.open(audioIn);
            clip.start(); //play sound
        }catch(Exception e){
            
        }
    }
    
    public static void friendhint(){
        //is friendhint button is pressed, open a dialogue with the current questions hint
        JOptionPane.showMessageDialog(null, currentq.hint);
    }
    
    public static void fiftyhint(){
        int num = 0;
        int prev = 0;
        do{
            int remove = (int)(Math.random()*4) + 1; //generate random number from 1-4 for button to be disabled
            if((remove != currentq.ans) && (remove != prev)){ //if number generated is not the answer and was not previously removed
                switch(remove){ //then start this switch statement to remove 1 button
                    case 1: NewJFrame.btn1.setEnabled(false);
                            break;
                    case 2: NewJFrame.btn2.setEnabled(false);
                            break;
                    case 3: NewJFrame.btn3.setEnabled(false);
                            break;
                    case 4: NewJFrame.btn4.setEnabled(false);
                            break;
                }
                prev = remove; //set prev to the number of the button that was removed so it cannot be removed again
                num++; //add 1 to num which is a counter for the total number of buttons this hint has removed
            }
        }while(num != 2); //loop until num = 2 so it removes 2 buttons each time
    }
    
    public static void init(){ //initialization method for when a new game is created
        time = 30;
        initgui(); //initialize gui
        
        counter = 0; //set counter to 0
        NewJFrame.winnings.setText("$0"); //set money won text to $0
        
        //initialize all questions in question array so that none of them are null from the previous game
        q[0] = new Question(1,2,"In looney tunes, what sound does the Road Runner make?",
            "Ping! Ping!","Beep! Beep!","Ooga Booga!","Vroom! Vroom!","Like a car horn");
        q[1] = new Question(2,3,"Where should choking victims place their hands to indicate they need help?",
            "Over the eyes","On the knees","Around the throat","On the hips","It's like a game of charades");
        q[2] = new Question(3,4,"Which of these dance names are used to describe a fasionable dot?",
            "Hora","Swing","Lambada","Polka","_____dot");
        q[3] = new Question(4,4,"In what language would you say ello-hay to greet your friends?",
            "Bull Latin","Dog Latin","Duck Latin","Pig Latin","ig-pay atin-lay");
        q[4] = new Question(5,4,"What is the only position in football where you can be sacked?",
            "Center","Wide reciever","Tight end","Quarterback","The NFL officially refers to a sack as 'dumping the passer'");
        q[5] = new Question(6,3,"What god of love is depicted as a chubby winged infant?",
            "Zeus","Aphrodite","Cupid","Mercury","Has a bow and arrow");
        q[6] = new Question(7,2,"In what town did the the 1881 shoot-out at the O.K. Corral take place?",
            "Laramie","Tombstone","El Paso","Dodge City","relevant name");
        q[7] = new Question(8,1,"Which of the following months has no U.S. federal holiday?",
            "August","February","September","November","President's Day, Veteran's Day, Labor Day");
        q[8] = new Question(9,1,"Who developed the first effective vaccine against polio?",
            "Jonas Salk","Louis Pasteur","Niels Bohr","Albert Sabin","Attended the New York University of Medicine");
        q[9] = new Question(10,3,"Which of the following is not a monothesitic religion?",
            "Islam","Judaism","Hinduism","Christianity","monothesitic = only 1 god");
        q[10] = new Question(11,1,"Which NBA player has the most points scored during their career?",
            "Kareem Abdul Jabbar","Michael Jordan","Lebron James","Kobe Bryant","He played from 1966-1969");
        q[11] = new Question(12,3,"In the year 1900 in the U.S. what were the most popular first names given to boy and girl babies?",
            "William and Elizabeth","Joseph and Catherine","John and Mary","George and Anne","Also the name of a 1969 movie");
        q[12] = new Question(13,2,"Which of the following items was owned by the fewest U.S. homes in 1990?",
            "Home computer","Compact disk player","Cordless phone","Dishwasher","Sony released the first commercial unit of this in 1982");
        q[13] = new Question(14,3,"Who is third behind Hank Aaron and Babe Ruth in major league career home runs?",
            "Reggie Jackson","Harmon Killebrew","Willie Mays","Frank Robinson","He played for the San Francisco Giants and the New York Mets");
        q[14] = new Question(15,2,"In 1990, in what percentage of U.S. married couples did the wife earn more money than the husband?",
            "8","18","38","58","Average salaries with a bachelor's degree: Male: $39,328 Female: $28,017");
        //q[15] = new Question(16,1,"The Brownie Box Camera introduced by Eastman Kodak in 1900 had a retail price of what?",
            //"$1","$5","$10","$20");
    }
    
    public static void endgame(String reason){ //endgame method called when user cashes out of gets a question wrong
        endgamegui(reason); //set gui based on reason (ie. incorrect answer, timer, cashed out)
        timer.stop(); //stop timer
        
        NewJFrame.moneywon.setText("$" + String.valueOf(moneywon)); //display money won to user
        NewJFrame.endgametxt.setText("Well done, " + NewJFrame.username + "!");
        
    }
    
    public static void initgui(){ //gui settings for initialization
        NewJFrame.nextqbtn.setVisible(false);
        NewJFrame.correcttxt.setVisible(false);
        NewJFrame.cashout.setVisible(false);
        NewJFrame.btn1.setVisible(false);
        NewJFrame.btn2.setVisible(false);
        NewJFrame.btn3.setVisible(false);
        NewJFrame.btn4.setVisible(false);
        NewJFrame.questxt.setVisible(false);
        NewJFrame.timertxt.setVisible(false);
        NewJFrame.startbtn.setVisible(true);
        NewJFrame.nametxt.setVisible(true);
        NewJFrame.starttxt.setVisible(true);
        NewJFrame.qcorrecttxt.setVisible(false);
        NewJFrame.moneyearnedtxt.setVisible(false);
        NewJFrame.endgametxt.setVisible(false);
        NewJFrame.endgametxt.setVisible(false);
        NewJFrame.youwon.setVisible(false);
        NewJFrame.moneywon.setVisible(false);
        NewJFrame.exitgame.setVisible(false);
        NewJFrame.playagain.setVisible(false);
        NewJFrame.incorrecttxt.setVisible(false);
        NewJFrame.safetytxt.setVisible(false);
        NewJFrame.fiftyfifty.setEnabled(true);
        NewJFrame.callfriend.setEnabled(true);
        NewJFrame.hintstxt.setVisible(false);
        NewJFrame.fiftyfifty.setVisible(false);
        NewJFrame.callfriend.setVisible(false);
        NewJFrame.bg.setIcon(startbg);
        
        NewJFrame.nametxt.setText("");
    }
    
    public static void endgamegui(String reason){ //gui settings for end of game based on reason
        NewJFrame.btn1.setVisible(false);
        NewJFrame.btn2.setVisible(false);
        NewJFrame.btn3.setVisible(false);
        NewJFrame.btn4.setVisible(false);
        NewJFrame.questxt.setVisible(false);
        NewJFrame.timertxt.setVisible(false);
        NewJFrame.bg.setIcon(null);
        NewJFrame.nextqbtn.setVisible(false);
        NewJFrame.correcttxt.setVisible(false);
        NewJFrame.cashout.setVisible(false);                //updating gui
        NewJFrame.qcorrecttxt.setVisible(false);
        NewJFrame.moneyearnedtxt.setVisible(false);
        NewJFrame.endgametxt.setVisible(true);
        NewJFrame.youwon.setVisible(true);
        NewJFrame.moneywon.setVisible(true);
        NewJFrame.exitgame.setVisible(true);
        NewJFrame.playagain.setVisible(true);
        NewJFrame.safetytxt.setVisible(false);
        NewJFrame.hintstxt.setVisible(false);
        NewJFrame.fiftyfifty.setVisible(false);
        NewJFrame.callfriend.setVisible(false);
        
        if(reason.equals("incorrect") || reason.equals("time")){
            NewJFrame.incorrecttxt.setVisible(true);
            if(reason.equals("incorrect")){
                NewJFrame.incorrecttxt.setText("Incorrect!"); //if reason is incorrect, set text to "Incorrect!"
                switch(currentq.ans){
                    //Display correct answer when user gets answer wrong
                    case 1: NewJFrame.safetytxt.setText("<html> The correct answer was: " + NewJFrame.btn1.getText() + "</html>");
                            break;
                    case 2: NewJFrame.safetytxt.setText("<html> The correct answer was: " + NewJFrame.btn2.getText() + "</html>");
                            break;
                    case 3: NewJFrame.safetytxt.setText("<html> The correct answer was: " + NewJFrame.btn3.getText() + "</html>");
                            break;
                    case 4: NewJFrame.safetytxt.setText("<html> The correct answer was: " + NewJFrame.btn4.getText() + "</html>");
                            break;
                }
                NewJFrame.safetytxt.setVisible(true);
            }
            else
                NewJFrame.incorrecttxt.setText("Out of Time!"); //if reason is time, set text to "Out of Time!"
            playSound("aww.wav"); //play awww sound
            
            if(counter < 5)
                moneywon = 0;
            else if(counter > 5 && counter < 10)
                moneywon = 1000;
            else if(counter > 10 && counter < 15)
                moneywon = 32000;
        }
        if(reason.equals("cash")){ //if reason is cash, set text to "Cashout out!"
            NewJFrame.incorrecttxt.setVisible(true);
            NewJFrame.incorrecttxt.setText("Cashed out!");
        }
    }
    
    public static void qscreen(){ //question screen gui settings
        NewJFrame.btn1.setVisible(true);
        NewJFrame.btn2.setVisible(true);
        NewJFrame.btn3.setVisible(true);
        NewJFrame.btn4.setVisible(true);
        NewJFrame.questxt.setVisible(true);
        NewJFrame.timertxt.setVisible(true);
        NewJFrame.bg.setIcon(bag);
        NewJFrame.nextqbtn.setVisible(false);
        NewJFrame.correcttxt.setVisible(false);             //updating gui
        NewJFrame.cashout.setVisible(false);
        NewJFrame.qcorrecttxt.setVisible(false);
        NewJFrame.moneyearnedtxt.setVisible(false);
        NewJFrame.safetytxt.setVisible(false);
        NewJFrame.hintstxt.setVisible(true);
        NewJFrame.fiftyfifty.setVisible(true);
        NewJFrame.callfriend.setVisible(true);
    }
    
}