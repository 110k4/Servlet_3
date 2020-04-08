package com.iu.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
	
	public static void main(String[] args) {
		try {
			Connection con = DBConnect.getConnect();
			System.out.println(con);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getConnect() throws Exception {
		//1. 로그인 정보 4가지
		String user = "user02";
		String password = "user02";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String driver = "oracle.jdbc.driver.OracleDriver";
		
		//2. 드라이버를 메모리에 로딩
		Class.forName(driver);
		
		//3. 로그인 Connection 객체 반환
		
		Connection con = DriverManager.getConnection(url, user, password);
		
		return con;
		
	}

}