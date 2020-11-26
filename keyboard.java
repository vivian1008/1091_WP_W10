import javax.swing.*;
import java.awt.*;
import java.awt.event;
import java.util.Random;

public class keyboard extends JFrame{
    private Container cp;
    private JButton jbtn[] = new JButton[54];
    private JPanel jpl1 = new JPanel(new GridLayout(5,10,3,3));
    private JPanel jpl2 = new JPanel(new GridLayout(1,4,3,3));
    private JPasswordField jpf = new JPasswordField();
    private JToggleButton cap = new JToggleButton();
    private LoginFrame loginfrm;
    private String btnlab[] ={"0","1","2","3","4","5","6","7","8","9",
                              "!","@","#","$","%","^","&","(",")","+",
                              "-","*","_","-","a","b","c","d","e","f",
                              "g","h","i","j","k","l","m","n","o","p",
                              "q","r","s","t","u","v","w","x","y","z"
                              "Exit","Reset","Submit"} 
}