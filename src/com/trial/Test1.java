/**
 * 
 */
package com.trial;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;

/**
 * @author skulkarni
 *
 */
public class Test1 implements Rideable{
	int weight = 2;
	/**
	 * @param args
	 */
	Test1()
	{
		System.out.println("c");
	}
	{ 
		System.out.print("y "); 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Test1().go();
		ArrayList p = new ArrayList();
		List q = (ArrayList) p.clone();
		p.add(7);
		p.add(2);
		p.add(5);
		p.add(2);
		//p.sort();
		for (Object object : p) {
			System.out.println("Success");
		}
		System.out.println("Q list size = " + q.size());
		
				
		Collections.sort(p);
		System.out.println(p);
		
		////
		String ipAddress = "27.146.221.178";
		System.out.println("IP = " + ipAddress + " Long =" + convertIPAddressToNumber(ipAddress));
		if((2 & 3) != 0)
		System.out.println(2 & 3);
		//convert null object to string n arraylist
		Object svalue = null;
		String mvalue = (String) svalue;
		List llist = new ArrayList((List) svalue);
		System.out.println(svalue);
	}
	
	void go() 
	{ 
		System.out.print("g "); 
		weight++;
	} 
	static { 
		System.out.print("x "); 
		}

	public String ride()
	{
		return "mph";
	}
	
	public static long convertIPAddressToNumber(String pIP)
  {
    long _result = 0;

    try
    {
      StringTokenizer _ipTokenizer = new StringTokenizer(pIP, ".");
      _result += (Long.valueOf(_ipTokenizer.nextToken()).longValue() << 24);
      _result += (Long.valueOf(_ipTokenizer.nextToken()).longValue() << 16);
      _result += (Long.valueOf(_ipTokenizer.nextToken()).longValue() << 8);
      _result += (Long.valueOf(_ipTokenizer.nextToken()).longValue());
    }
    catch (Exception _e)
    {
      _result = 0;
    }

    return _result;
  }
}
