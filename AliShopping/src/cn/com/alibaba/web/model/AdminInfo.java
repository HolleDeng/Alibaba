package cn.com.alibaba.web.model;

public class AdminInfo {

	/**
	 * AdminID varchar (20) primary key, not null 管理员id 
	 * Password varchar (20)  Not null 密码  
	 * AdminName varchar (20) Not null 管理员名字 
	 * IdentityID varchar (19) Not null 身份  
	 * Email varchar (50)      Not null 邮箱 
	 * ProductEdit Enum{“有权”, ”无权”} Default 无权 商品操作权限  
	 * UserEdit Enum{“有权”, ”无权”} Default 无权 用户操作权限 
	 * OrderEdit Enum{“有权”, “无权”} Default 无权 订单操作权限 
	 * AddAdmin Enum{“有权”, “无权”} Default 无权
	 * 添加管理员权限
	 */
	
	private String  AdminID;
	private String  Password;
	private String  AdminName;
	private String  IdentityID;
	private String  Email;
	private int 	ProductEdit;
	private int 	UserEdit;
	private int 	OrderEdit;
	private int 	AddAdmin;
	public String getAdminID() {
		return AdminID;
	}
	public void setAdminID(String adminID) {
		AdminID = adminID;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getAdminName() {
		return AdminName;
	}
	public void setAdminName(String adminName) {
		AdminName = adminName;
	}
	public String getIdentityID() {
		return IdentityID;
	}
	public void setIdentityID(String identityID) {
		IdentityID = identityID;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public int getProductEdit() {
		return ProductEdit;
	}
	public void setProductEdit(int productEdit) {
		ProductEdit = productEdit;
	}
	public int getUserEdit() {
		return UserEdit;
	}
	public void setUserEdit(int userEdit) {
		UserEdit = userEdit;
	}
	public int getOrderEdit() {
		return OrderEdit;
	}
	public void setOrderEdit(int orderEdit) {
		OrderEdit = orderEdit;
	}
	public int getAddAdmin() {
		return AddAdmin;
	}
	public void setAddAdmin(int addAdmin) {
		AddAdmin = addAdmin;
	}
	
}
