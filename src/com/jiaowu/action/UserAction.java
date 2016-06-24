package com.jiaowu.action;
import java.util.ArrayList;
import java.util.Map;

import javax.annotation.Resource;
import org.apache.struts2.interceptor.SessionAware; 
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.jiaowu.dao.UserDao;
import com.jiaowu.model.User;


import com.opensymphony.xwork2.ActionSupport;

@Controller @Scope("prototype")
public class UserAction extends ActionSupport  implements SessionAware{
	@Resource UserDao userDao;
	private User user;
	private Map<String,Object> session;
	public Map<String, Object> getSession() {
		return session;
	}
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	private String errMessage;
	
	public String geterrMessage(){
		return errMessage;
		
	}
	public void seterrMessage(String errMessage){
		this.errMessage=errMessage;		
	}
	public String reg() throws Exception{
		userDao.AddUser(user);
		session.put("user", user);
		return "main_view";
	}
    	public String login() {
		User db_user = (User)userDao.QueryUserInfo(user.getUserid()).get(0);
		if(db_user == null) { 
			this.errMessage = " 账号不存在 ";
			System.out.print(this.errMessage);
			return INPUT;
		} else if( !db_user.getPassword().equals(user.getPassword())) {
			this.errMessage = " 密码不正确! ";
			System.out.print(this.errMessage);
			return INPUT;
		}else{
			session.put("user", db_user);
			return "success";
		}	
	}
	  /*显示某一成绩的详细信息*/
    public String showDetail() {
    	user = userDao.GetUserById(user.getUserid());
        return "detail_view";
    }
    public String deleteEdit() throws Exception {
    	userDao.DeleteUser(user.getUserid());
        return "delete_message";
    }
}