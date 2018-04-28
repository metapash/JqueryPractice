package com.cts.jsons;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONObject;

public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public RegisterServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String custName = request.getParameter("name");
		String custEmail = request.getParameter("email");
		String custMobileno = request.getParameter("mobileno");
		
		
		PrintWriter out=response.getWriter();
		
		  JSONObject json = new JSONObject();

		   try {
			   		json.put("cname",custName);
			   		json.put("cemail",custEmail);
			   		json.put("cmobileno",custMobileno);
		   
		  } catch (Exception e) {
			  e.printStackTrace();
		  }
		  
		  System.out.println("from json.."+json.get("cname"));
		  
		  
		  out.print(json);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		
		
			
	}

}
