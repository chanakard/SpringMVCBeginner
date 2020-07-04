package com.personnel.springmvc.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.personnel.springmvc.entity.FeedBack;

@Component
public class FeedbackDAO {
	
	
	@Autowired
	private SessionFactory objSessionFactory;
	
	@Transactional
	public void addFeedback(FeedBack objFB)
	{
		 Session objSession = objSessionFactory.getCurrentSession();
		 objSession.save(objFB);
	}
	
	@Transactional
	public List<FeedBack> getFeedbacks()
	{
		
		Session session = objSessionFactory.getCurrentSession();
		List<FeedBack> l = session.createQuery("from FeedBack",FeedBack.class).getResultList();		// HQL
		
		
		System.out.println(l);
		return l;
	}
}
