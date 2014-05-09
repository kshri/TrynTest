/**
 * 
 */
package com.trial;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @author skulkarni
 *
 */
public class JdbcConnection {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String queryGetNext = "SELECT l.ow_intvalue + 1 nextfree FROM owbusdb.pool_allocation l LEFT OUTER JOIN owbusdb.pool_allocation r " +
				"ON l.ow_intvalue + 1 = r.ow_intvalue WHERE l.ow_pooloid = ? " +
				"	and r.ow_intvalue IS null ORDER BY nextfree LIMIT 1;";
		Connection conn = null;
		PreparedStatement preparedStatement = null;
    Properties connectionProps = new Properties();
    connectionProps.put("user", "root");
    connectionProps.put("password", "root");
    try 
		{
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/owbusdb", connectionProps);
			preparedStatement = conn.prepareStatement(queryGetNext);
			preparedStatement.setString(1, "com.dorado.redcell.pool.Pool::N9lSqhCOjEk3G03");
			ResultSet rs = preparedStatement.executeQuery();
			System.out.println(" Result = " + rs.getInt(0));
		}
		catch(SQLException  e)
		{
			//return -1;
			e.printStackTrace();
		}
		
	}

}
