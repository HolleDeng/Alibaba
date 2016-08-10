package cn.com.alibaba.web.model;

public class Category {
	/**
	 * category_id integer pk 类别 
	 * id fathercategoryid integer not null 
	 * 父类别 id
	 * name varchar(128) not null 类别名
	 * description varchar(512)   类别说明
	 */
	
	private int category_id;
	private int fathercategoryid;
	private String name;
	private String description;
	public int getCategory_id() {
		return category_id;
	}
	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}
	public int getFathercategoryid() {
		return fathercategoryid;
	}
	public void setFathercategoryid(int fathercategoryid) {
		this.fathercategoryid = fathercategoryid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
