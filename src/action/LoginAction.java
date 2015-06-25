package action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{

	private static final long serialVersionUID = 1L;
	
	private String userName;
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	private String password;
	private String msg;
	
	@Override
	public String execute() throws Exception {
		if ("test".equals(userName) && "test".equals(password)) {
			setMsg("µÇÂ½³É¹¦£¬»¶Ó­"+userName);
			return Action.SUCCESS;
		}else {
			setMsg("µÇÂ¼Ê§°Ü£¡");
			return Action.ERROR;
		}
	}

}
