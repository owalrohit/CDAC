package com.cdac.pages;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cdac.dao.UserDaoImpl;
import com.cdac.pojos.User;

import static com.cdac.utils.DBUtils.*;

import com.cdac.dao.UserDao;


/**
 * Servlet implementation class ValidationServlet
 */
@WebServlet(urlPatterns = "/login")
public class VoterRegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private UserDao userDao;  
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VoterRegistrationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
    
    // rule regarding method overriding and Exeption handling
    //Overriding form of the method , cannopt add any new or broader checked exception
    //overriding form of the init() - inherited from GenericServlet 
	public void init(ServletConfig config) throws ServletException {
		try {
			System.out.println("In init");
			// open connection
			openConnection();
			//create Dao instance
			userDao = new UserDaoImpl();
		}catch(Exception e) {
			// rethrow the exception to the called - WC - so that WC will mark the servlet unavailable for further servicing
			// constructor of ServletException(String msg, Throwable rootc\Cause)
			throw new ServletException("error in init" + getClass(), e );
		}
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		try {
			System.out.println("In Destroy");
			// Dao's cleanup + close the connection
			userDao.cleanUp();
			closeConnection();
		}catch(Exception e) {
			throw new RuntimeException("Error in destroy" + getClass(), e);
		}
	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		// set cont type
				response.setContentType("text/html");
				//get PW
				try(PrintWriter pw = response.getWriter()){
					//read request parameters
					String email = request.getParameter("em");
					String pwd = request.getParameter("pass");
					// invoke dao's method for authentication
					User user = userDao.signin(email, pwd);
					if(user == null) {
						//invalid - send error message with retry link
						pw.print("<h5>Invalid Login <a href='login.html'>Retry</a></h5>");
					}
					else {
						// authentication successful - continue to role-based authorization
						// to redirect client to the next page => 
						// API of HttpServletResponse
						// public void sendRedirect(String location) throws IOException
						// location can be relative to the current web page
							
						// incase of successful auth, store user details in a Cookie
						// API of javax.servlet.http.Cookie(String CookieName, String cookieV)
						Cookie c1 = new Cookie("user details", user.toString());
						
						// Add Cookies to in the response header 
						response.addCookie(c1);
						// this method can be called to set multiple cookies
						
						
						if(user.getUserRole().equals("admin")) {
							// admin login - redirect client to admin page
							response.sendRedirect("admin_page");
						}else {
							// Voter login - 
							if(user.isStatus()) {
								// already voted voter - redirect to logout page
								response.sendRedirect("logout");						
							}else {
								// not yet voted voter - redirect the client to candidate list page
								response.sendRedirect("candidate_list");
							}
						}
						
					}
				}catch(Exception e) {			
					// rethrow the exception to the called - WC - so that WC will mark the servlet unavailable for further servicing
					throw new ServletException("Error in do of"+ getClass(), e);
					
				}

	}

}
