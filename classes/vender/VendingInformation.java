package vender;

public class VendingInformation {
	//�a���
	Integer deposit;
	//�̔��i�ځB�������������ǁA����
		Item[] items = {new Item("�����[���[", 80), new Item("����[��", 100), new Item("���Ȃǂ�", 100)};
	//deposit��setter
	public void setDeposit(Integer deposit){
		this.deposit = deposit;
	}
	//�̔��\���ǂ��������߂郁�\�b�h
	//�t�B�[���h��deposit�̒l�ɂ���āAsellFlag���Z�b�g����B
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