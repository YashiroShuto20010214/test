package vender;

public class Item{

	//���O
	private String name;
	//�l�i
	private Integer price;
	//�̔��ł��邩�ǂ���
	private boolean sellFlag;
	//�R���X�g���N�^
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

















