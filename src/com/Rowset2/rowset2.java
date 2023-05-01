package com.Rowset2;

import java.io.FileOutputStream;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Iterator;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;
import javax.sql.rowset.WebRowSet;

import com.properties.jdbcCon;

public class rowset2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			jdbcCon c=new jdbcCon();
			Connection con=c.con();
			System.out.println(con);
	
			CallableStatement cs=con.prepareCall("{call Vehicle(?,?,?)}");
			
			cs.setString(1, "Yamaha");
			cs.setString(2, "RX100");
			cs.setString(3, "2000");
			 
			boolean b=cs.execute();
			System.out.println("Data updated: "+b);
			
			
	/*		Class.forName("oracle.jdbc.driver.OracleDriver");
			RowSetFactory rf=RowSetProvider.newFactory();
			
			JdbcRowSet jrs=rf.createJdbcRowSet();
			
			jrs.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
			jrs.setUsername("system");
			jrs.setPassword("vine96");
			
			jrs.setCommand("select * from movie");
			
			jrs.execute();
			
			for(;jrs.next();)
			{
				System.out.println(jrs.getString("Cenima"));
				System.out.println(jrs.getString("Hero"));
				System.out.println(jrs.getString("Heroine"));
				System.out.println(jrs.getString("Director"));
			}
			
			RowSetFactory rf1=RowSetProvider.newFactory();
			
			WebRowSet wb=rf1.createWebRowSet();
			// adding ResultSet(jdbcRowSet) to webRowSet wb
			wb.populate(jrs);
			
			FileOutputStream fo=new FileOutputStream("movies.xml");
			
			wb.writeXml(fo);
			
		//	wb.close();
	*/		
	/*	jdbcCon c=new jdbcCon();
		Connection con=c.con();
		System.out.println(con);
		
		PreparedStatement pst=con.prepareStatement("select Cenima,Hero,Heroine,Director from movie", ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
		
		ResultSet rs=pst.executeQuery();
		
	//	Using CachedRowSetImpl
		
		RowSetFactory rsf=RowSetProvider.newFactory();
		
		
		
		CachedRowSet cs=rsf.createCachedRowSet();
		
		cs.populate(rs);
		
		con.close();
	
		for(;cs.next();)
		{
			System.out.println(cs.getString("Cenima"));
			System.out.println(cs.getString("Hero"));
			System.out.println(cs.getString("Heroine"));
			System.out.println(cs.getString("Director"));
		}
	*/	
		
		/*
		for(;rs.next();)
		{
			System.out.println(rs.getString("Cenima"));
			System.out.println(rs.getString("Hero"));
			System.out.println(rs.getString("Heroine"));
			System.out.println(rs.getString("Director"));
		}
		
		System.out.println("****************");
		for(;rs.previous();)
		{
			System.out.println(rs.getString("Cenima"));
			System.out.println(rs.getString("Hero"));
			System.out.println(rs.getString("Heroine"));
			System.out.println(rs.getString("Director"));
		}
		*/
		//	Updating operation
		
		
	/*	rs.absolute(5);
		rs.updateString(1, "RRR");
		rs.updateString(2, "NTR, RamCharan");
		rs.updateString(3, "Oliva, Alia");
		rs.updateString(4, "Rajamouili");
		rs.updateRow();
		System.out.println("rs is updated: "+ rs);
	*/
	/*	rs.absolute(6);
		rs.deleteRow();
	*/	
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}
