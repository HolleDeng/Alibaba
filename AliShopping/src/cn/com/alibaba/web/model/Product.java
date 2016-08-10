package cn.com.alibaba.web.model;

public class Product {
	/*
	 * product _id integer auto_increment/ pk 
	 * 商品 id name varchar(40) not null
	 * 商品名 basePrice numeric(12,2) not null 
	 * 单价 category_id integer / 
	 * 类别 id 
	 * publish varchar(256) not nul   厂家 
	 * stock Int not null 商品库存 
	 * images varchar(40) not null 图片 
	 * intro varchar(128) / 商品介绍
	 *  url varchar (100) not  null 商品图片URL
	 */
	private int product_id;
	private String name;
	private double basePrice;
	private int category_id;
	private String Standard;
	private String publish;
	private int Stock;
	private String images;
	private String intro;
	private String url;

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBasePrice() {
		return basePrice;
	}

	public void setBasePrice(double basePrice) {
		this.basePrice = basePrice;
	}

	public int getCategory_id() {
		return category_id;
	}

	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}

	public String getStandard() {
		return Standard;
	}

	public void setStandard(String standard) {
		Standard = standard;
	}

	public String getPublish() {
		return publish;
	}

	public void setPublish(String publish) {
		this.publish = publish;
	}

	public int getStock() {
		return Stock;
	}

	public void setStock(int stock) {
		Stock = stock;
	}

	public String getImages() {
		return images;
	}

	public void setImages(String images) {
		this.images = images;
	}

	public String getIntro() {
		return intro;
	}

	public void setIntro(String intro) {
		this.intro = intro;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
