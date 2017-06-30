package com.cts.bankmanagement.service;

import java.util.Date;
import java.util.List;

import com.cts.bankmanagement.vo.TrainerVO;

public interface ViewService {

	public List<TrainerVO> getDetails(Date startDate);
}
