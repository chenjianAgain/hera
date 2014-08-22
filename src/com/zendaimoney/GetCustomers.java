package com.zendaimoney;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zendaimoney.util.StringUtil;

public class GetCustomers extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String outPrint = "";
		InputStream is = this.getClass()
				.getResourceAsStream("GetCustomers.txt");
		try {
			outPrint = StringUtil.InputStreamToString(is, "utf-8");
			outPrint = outPrint.trim();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		response.setContentType("UTF-8");
		response.setContentType("text/json");
		PrintWriter out = response.getWriter();

		out.println(outPrint);
		out.flush();
		out.close();
	}


}
