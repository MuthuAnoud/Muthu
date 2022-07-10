package role;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dBConnect.DBConnect;
import dataPack.UserDIO;

public class RegisterAction extends ServiceAction {	
		
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
			
			boolean a=con.RegisterUser(user);
			
			if(a) {
					
					return "Logout-Success";
					
				}
				
			else {
			
			return "Logout-Fail";
			
			}
		
	}

}
