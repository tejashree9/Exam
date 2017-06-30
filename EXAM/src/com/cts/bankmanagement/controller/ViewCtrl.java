package com.cts.bankmanagement.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.ws.rs.FormParam;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cts.bankmanagement.service.ViewService;
import com.cts.bankmanagement.vo.TrainerVO;

@Controller
public class ViewCtrl {

	@Autowired
	private ViewService viewService;
	
/*	@RequestMapping( value="View" ,method=RequestMethod.GET)
	public String getView(){
		return "View";
	}
	*/
	
	@RequestMapping(value="viewSchedule" ,method=RequestMethod.GET,produces = MediaType.APPLICATION_JSON)
	public @ResponseBody List<TrainerVO> viewWeeklySchedule(
			@FormParam("startDate") String startDate) throws ParseException{
		List<TrainerVO> list=null;
		
		System.out.println(startDate);
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		Date d1=sdf.parse(startDate);
		
		System.out.println(d1);
		list=viewService.getDetails(d1);
		System.out.println("After Getting Result in Ctrl"+list);
		return list;
	}
}
