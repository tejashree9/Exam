package com.cts.bankmanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cts.bankmanagement.dao.ScheduleDAO;
import com.cts.bankmanagement.vo.TrainerVO;

@Service("scheduleService")
public class ScheduleService implements ScheduleServiceI {
	@Autowired
	private ScheduleDAO scheduleDAO;

	@Transactional
	public void insert(TrainerVO trainerVO) {
	
	System.out.println("Inside Service ");	

	scheduleDAO.insert(trainerVO);
	}

	
}
