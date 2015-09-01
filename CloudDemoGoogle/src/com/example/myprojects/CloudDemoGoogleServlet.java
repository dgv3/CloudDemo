package com.example.myprojects;

import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class CloudDemoGoogleServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/plain");
		for (int i = 1; i < 10; i++) {
			resp.getWriter().println("Hello, world");
		}
	}
}
