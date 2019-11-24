package _03_remarkable;

import javax.swing.JOptionPane;

public class Remmarkable {
public static void main(String[] args) {
	String mattFact= " You like to catch fish";
	String baniFact= " You like to play soccer";
	String name=JOptionPane.showInputDialog("What is your name?");
	if(name.equals("matt")) {
		JOptionPane.showMessageDialog(null, mattFact);
	}
	if(name.equals("bani")) {
	JOptionPane.showMessageDialog(null, baniFact);
}
}}