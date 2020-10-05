package _05_Enum_Stuff;

import javax.swing.JOptionPane;

public class _00_Horoscope {
	static // 1. Create an enum in a separate file called Zodiac that contains a category for
	//    all 12 zodiac signs.
	
	// 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane to display
	//    a different horoscope based on the Zodiac's state.
	void horoscope(Zodiac z){
		switch(z) {
		case ARIES:
			JOptionPane.showMessageDialog(null, "A lot of creative work may need to be finished by today, Aries. If you're professionally involved with writing, a deadline may loom. It could be difficult to get it done because family members and friends could constantly call and text, which keeps you from concentrating. The best course of action might be to go somewhere quiet, like a library, and do your work there. Think about it!");
			break;
		case TAURUS:
			JOptionPane.showMessageDialog(null, "Smart, ambitious, and trustworthy, Taurus is the anchor of the Zodiac. Amazing friends, colleagues, and partners, Taureans value honesty above all else and are proud that their personal relationships tend to be drama free. Bulls get the reputation of being stubborn, but they're not always stuck in their ways. This searching sign is willing to see another point of view, but they won't flip-flop on an opinion just to make someone else happy. They will shift their thinking only if they truly have a change of heart.");
			break;
		}
	}
	// 3. Make a main method to test your method
	public static void main(String[] args) {
		Zodiac z=Zodiac.ARIES;
		horoscope(z);
	}
}
