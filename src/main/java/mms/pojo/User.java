package mms.pojo;

public class User {

	private String uUsername;// 用户姓名 uUsername
	private String uPassword;// 用户密码 uPassword
	private String uAccess;	// 用户权限 uAccess

	public String getuUsername() {
		return uUsername;
	}

	public void setuUsername(String uUsername) {
		this.uUsername = uUsername;
	}

	public String getuPassword() {
		return uPassword;
	}

	public void setuPassword(String uPassword) {
		this.uPassword = uPassword;
	}

	public String getuAccess() {
		return uAccess;
	}

	public void setuAccess(String uAccess) {
		this.uAccess = uAccess;
	}

	@Override
	public String toString() {
		return "User [uUsername=" + uUsername + ", uPassword=" + uPassword + ", uAccess=" + uAccess + "]";
	}

}
