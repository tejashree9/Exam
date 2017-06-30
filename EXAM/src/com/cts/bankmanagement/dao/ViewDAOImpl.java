package com.cts.bankmanagement.dao;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cts.bankmanagement.vo.TrainerVO;

@Repository("viewDAO")
public class ViewDAOImpl implements ViewDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<TrainerVO> getWeeklyDetails(Date startDate) {
		System.out.println("inside view dao");
		java.sql.Date s1=new java.sql.Date(startDate.getTime());
		System.out.println(s1);
		
		Calendar cal=Calendar.getInstance();
		cal.setTime(startDate);
		cal.add(Calendar.DATE, 7);
		java.util.Date utilDate=cal.getTime();
		
		Query query=sessionFactory.getCurrentSession().createQuery("from ScheduleTraining where startDate between :startDate and :utilDate");
		query.setParameter("startDate", startDate);
		query.setParameter("utilDate", utilDate);
		System.out.println(query.list());
		@SuppressWarnings("unchecked")
		List<TrainerVO> list=query.list();
		System.out.println("Inside DAO"+list);
		return list;
	}
}
