package vender;

public class VendingInformation {
	//預り金
	Integer deposit;
	//販売品目。かっこ悪いけど、今は
		Item[] items = {new Item("うぉーたー", 80), new Item("じゅーす", 100), new Item("えなどり", 100)};
	//depositのsetter
	public void setDeposit(Integer deposit){
		this.deposit = deposit;
	}
	//販売可能かどうかを決めるメソッド
	//フィールドのdepositの値によって、sellFlagをセットする。
	public Item[] sellJudge() {
		
		if(deposit<80) {
			items[0].setSellFlag(false);
			items[1].setSellFlag(false);
			items[2].setSellFlag(false);
		}else if(deposit<100) {
			items[0].setSellFlag(true);
			items[1].setSellFlag(false);
			items[2].setSellFlag(false);
		}
		else if(deposit<190) {
			items[0].setSellFlag(true);
			items[1].setSellFlag(true);
			items[2].setSellFlag(false);
		}
		else {
			items[0].setSellFlag(true);
			items[1].setSellFlag(true);
			items[2].setSellFlag(true);
		
		}
		return items;
	}
}