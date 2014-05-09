/**
 * 
 */
package com.trial;

import java.util.Locale;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;

/**
 * @author skulkarni
 *
 */
public class International {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale hindiLocale = new Locale("hi","IN");
		ResourceBundle messages = ResourceBundle.getBundle("Locale", hindiLocale);
		
		System.out.println(messages.getString("greetings"));
		JOptionPane.showMessageDialog(null,messages.getString("greetings"));
	}

}
