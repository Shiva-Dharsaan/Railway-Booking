package Railway;

public class LoginOld {

		

		private String loginId;
		private String name;
		private String password;
		private String email;
		private String mobile;
		
		public LoginOld(String loginId, String name, String password, String email, String mobile) {
			this.loginId = loginId;
			this.name = name;
			this.password = password;
			this.email = email;
			this.mobile = mobile;
		}
		
		public String getLoginId() {
			return loginId;
		}
		public void setLoginId(String loginId) {
			this.loginId = loginId;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getMobile() {
			return mobile;
		}
		public void setMobile(String mobile) {
			this.mobile = mobile;
		}
		

}
