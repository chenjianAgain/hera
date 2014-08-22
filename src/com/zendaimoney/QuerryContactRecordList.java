package com.zendaimoney;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zendaimoney.util.StringUtil;

public class QuerryContactRecordList extends HttpServlet {


	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String outPrint = "";
		InputStream is = this.getClass().getResourceAsStream("querryContactRecordList.txt");
		try {
			outPrint = StringUtil.InputStreamToString(is, "utf8");
			outPrint = outPrint.trim();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		outPrint = "{\"status\":\"0\",\"respDesc\":\"success\",\"id\":\"20109601\"}";
//		outPrint = "{\"id\":\"20109601\",\"status\":\"0\",\"respDesc\":\"success\"}";

		System.out.println(outPrint);
		response.setContentType("UTF-8");

		response.setContentType("text/json");
		PrintWriter out = response.getWriter();
		
		out.println(outPrint);
		out.flush();
		out.close();
	}

	
	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
