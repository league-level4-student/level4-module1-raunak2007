package _03_Switch_Statement_Practice;

import javax.swing.JOptionPane;

public class CustomButtonOptionPanes {
	public static void main(String[] args) {
		String[] options = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		int input = JOptionPane.showOptionDialog(null, "Choose a day of the week", "Custom Buttons", 0, -1, null,
				options, 0);

		String choice = options[input];
		
		//use a switch statement to do something cool for each option
		switch(choice) {
		case "Sunday":
			JOptionPane.showMessageDialog(null, "It's Satisfacton Sunday");
			break;
		case "Friday":
			JOptionPane.showMessageDialog(null, "It's Fabulous Friday");
			break;
		case "Tuesday":
			JOptionPane.showMessageDialog(null, "It's Taco Tuesday");
			break;
		case "Wednesday":
			JOptionPane.showMessageDialog(null, "It's Hump Day");
			break;	
		case "Thursday":
			JOptionPane.showMessageDialog(null, "It's Terrific Thursday");
			break;
		case "Monday":
			JOptionPane.showMessageDialog(null, "It's Mundane Monday");
			break;
		case "Saturday":
			JOptionPane.showMessageDialog(null, "It's Sweet Saturday");
			break;
		}
	}
}
