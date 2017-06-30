package com.cts.bankmanagement.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cts.bankmanagement.dao.ViewDAO;
import com.cts.bankmanagement.vo.TrainerVO;
@Service("viewService")
public class ViewServiceImpl implements ViewService{

	@Autowired
	public ViewDAO viewDAO;
	@Override
	@Transactional
	public List<TrainerVO> getDetails(Date startDate) {
		System.out.println("inside view service");
		return viewDAO.getWeeklyDetails(startDate);
	}

}
