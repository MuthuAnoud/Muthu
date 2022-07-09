package role;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.cj.Session;

import dBConnect.DBConnect;
import dataPack.UserDIO;

public class LoginAction extends ServiceAction{
	
	public LoginAction() {
		
	}
	
	private UserDIO user;
	
	private DBConnect con;

	public UserDIO getUser() {
		return user;
	}

	public void setUser(UserDIO user) {
		this.user = user;
	}

	public DBConnect getCon() {
		return con;
	}

	public void setCon(DBConnect con) {
		this.con = con;
	}

	@Override
	public String executeService(HttpServletRequest request, HttpServletResponse response) {
		
		user=new UserDIO();
		
		con=new DBConnect();
		
		user.setCname(request.getParameter("cname"));
		
		user.setCpass(request.getParameter("cpass"));
		
		boolean a=con.checkUser(user.getCname(), user.getCpass());
		
		if(a) {
			
			boolean b=con.checkFlag(user.getCname());
			
			if(b) {
				
				con.updateFlag(user.getCname(), 1);
				
				request.getSession().setAttribute("cname", user.getCname());
				
				return "Welcome-Page";
				
			}else {
				
				return "Already-Login";
				
			}
			
		}else {
		
		return "Invalid-User";
		
		}
		
	}


}
