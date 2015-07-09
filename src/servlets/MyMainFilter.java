package servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;

import web.service.ModelService;
import web.servlets.MainFilter;

@WebServlet("/*")
public class MyMainFilter extends MainFilter {

	@Override
	public void init() throws ServletException {
		super.init();
		registerService(new ModelService("gns-web-test"));
	}
}
