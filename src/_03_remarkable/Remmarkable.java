package _03_remarkable;

import javax.swing.JOptionPane;

public class Remmarkable {
public static void main(String[] args) {
	String mattFact= "catches fish";
	String baniFact= "plays soccer";
	String name=JOptionPane.showInputDialog("What is your name?");
	if(mattFact.equals("matt")) {
		JOptionPane.showMessageDialog(null, "You like to catch fish");
	}
	if(baniFact.equals("bani")) {
	JOptionPane.showMessageDialog(null, "You like to play soccer");
}
}}