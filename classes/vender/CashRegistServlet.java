package vender;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/CashRegistServlet")
public class CashRegistServlet extends HttpServlet {
	//�a���
	private Integer deposit = 0;

    public CashRegistServlet() {
        super();
    }

	//���z�������̏���
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//index.jsp����A�ucash�v�Ƃ����p�����[�^�Ɋi�[���ꂽ�l���擾���āA
		//String�^�̕ϐ�cash�Ɋi�[
		String cash = request.getParameter("cash");
		//�m�F�̂��߂̓��e�\���i���̂��������j
		System.out.println(cash);
		//�󂯎�������z��deposit�ɉ��Z�iString������^�ϊ����K�v�j
		deposit += Integer.parseInt(cash);
		
		////�����̎󂯎�肱���܂�
		
		//���z�Ŕ̔��ł��邩�ǂ����𔻒肷�邽�߂̃N���X���C���X�^���X��
		VendingInformation info = new VendingInformation();
		//���肷�邽�߂̗a������Z�b�g
		info.setDeposit(deposit);
		//�̔��\���ǂ����𔻒�
		Item[] items = info.sellJudge();

		//�a�����]�����邽�߂ɃZ�b�g
		request.setAttribute("deposit",deposit);
		//�̔����i��]�����邽�߂ɃZ�b�g
		request.setAttribute("items",items);
		//�]������Z�b�g
		RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
		//�]��
		dispatcher.forward(request,response);
	}
	
	//���z������A���i�{�^�����������Ƃ��̏����i�������j
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
}
