package _07_riddler;
import javax.swing.JOptionPane;

public class Riddlers {
public static void main(String[] args) {
int score=0;
JOptionPane.showMessageDialog(null,"Let's solve some riddles and win some points!!");
String playerOne =JOptionPane.showInputDialog("What is made out of water but if you put it in the water you will die?");
if(playerOne.equals("ice cube")) {
	JOptionPane.showMessageDialog(null,"CORRECT!!!");
	score+=10;
}
else {JOptionPane.showMessageDialog(null, "OOFF WRONG!!! The anwser is an ice cube");
score-=10;
}
String playerTwo=JOptionPane.showInputDialog("What has hands but cannot clap?");
if(playerTwo.equals("a clock")) {
	JOptionPane.showMessageDialog(null,"Way to go!!!");
	score+=20;
}
else {JOptionPane.showMessageDialog(null,"Wrong!!! The anwser was a clock buddy");
score-=20;
}
JOptionPane.showMessageDialog(null,"Thanks for playing!!!");
}
}