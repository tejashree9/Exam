package com.cts.bankmanagement.controller;

import javax.validation.Valid;
import javax.ws.rs.FormParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cts.bankmanagement.service.ScheduleServiceI;
import com.cts.bankmanagement.vo.TrainerVO;


@Controller
public class ScheduleCtrl {
	
@Autowired
private ScheduleServiceI scheduleService;

	@RequestMapping(value = "/Schedule", method = RequestMethod.GET)
	public String scheduleForm(Model model) {
	//	ModelAndView model=new ModelAndView("TrainerInfo");
		model.addAttribute("Schedule", new TrainerVO());
		
		return "Schedule";
	}
	
	
	@RequestMapping(value = "/addSchedule", method = RequestMethod.POST)
	public String getHomeLoan(@Valid TrainerVO trainerVO ,Model model, BindingResult result,
			@RequestParam("trainerId") String trainerId,
			@RequestParam("trainerName") String trainerName
			,@RequestParam("collegeName") String collegeName
			,@RequestParam("domain") String domain
			,@RequestParam("startDate") String startDate,
			@RequestParam("duration") String duration
			) {
	System.out.println("Inside schedule controller");
	
	model.addAttribute("Schedule",new TrainerVO());
	
	
	System.out.println(trainerId);System.out.println(trainerName);
	System.out.println(collegeName);System.out.println(domain);
	System.out.println(startDate);System.out.println(duration);
		
	if(result.hasErrors()){
		System.out.println("Error detected "+result);
		return "Schedule";
	}
	
	scheduleService.insert(trainerVO);
	
	
		return "success";
	}
	
}
