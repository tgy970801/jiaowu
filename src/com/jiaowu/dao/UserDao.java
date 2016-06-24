package com.jiaowu.dao;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


import com.jiaowu.model.Score;
import com.jiaowu.model.User;

@Service @Transactional
public class UserDao {
	@Resource SessionFactory factory;
	
	public void AddUser(User user) throws Exception {
	    	Session s = factory.getCurrentSession();
	    	s.save(user);
	    }
    public void UpdateUser(User user) throws Exception {
        Session s = factory.getCurrentSession();
        s.update(user);
    }
		public User GetUserById(Integer userid) {
		Session s = factory.getCurrentSession();
        User user = (User)s.get(User.class, userid);
        return user;
	}
		   public ArrayList<User> QueryAllUser() {
		        Session s = factory.getCurrentSession();
		        String hql = "From User";
		        Query q = s.createQuery(hql);
		        List userList = q.list();
		        return (ArrayList<User>) userList;
		    }
		public ArrayList<User> QueryUserInfo(Integer userid) {
    	Session s = factory.getCurrentSession();
    	List userList;
    	String hql = "From User user where 1=1";
            if(!userid.equals("")){ 
    		hql = hql + " and user.userid like '%" +userid+ "%'";
	    	Query q = s.createQuery(hql);
	    	 userList = q.list();
    	}else{    		
    	  userList =null;	
    	 	}
    	    	return (ArrayList<User>)userList;
    }
	public void DeleteUser(Integer userId) throws Exception {
        Session s = factory.getCurrentSession(); 
        Object user = s.load(User.class, userId);
        s.delete(userId);
    }
}
