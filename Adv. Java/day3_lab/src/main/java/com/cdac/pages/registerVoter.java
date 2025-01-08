package com.cdac.pages;

import static com.cdac.utils.DBUtils.closeConnection;
import static com.cdac.utils.DBUtils.openConnection;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cdac.dao.UserDao;
import com.cdac.dao.UserDaoImpl;
import com.cdac.pojos.User;

/**
 * Servlet implementation class registerVoter
 */
@WebServlet("/voter_register")
public class registerVoter extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserDao userDao;

	@Override
	public void init() throws ServletException {
		try {
			System.out.println("in init");
			// open connection
			openConnection();
			// create dao instance
			userDao = new UserDaoImpl();
		} catch (Exception e) {
			// re throw the exception to the caller -
			// WC - so that WC will mark this servlet
			// un available for further servicing (i.e it won't continue with the
			// remaining life cycle
			// Ctor of ServletException(String mesg,Throwable rootCause)
			throw new ServletException("err in init of " + getClass(), e);
		}

	}

	@Override
	public void destroy() {
		try {
			System.out.println("in destroy");
			// dao's cleanup + close cn
			userDao.cleanUp();
			closeConnection();
		} catch (Exception e) {
			throw new RuntimeException("err in destroy " + getClass(), e);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");

		try (PrintWriter pw = response.getWriter()) {

			String firstname = request.getParameter("fn");
			String lastname = request.getParameter("ln");
			String email = request.getParameter("em");
			String password = request.getParameter("pass");
			String dobString = request.getParameter("dob");

			java.sql.Date dob = null;
			try {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                Date parsedDate = sdf.parse(dobString);
                dob = new java.sql.Date(parsedDate.getTime());
            } catch (ParseException e) {
                pw.println("<h3 style='color:red;'>Invalid Date of Birth format!</h3>");
                return;
            }
			
			if (firstname == null || firstname.isEmpty() ||
	                lastname == null || lastname.isEmpty() ||
	                email == null || email.isEmpty() ||
	                password == null || password.isEmpty() ||
	                dob == null) {
	                pw.println("<h3 style='color:red;'>All fields are mandatory!</h3>");
	                return;
	            }
			
			
//			 String passwordRegex = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{4,8}$";
//	            Pattern passwordPattern = Pattern.compile(passwordRegex);
//	            Matcher passwordMatcher = passwordPattern.matcher(password);
//
//	            if (!passwordMatcher.matches()) {
//	                pw.println("<h3 style='color:red;'>Invalid password format! Password must be at least 4 characters, no more than 8 characters, and must include at least one upper case letter, one lower case letter, and one numeric digit.</h3>");
//	                return;
//	            }
//			
			
			
			
			User voter= new User(firstname,lastname,email,password,dob);
			String result=userDao.registerVoter(voter);
			
			if(result == null || result.equals("Failed"))
			{
				//=> invalid login->, send err mesg with a retry link to the clnt
				pw.print("<h5> Regisration failed , "
						+ "Please <a href='voter_register.html'>Retry</a></h5>");						
			}
			
			if (result.equals("Error_Age")) {
				
				pw.print("<h3> you are not eligible for voting</h3>");
			}
			
			if(result.equals("Success")) {
				pw.print("<h5> Regisration Sucessful you can login Now , "
						+ "login-> <a href='login.html'>Click here</a></h5>");
			}		
			

		} catch (Exception e) {
			// TODO: handle exception
			throw new ServletException("err in doXXX of " + getClass(), e);
		}
	}

}
