package com.DAO;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import beans.MyPojo;
import ravi.util.DBConnectionManager;

public class DAOCreateSubcription {
	public void UserInsert(MyPojo obj_user) throws Exception{
		try{
			Connection con =(Connection)DBConnectionManager.getConnection();
			
			PreparedStatement pst=(PreparedStatement) con.prepareStatement("insert into  Creator(uuid,firstName,lastName,email)values(?,?,?,?)");
			pst.setString(1, obj_user.getCreator().getUuid());
			pst.setString(2, obj_user.getCreator().getFirstName());
			pst.setString(3, obj_user.getCreator().getLastName());
			pst.setString(4, obj_user.getCreator().getEmail());
			//pst.setString(5, obj_user.getCreator().getAddress());
			System.out.println("111111");
			pst.executeUpdate();
			System.out.println(pst);
			System.out.println("222222");
			
					PreparedStatement pst1=(PreparedStatement) con.prepareStatement("insert into MarketPlace(baseUrl,partner) values(?,?)");
					pst1.setString(1, obj_user.getMarketplace().getBaseUrl());
					pst1.setString(2, obj_user.getMarketplace().getPartner());
					System.out.println("3333333");
					pst1.executeUpdate();
					System.out.println(pst1);
					System.out.println("44444444");
	      
					
		}
		catch(Exception e){
			
			e.printStackTrace();
		}
	}
}
