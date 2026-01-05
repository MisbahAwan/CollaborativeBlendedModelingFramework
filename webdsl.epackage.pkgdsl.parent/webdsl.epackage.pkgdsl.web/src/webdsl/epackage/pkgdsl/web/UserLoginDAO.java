package webdsl.epackage.pkgdsl.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//import com.javawebapp.beans.UserBeans;
//import com.javawebapp.utility.JDBCDataSource;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

public class UserLoginDAO {
	
	 public static User  Login(String login,String password) {
		 
		 Connection con = getConnection();
		 User user = null;
		    
		 PreparedStatement stmt;
		try {
			stmt = con.prepareStatement("Select * from userlogin where username=? and password = ?");
		
		      
		      stmt.setString(1,login);
		      stmt.setString(2,password);
		      System.out.println("stmt: "+stmt);
		      ResultSet rs = stmt.executeQuery();
		      if(rs.next()) {
		        user = new User();
		        System.out.println("Inside rs loop");
		        user.setLogin(rs.getString("username"));
		        user.setPassword(rs.getString("password"));
		        user.setRuntimeInstance(rs.getString("RuntimeInstance"));
		        user.setTempRuntimeInstance(rs.getString("TempRuntimeInstance"));
		      } 
		      
		      con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		    return user;
		  }
//===============================================================================================================
public static List<User>  getLog(String user)
{
		 
		 Connection con = getConnection();
		 ResultSet rs=null;
		 //User user = null;
		 List<User> result = new ArrayList<User>();
		 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		    
		 PreparedStatement stmt;
		try {
			  stmt = con.prepareStatement("Select * from runtime_instance_log");// where username='"+user+"'");
		      System.out.println("stmt: "+stmt);
		      rs = stmt.executeQuery();
		     
					while (rs.next()) {
						System.out.println("user: "+rs.getString("username"));
						 User u = new User();
				          u.setRuntimeInstance(makeFinalInstance(rs.getString("runtime_instance"))); // u.setName(rs.getString("emp_name"));
				          u.setLogin(rs.getString("username"));
				          u.setCreatedOn(rs.getTimestamp("createdOn"));
				          result.add(u);

				          	}
				
		      //con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		    return result;
		  }
//===============================================================================================================	 
	 public static User  saveRunTimeInstance(String instance, String user, String instanceType) 
	 {
		 
		    Connection con = getConnection();
		    User u = new User();
		    String inst="";
		       
		    try {
		    	  
			      
			      if (user.equals("admin"))
			       {
			    	  //String query1 = "Select * from userlogin";
			    	  //System.out.println("select query: "+query1);
			    	  /*
			    	  PreparedStatement stmt1;
					  stmt1 = con.prepareStatement("Select RuntimeInstance from userlogin where username!='"+user+"'");		      
				      ResultSet rs = stmt1.executeQuery();
				      
				      while(rs.next()) 
				      {
				    	inst=rs.getString("RuntimeInstance")+"\\n "+inst;
				        System.out.println("Making inst after: "+inst);
				      }*/
			    	  if(instanceType.equals("permanent"))
			    	  {
				      instance=instance+"\n // THIS MERGER INSTANCE IS COMMMITTED AND APPROVED BY ADMIN.";
				      String query2 = "update userlogin set RuntimeInstance = '"+instance+"', LastUpdatedOn=now(),  LastUpdatedBy='"+user+"' where username='"+user+"'";
				      System.out.println("update query: "+query2);
				      PreparedStatement preparedStmt1 = con.prepareStatement(query2);
				      preparedStmt1.executeUpdate();
				      u.setRuntimeInstance(inst); 
				      
				    //Creating log of the previous runtime instance saved by the admin in runtime_instance_log table
			          String insertquery = " insert into runtime_instance_log (runtime_instance, username, createdOn)"+" values (?, ?, now())";
			          PreparedStatement preparedStmtinsert = con.prepareStatement(insertquery);
			          preparedStmtinsert.setString(1, instance);
			          preparedStmtinsert.setString(2, user);
			          System.out.println("insert log stmt: "+insertquery);
			          preparedStmtinsert.execute();
		    	   // LOG CREATION COMPLETED
			    	  }
			    	  else
			    	  {
			    		  String query = "update userlogin set TempRuntimeInstance = '"+instance+"', LastUpdatedOn=now(),  LastUpdatedBy='"+user+"'  where username='"+user+"'";
					      System.out.println("update TEMP stmt: "+query);
						  PreparedStatement preparedStmt = con.prepareStatement(query);
					      preparedStmt.executeUpdate();
					      u.setRuntimeInstance(instance);
			    	  }

			      }
			      else
			      {
			    	  if(instanceType.equals("permanent"))
			    	  {System.out.println("NOT ADMIN ... PERMANENT ");
				    	  String query = "update userlogin set RuntimeInstance = '"+instance+"', LastUpdatedOn=now(),  LastUpdatedBy='"+user+"'  where username='"+user+"'";
					      System.out.println("update stmt: "+query);
						  PreparedStatement preparedStmt = con.prepareStatement(query);
					      preparedStmt.executeUpdate();
					      u.setRuntimeInstance(instance);
					      
					    //Creating log of the previous runtime instance saved by the admin in runtime_instance_log table
				          String insertquery = " insert into runtime_instance_log (runtime_instance, username, createdOn)"+" values (?, ?, now())";
				          PreparedStatement preparedStmtinsert = con.prepareStatement(insertquery);
				          preparedStmtinsert.setString(1, instance);
				          preparedStmtinsert.setString(2, user);
				          System.out.println("insert log stmt: "+insertquery);
				          preparedStmtinsert.execute();
			    	   // LOG CREATION COMPLETED
				          
			    	  }
			    	  else if(instanceType.equals("temporary"))
			    	  {
				    	  String query = "update userlogin set TempRuntimeInstance = '"+instance+"', LastUpdatedOn=now(),  LastUpdatedBy='"+user+"'  where username='"+user+"'";
					      System.out.println("update TEMP stmt: "+query);
						  PreparedStatement preparedStmt = con.prepareStatement(query);
					      preparedStmt.executeUpdate();
					      u.setRuntimeInstance(instance);
			    	  }
			      }	
			  con.close();
		      } catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
    	    u.setLogin(user);
		    return u;
		    
		  }
		//===============================================================================================================
	 
	 private static Connection  getConnection() 
	 {
		 Connection con = null;
		    String url = "jdbc:mysql://localhost:3306/xtextdb";
		    String username = "root";
		    String dbpassword = "123456";

		    try {
				      try {
						Class.forName("com.mysql.jdbc.Driver");
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		      con = DriverManager.getConnection(url, username, dbpassword);
		      System.out.println("Connected!");
		      
		    }
		    catch (Exception e) {
			      // TODO Auto-generated catch block
			      e.printStackTrace();
			    }
		    return con;
	 }
		 //===============================================================================================================
	 
 public static User  Merge(String instance, String user) 
 {
	 Connection con = getConnection();
	 User u = new User();
	 String inst="", resultsetstring="";
	 System.out.println("IN SAVE AND MERGE");
	       
	    try {
			    	/*if (user.equals("admin"))
			    	{}
			    	else
				       {
				    	  String query = "update userlogin set RuntimeInstance = '"+instance+"', LastUpdatedOn=now() ,  LastUpdatedBy='"+user+"' where username='"+user+"'";
					      System.out.println("update user query: "+query);
					      PreparedStatement preparedStmt = con.prepareStatement(query);
					      preparedStmt.executeUpdate();
					      //u.setRuntimeInstance(inst);  
				       } *///not not saving current user instance on merger 
	    	      PreparedStatement stmtSuper;
	    	      stmtSuper = con.prepareStatement("Select RuntimeInstance, TempRuntimeInstance, LastUpdatedOn, LastUpdatedBy from userlogin where username='super'");  
	    	      ResultSet rsSuper = stmtSuper.executeQuery();
	    	      while(rsSuper.next()) 
	    	      {
				      inst=rsSuper.getString("RuntimeInstance");
				      //System.out.println("SUPER: "+inst);
				      resultsetstring="\\n //The above part is Updated by: "+rsSuper.getString("LastUpdatedBy")+" on " +rsSuper.getString("LastUpdatedOn")+"\\n ";
	    	      }

	    	      //***********************************************************************************************************8
	    	      //below two lines are for this particular case study. 
	    	      //We want to delete last two parathensis of ELEMENT and TOP-PACKAGE so that we can merge TIMING inside
	    	      StringBuilder sb = new StringBuilder(inst);
	    	      sb.deleteCharAt(sb.lastIndexOf("}"));
	    	      inst = sb.toString();
	    	      
	    	      sb = new StringBuilder(inst);
	    	      sb.deleteCharAt(sb.lastIndexOf("}"));
	    	      inst = sb.toString();
	    	      
	    	      inst=inst+resultsetstring;
	    	      //***********************************************************************************************************8
	    	      
	    	      PreparedStatement stmt1;
				  stmt1 = con.prepareStatement("Select RuntimeInstance, TempRuntimeInstance, LastUpdatedOn, LastUpdatedBy from userlogin where username!='admin' AND username!='super'");  
			      ResultSet rs = stmt1.executeQuery();
			      
			      while(rs.next()) 
			      {System.out.println("SUPER NOT: "+rs.getString("RuntimeInstance"));
			    	inst=inst+rs.getString("RuntimeInstance")+"\\n //The above part is Updated by: "+rs.getString("LastUpdatedBy")+" on " +rs.getString("LastUpdatedOn")+"\\n ";
			      }
			      inst=inst+"\\n //== THIS MERGER INSTANCE IS GENERATED BY: "+user+". Its is subject to ADMIN approval.==";
			      
			     /* String query2 = "update userlogin set RuntimeInstance = '"+inst+"', LastUpdatedOn=now(),  LastUpdatedBy='"+user+"' where username='admin'";
			      System.out.println("update admin query2: "+query2);
			      PreparedStatement preparedStmt2 = con.prepareStatement(query2);
			      preparedStmt2.executeUpdate(); */// now not saving merger in admin user
			      
			      inst=inst+"\\n	}\\n}"; // addding paranthesis after merging all instances
			      u.setRuntimeInstance(instance); 
			      u.setMerger(inst);
		     
		  con.close();
	      } catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    u.setLogin(user);
	    return u;
	 
		 }

//=======================================================================================================================
public static String makeFinalInstance(String instance)
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
	    	   System.out.println("substring: "+instance.substring(0, instance.indexOf('\n')));
	    	   substr=instance.substring(0, instance.indexOf('\n'));
	    		   substr=substr.replace("\n", "").replace("\r", "");
	    		   
	    	   System.out.println("substr: "+substr);
	    	   finalInstance=finalInstance+substr+"\\n";
		       System.out.println("finalInstance: "+finalInstance);
		       instance=instance.substring(instance.indexOf('\n')+1);
		       System.out.println("instance: "+instance);
		       
	       }
     }
     finalInstance=finalInstance.replace("\n", "").replace("\r", "");
     return finalInstance;
    
 }

} // CLASS END 