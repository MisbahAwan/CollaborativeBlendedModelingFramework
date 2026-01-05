package webdsl.epackage.pkgdsl.web;

import java.util.Date;

public class User {
	
	  private String login;
	  private String password;
	  private String runtimeInstance;
	  private String tempruntimeInstance;
	  private String merger;
	  private Date createdon;
	 
	 
	  public String getLogin() {
	    return login;
	  }
	  public void setLogin(String login) {
	    this.login = login;
	  }
	  public String getRuntimeInstance() {
	    return runtimeInstance;
	  }
	  public void setRuntimeInstance(String runtimeInstance) {
	    this.runtimeInstance = runtimeInstance;
	  }
	  
	  public String getTempRuntimeInstance() {
		    return tempruntimeInstance;
		  }
		  public void setTempRuntimeInstance(String tempruntimeInstance) {
		    this.tempruntimeInstance = tempruntimeInstance;
		  }
	  
	  public String getMerger() {
		    return merger;
		  }
		  public void setMerger(String merger) {
		    this.merger = merger;
		  }
	  
	  public String getPassword() {
		    return password;
		  }
		  public void setPassword(String password) {
		    this.password = password;
		  }
		  
		  public Date getCreatedOn() {
			    return createdon;
			  }
			  public void setCreatedOn(Date createdon) {
			    this.createdon = createdon;
			  }	  

}
