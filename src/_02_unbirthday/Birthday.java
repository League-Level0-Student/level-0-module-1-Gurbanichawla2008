package _02_unbirthday;

import javax.swing.JOptionPane;

public class Birthday {
public static void main(String[] args) {
	String birthday=JOptionPane.showInputDialog("When is your birthday (month/day/year)?");
	if(birthday.equals ("11/17/19")) {
		JOptionPane.showMessageDialog(null,"Happy Birthday!");
	}
		else {
			JOptionPane.showMessageDialog(null, "Ooofff,ok no one cares");
	}
	
}
}
