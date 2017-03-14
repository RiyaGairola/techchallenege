package com.DAO;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import beans.MyPojo;
import ravi.util.DBConnectionManager;

public class DAODelSubcription {
	public void deleteDao(MyPojo bean) throws Exception{
	Connection con =(Connection)DBConnectionManager.getConnection();
	
	PreparedStatement pst= null ;
	pst=(PreparedStatement)con.prepareStatement("DELETE * FROM Creator where uuid=?");
		
	pst.setString(1,bean.getCreator().getUuid());
	pst.executeUpdate();
}
		
}
