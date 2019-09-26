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
	//預り金
	private Integer deposit = 0;

    public CashRegistServlet() {
        super();
    }

	//金額投入時の処理
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//index.jspから、「cash」というパラメータに格納された値を取得して、
		//String型の変数cashに格納
		String cash = request.getParameter("cash");
		//確認のための内容表示（そのうち消す）
		System.out.println(cash);
		//受け取った金額をdepositに加算（Stringだから型変換が必要）
		deposit += Integer.parseInt(cash);
		
		////お金の受け取りここまで
		
		//金額で販売できるかどうかを判定するためのクラスをインスタンス化
		VendingInformation info = new VendingInformation();
		//判定するための預り金をセット
		info.setDeposit(deposit);
		//販売可能かどうかを判定
		Item[] items = info.sellJudge();

		//預り金を転送するためにセット
		request.setAttribute("deposit",deposit);
		//販売商品を転送するためにセット
		request.setAttribute("items",items);
		//転送先をセット
		RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
		//転送
		dispatcher.forward(request,response);
	}
	
	//金額投入後、商品ボタンを押したときの処理（未実装）
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
}
