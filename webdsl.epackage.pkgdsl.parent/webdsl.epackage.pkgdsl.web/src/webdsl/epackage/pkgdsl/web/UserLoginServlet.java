
package webdsl.epackage.pkgdsl.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.eclipse.xtext.web.servlet.XtextServlet;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

//import com.javawebapp.utility.ServletUtility;
/**
 * Servlet implementation class LoginUser Servlet
 */
@WebServlet(name= "UserLoginServlet", urlPatterns = {"/loginservlet/*"})

public class UserLoginServlet extends XtextServlet {
	  private static final long serialVersionUID = 1L;
	  private Gson gson = new Gson();
	    /**
	     * @see HttpServlet#HttpServlet()
	     */
	    public UserLoginServlet() {
	        super();
	        // TODO Auto-generated constructor stub
	    }
	  /**
	   * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	   */
	  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    // TODO Auto-generated method stub
	   // ServletUtility.forward("jsp/login.jsp", request, response);
		 
		   System.out.println("Inside Do Get ");
		   User u = new User();
		   
		   
	       String user=request.getParameter("user");
	       String merger=request.getParameter("merger");
	       System.out.println("User: "+user);
	       
	       if (merger.equals("merger"))
	       {
	    	   String mergerinstance=request.getParameter("mergerinstance");
	    	   //System.out.println("mergerinstanceJSP: "+mergerinstance);
	    	// adding \\n new lines in the DSL fetched from jsp text area
	    	   mergerinstance=makeFinalInstance(mergerinstance);
		       u=UserLoginDAO.Merge(mergerinstance, user);
	    	  System.out.println("INSTANCE: "+u.getMerger());

		       u.setMerger(makeFinalInstance(u.getMerger()));
		       //if (u.getLogin().equals("admin"))
			    	// adding \\n new lines in the DSL fetched from admin merger dsl from all users
			   u.setRuntimeInstance(makeFinalInstance(u.getRuntimeInstance()));
		      System.out.println("final merger: "+u.getMerger());
		       //System.out.println("final runtime: "+u.getRuntimeInstance());
		       HttpSession session= request.getSession();
	           session.setAttribute("name", u.getLogin());
	           session.setAttribute("runtimeInstance", u.getRuntimeInstance());
	           session.setAttribute("merger", u.getMerger());
	           //session.setAttribute("response", u);
	           
	           /*String userJsonString = this.gson.toJson(u);
	           PrintWriter out = response.getWriter();
	           response.setContentType("application/json");
	           response.setCharacterEncoding("UTF-8");
	           System.out.println("userJsonString:*********************************************************************************** "+userJsonString);
	           out.print(userJsonString);
	           out.flush(); */
	           
	           ServletUtility.redirect("home.jsp", request, response);
	       }
	       
	       else if(merger.equals("nomerger"))
	       {
	    	   	   String instance=request.getParameter("instance");
	    	   	   String instanceType=request.getParameter("instanceType");
	    	       // adding \\n new lines in the DSL fetched from jsp text area
			       instance=makeFinalInstance(instance);
			       
			       System.out.println("instance: "+instance);
			       System.out.println("user: "+user);
			       //if(instanceType.equals("permanent"))
			    	 //  u=UserLogin.saveRunTimeInstance(instance, user);
			       //else if(instanceType.equals("temporary"))
			    	   u=UserLoginDAO.saveRunTimeInstance(instance, user, instanceType);
			       
			       //if (u.getLogin().equals("admin"))
			    	// adding \\n new lines in the DSL fetched from admin merger dsl from all users
			    	   u.setRuntimeInstance(makeFinalInstance(u.getRuntimeInstance()));
		
			       System.out.println("u: "+u.getLogin());
			       System.out.println("inst: "+u.getRuntimeInstance());
			       
			       HttpSession session= request.getSession();
		           session.setAttribute("name", u.getLogin());
		           session.setAttribute("runtimeInstance", u.getRuntimeInstance());
		           
		           String userJsonString = this.gson.toJson(u);
		           PrintWriter out = response.getWriter();
		           response.setContentType("application/json");
		           response.setCharacterEncoding("UTF-8");
		           System.out.println("userJsonString:*********************************************************************************** "+userJsonString);
		           out.print(userJsonString);
		           out.flush(); 
		           
		           //if(instanceType.equals("permanent"))
		           //ServletUtility.redirect("home.jsp", request, response);
	       }
	       else // executed when log is called
	       {
	    	   List<User> rs= UserLoginDAO.getLog(user);
	    	  // PrintWriter out = response.getWriter();
	    	   String tableRows="";
	    	   for (int i = 0; i < rs.size(); i++)	           
				tableRows=tableRows+"<tr><td>"+rs.get(i).getRuntimeInstance()+"</td><td>"+rs.get(i).getLogin()+"</td><td>"+rs.get(i).getCreatedOn()+"</td></tr>";

	    	   HttpSession session= request.getSession();
	           session.setAttribute("name", u.getLogin());
	           session.setAttribute("runtimeInstance", u.getRuntimeInstance());
	           session.setAttribute("tableRows", tableRows);
	           
	           
	           //session.setAttribute("response", rs);
	           
		         String userJsonString = this.gson.toJson(rs);
		           PrintWriter out = response.getWriter();
		           response.setContentType("application/json");
		           response.setCharacterEncoding("UTF-8");
		           System.out.println("userJsonString:*********************************************************************************** "+userJsonString);
		           out.print(userJsonString);
		           out.flush(); 
		           
		         //  ServletUtility.redirect("Log.jsp", request, response);
	            
	       }

	  }
	  /**
	   * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	   */
	  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    // TODO Auto-generated method stub
        //  ServletUtility.setSuccessMessage(" I AM IN POST", request);

	       User user = new User();
	       String login=request.getParameter("login");
	       String pwd=request.getParameter("password");
	       
	       user = UserLoginDAO.Login(login,pwd);
	       
	    // adding \\n new lines in the DSL fetched from database for jsp text area
	       user.setRuntimeInstance(user.getRuntimeInstance().replaceAll("(?m)^[ \t]*\r?\n", ""));
	       user.setTempRuntimeInstance(user.getTempRuntimeInstance().replaceAll("(?m)^[ \t]*\r?\n", ""));
	       
	       user.setRuntimeInstance(makeFinalInstance(user.getRuntimeInstance()));
	       user.setTempRuntimeInstance(makeFinalInstance(user.getTempRuntimeInstance()));
	       
	       
	       PrintWriter out=response.getWriter();
	       if(user != null) {
	    	   System.out.println("TEMP runtimeInstance: "+user.getTempRuntimeInstance());
	    	   //System.out.println("runtimeInstance: "+user.getRuntimeInstance());
	           ServletUtility.setSuccessMessage(request.getParameter("login")+ " is login successfully", request);
	           request.setAttribute("runtimeInstance", user.getRuntimeInstance());
	           request.setAttribute("TempRuntimeInstance", user.getTempRuntimeInstance());
	           
	           HttpSession session= request.getSession();
	           session.setAttribute("name", login);
	           session.setAttribute("runtimeInstance", user.getRuntimeInstance());
	           session.setAttribute("TempRuntimeInstance", user.getTempRuntimeInstance());
	           
	           ServletUtility.redirect("home.jsp", request, response);

	       }else {
	    	   System.out.println("Invalid User");
	           ServletUtility.setErrorMessage("Invalid User", request);
	           //ServletUtility.forward("jsp/login.jsp", request, response);
	           out.print("Sorry, username or password error!");  
	           ServletUtility.forward("Login.html", request, response);

	       }
	  }
	  
	  public String makeFinalInstance(String instance)
	  {
		   boolean flag=true;
	       String finalInstance="";
	       String substr="";
	       //instance=u.getRuntimeInstance();
	       while (flag)
	       {
	       //System.out.println("index: "+instance.indexOf('\n'));
	       
		       if (instance.indexOf('\n')<1)
		       {
			       finalInstance = finalInstance+instance;
		    	   flag=false;
		       }
		       else
		       {
		    	   //System.out.println("substring: "+instance.substring(0, instance.indexOf('\n')));
		    	   substr=instance.substring(0, instance.indexOf('\n'));
		    	   //if (substr.substring(substr.length()-1,substr.length()).equals(""))
		    		   substr=substr.replace("\n", "").replace("\r", "");
		    		   
		    	   //System.out.println("substr: "+substr);
		    	   //if (substr.substring(substr.length()))
		    	   finalInstance=finalInstance+substr+"\\n";
			       //System.out.println("finalInstance: "+finalInstance);
			       instance=instance.substring(instance.indexOf('\n')+1);
			      // System.out.println("instance: "+instance);
			       /*finalInstance=finalInstance+instance.substring(0, instance.indexOf('\n')-1)+"\\n";
			       System.out.println("finalInstance: "+finalInstance);
			       instance=instance.substring(instance.indexOf('\n')+1);
			       System.out.println("instance: "+instance);*/
		       }
	       }
	       return finalInstance;
	      
	  }
	}