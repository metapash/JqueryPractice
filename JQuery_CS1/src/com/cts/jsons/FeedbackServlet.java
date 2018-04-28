package com.cts.jsons;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class FeedbackServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public FeedbackServlet() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		FileWriter file =null;
		String custEmail = request.getParameter("emailid");
		String custMessage = request.getParameter("message");
		
		
		
		PrintWriter out=response.getWriter();
		
		 

	        try {
	        	file = new FileWriter("C:\\Users\\337003\\JQuery\\JQuery_CS1\\feedback.txt",true);
	           
	        } catch (IOException e) {
	            e.printStackTrace();
	 
	        } finally {
	            file.flush();
	            file.close();
	        }
		  
		 
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
