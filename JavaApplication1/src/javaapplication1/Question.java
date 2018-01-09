/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
public class Question {
    int id;
    String text;
    int ans;
    String b1;
    String b2;
    String b3;
    String b4;
    String hint;
    
    public Question(int id, int ans, String text, String b1, String b2, String b3, String b4, String hint){
        this.id = id;
        this.ans = ans;
        this.text = text;
        this.b1 = b1;
        this.b2 = b2;
        this.b3 = b3;
        this.b4 = b4;
        this.hint = hint;
    }
}
