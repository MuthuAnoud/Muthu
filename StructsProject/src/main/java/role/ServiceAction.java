package role;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public abstract class ServiceAction {
  
	public abstract String executeService(HttpServletRequest request, HttpServletResponse response);

}
