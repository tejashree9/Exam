package com.cts.bankmanagement.dao;

import java.util.Date;
import java.util.List;

import com.cts.bankmanagement.vo.TrainerVO;

public interface ViewDAO {
	
	public List<TrainerVO> getWeeklyDetails(Date startDate);
}
