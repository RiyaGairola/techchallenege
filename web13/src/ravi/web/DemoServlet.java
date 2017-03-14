package ravi.web;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.map.ObjectMapper;

import com.DAO.DAOCreateSubcription;

import beans.MyPojo;
import oauth.signpost.OAuthConsumer;
import oauth.signpost.basic.DefaultOAuthConsumer;
import ravi.model.ResponseSuccess;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 * Servlet implementation class DemoServlet
 */
@WebServlet("/DemoServlet")
public class DemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//ResponseSuccess rs = new ResponseSuccess(false,"asdf");
	//rs.setSuccess(false);
	//rs.setAccountIdentifier("abcd");
		
		
		response.setContentType("application/json");

		PrintWriter out=response.getWriter();
		
		String eventUrl=(String)request.getParameter("eventUrl");
		System.out.println("sbvsdbvkshdv");
		System.out.println(eventUrl);

		
		ObjectMapper mapper=new ObjectMapper();
		
		ResponseSuccess responseObject = new ResponseSuccess(true,"new-account-modifier");
		
		
		
	
	OAuthConsumer consumer = new DefaultOAuthConsumer("switchapp-152818", "EI2bmo3eZK9UbiRY");
	try{
		System.out.println(eventUrl);
	URL url = new URL(eventUrl);
	HttpURLConnection req = (HttpURLConnection) url.openConnection();
	req.setRequestProperty("Accept","application/json");
	try{
		consumer.sign(req);
	 }
	catch(Exception e){
		e.printStackTrace();
	}
	req.connect();
	
		BufferedReader f = new BufferedReader(new InputStreamReader(req.getInputStream()));
		String last="";
		String str="";
		while((last=f.readLine())!=null){
			str=str+last;
		}
			System.out.println(str);
			ObjectMapper  objmapp = new ObjectMapper();
			MyPojo  mp =  objmapp.readValue(str,MyPojo.class);
			DAOCreateSubcription cd = new DAOCreateSubcription();
			cd.UserInsert(mp);
			String json=mapper.writeValueAsString(responseObject);
			
			out.println(json);
			
	}
	catch(Exception e){
		e.printStackTrace();
		e.getMessage();
	}
  }
	}