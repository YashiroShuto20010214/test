package vender;

public class Item{

	//名前
	private String name;
	//値段
	private Integer price;
	//販売できるかどうか
	private boolean sellFlag;
	//コンストラクタ
	public Item(String name, Integer price){
		this.name = name;
		this.price = price;
		this.sellFlag = false;
	
	}
	public boolean isSellFlag(){
		return sellFlag;
	}
	public void setSellFlag(boolean sellFlag){
		this.sellFlag = sellFlag;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	
	public void setPrice(Integer price){
		this.price=price;
	}
	
	public Integer getPrice(){
		return price;
	}
}

















