/**
 * 
 */
package com.trial;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author skulkarni
 *
 */
public class RegEx {
	
	private static final String REGEX = "\\b\\s\\d{0,3}\\s\\b";	//"xconnect\\s.*\\s\\d{0,3}\\sencapsulation\\smpls";
  private static final String INPUT = "interface GigabitEthernet1/1/0.900 description client5 encapsulation dot1Q 900 xconnect 41.249.240.74 900 encapsulation mpls end";
	
	public static void main(String args[])
	{
		Pattern p = Pattern.compile(REGEX);
    //  get a matcher object
    Matcher m = p.matcher(INPUT);
    int count = 0;
    while(m.find()) {
        count++;
        System.out.println("Match number "
                           + count);
        System.out.println("start(): "
                           + m.start());
        System.out.println("end(): "
                           + m.end());
        System.out.print(m.group() + " ");
   }
		
	}
	

}
