package org.ipsd.k12.cs2019;
import javax.swing.JOptionPane;

public class StringMethods 
{
	//precondition: text.length() > 0
	//postcondition: returns the proper form of the name
	//              i.e. first letter capitalized the rest of the name lower case
	public static String proper(String text)
	{
		String result = text.substring(0, 1).toUpperCase() + text.substring(1).toLowerCase();
		return result;
	}
	
	//precondition: the explicit parameters have lengths greater than 3
	//postcondition: returns the generated email in the format of:
	//              (first name) + (first 3 characters of last name) 
	//				+ (random integer 1-20, inclusive) + "@k12.ipsd.org" --> all lower case letters
	//			    Example:  John Riddle returns "johnrid18@k12.ipsd.org"
	public static String email(String firstName, String lastName)
	{
		int x = (int) (Math.random()*20 +1);
		String result = (firstName) + lastName.substring(0,3) + x + "@k12.ipsd.org";
		return result;
		
		
	}
	
	//precondition: text.length() > 0
	//postcondition: returns a new word with the first letter and last letters of text switched
	//example: rearranger(John) returns Nohj (use the proper method inside the rearranger method)
	public static String rearranger(String text)
	{
		String firstCharacter = text.substring(0,1);
		String middlePortion = text.substring(1,text.length()-1);
		String lastCharacter = text.substring (text.length()-1, text.length());
		String result = lastCharacter + middlePortion + firstCharacter;
		return result;
		
	}		
	
	//precondition: text.length() >=3 and has exactly two spaces somewhere between the first and the last letter, and the spaces are not next to each other
	//postcondition: returns a new string that has removed both spaces.
	//example: eliminateTwoSpaces("Tom Marvelo Riddle") returns "TomMarveloRiddle"
	
	public static String eliminateTwoSpaces(String text)  //for extra credit
	{
		String result;
		
		if (text.length() >=3) {
           result = text.replaceAll(" ", "");
		}
		else {
			result = text;
		}
		
          return result;
	}
	
	
	
	
	
	//Use the main method to test your methods you created.  
	//Since you made all of the methods static, you can call them inside the same class!  
	public static void main(String[] args) 
	{
		//Syntax for reading user input using a JOptionPane Window
		String firstName = JOptionPane.showInputDialog("Enter your first name");
		String lastName = JOptionPane.showInputDialog("Enter your last name");
		
		//Syntax for displaying a message using JOptionPane
		JOptionPane.showMessageDialog(null, "Name      : " + proper(firstName) + " " + proper(lastName));
		JOptionPane.showMessageDialog(null, "Email     : " + email(firstName, lastName));
		JOptionPane.showMessageDialog(null, "Rearrange : " + rearranger(lastName));
		JOptionPane.showMessageDialog(null, "Eliminate Spaces : " + eliminateTwoSpaces(firstName));

		JOptionPane.showMessageDialog(null, "Name      : " + proper(firstName) + " " + proper(lastName) +
		                                    "\nEmail     : " + email(firstName, lastName) +
		                                    "\nRearrange : " + rearranger(lastName) +
		                                    "\nEliminate Spaces : " + eliminateTwoSpaces(firstName));             
		
		/*After entering in your full name print out the following:
		 * Proper first and last name together in one Pane
		 * Generated Email address in a new Pane
		 * Last name rearranged in last Pane
		 * 
		 * Please make the program visually appealing
		 */		
	}
}



