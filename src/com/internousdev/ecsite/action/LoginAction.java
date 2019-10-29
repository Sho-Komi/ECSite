package com.internousdev.ecsite.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.BuyItemDAO;
import com.internousdev.ecsite.dao.LoginDAO;
import com.internousdev.ecsite.dto.BuyItemDTO;
import com.internousdev.ecsite.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;


public class LoginAction extends ActionSupport implements SessionAware {

    private String loginUserId;
    private String loginPassword;
    private Map<String, Object> session;
    private LoginDAO loginDAO = new LoginDAO();
    private LoginDTO loginDTO = new LoginDTO();
    private BuyItemDAO buyItemDAO = new BuyItemDAO();


    public String execute()  {

    	String result =ERROR;

    	loginDTO =loginDAO.getLoginUserInfo(loginUserId, loginPassword);
    	session.put("loginUser", loginDTO);                                                             // LoginDTOインスタンスを"loginUser"というkeyでsessionに保存

    	if(((LoginDTO) session.get("loginUser")).getLoginFlg())  {                           //  一番内側の（）はLoginDTO型という型を宣言するカッコ。getLoginFlgはboolean型でtrueかfalseを返す
    		result = SUCCESS;
    		BuyItemDTO buyItemDTO = buyItemDAO.getBuyItemInfo();                  // 上ではログインに必要なデータ（IDとパスワード）が合っているかの確認をした。ここからは次の購入の段階で必要な商品情報が必要なため商品情報を取得している。

    		session.put("login_user_id", loginDTO.getLoginId());                              //
    		session.put("id", buyItemDTO.getId());
    		session.put("buyItem_name", buyItemDTO.getItemName());
    		session.put("buyItem_price", buyItemDTO.getItemPrice());

    		return result;
    	}
    	return result;
    }



    public String getLoginUserId()  {
    	return loginUserId;
    }

    public void setLoginUserId(String loginUserId)  {
    	this.loginUserId = loginUserId;
    }

    public String getLoginPassword()  {
    	return loginPassword;
    }

    public void setLoginPassword(String loginPassword)  {
    	this.loginPassword = loginPassword;
    }

    public Map<String, Object> getSession()  {
    	return this.session;
    }

    @Override
    public void setSession(Map<String, Object> session)  {
    	this.session =session;
    }
}
