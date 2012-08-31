package com.mc.dao;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * ���ݿ�������
 * @author Shine_MuShi
 *
 */
public class DBConn {
	/**
	 * ����Mysql���ݿ�����
	 * @return
	 */
	public Connection getMySQLConnection(){
		Connection conn=null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			 conn = java.sql.DriverManager.getConnection(
					    "jdbc:mysql://localhost/qqzone?useUnicode=true&characterEncoding=utf-8", "root", "root");
		}catch(Exception e){
			e.printStackTrace();
		}
		return conn;
	}
	/**
	 * �ر����ݿ�����
	 */
	public void close(Connection conn){
		try {
			if(conn!=null){
				conn.close();
				conn=null;
			}
		} catch (SQLException e) {			
			e.printStackTrace();
		}
	}
}
