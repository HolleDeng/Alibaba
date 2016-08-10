package cn.com.alibaba.web.model;

public class PayWay {
	/**
	 * payway_id integer pk 付款方式 id 
	 * paystyle varchar(64) not null 付款方式名称
	 */
    private int payway_id;
    private String paystyle;
	public int getPayway_id() {
		return payway_id;
	}
	public void setPayway_id(int payway_id) {
		this.payway_id = payway_id;
	}
	public String getPaystyle() {
		return paystyle;
	}
	public void setPaystyle(String paystyle) {
		this.paystyle = paystyle;
	}
	
    
    
	
}
